package modelo;

public class Pessoa {
	String nome, endereco, fone;	
	public Pessoa (String nome,String end ,String fon) {
	this.nome = nome;
	this.endereco = end;
	this.fone = fon;
	}
	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("endereço: " + this.endereco);
		System.out.println("telefone: " + this.fone);
	}	
}

package execucao;
import modelo.Pessoa;
public class Execucao {
	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa("Frajola","zika da rua 12","(92)98135-7843");
		pes1.imprimir();
	}
}
