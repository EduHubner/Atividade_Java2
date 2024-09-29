package exercicios;

import java.util.Scanner;

public class F1_Ex12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, atual = 1, anterior = 1, guarda;
		
		System.out.println("Informe até que termo desejas gerar a sequência de Fibonacci :");
		n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i <=2) {
				System.out.print("1 ");
			} else {
				System.out.print((atual + anterior) + " ");
				guarda = atual;
				atual += anterior;
				anterior = guarda;
			}
		}
		
		in.close();

	}

}
