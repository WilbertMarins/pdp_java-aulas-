package modelo;

import java.util.ArrayList;

public class Alocacao {
	ArrayList<TrabalhaEm> aloca;
	
	public Alocacao(){
//		construtor padrão, Java inicializa
	}
	
	public void cadastrarAlocacoes(Empregado emp, Projeto proj, String data){
		this.aloca.add(new TrabalhaEm(emp, proj, data));
	}
	
	public void listarAlocacoes(){
		for (int i = 0; i < this.aloca.size(); i++) {
			this.aloca.get(i).mostrarDados();
		}
	}
	
	public void excluirAlocacao(Empregado emp, Projeto proj){
		for (int i = 0; i < this.aloca.size(); i++) {
			if (this.aloca.get(i).getEmp().equals(emp) && this.aloca.get(i).getProj().equals(proj)) {
				this.aloca.remove(i);
				break;
			}
		}
	}
}
