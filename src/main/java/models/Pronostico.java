package models;

import lombok.Data;

@Data
public class Pronostico {
	private Partido partido;
	private Equipo equipo;
	private ResultadoEnum resultado;
	
	
	
}