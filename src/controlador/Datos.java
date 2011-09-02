package controlador;


import java.text.SimpleDateFormat;
import java.util.Date;

import sistemaAdministracionGanadera.SistemaAdministracionGanadera;

public class Datos {
	/*
	 * Clase de Inserci�n de datos.
	 */
	private static SistemaAdministracionGanadera sistema;
	private static Datos datos;
	
	private Datos(){
		sistema=SistemaAdministracionGanadera.getInstancia();
		insertarCategoria(sistema);
		insertarRodeos(sistema);
		insertarMovimientosRodeo(sistema);
		
	}
	public static Datos getInstancia(){
		if(datos==null)
			datos=new Datos();
		return datos;
	}
	public void insertarCategoria(SistemaAdministracionGanadera sistema){
		sistema.nuevaCategoria(1, "vaca", 60, 55, 120, 100);
		sistema.nuevaCategoria(2, "vaquillona", 40, 35, 60, 55);
		sistema.nuevaCategoria(3, "novillo", 5, 6, 40, 35);
	}
	public void insertarRodeos(SistemaAdministracionGanadera sistema){
		try{
			SimpleDateFormat forma=new SimpleDateFormat("dd-mm-yyyy");
			String fecha="20-01-1999";
			Date f=forma.parse(fecha);
			sistema.nuevoRodeo(1, f, "Hereford", 1);
			sistema.nuevoRodeo(2, f, "Hereford", 2);
			sistema.nuevoRodeo(3, f, "Hereford", 3);
			sistema.nuevoRodeo(4, f, "Angus", 1);
			sistema.nuevoRodeo(5, f, "Angus", 2);
			sistema.nuevoRodeo(6, f, "Angus", 3);
			sistema.nuevoRodeo(7, f, "Charolaise", 1);
			sistema.nuevoRodeo(8, f, "Charolaise", 2);
			sistema.nuevoRodeo(9, f, "Charolaise", 3);
			sistema.nuevoRodeo(10, f, "Pardo", 1);
			sistema.nuevoRodeo(11, f, "Pardo", 2);
			sistema.nuevoRodeo(12, f, "Pardo", 3);
			sistema.nuevoRodeo(13, f, "Criolla", 1);
			sistema.nuevoRodeo(14, f, "Criolla", 2);
			sistema.nuevoRodeo(15, f, "Criolla", 3);
		}catch(Exception ex){
			System.out.println("error insertar rodeo");
		}
	}
	public void insertarMovimientosRodeo(SistemaAdministracionGanadera sistema){
		try{
			SimpleDateFormat forma=new SimpleDateFormat("dd-mm-yyyy");
			String fecha="20-01-1999";
			Date f=forma.parse(fecha);
			sistema.nuevoMovimientoDeRodeo(1, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(1, j, 15, 2, 1, 3, 0);
			}
			fecha="20-02-1999";
			sistema.nuevoMovimientoDeRodeo(2, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(2, j, 15, 2, 1, 3, 2);
			}
			fecha="20-03-1999";
			sistema.nuevoMovimientoDeRodeo(3, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(3, j, 15, 2, 1, 3, 3);
			}
			fecha="20-04-1999";
			sistema.nuevoMovimientoDeRodeo(4, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(4, j, 15, 2, 1, 3, 4);
			}
			fecha="20-05-1999";
			sistema.nuevoMovimientoDeRodeo(5, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(5, j, 15, 2, 1, 5, 0);
			}
			
			fecha="20-05-1999";
			sistema.nuevoMovimientoDeRodeo(6, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(6, j, 15, 2, 1, 3, 6);
			}
			fecha="20-07-1999";
			sistema.nuevoMovimientoDeRodeo(7, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(7, j, 15, 2, 7, 3, 0);
			}
			fecha="20-08-1999";
			sistema.nuevoMovimientoDeRodeo(8, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(8, j, 15, 2, 8, 3, 0);
			}
			fecha="20-09-1999";
			sistema.nuevoMovimientoDeRodeo(9, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(9, j, 15, 9, 1, 3, 0);
			}
			fecha="20-10-1999";
			sistema.nuevoMovimientoDeRodeo(10, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(10, j, 15, 2, 1, 3, 0);
			}
			fecha="20-11-1999";
			sistema.nuevoMovimientoDeRodeo(11, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(11, j, 15, 2, 1, 3, 0);
			}
			fecha="20-12-1999";
			sistema.nuevoMovimientoDeRodeo(12, "empleado01", f);
			for(int j=1;j<16;j++){
				sistema.agregarRodeo(12, j, 15, 2, 1, 3, 0);
			}
		}catch(Exception ex)
		{
			
		}
	}
}
