package agenda;

public class ContatoPessoaJuridica extends Contato{
	private String cnpj;
	
	//construtor 
	public ContatoPessoaJuridica(String umNome, String umTelefone, String umCnpj) {
		super(umNome,umTelefone);
		this.cnpj=umCnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
