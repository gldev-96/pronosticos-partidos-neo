package models;


public class Ronda {
	private int nro;
	private Partido[] partidos;
	
	
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public Partido[] getPartidos() {
		return partidos;
	}
	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}
	
}