package ModelsEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor c/ los todos argumentos
public class Persona {
	private String nombre;
	private int puntos;
}