package ModelsEntidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getters and setters
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor c/ los todos argumentos
public class Pronostico {
	private Partido partido;
	private Equipo equipo;
	private ResultadoEnum resultado;
}