package exercicios;

import java.util.Scanner;

public class F1_Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] num = new int[10];
		int quant_par = 0, quant_impar = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o " + (i+1) + "º número: ");
			num[i] = in.nextInt();
			
			if (num[i] % 2 == 0) {
				quant_par++;
			} else {
				quant_impar++;
			}
		}
		
		System.out.println("Quantidade de números pares: " + quant_par);
		System.out.println("Quantidade de número impares: " + quant_impar);
		
		in.close();
	}

}
