package negocio;

import java.util.Date;

public class Rodeo {
	private int idRodeo;
	private MovimientoDeRodeo movimiento;
	private Date fecha;
	private String raza;
	private Categoria categoria;
	private int existenciaInicial,muertes,nacimientos,deRodeo,
	transferenciasDescarte,abortos,transferenciasRodeo,ventas,existenciaFinal;
	
	
	
	public Rodeo(int idRodeo, Date fecha, String raza, Categoria categoria) {
		super();
		this.idRodeo = idRodeo;
		this.fecha = fecha;
		this.raza = raza;
		this.categoria = categoria;
	}
	public int getIdRodeo() {
		return idRodeo;
	}
	public void setIdRodeo(int idRodeo) {
		this.idRodeo = idRodeo;
	}
	public MovimientoDeRodeo getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(MovimientoDeRodeo movimiento) {
		this.movimiento = movimiento;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getExistenciaInicial() {
		return existenciaInicial;
	}
	public void setExistenciaInicial(int existenciaInicial) {
		this.existenciaInicial = existenciaInicial;
	}
	public int getMuertes() {
		return muertes;
	}
	public void setMuertes(int muertes) {
		this.muertes = muertes;
	}
	public int getNacimientos() {
		return nacimientos;
	}
	public void setNacimientos(int nacimientos) {
		this.nacimientos = nacimientos;
	}
	public int getDeRodeo() {
		return deRodeo;
	}
	public void setDeRodeo(int deRodeo) {
		this.deRodeo = deRodeo;
	}
	public int getTransferenciasDescarte() {
		return transferenciasDescarte;
	}
	public void setTransferenciasDescarte(int transferenciasDescarte) {
		this.transferenciasDescarte = transferenciasDescarte;
	}
	public int getAbortos() {
		return abortos;
	}
	public void setAbortos(int abortos) {
		this.abortos = abortos;
	}
	public int getTransferenciasRodeo() {
		return transferenciasRodeo;
	}
	public void setTransferenciasRodeo(int transferenciasRodeo) {
		this.transferenciasRodeo = transferenciasRodeo;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	public int getExistenciaFinal() {
		return existenciaFinal;
	}
	public void setExistenciaFinal(int existenciaFinal) {
		this.existenciaFinal = existenciaFinal;
	}
	public void insert(){
		
	}
	public void update(){
		
	}
	public void delete(){
		
	}
	
}
