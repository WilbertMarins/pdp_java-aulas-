//metodo ou nao so o tempo dira


//classe

package modelo;
public class Pessoa {
	String nome, endereco, fone;
	public Pessoa (String pNome,String pEnd ,String pFon) {
	nome = pNome;
	endereco = pEnd;
	fone = pFon;
	}
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("endereço: " + endereco);
		System.out.println("telefone: " + fone);
	}
}


//execuçao

package execucao;
import modelo.Pessoa;
public class Execucao {
	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa("Frajola","zika da rua 12","(92)98135-7843");
		pes1.imprimir();
	}
}

