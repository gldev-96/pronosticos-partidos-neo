package ModelsEntidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor c/ los todos argumentos

@Entity
@Table(name = "Ronda")
public class Ronda {
	@Id
	private int nro;
	 @OneToMany(mappedBy = "Ronda") // "ronda" es el nombre del campo en la clase Partido que representa la relación
	private Partido[] partidos;
}