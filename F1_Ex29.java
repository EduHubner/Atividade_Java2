package exercicios;

import java.util.Scanner;

public class F1_Ex29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int inicio, fim, num;
		
		System.out.println("Informe um número: ");
		num = in.nextInt();
		
		System.out.println("Informe o número que deseja começar a tuabada: ");
		inicio = in.nextInt();
		
		do {
			System.out.println("Informe o número que deseja terminar a tabuada: ");
			fim = in.nextInt();
			if (fim < inicio) {
				System.out.println("O número que deseja terminar na tabuada tem que ser maior que a de inicio");
			} 
		} while (fim < inicio);
		
		for (int i = inicio; i <= fim; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		
		in.close();

	}

}
