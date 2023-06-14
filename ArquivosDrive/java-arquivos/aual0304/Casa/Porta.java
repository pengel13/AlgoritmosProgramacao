package Casa;

public class Porta {
	private String material;  // não pode mexer em material sem usar get e set
	private double altura;
	private double largura;
	private double espessura;
	private String Cor;
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
	@Override
	public String toString() {
		return "Porta [material=" + material + ", altura=" + altura + ", largura=" + largura + ", espessura="
				+ espessura + ", Cor=" + Cor + "]";
	}
}
