package geometria;

public class Circulo extends Figura {
	public Circulo() {
		super();
	}

	public Circulo(String cor, boolean filled) {
		super(cor, filled);
	}
	
	public Circulo(String cor, boolean filled, float raio) {
		super(cor, filled);
		this.raio = raio;
	}

	private double raio;
	
	public double calcularaio() {
		double area = Math.pow(raio, 2) * Math.PI;
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro = Math.PI * 2 * raio;
		return perimetro;
	}
	
}
