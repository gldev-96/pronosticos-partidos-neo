package repositoriosCSV;

import com.opencsv.CSVReader;

import lombok.Builder;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class PronosticoRepositorioCSV {
    private String equipo1;
    private int golesEquipo1;
    private int golesEquipo2;
    private String equipo2;
    private String nombreApostador;
    private String ronda;

    @SneakyThrows //exception
    
    public static List<PronosticoRepositorioCSV> leerDesdeCSV(String rutaArchivo) {
        List<PronosticoRepositorioCSV> pronosticos = new ArrayList<>();
       
        try (CSVReader lector = new CSVReader(new FileReader(rutaArchivo))) {
            String[] nextLine;
            while ((nextLine = lector.readNext()) != null) {
                PronosticoRepositorioCSV pronostico = PronosticoRepositorioCSV.builder() //setteo c/atributo en base a lo que esta en el archivo CSV
                        .equipo1(nextLine[0])
                        .golesEquipo1(Integer.parseInt(nextLine[1]))
                        .golesEquipo2(Integer.parseInt(nextLine[2]))
                        .equipo2(nextLine[3])
                        .nombreApostador(nextLine[4])
                        .ronda(nextLine[5])
                        .build();

                pronosticos.add(pronostico);
               
            }
        }

        return pronosticos;
    }
}

/**
 La clase PronosticoReppositorio utiliza las anotaciones @Data y @Builder de Lombok para generar automáticamente los métodos toString
  , equals, hashCode, y el constructor con todos los argumentos.
Se utiliza la anotación @SneakyThrows para evitar tener que manejar las excepciones de lectura del archivo dentro del método.
El método leerDesdeCSV utiliza la biblioteca OpenCSV para leer el archivo CSV y crea instancias de la clase Pronostico.**/
