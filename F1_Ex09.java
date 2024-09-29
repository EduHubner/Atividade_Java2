package exercicios;

import java.util.Scanner;

public class F1_Ex09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.println("Informe um número: ");
		n = in.nextInt();
		
		for (int i=1;i<=10;i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
		
		in.close();
	}

}
