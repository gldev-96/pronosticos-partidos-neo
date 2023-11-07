package models;

import lombok.Data;

@Data
public class Pronostico {
	private Partido partido;
	private Equipo equipo;
	private ResultadoEnum resultado;
	private Persona apostador;
	
	public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado, Persona apostador) {
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
		this.apostador = apostador;
	}

	public Pronostico() {

	}
	
	
	
	
}