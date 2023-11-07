package models;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.opencsv.bean.CsvBindByPosition;

public class ArchivoPronostico {
	// PRONOSTICO: equipo1, gana1, empata, gana2,equipo2

	/*@CsvBindByPosition(position = 0)
	private String nameEquipo1;

	@CsvBindByPosition(position = 1)
	private String gana1;

	@CsvBindByPosition(position = 2)
	private String empate;

	@CsvBindByPosition(position = 3)
	private String gana2;

	@CsvBindByPosition(position = 4)*/
	
	private String nameEquipo2;
	private static List<String> lista;

	public static List<String> sacarDatos() {
		try {
			String archivoEntrada = "src/Models/Pronosticos2.csv";
			// archivo a leer

			lista = Files.readAllLines(Paths.get(archivoEntrada)); // extraer en lista

			return lista;
		} catch (Exception e) {
			System.out.print("Error carga de datos");
			return null;
		}

	}

	public static void cargarPronostico() {
		ArrayList<String[]> listaPronostico = new ArrayList<>();
		try {
			String[] p1R1 = sacarDatos().get(1).split(","); //
			String[] p2R1 = sacarDatos().get(2).split(",");
			String[] p3R2 = sacarDatos().get(3).split(",");
			String[] p4R2 = sacarDatos().get(4).split(","); //

			String[] p5R1 = sacarDatos().get(5).split(",");
			String[] p6R1 = sacarDatos().get(6).split(",");
			String[] p7R2 = sacarDatos().get(7).split(",");
			String[] p8R2 = sacarDatos().get(8).split(",");

			listaPronostico.add(p1R1);
			listaPronostico.add(p2R1);
			listaPronostico.add(p3R2);
			listaPronostico.add(p4R2);
			listaPronostico.add(p5R1);
			listaPronostico.add(p6R1);
			listaPronostico.add(p7R2);
			listaPronostico.add(p8R2);
			
			
			Lista<Pronostico> listPronosticoM = new Pronostico();
			Lista<Pronostico> listPronosticoC = new Pronostico();
		
			
             int contadorPartid= 0;
			for (int i = 0; i < listaPronostico.size(); i++) {
				if ((listaPronostico.get(i))[4].equals("Maria")) {
					//equipo = nombre[0 y 3] y desc ""
					Equipo equipo1 = new Equipo((listaPronostico.get(i))[0], "");
					Equipo equipo2 = new Equipo((listaPronostico.get(i))[3], "");
					
                    //partido = equipo y goles[1 y 2] parseados de String a int -> 
					Partido partidoMaria = new Partido(equipo1, equipo2, Integer.parseInt((listaPronostico.get(i))[1]),
							Integer.parseInt((listaPronostico.get(i))[2]));
                    
					Pronostico pronostico = new Pronostico();
					Persona persona1 = new Persona();
					
					
					
					//persona = nombre -> maria
					persona1.setNombre((listaPronostico.get(i))[4]);
                    //pronostico =  partido,persona (equipo y resultado c/metodo)
					pronostico.setPartido(partidoMaria);
					pronostico.setApostador(persona1);
							
					
					listPronosticoM.add(pronostico);
					

				} else {
					//equipo = nombre[0 y 3] y desc ""
					Equipo equipo1 = new Equipo((listaPronostico.get(i))[0], "");
					Equipo equipo2 = new Equipo((listaPronostico.get(i))[3], "");
					
                    //partido = equipo y goles[1 y 2] parseados de String a int -> 
					Partido partidoMaria = new Partido(equipo1, equipo2, Integer.parseInt((listaPronostico.get(i))[1]),
							Integer.parseInt((listaPronostico.get(i))[2]));
                    
					Pronostico pronostico = new Pronostico();
					Persona persona1 = new Persona();
					
					//persona = nombre -> maria
					persona1.setNombre((listaPronostico.get(i))[4]);
                    //pronostico =  partido,persona (equipo y resultado c/metodo)
					pronostico.setPartido(partidoMaria);
					pronostico.setApostador(persona1);
							
					
					listPronosticoC.add(pronostico);
					
				}

			}
		
			
		} catch (Exception e) {
			System.out.print("Error al cargar Apostador " + e.getMessage());
			
		
		}
	
	}
}

