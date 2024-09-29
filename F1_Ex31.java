package exercicios;

import java.util.Scanner;

public class F1_Ex31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num_al, num_al_maior = 0, num_al_menor = 0;
		float alt, maior = 0, menor = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("informe o número do aluno: ");
			num_al = in.nextInt();
			
			System.out.println("Informe a altura do aluno: ");
			alt = in.nextFloat();
			
			if (i == 0) {
				num_al_maior = num_al_menor = num_al;
				maior = menor = alt;
			}
			
			if (alt > maior) {
				num_al_maior = num_al;
				maior = alt;
			} else if (alt < menor) {
				num_al_menor = num_al;
				menor = alt;
			}
			
			
		}
		
		System.out.println("O Aluno com codigo " + num_al_maior + " é o mais alto com " + maior + "m");
		System.out.println("O Aluno com codigo " + num_al_menor + " é o mais baixo com " + menor + "m");
		
		in.close();

	}

}
