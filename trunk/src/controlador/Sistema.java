package controlador;

import java.util.Date;
import java.util.Vector;

import vista.PrediccionMuerteView;

import negocio.Categoria;
import negocio.MovimientoDeRodeo;
import negocio.PrediccionMuerte;
import negocio.PrediccionNacimiento;
import negocio.PrediccionPreñez;
import negocio.Rodeo;

public class Sistema {
	private static Sistema sistemaSAG;
	private Vector<MovimientoDeRodeo> movimientosDeRodeo;
	private Vector<Categoria> categorias;
	private Vector<Rodeo> rodeos;
	private Vector<PrediccionMuerte> prediccionMuertes;
	private Vector<PrediccionNacimiento> prediccionNacimiento;
	private Vector<PrediccionPreñez> prediccionPreniez;
	public static Sistema getInstancia(){
		if(sistemaSAG==null)
			sistemaSAG=new Sistema();
		return sistemaSAG;
	}
	public Sistema(){
		movimientosDeRodeo=new  Vector<MovimientoDeRodeo>();
		rodeos=new Vector<Rodeo>();
		categorias=new Vector<Categoria>();
		prediccionMuertes=new Vector<PrediccionMuerte>();
		prediccionNacimiento=new Vector<PrediccionNacimiento>();
		prediccionPreniez=new Vector<PrediccionPreñez>();
	}
	/* ABM RODEOS */
	public void nuevoRodeo(int idRodeo, Date fecha, String raza, int idCategoria){
		try{
			Rodeo r=this.buscarRodeo(idRodeo);
			if(r==null){
				Categoria c= this.buscarCategoria(idCategoria);
				if(c!=null){
					r=new Rodeo(idRodeo,fecha,raza,c); 
					r.insert();
					rodeos.add(r);
				}
			}
		}catch(Exception e){
			System.out.println("Error al crear Rodeo "+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
	}
	public void actualizarRodeo(int idRodeo, int idCategoria){//SUPONGO QUE ES CAMBIAR CATEGORIA
		try{
			Rodeo r= this.buscarRodeo(idRodeo);
			Categoria c=this.buscarCategoria(idCategoria);
			if(r!=null && c!=null)
			{
				r.setCategoria(c);
				r.update();
			}
		}catch(Exception e){
			System.out.println("Error al Actualizar Rodeo "+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
		
	}
	public void borrarRodeo(int idRodeo){
		try{
			
			
			for(int i=0;i<rodeos.size();i++){
				if(rodeos.elementAt(i).getIdRodeo()==idRodeo){
					Rodeo r=rodeos.elementAt(i);
					rodeos.remove(i);
					r.delete();
				}
			}
		}catch(Exception e){
			System.out.println("Error al borrar Rodeo "+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
	}
	/*BUSCAR*/
	public Rodeo buscarRodeo(int idRodeo) {
		Rodeo r=null;
		try{
			for(int i=0;i<rodeos.size();i++)
			{
				if(rodeos.elementAt(i).getIdRodeo()==idRodeo)
				{
					r=rodeos.elementAt(i);
					return r;
				}
			}
		}catch(Exception e){
			System.out.println("Error al buscar Rodeo "+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return r;
		}
		return r;//aqui va Persistencia
	}
	public Categoria buscarCategoria(int idCategoria){
		Categoria c=null;
		try{
			for(int i=0;i<categorias.size();i++){
				if(categorias.elementAt(i).getIdCategoria()==idCategoria){
					c=categorias.elementAt(i);
					return c;
				}
			}
		}catch(Exception e){
			System.out.println("Error al buscar Categoria "+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return c;
		}
		return c;//aqui va PERSISTENCIA
	}
	public MovimientoDeRodeo buscarMovimientoDeRodeo(int idMovimiento){
		MovimientoDeRodeo m=null;
		try{
			for(int i=0;i<movimientosDeRodeo.size();i++){
				if(movimientosDeRodeo.elementAt(i).getIdMovimiento()==idMovimiento){
					m=movimientosDeRodeo.elementAt(i);
					return m;
				}
			}
		}catch(Exception e){
			System.out.println("Error al buscar Movimiento "+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return m;
		}
		return m;//aqui va PERSISTENCIA
	}
	/* AM Categoria */
	public void nuevaCategoria(int idCategoria, String tipo, float pesoMacho,
			float pesoHembra, float pesoFMacho,float pesoFHembra){
		try{
			Categoria c=this.buscarCategoria(idCategoria);
			if(c==null){
				c=new Categoria(idCategoria, tipo, pesoMacho, pesoHembra, pesoFHembra, pesoFMacho);
				c.insert();
				categorias.add(c);
			}
		}catch(Exception e){
			System.out.println("Error al crear Categoria "+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
	}
	public void modificarCategoria(int idCategoria, String tipo, float pesoMacho,
			float pesoHembra, float pesoFMacho,float pesoFHembra){
		try{
			Categoria c=this.buscarCategoria(idCategoria);
			if(c!=null){
				c.setTipo(tipo);
				c.setPesoMacho(pesoMacho);
				c.setPesoHembra(pesoHembra);
				c.setPesoFinalM(pesoFMacho);
				c.setPesoFinalH(pesoFHembra);
				c.update();
			}
		}catch(Exception e){
			System.out.println("Error al modificar Categoria "+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
	}
	/* AM Movimientos Rodeo*/
	public void nuevoMovimientoDeRodeo(int idMovimiento, String legajo, Date fecha) {
		try{
			MovimientoDeRodeo m=this.buscarMovimientoDeRodeo(idMovimiento);
			if(m==null){
				m=new MovimientoDeRodeo(idMovimiento, legajo, fecha);
				movimientosDeRodeo.add(m);
				m.insert();
			}
		}catch(Exception e){
			System.out.println("Error al crear Movimiento"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
	}
	public void agregarRodeo(int idMovimiento,int idRodeo, int nacimientos,int muertes,int abortos,int descarte,int transRodeo){
		try {
			MovimientoDeRodeo m=this.buscarMovimientoDeRodeo(idMovimiento);
			Rodeo r=this.buscarRodeo(idRodeo);
			r.setNacimientos(nacimientos);
			r.setMuertes(muertes);
			r.setAbortos(abortos);
			r.setTransferenciasDescarte(descarte);
			r.setTransferenciasRodeo(transRodeo);
			m.getRodeos().add(r);
			m.update();
		}catch(Exception e){
			System.out.println("Error al agregar Rodeo a Movimiento"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
	}
	public void modificarMovimiento(int idMovimiento,int idRodeo, int nacimientos,int muertes,int abortos,int descarte,int transRodeo){
		try{
			MovimientoDeRodeo m=this.buscarMovimientoDeRodeo(idMovimiento);
			Rodeo r=this.buscarRodeo(idRodeo);
			r.setNacimientos(nacimientos);
			r.setMuertes(muertes);
			r.setAbortos(abortos);
			r.setTransferenciasDescarte(descarte);
			r.setTransferenciasRodeo(transRodeo);
			m.getRodeos().add(r);
			m.update();
		}catch(Exception e){
			System.out.println("Error al agregar Rodeo a Movimiento"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
	}
	/*PREDICCIONES*/
	public void generarPrediccionVolumenDeVenta(Date periodoInicial,Date periodoFinal, int idCategoria){
		try{
			float resultado=0;
			resultado=resultado+this.sumatoriaExistenciaFinal(periodoFinal,periodoInicial,idCategoria);
			resultado=resultado+this.sumatoriaTransferenciaDescarte(periodoFinal,periodoInicial,idCategoria);
			resultado=resultado-this.prediccionDeMuertes(periodoFinal,periodoInicial,idCategoria);
			
		}catch(Exception e){
			System.out.println("Error al Crear Prediccion Ventas"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
		}
	}
	public float prediccionDeMuertes(Date periodoInicial,Date periodoFinal, int idCategoria){
		try{
			Vector<MovimientoDeRodeo> movimientosEnPeriodo=this.buscarEnPeriodo(periodoInicial,periodoFinal);
			float resultado=0;
			Date periodoInicialAnioAnterior=new Date();//periodoInicial - 1 anio
			int mes=periodoInicial.getMonth();
			int dia=periodoInicial.getDate();
			int anio=periodoInicial.getYear()-1;
			periodoInicialAnioAnterior.setDate(dia);
			periodoInicialAnioAnterior.setMonth(mes);
			periodoInicialAnioAnterior.setYear(anio);
			Date periodoFinalAnioAnterior= new Date();//periodoFinal -1 anio
			int mesF=periodoFinal.getMonth();
			int diaF=periodoFinal.getDate();
			int anioF=periodoFinal.getYear()-1;
			periodoFinalAnioAnterior.setDate(diaF);
			periodoFinalAnioAnterior.setMonth(mesF);
			periodoFinalAnioAnterior.setYear(anioF);
			resultado=resultado+this.sumatoriaMuertesPeriodoAnterior(periodoInicialAnioAnterior,periodoFinalAnioAnterior);
			resultado=resultado/(this.existenciasFinalesAnioAnterior(periodoInicialAnioAnterior,periodoFinalAnioAnterior)+this.muertesAnioAnterior(periodoInicialAnioAnterior,periodoFinalAnioAnterior));
			resultado=resultado*this.sumatoriaExistenciaFinal(periodoInicial, periodoFinal, idCategoria);
			return resultado;
		}catch(Exception e){
			System.out.println("Error al realizar prediccion de Muertes"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return 0;
		}
		
	}
	public String generarPrediccionDePesoMacho(float pesoDeseado, int idCategoria){
		Categoria c=this.buscarCategoria(idCategoria);
		float resultado=0;
		try{
			
			resultado=resultado+(pesoDeseado-c.getPesoMacho());
			resultado=resultado/c.getGananciaDiariaM();
			String res="Prediccion peso macho"+resultado;
			return res;
		}catch(Exception e){
			System.out.println("Error al Crear Prediccion de peso macho"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return null;
		}
	}
	public String generarPredicciondePesoHembra(float pesoDeseado, int idCategoria){
		Categoria c=this.buscarCategoria(idCategoria);
		float resultado=0;
		try{
			
			resultado=resultado+(pesoDeseado-c.getPesoHembra());
			resultado=resultado/c.getGananciaDiariaH();
			String res="Prediccion peso hembra"+resultado;
			return res;
		}catch(Exception e){
			System.out.println("Error al Crear Prediccion de peso hembra"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return null;
		}
	}
	public float gananciaDiariaMacho(int idCategoria, int tiempoCrecimiento){
		float resultado=0;
		try{
			Categoria c=this.buscarCategoria(idCategoria);
			resultado=resultado+(c.getPesoFinalM()-c.getPesoMacho());
			resultado= resultado/tiempoCrecimiento;
			return resultado;
		}catch(Exception e){
			System.out.println("Error al Crear ganancia diaria macho"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return resultado;
		}
	}
	public float gananciaDiariaHembra(int idCategoria, int tiempoCrecimiento){
		float resultado=0;
		try{
			Categoria c=this.buscarCategoria(idCategoria);
			resultado=resultado+(c.getPesoFinalH()-c.getPesoHembra());
			resultado= resultado/tiempoCrecimiento;
			return resultado;
		}catch(Exception e){
			System.out.println("Error al Crear ganancia diaria hembra"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return resultado;
		}
	}
	
	/*FUNCIONALIDADES INTERNAS*/
	private float sumatoriaExistenciaFinal(Date periodoInicial,Date periodoFinal, int idCategoria){
		try{
			Vector<MovimientoDeRodeo> movimientosEnPeriodo=this.buscarEnPeriodo(periodoInicial,periodoFinal);
			
			return 0;
		}catch(Exception e){
			System.out.println("Error al realizar sumatoria Existencia Final"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return 0;
		}
	}
	private float sumatoriaTransferenciaDescarte(Date periodoInicial,Date periodoFinal, int idCategoria){
		try{
			Vector<MovimientoDeRodeo> movimientosEnPeriodo=this.buscarEnPeriodo(periodoInicial,periodoFinal);
			float sumatoria=0;
			for(int i=0;i<movimientosEnPeriodo.size();i++){
				sumatoria=sumatoria+movimientosEnPeriodo.elementAt(i).getTransferenciasDescarte();
			}
			return sumatoria;
		}catch(Exception e){
			System.out.println("Error al realizar sumatoria descarte"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return 0;
		}
	}

	private float sumatoriaMuertesPeriodoAnterior(Date periodoInicialAnioAnterior, Date periodoFinalAnioAnterior){
		Vector <MovimientoDeRodeo> movimientosEnPeriodo=this.buscarEnPeriodo(periodoInicialAnioAnterior, periodoFinalAnioAnterior);
		float resultado=0;
		try{
			for(int i=0;i<movimientosEnPeriodo.size();i++){
				resultado=resultado+movimientosEnPeriodo.elementAt(i).getMuertes();
			}
			return resultado;
		}catch(Exception e){
			System.out.println("Error al obtener datos de muertes del año pasado"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return resultado;
		}
	}
	private float existenciasFinalesAnioAnterior(Date periodoInicialAnioAnterior,Date periodoFinalAnioAnterior){
		Vector <MovimientoDeRodeo> movimientosEnPeriodo=this.buscarEnPeriodo(periodoInicialAnioAnterior, periodoFinalAnioAnterior);
		float resultado=0;
		try{
			//calcular existencias finales
			return resultado;
		}catch(Exception e){
			System.out.println("Error al obtener datos de existencias del año pasado"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return resultado;
		}
	}
	private float muertesAnioAnterior(Date periodoInicialAnioAnterior,Date periodoFinalAnioAnterior){//hace lo mismo que sumatoriaMuertesPeriodoAnterior??
		Vector <MovimientoDeRodeo> movimientosEnPeriodo=this.buscarEnPeriodo(periodoInicialAnioAnterior, periodoFinalAnioAnterior);
		float resultado=0;
		try{
			for(int i=0;i<movimientosEnPeriodo.size();i++){
				resultado=resultado+movimientosEnPeriodo.elementAt(i).getMuertes();
			}
			return resultado;
		}catch(Exception e){
			System.out.println("Error al obtener datos de muertes del año pasado"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return resultado;
		}
	}
	/*ME SEPARA EL PERIODO ENTRE FECHA INICIAL Y FINAL*/
	private Vector<MovimientoDeRodeo> buscarEnPeriodo(Date periodoInicial, Date periodoFinal){
		Vector <MovimientoDeRodeo> movimientosEnPeriodo=null;
		try{
			movimientosEnPeriodo=new Vector<MovimientoDeRodeo>();
			int indexInicial=0;
			int indexFinal=0;
			while(movimientosDeRodeo.elementAt(indexInicial).getFecha()!=periodoInicial){
				indexInicial++;
			}
			while(movimientosDeRodeo.elementAt(indexInicial).getFecha()!=periodoFinal){
				indexFinal++;
			}
			while(indexInicial!=indexFinal){
				movimientosEnPeriodo.add(movimientosDeRodeo.elementAt(indexInicial));
				indexInicial++;
			}
			return movimientosEnPeriodo;
		}catch(Exception e){
			System.out.println("Error al obtener datos del Periodo"+e.getMessage());
			System.out.println("Stack trace " +e.getStackTrace());
			return null;
		}
	}
}
