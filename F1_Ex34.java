package exercicios;

import java.util.Scanner;

public class F1_Ex34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, num;
		
		System.out.println("Informe um número positivo até 100: ");
		num = in.nextInt();
		
		while (num > 0) {
			
			if (num <= 25) {
				quant1++;
			} else if (num <= 50) {
				quant2++;
			} else if (num <= 75) {
				quant3++;
			} else {
				quant4++;
			}
			
			System.out.println("Informe um número positivo até 100 (informe um número negativo para parar: ");
			num = in.nextInt();
		}
		
		System.out.println(quant1 + " números ficaram entre 0 e 25");
		System.out.println(quant2 + " números ficaram entre 25 e 50");
		System.out.println(quant3 + " números ficaram entre 50 e 75");
		System.out.println(quant4 + " números ficaram entre 75 e 100");
		
		in.close();

	}

}
