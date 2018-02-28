public class Execucao {

	public static void main(String[] args) {
		Gato cat1 = new Gato();
		
		Gato cat2 = new Gato();
		
		cat1.nome = "Tom";
		cat1.idade = 12;
		cat1.peso = 3.5f;
		
		cat2.nome = "Frajola";
		cat2.idade = 7;
		cat2.peso = 5.7f;
		
		cat1.fazerAniversario();
		cat1.comer();
		cat1.correr();
		
		cat2.fazerAniversario();
		cat2.comer();
		cat2.correr();
		
		cat1.mostrarDados();
		cat2.mostrarDados();
		
		
	}

}
