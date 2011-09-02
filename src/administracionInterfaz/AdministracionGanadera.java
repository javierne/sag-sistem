package administracionInterfaz;

import java.util.Date;
import java.util.Vector;

import negocio.Categoria;
import negocio.MovimientoDeRodeo;
import negocio.Rodeo;

/**
 * Interfaz con los servicios que serviran para el sistema: ABMs y predicciones
 * 
 * @author mariela
 *
 */
public interface AdministracionGanadera {

	public void nuevoRodeo(int idRodeo, Date fecha, String raza, int idCategoria);
	
	public void actualizarRodeo(int idRodeo, int idCategoria);
	
	public void borrarRodeo(int idRodeo);
	
	public Rodeo buscarRodeo(int idRodeo);
	
	public Categoria buscarCategoria(int idCategoria);
	
	public MovimientoDeRodeo buscarMovimientoDeRodeo(int idMovimiento);
	
	public void nuevaCategoria(int idCategoria, String tipo, float pesoMacho,float pesoHembra, float pesoFMacho,float pesoFHembra);
	
	public void modificarCategoria(int idCategoria, String tipo, float pesoMacho,float pesoHembra, float pesoFMacho,float pesoFHembra);
	
	public void nuevoMovimientoDeRodeo(int idMovimiento, String legajo, Date fecha) ;
	
	public void agregarRodeo(int idMovimiento,int idRodeo, int nacimientos,int muertes,int abortos,int descarte,int transRodeo);
	
	public void modificarMovimiento(int idMovimiento,int idRodeo, int nacimientos,int muertes,int abortos,int descarte,int transRodeo);
	
	public void generarPrediccionVolumenDeVenta(Date periodoInicial,Date periodoFinal, int idCategoria);
	
	public float prediccionDeMuertes(Date periodoInicial,Date periodoFinal, int idCategoria);
	
	public String generarPrediccionDePesoMacho(float pesoDeseado, int idCategoria);
	
	public String generarPredicciondePesoHembra(float pesoDeseado, int idCategoria);
	
	public float gananciaDiariaMacho(int idCategoria, int tiempoCrecimiento);
	
	public float gananciaDiariaHembra(int idCategoria, int tiempoCrecimiento);
	
	float sumatoriaExistenciaFinal(Date periodoInicial,Date periodoFinal, int idCategoria);
	
	float sumatoriaTransferenciaDescarte(Date periodoInicial,Date periodoFinal, int idCategoria);
	
	float sumatoriaMuertesPeriodoAnterior(Date periodoInicialAnioAnterior, Date periodoFinalAnioAnterior);
	
	float existenciasFinalesAnioAnterior(Date periodoInicialAnioAnterior,Date periodoFinalAnioAnterior);
	
	float muertesAnioAnterior(Date periodoInicialAnioAnterior,Date periodoFinalAnioAnterior);
	
	Vector<MovimientoDeRodeo> buscarEnPeriodo(Date periodoInicial, Date periodoFinal);
	
}
