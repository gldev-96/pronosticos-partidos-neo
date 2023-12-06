package Servicios;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import ModelsEntidades.Equipo;
import DAO.EquiposDAO;

public class MenuServicio {

    String consultaTodoEquipo = "select * from equipos";
    String consultaExtraerEquipo = "SELECT * FROM equipos";
    String consultaInsertarEquipo  = "INSERT INTO Equipo (nombre) VALUES (?)";
    Resources.DAO.EquiposDAO ed = new Resources.DAO.EquiposDAO();

    public void IniciarCargaEquipos() throws ClassNotFoundException, SQLException {
        // Insertar los equipos en la base de datos
        ed.insertarEquipos(consultaInsertarEquipo);
    }

    public void MostrarEquipos() throws ClassNotFoundException, SQLException {
        // Extraer los equipos de la base de datos
        List<Equipo> equipos = ed.extraerEquipos(consultaExtraerEquipo);

        // Mostrar los equipos por pantalla
        for (Equipo e : equipos) {
            System.out.println(e.getNombre());
        }
    }

    public void ApostarPorPronostico() {
        // Aquí puedes poner el código para que el usuario apueste por un pronóstico
        // usar PronosticoRepositorio
    }

    public void VerPuntos() {
        // el usuario vea los puntos que tiene
    }

    public void Salir() {
        // salga del programa
    }

    public void MostrarMenu() throws ClassNotFoundException, SQLException {
    	
       
        Scanner sc = new Scanner(System.in);

        // Mostrar el menú por pantalla
        System.out.println("Bienvenido al programa de apuestas de fútbol");
        System.out.println("Elige una opción:");
        System.out.println("1. Cargar datos");
        System.out.println("2. Apostar por un pronóstico");
        System.out.println("3. Ver los puntos");
        System.out.println("4. Salir");

        // Leer la opción del usuario
        int opcion = sc.nextInt();

        // Ejecutar la opción elegida usando un switch
        switch (opcion) {
            case 1:
                IniciarCargaEquipos();
                break;
            case 2:
                ApostarPorPronostico();
                break;
            case 3:
                VerPuntos();
                break;
            case 4:
                Salir();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        // Cerrar el Scanner
        sc.close();
    }
}
