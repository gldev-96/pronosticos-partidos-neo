package demo_pronostico;

import java.util.List;

import repositorios.PronosticoRepositorio;

public class MainApuesta {

	public static void main(String[] args) {

		String rutaArchivo = "src/main/java/ModelsEntidades/Pronosticos2.csv";

		List<PronosticoRepositorio> pronosticos = PronosticoRepositorio.leerDesdeCSV(rutaArchivo);
		
		// imprime los pronosticos
		System.out.println(pronosticos.toString());

	}

}
