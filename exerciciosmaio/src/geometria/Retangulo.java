package geometria;

public class Retangulo extends Figura{
	private double ladomaior;
	private double ladomenor;
	public double getLadomaior() {
		return ladomaior;
	}
	public void setLadomaior(double ladomaior) {
		this.ladomaior = ladomaior;
	}
	public double getLadomenor() {
		return ladomenor;
	}
	public void setLadomenor(double ladomenor) {
		this.ladomenor = ladomenor;
	}
	public Retangulo() {
		super();
	}
	public Retangulo(String cor, boolean filled) {
		super(cor, filled);
	}
	public Retangulo(String cor, boolean filled, double ladomaior, double ladomenor) {
		super(cor, filled);
		this.ladomaior = ladomaior;
		this.ladomenor = ladomenor;
	}
	public double calculaArea() {
		double area = ladomenor * ladomaior;
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro = 2 * ladomenor + 2 * ladomaior; 
		return perimetro;
	}
	
	
}
