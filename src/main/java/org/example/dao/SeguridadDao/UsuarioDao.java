package org.example.dao.SeguridadDao;

import org.example.database.DatabaseConnection;
import org.example.models.seguridad.Usuario;

import javax.print.DocFlavor;
import javax.swing.plaf.TreeUI;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

    public static boolean crearUsuario(Usuario Usuario) {

        String sql = "INSERT INTO usuarios (nombre,contraseña) VALUES (?, ?)";

        //la condicion especial hace que se guarden los id que se han generado en una variable predefinida por el jdbc
        try (Connection con = DatabaseConnection.conectar(); PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            pstmt.setString(1, Usuario.getNombre());
            pstmt.setString(2, Usuario.getContraseña());
            int filasAfectadas = pstmt.executeUpdate();

            //si las filas afectadas son mayores a cero
            if (filasAfectadas > 0) {
                // Pedimos las claves generadas
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    //Se abre temporalmente donde se guarda todo y luego se lee el numero
                    if (generatedKeys.next()) {
                        int idGenerado = generatedKeys.getInt(1);
                        Usuario.setIdUsuario(idGenerado); // ¡Guardamos el ID en el objeto!
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean comprobarInicioSesion(Usuario usuario) {

        String sql = "SELECT nombre,contraseña FROM usuarios WHERE nombre = ? AND contraseña = ?";

        try (Connection conn = DatabaseConnection.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Simplemente le pasas los valores
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getContraseña());

            try (ResultSet rs = stmt.executeQuery()) {
                // 2. Si rs.next() da true, significa que la consulta devolvió un registro
                // (es decir, el usuario y contraseña existen y coinciden)
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean exsisteUsuario(String nombre) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE nombre = ?";
        try (Connection con = DatabaseConnection.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            // el resultset esta obteniendo el resultado de la consulta. Y lo compara con el 0 para ver si hay mas nombres como este
            // el execute query es simplemente para consultar
            try (var resultSet = stmt.executeQuery()) {
                //Si el resultado es mayor que cero devuelve true y si es cero devuelve false
                //el column index es el numero de la columna de la consulta que queremos comparar
                //el getint establece el resultado de la columna 1 en la variable
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean eliminarUsuario(Usuario usuarioObtenido) {

        String sql = "DELETE FROM usuarios WHERE idUsuario = ?";

        try (Connection con = DatabaseConnection.conectar(); PreparedStatement stmt = con.prepareStatement(sql);
        ) {
            //obtiene el id del usuario para poder eliminarlo de manera correcta
            stmt.setInt(1, usuarioObtenido.getIdUsuario());

            //controlamos que se haya eliminado al ejecutar en una variable llamada filas afectadas
            int filasAfectadas = stmt.executeUpdate();
            //devuelve el valor false si las filas afectadas son menores que 0
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }



    public static void editarUsuario(String nombre) {

    }
}



