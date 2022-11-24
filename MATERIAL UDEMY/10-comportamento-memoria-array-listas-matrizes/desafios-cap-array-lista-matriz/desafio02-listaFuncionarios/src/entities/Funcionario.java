package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario(Integer id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return id+", "+nome+", "+String.format("%.2f",this.salario);
	}

	public void increaseSalary(Double percentage) {
		this.salario=this.salario*(1+percentage*0.01);
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
