package exercicios;

import java.util.Scanner;

public class F1_Ex24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float  valor_cd, soma = 0;
		int num_cd;
		
		System.out.println("Informe o número de Cds comprados: ");
		num_cd = in.nextInt();
	
		for (int i = 0; i < num_cd; i++) {
			do {
				System.out.println("Informe o valor do  " + (i+1) + "º CD: " );
				valor_cd = in.nextFloat();
				if (valor_cd < 0) {
					System.out.println("O valor informado não é possivel!");
				}
			} while (valor_cd < 0);
			
			soma += valor_cd;
		}
		
		System.out.println("A média de alunos por turma é igual a " + soma/num_cd);
		
		in.close();
	}

}
