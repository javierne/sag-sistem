package controlador;

import java.util.Vector;

import negocio.Categoria;
import negocio.MovimientoDeRodeo;
import negocio.Rodeo;

public class Sistema {
	private static Sistema sistemaSAG;
	private Vector<MovimientoDeRodeo> movimientosDeRodeo;
	private Vector<Categoria> categorias;
	private Vector<Rodeo> rodeos;
	
	public static Sistema getInstancia(){
		if(sistemaSAG==null)
			sistemaSAG=new Sistema();
		return sistemaSAG;
	}
	public Sistema(){
		movimientosDeRodeo=new  Vector<MovimientoDeRodeo>();
		rodeos=new Vector<Rodeo>();
		categorias=new Vector<Categoria>();
	}
	
}
