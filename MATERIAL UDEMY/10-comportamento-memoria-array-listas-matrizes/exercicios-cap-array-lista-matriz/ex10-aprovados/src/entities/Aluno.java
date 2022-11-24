package entities;

public class Aluno {
	private String nome;
	private float notaSemestre1;
	private float notaSemestre2;
	
	public Aluno(String nome, float notaSemestre1, float notaSemestre2) {
		super();
		this.nome = nome;
		this.notaSemestre1 = notaSemestre1;
		this.notaSemestre2 = notaSemestre2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNotaSemestre1() {
		return notaSemestre1;
	}

	public void setNotaSemestre1(float notaSemestre1) {
		this.notaSemestre1 = notaSemestre1;
	}

	public float getNotaSemestre2() {
		return notaSemestre2;
	}

	public void setNotaSemestre2(float notaSemestre2) {
		this.notaSemestre2 = notaSemestre2;
	}
	
	
}
