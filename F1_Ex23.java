package exercicios;

import java.util.Scanner;

public class F1_Ex23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num_turma, num_alunos, soma = 0;
		
		System.out.println("Informe o núemro de turmas existentes: ");
		num_turma = in.nextInt();
	
		for (int i = 0; i < num_turma; i++) {
			do {
				System.out.println("Informe o número de alunos da turma " + (i+1) + " (max 40): " );
				num_alunos = in.nextInt();
				if (num_alunos < 1 || num_alunos > 40) {
					System.out.println("O número de alunos informados ultrapasso o possivel por sala ou não corresponde a um número positivo");
				}
			} while (num_alunos < 1 || num_alunos > 40);
			
			soma += num_alunos;
		}
		
		System.out.println("A média de alunos por turma é igual a " + soma/num_turma);
		
		in.close();
	}

}
