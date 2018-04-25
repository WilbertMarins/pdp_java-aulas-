package execucao;

import modelo.Engenheiro;
import modelo.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engenheiro eng1 = new Engenheiro("João","111.111.111-11",23456);
		Pessoa pes1= new Pessoa("Juviuomar E. Filho","222.222.222.-22");
		
		System.out.println(eng1.obterDadosPessoais());
		System.out.println(pes1.obterDadosPessoais());
		
		pes1.respirar();
		eng1.respirar();
		

	}

}
