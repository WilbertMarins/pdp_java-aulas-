package modelo;

public class Engenheiro extends Pessoa {
	private int numCREA;
	
	public Engenheiro( String pNome,String pCpf,int pCREA) {
		super(pNome,pCpf);
		this.numCREA=pCREA;
	}
	
	public void projetar() {
		System.out.println( this.getNome()+ "está projetando");
	}
	
	public void emitinAvaliacaoTecnica() {
		System.out.println(this.getNome() + "," +this.getNumCREA() + "esta emitindo avaliação técnica");
	}
	
	
	public int getNumCREA() {
		return numCREA;
	}
	public void setNumCREA(int numCREA) {
		this.numCREA = numCREA;
	}



	

}
