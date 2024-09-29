package exercicios;

import java.util.Scanner;

public class F1_Ex28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		float temp, menor = 0, maior = 0, soma = 0;
		int i = 1, cont;
		
		do {
			System.out.println("Informe a " + i + "ª temperatura: ");
			temp = in.nextFloat();
			if (i == 1) {
				maior = menor = temp;
			}
			if (temp > maior) {
				maior = temp;
			} else if (temp < menor) {
				menor = temp;
			}
			soma += temp;
			i++;
			System.out.println("Desejas informar mais alguma temperatura? (1 - Sim / 0 - Não): ");
			cont = in.nextInt();
		} while (cont != 0);
		
		System.out.println("Maior temperatura: " + maior + "°");
		System.out.println("Menor temperatura " + menor + "°");
		System.out.println("Soma das temperaturas " + soma + "°");
		in.close();

	}

}
