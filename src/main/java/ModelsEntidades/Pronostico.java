package ModelsEntidades;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // getters and setters
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor c/ los todos argumentos

@Entity
@Table(name= "Pronostico")
public class Pronostico {

	@ManyToOne
    @JoinColumn(name = "idPartido")
	private Partido partido;
	
	 @ManyToOne
	 @JoinColumn(name = "idEquipo")
	private Equipo equipo;
	 
	@Enumerated(EnumType.STRING)
	private ResultadoEnum resultado;
	
	 
}