package Resources.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ModelsEntidades.Equipo;

public class EquiposDAO extends DAO {

	public EquiposDAO() {
		super();
	}

	Connection coneccion = null;
	PreparedStatement preparedStatement = null;

// Retornar directamente la lista de equipos
	public List<String> cargarEquipos() {
		return Arrays.asList("Paraguay", "Uruguay", "Colombia", "Argentina");
	}

	
	// insertar equipos en la base de datos
	public void insertarEquipos(String consulta) throws  SQLException, ClassNotFoundException {
		cargarEquipos();
		List<String> equipos = cargarEquipos();
		PreparedStatement preparedStatement = null;

		try {
			coneccion = conectar(); // Utiliza el método conectar de la clase padre DAO

			// Sentencia SQL para la inserción

			preparedStatement = coneccion.prepareStatement(consulta);

			// recorrer y cargar la lista de equipos
			for (int i = 0; i < equipos.size(); i++) {
				preparedStatement.setString(2, equipos.get(i));
				// Ejecuta la consulta de inserción
				preparedStatement.executeUpdate();
			}
			System.out.println("Equipo insertado correctamente en la base de datos.");

		} catch (SQLException e) {
			System.out.println("Error al insertar el equipo en la base de datos.");
			e.printStackTrace();
		} finally {
			close(); // cerrar recursos
		}
	}

	public List<Equipo> extraerEquipos(String consulta) throws SQLException, ClassNotFoundException {
	    List<Equipo> equiposLista = new ArrayList<>();
	    
	    coneccion = conectar(); // Utiliza el método conectar de la clase padre DAO

	    // Usar un bloque try-with-resources para cerrar los recursos automáticamente
	    try (PreparedStatement ps = coneccion.prepareStatement(consulta);
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {
	            String nombre = rs.getString("nombre");
	            Integer id1 = Integer.valueOf(rs.getString("idEquipo"));
	            int id = id1.intValue();
	          
	            

	            // Construir la instancia de Eq and agregarla a la lista
	            Equipo equipo = new Equipo();
	            equipo.setNombre(nombre);
	            equipo.setId(id);
	            

	            equiposLista.add(equipo);
	        }

	    } catch (SQLException e) {
	        System.out.println("Error al extraer equipos de la base de datos.");
	        e.printStackTrace();
	    } finally {
	        close(); // Cerrar la conexión
	    }

	    return equiposLista;
	}


}
