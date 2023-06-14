package Cliente;

public class Cliente {
	private String nome;
	private String endereco;
	private float renda;
	
	public Cliente() {}
	
	public Cliente(String nome, String endereco, float renda) {
		this.nome = nome;
		this.endereco = endereco;
		this.renda = renda;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public float getRenda() {
		return renda;
	}
	public void setRenda(float renda) {
		this.renda = renda;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", renda=" + renda + "]";
	}
	
	
	
}
