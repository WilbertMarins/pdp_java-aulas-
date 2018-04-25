package modelo;

public class Pessoa {
	private String nome,cpf;
	public Pessoa(String pNome,String pCpf) {
		this.setNome(pNome);
		this.setCpf(pCpf);
	}
	public void respirar() {
		System.out.println(this.nome + " está respirando");
	}
	public String obterDadosPessoais() {
		return (this.getNome()+" "+this.getCpf());
	}
	
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
