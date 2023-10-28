package models;

import lombok.Data;

@Data
public class ArchivoResultado {
//RESULTADO: equipo1, cant.goles1, cant.gol2, equipo2

	
	@CsvBindByPosition(position = 0)
	private String nameEquipo1;
	
	@CsvBindByPosition(position = 1)
	private int cantGoles1;
	
	@CsvBindByPosition(position = 2)
	private int cantGoles2;
	
	@CsvBindByPosition(position = 3)
	private String nameEquipo2;
	
	
	
}
