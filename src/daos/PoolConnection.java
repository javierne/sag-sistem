package daos;

import java.io.FileInputStream;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

public class PoolConnection {
	private String usuario,password,jdbc,servidor;
	private Vector<Connection> conexiones=new Vector<Connection>();
	private int cantidadConexiones;
	private static PoolConnection pool;
	
	public static PoolConnection getPoolConnection(){
		if(pool==null)
			pool=new PoolConnection();
		return pool;
	}
	private PoolConnection(){
		getConfiguration();
		for(int i=0; i<cantidadConexiones;i++){
			conexiones.add(connect());
		}
	}
	public void getConfiguration(){
		try{
			String arch="Config.txt";
			FileInputStream file=new FileInputStream(arch);
			Properties p=new Properties();
			p.load(file);
			file.close();
			jdbc=p.getProperty("jdbc");
			usuario=p.getProperty("usuario");
			password=p.getProperty("password");
			servidor=p.getProperty("servidor");
			cantidadConexiones=Integer.parseInt(p.getProperty("cantidadConexiones"));
		}catch(Exception e){
			System.out.println("Error al levantar datos de configuracion: "+e.getMessage());
			System.out.println("stack trace "+ e.getStackTrace());
		}
	}
	public Connection connect(){
		try{
			Connection c=null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String config=jdbc+servidor;
			DriverManager.getConnection(config,usuario, password);
			return c;
		}catch (SQLException sqlex){
			System.out.println("Error al levantar conexion: "+sqlex.getMessage());
			System.out.println("stack trace "+sqlex.getStackTrace());
			return null;
		}catch(Exception e){
			System.out.println("Error al levantar datos de configuracion: "+e.getMessage());
			System.out.println("stack trace "+ e.getStackTrace());
			return null;
		}
	}
	public Connection getConnection(){
		Connection c=null;
		if(conexiones.size()>0){
			c=conexiones.remove(0);
		}else{
			c=connect();
			System.out.println("Se creo conexion fuera de los parametros por default ");
		}
		return c;
	}
	public void releaseConnection(Connection c){
		conexiones.add(c);
	}
	public void closeConnections(){
		for(int i=0; i<conexiones.size();i++){
			try{
				conexiones.elementAt(i).close();
			}catch(SQLException e){
				System.out.println("Error al cerrar conexiones: "+e.getMessage());
				System.out.println("stack trace "+ e.getStackTrace());
			}
		}
	}
}
