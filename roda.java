package execucao;
import modelo.Pessoa;
public class Execucao {
	public static void main(String[] args) {
		Pessoa pes1 = new Pessoa("Frajola","zika da rua 12","(92)98135-7843");
		
		Pessoa[] vPessoas = new Pessoa[12];
		vPessoas[0]= new Pessoa("Rick","Rua SI ,casa 2017","1344-8424");
		vPessoas[1]= new Pessoa("Morty","Rua SI ,casa 2018","7765-6878");
		vPessoas[3]= new Pessoa("Professor","Rua casa da moeda ,casa 157","4782-7643");
		vPessoas[4]= new Pessoa("Berlin","Rua casa da moeda ,casa 157","3264-5468");
		vPessoas[5]= new Pessoa("Nairobi","Rua casa da moeda ,casa 157","6732-4834");
		vPessoas[6]= new Pessoa("Toquio","Rua casa da moeda ,casa 157","4326-0239");
		vPessoas[7]= new Pessoa("Rio","Rua casa da moeda ,casa 157","3428-2398");
		vPessoas[8]= new Pessoa("Denver","Rua casa da moeda ,casa 157","7324-7329");
		vPessoas[9]= new Pessoa("Moscou","Rua casa da moeda ,casa 157","6272-9353");
		vPessoas[10]= new Pessoa("Oslo","Rua casa da moeda ,casa 157","2658-3328");
		vPessoas[2]= new Pessoa("Arturo","Rua dos refens ,casa 171"," 3698-3243");
		for(int i = 0; i< vPessoas.length;i++){
			vPessoas[i].imprimir();
		}
		pes1.imprimir();
	}
}


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
