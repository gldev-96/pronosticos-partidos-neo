package models;

import lombok.Data;

@Data
public class Ronda {
	private int nro;
	private Partido[] partidos;
}