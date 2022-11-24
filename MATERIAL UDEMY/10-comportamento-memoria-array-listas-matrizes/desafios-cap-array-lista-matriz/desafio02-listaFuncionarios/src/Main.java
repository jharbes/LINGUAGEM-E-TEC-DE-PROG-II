import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n=teclado.nextInt();
		
		List<Funcionario> lista=new ArrayList<>();
		
		Integer id;
		Integer posicao=-1;
		String nome;
		Double salario,porcentagem;
		
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("Id: ");
			id=teclado.nextInt();
			System.out.print("Name: ");
			teclado.nextLine();
			nome=teclado.nextLine();	
			System.out.print("Salary: ");
			salario=teclado.nextDouble();
			Funcionario f1=new Funcionario(id,nome,salario);
			lista.add(f1);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		id=teclado.nextInt();
		
		for (int i=0;i<lista.size();i++) {
			if (lista.get(i).getId()==id)
				posicao=i;
		}
		
		if (posicao==-1)
			System.out.println("This id does not exist!");
		else {
			System.out.print("Enter the percentage: ");
			porcentagem=teclado.nextDouble();
			System.out.println();
			lista.get(posicao).increaseSalary(porcentagem);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).toString());
		}
			
		teclado.close();
	}

}
