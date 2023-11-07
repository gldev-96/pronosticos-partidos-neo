package controllers;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvParser {

	 private String archivoCSV;
     private String separador;
  
     public CsvParser(String archivoCSV, String separador) {
		this.archivoCSV = archivoCSV;
		this.separador = separador;
	}

	public String[] camposALista() {
    	 String[] campos = null;
    	 try {
        	 BufferedReader br = new BufferedReader(new FileReader(archivoCSV));
        	 String lineaActual;
        	 
        	 while ((lineaActual = br.readLine()) != null) {
        		 campos = lineaActual.split(separador);
        	 }
         } catch (Exception e) {
        	 e.printStackTrace();
         }	 
    	 return campos;
     }
     
}