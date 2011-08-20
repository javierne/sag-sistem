package negocio;

import java.util.Date;
import java.util.Vector;

public class MovimientoDeRodeo {
	private int idMovimiento;
	private String legajo;
	private Date fecha;
	private Vector<Rodeo> rodeos;
	private int nacimientos,muertes,abortos,transferenciasDescarte,
	transferenciasRodeos;
	public MovimientoDeRodeo(int idMovimiento, String legajo, Date fecha) {
		super();
		this.idMovimiento = idMovimiento;
		this.legajo = legajo;
		this.fecha = fecha;
		this.rodeos=new Vector<Rodeo>();
	}
	public int getIdMovimiento() {
		return idMovimiento;
	}
	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Vector<Rodeo> getRodeos() {
		return rodeos;
	}
	public void setRodeos(Vector<Rodeo> rodeos) {
		this.rodeos = rodeos;
	}
	public int getNacimientos() {
		return nacimientos;
	}
	public void setNacimientos(int nacimientos) {
		this.nacimientos = nacimientos;
	}
	public int getMuertes() {
		return muertes;
	}
	public void setMuertes(int muertes) {
		this.muertes = muertes;
	}
	public int getAbortos() {
		return abortos;
	}
	public void setAbortos(int abortos) {
		this.abortos = abortos;
	}
	public int getTransferenciasDescarte() {
		return transferenciasDescarte;
	}
	public void setTransferenciasDescarte(int transferenciasDescarte) {
		this.transferenciasDescarte = transferenciasDescarte;
	}
	public int getTransferenciasRodeos() {
		return transferenciasRodeos;
	}
	public void setTransferenciasRodeos(int transferenciasRodeos) {
		this.transferenciasRodeos = transferenciasRodeos;
	}
	public void insert(){
		
	}
	public void update(){
		
	}
	public void delete(){
		
	}
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
}
