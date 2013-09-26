package agenda;

public class ContatoPessoaFisica extends Contato {
	
	private String cpf;
	
	//construtor 
	public ContatoPessoaFisica(String umNome, String umTelefone, String umCpf) {
		super(umNome,umTelefone);
		this.cpf=umCpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
