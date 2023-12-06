package Resources.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.jdbc.Statement;

import ModelsEntidades.Equipo;
import ModelsEntidades.Partido;
import ModelsEntidades.Ronda;
import Resources.Conexion.Conexion;

public class PartidoDAO extends DAO {

	public PartidoDAO() {
		super();
	}

	public void recuperarDatosBD() {
		// Crear instancias de Partido y conexion

		Connection conexion = null;
		List<Partido> listaPartidos = new ArrayList();
		Partido partido1 = new Partido();

		// Crear instancias de Equipo y Ronda
		Equipo equipo1 = new Equipo();
		Equipo equipo2 = new Equipo();
		Ronda ronda = new Ronda();

		PreparedStatement preparedStatement = null;
		String consulta = "SELECT * FROM Partidos";

		try {

			conexion = conectar(); // Utiliza el método conectar de la clase padre DAO
			Statement st = (Statement) conexion.createStatement();

			ResultSet rs = st.executeQuery(consulta); // capturo los dato traidos de mi BD
			while (rs.next()) {
				// extraer datos
				String golesE1 = rs.getString("golEquipo1");
				String golesE2 = rs.getString("golEquipo2");
				String e1 = rs.getString("nombreEquipo1");
				String e2 = rs.getString("NombreEquipo2");
				String r = rs.getString("numeroRonda");

				// guardar datos en el objeto
				equipo1.setNombre(e1);
				equipo2.setNombre(e2);
				
				partido1.setEquipo1(equipo1);
				partido1.setEquipo2(equipo2);
				partido1.setGolEquipo1(golesE1);
				partido1.setGolEquipo2(golesE2);
				partido1.setRonda(r);

				//cargar lista de partidos
				listaPartidos.add(partido1);
			}

		} catch (Exception e) {
			// Manejar excepciones
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			// Cerrar el EntityManager
		close();
		}
	}
}
