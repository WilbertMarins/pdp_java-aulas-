public class Gato {
	String nome;
	int idade;
	float peso;
	
	void comer() {
		System.out.println(nome + " esta comendo !! " );
		peso+=2;
		System.out.println("o novo peso e :" + peso);
}
	void correr() {
		System.out.println(nome + " esta correndo,  vai passar mal pois acabou de comer !! " );
		peso--;
		System.out.println("o novo peso e :" + peso);
}
	void fazerAniversario() {
		System.out.println(nome + " parabens " );
		idade++;
		System.out.println("a nova idade e :" + idade);
	}
	void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso:" + peso);
		
}
}
