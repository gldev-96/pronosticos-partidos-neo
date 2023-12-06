package Resources.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	// Datos de conexión a la base de datos
	private static final String URL = "jdbc:mysql://localhost:3306/bd_pronostico";
	private static final String USUARIO = "root";
	private static final String CONTRASENA = "root";

	Connection conexion = null; // declaro objeto conexion que trae de la base de datos
	
	static {
		try {
			// Paso 1: Registrar driver -> controlador JDBC
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}

	
	public Connection conectar() throws SQLException {

		try {
			// Paso 2: Crear conexión -> con la base de datos y asignar al objeto conexion
			conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

			System.out.println("Conexion ok");

		} catch (Exception e) {
			System.out.println("Error en la conexion");
			e.printStackTrace();
		}

		// retorna objeto conexion
		return conexion;

	}

	public void close() throws ClassNotFoundException, SQLException {
		if (conexion != null) {
			try {
				if (!conexion.isClosed()) {
					conexion.close();
				}
			} catch (Exception e) {
				System.out.println("Error al cerrar la conexion");
				e.printStackTrace();
			}

		}
	}
}
