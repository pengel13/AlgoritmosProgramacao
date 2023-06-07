package gerente;


public class Cliente extends Pessoa {

	private int codigo;
	
	public Cliente() {}
	
	public Cliente (String nome, int dia, int mes, int ano, int codigo) {
		this.setNome(nome);
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
		this.setCodigo(codigo);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", getNome()=" + getNome() + ", getDia()=" + getDia() + ", getMes()="
				+ getMes() + ", getAno()=" + getAno() + ", getClass()=" + getClass() + "]";
	}

	public void imprimeDados() {
		System.out.println(this.toString());
	}
}
