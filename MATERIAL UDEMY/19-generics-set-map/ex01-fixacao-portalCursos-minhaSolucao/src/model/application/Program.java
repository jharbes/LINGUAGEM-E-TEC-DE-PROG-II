package model.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Set<Integer> setCursoA = new HashSet<>();
		System.out.print("How many students for course A? ");
		Integer numAlunos = teclado.nextInt();
		for (int i = 1; i <= numAlunos; i++) {
			Integer idAluno = teclado.nextInt();
			setCursoA.add(idAluno);
		}

		Set<Integer> setCursoB = new HashSet<>();
		System.out.print("How many students for course B? ");
		numAlunos = teclado.nextInt();
		for (int i = 1; i <= numAlunos; i++) {
			Integer idAluno = teclado.nextInt();
			setCursoB.add(idAluno);
		}

		Set<Integer> setCursoC = new HashSet<>();
		System.out.print("How many students for course C? ");
		numAlunos = teclado.nextInt();
		for (int i = 1; i <= numAlunos; i++) {
			Integer idAluno = teclado.nextInt();
			setCursoC.add(idAluno);
		}

		setCursoA.addAll(setCursoC);
		setCursoA.addAll(setCursoB);
		System.out.println("Total students: "+ setCursoA.size());

		teclado.close();
	}

}
