package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.bean.CsvBindByPosition;



public class LectorArchivos {
	String rutaArchivoPronostico;
	List<ArchivoPronostico> lineasArchivoPronostico;

public LectorArchivos(String rutaArchivoPronostico ) {
	this.rutaArchivoPronostico = rutaArchivoPronostico;
	lineasArchivoPronostico =	new ArrayList<ArchivoPronostico>();
	
}

public void parsearArchivo() {
	List<ArchivoPronostico> listaDePronosticos=null;
	 try {
         // En esta primera línea definimos el archivos que va a ingresar
     	listaDePronosticos = new CsvToBeanBuilder (new FileReader(this.rutaArchivoPronostico))
                 // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
                 .withSkipLines(0)
                 // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
                 .withSeparator(';')
                 // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
                 .withType(ArchivoPronostico.class)
                 .build()
                 .parse();

     } catch (IOException e) {
     e.printStackTrace();
 }
     this.lineasArchivoPronostico = listaDePronosticos;
	
}

public ArrayList<Pronostico> listarPronostico() {
	return null;
}
}
