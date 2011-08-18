package negocio;

public class Categoria {
	private int idCategoria;
	private String tipo;
	private float pesoMacho,pesoHembra,
	pesoFinalH,pesoFinalM,gananciaDiariaH,gananciaDiariaM;
	public Categoria(int idCategoria, String tipo, float pesoMacho,
			float pesoHembra, float pesoFinalH, float pesoFinalM) {
		super();
		this.idCategoria = idCategoria;
		this.tipo = tipo;
		this.pesoMacho = pesoMacho;
		this.pesoHembra = pesoHembra;
		this.pesoFinalH = pesoFinalH;
		this.pesoFinalM = pesoFinalM;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPesoMacho() {
		return pesoMacho;
	}
	public void setPesoMacho(float pesoMacho) {
		this.pesoMacho = pesoMacho;
	}
	public float getPesoHembra() {
		return pesoHembra;
	}
	public void setPesoHembra(float pesoHembra) {
		this.pesoHembra = pesoHembra;
	}
	public float getPesoFinalH() {
		return pesoFinalH;
	}
	public void setPesoFinalH(float pesoFinalH) {
		this.pesoFinalH = pesoFinalH;
	}
	public float getPesoFinalM() {
		return pesoFinalM;
	}
	public void setPesoFinalM(float pesoFinalM) {
		this.pesoFinalM = pesoFinalM;
	}
	public float getGananciaDiariaH() {
		return gananciaDiariaH;
	}
	public void setGananciaDiariaH(float gananciaDiariaH) {
		this.gananciaDiariaH = gananciaDiariaH;
	}
	public float getGananciaDiariaM() {
		return gananciaDiariaM;
	}
	public void setGananciaDiariaM(float gananciaDiariaM) {
		this.gananciaDiariaM = gananciaDiariaM;
	}
	public void insert(){
		
	}
	public void update(){
		
	}
	public void delete(){
		
	}
}
