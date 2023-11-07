package models;

import lombok.Data;

@Data
public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golEquipo1;
	private int golEquipo2;
	
	public Partido(Equipo equipo1, Equipo equipo2, int golEquipo1, int golEquipo2) {

		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golEquipo1 = golEquipo1;
		this.golEquipo2 = golEquipo2;
	}
	
}