package Resources.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import Resources.Conexion.Conexion;




public class DAO extends Conexion {
	@Override
	public Connection conectar() throws SQLException {
		return super.conectar();
	}

	@Override
	public void close() throws SQLException, ClassNotFoundException{
		super.close();
	}
	
	 

}
