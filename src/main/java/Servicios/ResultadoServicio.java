package Servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import ModelsEntidades.Equipo;
import ModelsEntidades.Partido;
import ModelsEntidades.ResultadoEnum;
import ModelsEntidades.Ronda;

public class ResultadoServicio {
	
	
	
	
	
    // Método para guardar resultados en la base de datos
    public static void guardarResultadosEnBD(Ronda ronda) {
     /**   try (Connection conexion = ConexionBD.obtenerConexion()) {
            String query = "INSERT INTO resultados (id_partido, resultado_real) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
                for (Partido partido : ronda.getPartidos()) {
                    // Ajusta esta parte según la estructura de tu base de datos
                    preparedStatement.setInt(1, partido.getId()); // Supongamos que tienes un campo id en la tabla de partidos
                    preparedStatement.setString(2, obtenerResultadoReal(partido)); // Implementa este método según tu lógica
                    preparedStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
    }

    // Otros métodos...
	
**/
}
}

/**
Equipo equipo = new Equipo();
Partido partido = new Partido();
	public String ResultadoReal(int golE1, int golE2) {
		if (golE1>golE2 ) {
			ResultadoEnum.Ganador();
		}
		return null;
	}**/