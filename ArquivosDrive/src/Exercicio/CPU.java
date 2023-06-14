package Exercicio;

public class CPU {
	private String placamae;
	private String processador;
	private String hd;
	private int memoriaram;
	private String fonte; 
	private String estabilizador;
	private int disco;
	public String getPlacamae() {
		return placamae;
	}
	public void setPlacamae(String placamae) {
		this.placamae = placamae;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getHd() {
		return hd;
	}
	public void setHd(String hd) {
		this.hd = hd;
	}
	public int getMemoriaram() {
		return memoriaram;
	}
	public void setMemoriaram(int memoriaram) {
		this.memoriaram = memoriaram;
	}
	public String getFonte() {
		return fonte;
	}
	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
	public String getEstabilizador() {
		return estabilizador;
	}
	public void setEstabilizador(String estabilizador) {
		this.estabilizador = estabilizador;
	}
	public int getDisco() {
		return disco;
	}
	public void setDisco(int disco) {
		this.disco = disco;
	}
	@Override
	public String toString() {
		return "CPU [placamae=" + placamae + ", processador=" + processador + ", hd=" + hd + ", memoriaram="
				+ memoriaram + ", fonte=" + fonte + ", estabilizador=" + estabilizador + ", disco=" + disco + "]";
	}
}
