package Tema12Caso1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBase {

    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_ja_inventario";
    private static final String USER = "root";
    private static final String PASSWORD = "posnose90";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");

            Scanner scanner = new Scanner(System.in);
            String selection = "";

            while (!selection.equals("exit")) {
                System.out.println("Selecciona entre 'mostrar', 'buscar', 'insertar' o 'borrar', o ingresa 'exit' para salir:");
                selection = scanner.nextLine();

                if (selection.equals("mostrar")) {
                    mostrarRegistros(connection);
                } else if (selection.equals("buscar")) {
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    buscarRegistrosPorNombre(connection, nombreBuscar);
                } else if (selection.equals("insertar")) {
                    insertarRegistro(connection, scanner);
                } else if (selection.equals("borrar")) {
                    System.out.print("Ingrese el nombre del registro a borrar: ");
                    String nombreBorrar = scanner.nextLine();
                    borrarRegistro(connection, nombreBorrar);
                } else if (!selection.equals("exit")) {
                    System.out.println("Selección inválida");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }

    private static void mostrarRegistros(Connection connection) throws SQLException {
        String sql = "SELECT * FROM inventario";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String nombre = resultSet.getString("nombre");
            int cantidad = resultSet.getInt("cantidad");
            String comentario = resultSet.getString("comentario");

            System.out.println("Nombre: " + nombre + ", Cantidad: " + cantidad + ", Comentario: " + comentario);
        }

        resultSet.close();
        statement.close();
    }

    private static void buscarRegistrosPorNombre(Connection connection, String nombreBuscar) throws SQLException {
        String sql = "SELECT * FROM inventario WHERE nombre = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nombreBuscar);
        ResultSet resultSet = preparedStatement.executeQuery();

        boolean registrosEncontrados = false;

        while (resultSet.next()) {
            String nombre = resultSet.getString("nombre");
            int cantidad = resultSet.getInt("cantidad");
            String comentario = resultSet.getString("comentario");

            System.out.println("Nombre: " + nombre + ", Cantidad: " + cantidad + ", Comentario: " + comentario);
            registrosEncontrados = true;
        }

        if (!registrosEncontrados) {
            System.out.println("No existen referencias del objeto.");
        }

        resultSet.close();
        preparedStatement.close();
    }

    private static void insertarRegistro(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Ingrese el comentario: ");
        String comentario = scanner.nextLine();

        String sql = "INSERT INTO inventario (nombre, cantidad, comentario) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nombre);
        preparedStatement.setInt(2, cantidad);
        preparedStatement.setString(3, comentario);

        int filasInsertadas = preparedStatement.executeUpdate();
        System.out.println("Se han insertado " + filasInsertadas + " filas.");

        preparedStatement.close();
    }

    private static void borrarRegistro(Connection connection, String nombreBorrar) throws SQLException {
        String sql = "DELETE FROM inventario WHERE nombre = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nombreBorrar);

        int filasBorradas = preparedStatement.executeUpdate();
        System.out.println("Se han borrado " + filasBorradas + " filas.");

        preparedStatement.close();
    }
}