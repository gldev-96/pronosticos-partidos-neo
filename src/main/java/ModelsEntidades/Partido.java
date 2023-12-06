package ModelsEntidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor c/ los todos argumentos

@Entity
@Table(name = "Partido")

public class Partido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPartido")
	private long idPartido;
	@Column(name = "equipo1")
	private Equipo equipo1;
	@Column(name = "equipo2")
	private Equipo equipo2;
	@Column(name = "golEquipo1")
	private int golEquipo1;
	@Column(name = "golEquipo2")
	private int golEquipo2;
	@ManyToOne // Muchos partidos pertenecen a una ronda
    @JoinColumn(name = "idRonda") // idRonda es la clave foránea en la tabla Partido
    private Ronda ronda;
	
	public Partido() {
		
	}

	public Partido(long idPartido, Equipo equipo1, Equipo equipo2, int golEquipo1, int golEquipo2, Ronda ronda) {
		
		this.idPartido = idPartido;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golEquipo1 = golEquipo1;
		this.golEquipo2 = golEquipo2;
		this.ronda = ronda;
	}

	
	
	
}