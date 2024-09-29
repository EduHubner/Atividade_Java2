package exercicios;

import java.util.Scanner;

public class F2_Ex02{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um número: ");
			num[i] = in.nextInt();
		}
		
		for (int i = 9; i >= 0; i--) {
			System.out.println(num[i]);
		}
		in.close();
	}

}
