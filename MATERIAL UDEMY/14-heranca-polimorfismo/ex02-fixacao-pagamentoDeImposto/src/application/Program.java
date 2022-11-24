package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		List<Pessoa> lista=new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		Integer numContribuintes=teclado.nextInt();
		
		for (int i=1;i<=numContribuintes;i++) {
			System.out.println("Tax payer #"+i+" data:");
			
			System.out.print("Individual or company (i/c)? ");
			char tipoContribuinte=teclado.next().charAt(0);
			
			System.out.print("Name: ");
			teclado.nextLine();
			String nome=teclado.nextLine();
			
			System.out.print("Anual income: ");
			Double rendaAnual=teclado.nextDouble();
			
			if (tipoContribuinte=='i') {
				System.out.print("Health expenditures: ");
				Double gastosComSaude=teclado.nextDouble();
				
				lista.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			}
			else {
				System.out.print("Number of employees: ");
				Integer numFuncionarios=teclado.nextInt();
				
				lista.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		Double totalImposto=0.0;
		
		System.out.println("\nTAXES PAID:");
		for (Pessoa p:lista) {
			System.out.println(p.getNome()+": $ "+String.format("%.2f", p.valorImposto()));
			totalImposto+=p.valorImposto();
		}
		
		System.out.println("\nTOTAL TAXES: $ "+String.format("%.2f", totalImposto));
		
		teclado.close();
	}

}
