package exercicios;

import java.util.Scanner;

public class F2_Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um número: ");
			num[i] = in.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
		in.close();
	}

}
