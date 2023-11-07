package models;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import lombok.Data;

@Data
public class ArchivoResultado {
//RESULTADO: equipo1, cant.goles1, cant.gol2, equipo2

	private static List<String> lista;

	public List<String> sacarDatos() {
		try {
			String archivoEntrada = "src/Models/Resultados2.csv";
			// archivo a leer

			this.lista = Files.readAllLines(Paths.get(archivoEntrada)); // extraer en lista

			return lista;
		} catch (Exception e) {
			System.out.print("Error carga de datos");
			return null;
		}

	}
	
	@CsvBindByPosition(position = 0)
	private String nameEquipo1;
	
	@CsvBindByPosition(position = 1)
	private int cantGoles1;
	
	@CsvBindByPosition(position = 2)
	private int cantGoles2;
	
	@CsvBindByPosition(position = 3)
	private String nameEquipo2;
	
	
	
}
