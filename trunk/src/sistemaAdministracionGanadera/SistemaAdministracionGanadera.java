package sistemaAdministracionGanadera;

import java.util.Vector;

import negocio.Categoria;
import negocio.MovimientoDeRodeo;
import negocio.PrediccionMuerte;
import negocio.PrediccionNacimiento;
import negocio.Rodeo;
import negocio.PrediccionPreniez;


/**
 * Todavia no se si sirve esta clase, ni para que se usara, por el momento queda inconclusa 
 * 
 * @author mariela
 *
 */
public class SistemaAdministracionGanadera {

	private static SistemaAdministracionGanadera sistemaSAG;
	private Vector<MovimientoDeRodeo> movimientosDeRodeo;
	private Vector<Categoria> categorias;
	private Vector<Rodeo> rodeos;
	private Vector<PrediccionMuerte> prediccionMuertes;
	private Vector<PrediccionNacimiento> prediccionNacimiento;
	private Vector<PrediccionPreniez> prediccionPreniez;
	public static SistemaAdministracionGanadera getInstancia(){
		if(sistemaSAG==null)
			sistemaSAG=new SistemaAdministracionGanadera();
		return sistemaSAG;
	}
	public SistemaAdministracionGanadera(){
		movimientosDeRodeo=new  Vector<MovimientoDeRodeo>();
		rodeos=new Vector<Rodeo>();
		categorias=new Vector<Categoria>();
		prediccionMuertes=new Vector<PrediccionMuerte>();
		prediccionNacimiento=new Vector<PrediccionNacimiento>();
		prediccionPreniez=new Vector<PrediccionPreniez>();
	}
}
