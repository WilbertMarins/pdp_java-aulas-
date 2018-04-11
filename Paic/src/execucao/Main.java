package execucao;

import modelo.Empregado;
import modelo.Projeto;
import modelo.TrabalhaEm;

public class Main {

	public static void main(String[] args) {
		Empregado emp1 = new Empregado("Empregado 1", "111.111.111-11", "12436578", "Rua de preda");
		Empregado emp2 = new Empregado("Empregado 2", "211.111.111-11", "22236578", "Rua de predaa");
		Empregado emp3 = new Empregado("Empregado 3", "111.111.111-33", "33336578", "Rua de preeda");
		
		Projeto proj1 = new Projeto("Projeto de Robô", "NuComp", "De robô de pedra", "Sala 1");
		Projeto proj2 = new Projeto("Projeto de Roobô", "NuCoomp", "De roobô de pedra", "Sala 2");
		Projeto proj3 = new Projeto("Projeto de RRobô", "NuuComp", "De robô de pedraa", "Sala 3");
		
		TrabalhaEm assosc1 = new TrabalhaEm(emp1, proj1, "02/02/18");
		TrabalhaEm assosc2 = new TrabalhaEm(emp1, proj3, "03/02/18");
		TrabalhaEm assosc3 = new TrabalhaEm(emp3, proj2, "04/03/18");
		TrabalhaEm assosc4 = new TrabalhaEm(emp2, proj1, "05/02/18");
		TrabalhaEm assosc5 = new TrabalhaEm(emp3, proj3, "06/04/18");
		TrabalhaEm assosc6 = new TrabalhaEm(emp2, proj2, "07/04/18");
		
		assosc1.mostrarDados();
	}

}
