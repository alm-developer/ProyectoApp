package org.example.dao.SeguridadDao;

import org.example.database.DatabaseConnection;
import org.example.models.seguridad.Usuario;

import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {

    public static boolean crearUsuario(Usuario Usuario) {

        String sql = "INSERT INTO usuarios (nombre,contraseña) VALUES (?, ?)";

        try (Connection con = DatabaseConnection.conectar(); PreparedStatement stmt = con.prepareStatement(sql);) {

            stmt.setString(1, Usuario.getNombre());
            stmt.setString(2, Usuario.getContraseña());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
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
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


        public static boolean eliminarUsuario (Usuario usuarioObtenido) {

        String sql = "DELETE FROM usuarios WHERE idUsuario = ?";

        try (Connection con = DatabaseConnection.conectar();PreparedStatement stmt = con.prepareStatement(sql);
        ){
            stmt.setInt(1, usuarioObtenido.getIdUsuario());

            int filasAfectadas = stmt.executeUpdate();
            stmt.execute(sql);
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return false;
        }

        public static void editarUsuario (String nombre) {

        }

    }


