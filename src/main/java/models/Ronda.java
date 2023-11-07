package models;

import lombok.Data;

@Data
public class Ronda {
	private int nro;
	private Partido[] partidos;

	public Ronda(int nro, Partido[] partidos) {

		this.nro = nro;
		this.partidos = partidos;
	}

	public Ronda() {

	}

}