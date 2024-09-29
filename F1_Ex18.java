package exercicios;

import java.util.Scanner;

public class F1_Ex18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		boolean primo = true;
		
		System.out.println("Informe um número: ");
		n = in.nextInt();
		
		for (int i = 2; i <= n/2; i++) {
			if (n%i == 0) {
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println(n + " é um número primo");
		} else {
			System.out.println(n + " não é um número primo, ele é divisivel por:");
			for (int i = 2; i <= n/2; i++) {
				if (n%i == 0) {
					System.out.print(i + ", ");
				}
			}
			
		}
		
		in.close();
	}

}
