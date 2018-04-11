package modelo;

public class TrabalhaEm {
	private Empregado emp;
	private Projeto proj;
	private String data;
	
	public TrabalhaEm(Empregado emp, Projeto proj, String data){
		this.setEmp(emp);
		this.setProj(proj);
		this.setData(data);
	}

	
	public TrabalhaEm(){
//		construtor padrão, Java inicializa
	}
	
	public void mostrarDados(){
		this.getEmp().mostrarDados();
		this.getProj().mostrarDados();
	}
	
	public Empregado getEmp() {
		return emp;
	}
	public void setEmp(Empregado emp) {
		this.emp = emp;
	}
	public Projeto getProj() {
		return proj;
	}
	public void setProj(Projeto proj) {
		this.proj = proj;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
