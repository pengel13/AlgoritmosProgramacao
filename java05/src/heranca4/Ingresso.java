package heranca4;

public class Ingresso {
	public float valor;

	
	public Ingresso() {}
	
	public Ingresso(float valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Ingresso [valor= R$" + valor + "]";
	}
	
	
}
