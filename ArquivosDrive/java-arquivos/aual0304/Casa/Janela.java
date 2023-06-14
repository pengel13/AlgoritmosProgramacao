package Casa;

public class Janela {
	private String material;  // não pode mexer em material sem usar get e set
	private double altura;
	private double largura;
	private double espessura;
	private String Cor;
	public String TipoVidro;
	private boolean aberta = false;
	
	public Janela () {};
	public Janela (String material, double altura, double largura, 
			double espessura, String Cor, String TipoVidro, boolean aberta) {
		this.material = material;
		this.altura = altura;
		this.largura = largura;
		this.espessura = espessura;
		this.Cor = Cor;
		this.TipoVidro = TipoVidro;
		this.aberta = aberta;
	}
	@Override
	public String toString() {
		return "Janela [material=" + material + ", altura=" + altura + ", largura=" + largura + ", espessura="
				+ espessura + ", Cor=" + Cor + ", TipoVidro=" + TipoVidro + ", aberta=" + aberta + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getEspessura() {
		return espessura;
	}
	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getTipoVidro() {
		return TipoVidro;
	}
	public void setTipoVidro(String tipoVidro) {
		TipoVidro = tipoVidro;
	}
	public boolean isAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
	
}
