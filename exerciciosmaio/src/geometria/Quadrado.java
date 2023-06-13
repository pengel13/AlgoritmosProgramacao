package geometria;

public class Quadrado extends Figura{
	private double lado;

	public Quadrado() {
		super();
	
	}

	public Quadrado(String cor, boolean filled) {
		super(cor, filled);
		
	}
	
	public Quadrado(String cor, boolean filled, double lado) {
		super(cor, filled);
		this.lado = lado;
	}
	
	public double calculaArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
}
