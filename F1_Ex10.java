package exercicios;

import java.util.Scanner;

public class F1_Ex10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num, exp, result;
		
		System.out.println("Informe um número: ");
		num = in.nextInt();
		
		System.out.println("Informe o expoente para esse número: ");
		exp = in.nextInt();
		result = num;
		
		for (int i = 2; i <= exp; i++) {
			result *= num;
		}
		
		System.out.println("Resultado da potencia: " + result);
		
		in.close();

	}

}
