package exercicios;

import java.util.Scanner;

public class F1_Ex19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, quant_div = 0;
		boolean primo = true;

		
		System.out.println("Informe um número: ");
		n = in.nextInt();
		
		System.out.println("Os número inteiros entre 1 e " + n + " são: ");
		for (int k = 2; k <= n; k++) {
			for (int i = 2; i <= k/2; i++) {
				if (k%i == 0) {
					primo = false;
					i = k/2 + 1;
				} 
				quant_div++;
			}
			if (primo) {
				System.out.print(k + ", ");
			}
			primo = true;
		}
		
		System.out.println("\nO número de divisões feitas para chegar a esse números foram: " + quant_div);
		
		in.close();
	}

}
