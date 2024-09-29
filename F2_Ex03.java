package exercicios;

import java.util.Scanner;

public class F2_Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int soma = 0;
		int num[] = new int[4];
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Informa " + (i+1) + "ª nota: ");
			num[i] = in.nextInt();
			soma += num[i];
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println(num[i]);
		}
		System.out.println("Média " + (soma/4));
		in.close();
	}

}
