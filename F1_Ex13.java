package exercicios;

import java.util.Scanner;

public class F1_Ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.println("Informe um número: ");
		n = in.nextInt();
		
		System.out.print("O fatorial de " + n + " é: ");
		
		for (int i = n - 1; i >= 1; i--) {
			n *= i;
		}
		
		System.out.print(n);
		
		in.close();

	}

}
