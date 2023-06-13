package heranca4;

public class IngressoVIP extends Ingresso{
	public float valorAdicional;
	
	public IngressoVIP() {}
	
	public IngressoVIP(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		this.valor += valorAdicional;
		return "IngressoVIP [valor= R$" + this.valor  + "]";
	}
	
	
}
