package ModelsEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor c/ los todos argumentos
public class Equipo{
	
	private String nombre; 
	private String descripcion;
	
}