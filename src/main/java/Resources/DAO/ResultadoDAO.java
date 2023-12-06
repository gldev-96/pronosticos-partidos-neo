package Resources.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ModelsEntidades.Partido;

public class ResultadoDAO extends DAO{

	
	public ResultadoDAO() {
		super();
	}

	public List<Partido> obtenerPartidos(String ronda, int id) {
		List<Partido> partidos = new ArrayList<>();

		try (Connection conexion = conectar()) { //abrir bd
			
			 // Preparar la consulta SQL
	        String query = "SELECT * FROM partidos WHERE id = ?";
	        PreparedStatement preparedStatement = conexion.prepareStatement(query);
	        preparedStatement.setString(1, id);

	        // Ejecutar la consulta y obtener los resultados
	        ResultSet resultSet = preparedStatement.executeQuery();

	        // Si se encontró un partido, deserializar el JSON a un objeto Partido
	        if (resultSet.next()) {
	            String json = resultSet.getString("json");
	           
				Partido partido = mapper.readValue(json, Partido.class);
	            return  partidos;
	        }

						close(); //cerrar bd
		
		} catch (SQLException e) {
			e.printStackTrace();
			// Manejo de excepciones
		}

		return partidos;
		}
}