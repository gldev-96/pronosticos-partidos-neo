package models;

import lombok.Data;


@Data
public class ArchivoPronostico {
    //PRONOSTICO: equipo1, gana1, empata, gana2,equipo2

    @CsvBindByPosition(position = 0)
    private String nameEquipo1;

    @CsvBindByPosition(position = 1)
    private String gana1;

    @CsvBindByPosition(position = 2)
    private String empate;

    @CsvBindByPosition(position = 3)
    private String gana2;

    @CsvBindByPosition(position = 4) 
    private String nameEquipo2;
}

