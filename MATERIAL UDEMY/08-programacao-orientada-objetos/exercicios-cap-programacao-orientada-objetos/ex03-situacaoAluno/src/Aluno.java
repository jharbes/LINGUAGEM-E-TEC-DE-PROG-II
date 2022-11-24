
public class Aluno {
	public String nome;
	double n1,n2,n3;
	
	public void status() {
		System.out.printf("FINAL GRADE = %.2f%n",n1+n2+n3);
		System.out.printf((n1+n2+n3)>60?"PASS":"FAILED%nMISSING %.2f POINTS",60-(n1+n2+n3));
	}
	
	public Aluno() {
		
	}

	public Aluno(String nome, double n1, double n2, double n3) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	
}
