package geometria;

public class Figura {
	private String cor;
	private boolean filled;
	
	public Figura() {}
	
	public Figura(String cor, boolean filled) {
		super();
		this.cor = cor;
		this.filled = filled;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
}
