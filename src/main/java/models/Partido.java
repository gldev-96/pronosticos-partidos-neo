package models;

import lombok.Data;

@Data
public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golEquipo1;
	private int golEquipo2;
}