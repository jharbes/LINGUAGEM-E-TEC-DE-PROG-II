package model.entities;

//para que seja possivel fazer o sort agora que a lista eh do tipo Employee
// teremos que implementar a interface comparable
public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {

		// para ordenar em ordem decrescente basta colocar um sinal de menos (-) na
		// frente do metodo compareTo sendo chamado
		return this.name.compareTo(other.getName());
	}

	@Override
	public String toString() {

		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
