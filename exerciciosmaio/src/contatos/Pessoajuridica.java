package contatos;

public class Pessoajuridica extends Contato {
	public Pessoajuridica() {
		super();
	}
	
	public Pessoajuridica(String nome, String email, String endereco) {
		super(nome, email, endereco);
	}
	
	public Pessoajuridica(String nome, String email, String endereco, String CNPJ, String inscricao) {
		super(nome, email, endereco);
		this.setCNPJ(CNPJ);
		this.setInscricaoEstadual(inscricao);
	}
	private String CNPJ;
	private String inscricaoEstadual;
	
	
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
}
