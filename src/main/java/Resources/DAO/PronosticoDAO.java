package Resources.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PronosticoDAO{
    
    private Connection conexion;  // 

    public PronosticoDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public void guardarPronostico(String participante, String partido, int golesEquipo1, int golesEquipo2) {
        String query = "INSERT INTO apuestas (participante, partido, goles_equipo1, goles_equipo2) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement preparedStatement = conexion.prepareStatement(query)) {
            preparedStatement.setString(1, participante);
            preparedStatement.setString(2, partido);
            preparedStatement.setInt(3, golesEquipo1);
            preparedStatement.setInt(4, golesEquipo2);

            // Ejecutar la inserción
            preparedStatement.executeUpdate();
            
            System.out.println("Apuesta guardada en la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al guardar la apuesta en la base de datos: " + e.getMessage());
        }
    }
}

