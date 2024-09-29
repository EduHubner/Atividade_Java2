package exercicios;

import java.util.Scanner;

public class F2_Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char letra[] = new char[10];
		int quant = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um número: ");
			letra[i] = in.nextLine().charAt(0);
			if (letra[i] != 'a' && letra[i] != 'e' && letra[i] != 'i' && letra[i] != 'o' && letra[i] != 'u') {
				quant++;
				System.out.println(letra[i]);
			}
		}
		
		System.out.println("Quantidade de consoantes: " + quant);
		
		in.close();
	}

}
