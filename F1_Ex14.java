package exercicios;

import java.util.Scanner;

public class F1_Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.println("Informe até que termo desejas gerar a sequência:");
		n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + "/" + (i*2 - 1));
		}
		
		in.close();

	}

}
