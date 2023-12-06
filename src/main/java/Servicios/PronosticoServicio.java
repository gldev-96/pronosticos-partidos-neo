package Servicios;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import ModelsEntidades.Ronda;
public class PronosticoServicio {


	    // Métodos anteriores que hicimos...

	    // Método para guardar pronósticos en la base de datos
	    public static void guardarPronosticosEnBD(Ronda ronda, String participante) {
	      /**  try (Connection conexion = ConexionBD.obtenerConexion()) {
	            String query = "INSERT INTO pronosticos (participante, id_partido, resultado) VALUES (?, ?, ?)";
	            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
	                for (Partido partido : ronda.getPartidos()) {
	                
	                    // Ajusta esta parte según la estructura de tu base de datos
	                    preparedStatement.setString(1, participante);
	                    preparedStatement.setInt(2, partido.getId()); // Supongamos que tienes un campo id en la tabla de partidos
	                    preparedStatement.setString(3, obtenerResultadoPronosticado(partido)); // Implementa este método según tu lógica
	                    preparedStatement.executeUpdate();
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            // Manejo de excepciones
	        }**/
	    }

	    // Otros métodos...
	}


