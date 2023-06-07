package contatos;

public class PessoaFisica extends Contato {
	private String data_nascimento;
	private String estado_civil;
	
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String nome, String email, String endereco) {
		super(nome, email, endereco);
	}
	
	public PessoaFisica(String nome, String email, String endereco, String datanascimento, String estado_civil) {
		super(nome, email, endereco);
		this.setData_nascimento(datanascimento);
		this.setEstado_civil(estado_civil);
	}
}
