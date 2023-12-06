package Main;

import java.sql.SQLException;

import Servicios.MenuServicio;


public class MainApuesta {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	MenuServicio menu = new MenuServicio();
	menu.MostrarMenu();
	
	}
}






	/**
		 * /**String rutaArchivo = "src/main/java/ModelsEntidades/Pronosticos2.csv";
		 * 
		 * List<PronosticoRepositorio> pronosticos =
		 * PronosticoRepositorio.leerDesdeCSV(rutaArchivo);
		 * 
		 * // imprime los pronosticos System.out.println(pronosticos.toString());
		 *//**/