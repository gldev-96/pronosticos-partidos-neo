package ModelsEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor c/ los todos argumentos
public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golEquipo1;
	private int golEquipo2;
}