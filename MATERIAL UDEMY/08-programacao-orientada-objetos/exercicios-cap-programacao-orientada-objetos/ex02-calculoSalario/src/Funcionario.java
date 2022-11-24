
public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return this.salarioBruto-this.imposto;
	}
	
	public void aumentoSalario(double aumento) {
		this.salarioBruto+=this.salarioBruto*(0.01*aumento);
	}
}
