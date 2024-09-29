package exercicios;

import java.util.Scanner;

public class F1_Ex20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		float soma = 0;
		
		System.out.println("Informe o número de notas que deseja informar: ");
		num = in.nextInt();
		
		float notas[] = new float[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Informe o valor da " + (i+1) + "ª nota: ");
			notas[i] = in.nextFloat();
			soma += notas[i];
		}
		
		System.out.println("A média dessas notas é: " + soma/num);
		
		in.close();

	}

}
