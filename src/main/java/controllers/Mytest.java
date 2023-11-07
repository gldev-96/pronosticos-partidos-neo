package controllers;

import java.io.File;

public class Mytest {
	
	public static void main(String[] args) {
		
		String directorioDeTrabajo = System.getProperty("user.dir");
		String rutaAlArchivo = directorioDeTrabajo + "/src/main/java/models/pronosticos1.csv";
		
		CsvParser cp = new CsvParser(rutaAlArchivo, ",");
		
		String[] datos = cp.camposALista();
		
		
	}
}
