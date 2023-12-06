package ModelsEntidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor c/ los todos argumentos

@Entity
@Table(name = "Persona")
public class Persona {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nombre")
	private String nombre;
	@Column(name = "puntos")
	private int puntos;
}