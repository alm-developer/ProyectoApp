package org.example.database;

import com.sun.source.tree.TryTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static String url = "jdbc:sqlite:/BaseDatos/BaseDatos.sqlite";

    public static Connection conectar() {
        //Esto declara la conexion como null
        Connection con = null;
        try {
            //le dices al gestor de conexion que obtenga la url y se la pase a la conexion
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public static void inicializarDatabase(){
        String sql = """
        CREATE TABLE IF NOT EXISTS usuarios (
            idUsuario INTEGER PRIMARY KEY AUTOINCREMENT,
            nombre TEXT NOT NULL,
            contraseña TEXT NOT NULL
        );
        """;

        //es obligatorio obtener la conexion con el metodo anterior asi se lo pasas al stmt que tiene que trabajar a traves de ella.
        //el statement ejecuta las ordenes que le pasas. Por eso debe ser creado a partir de la conexion para saber donde tiene que ir
        try (Connection con = conectar(); Statement stmt = con.createStatement()){
            stmt.executeUpdate(sql);
            System.out.println("¡Tabla creada correctamente!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
