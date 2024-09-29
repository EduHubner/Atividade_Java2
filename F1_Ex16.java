package exercicios;

import java.util.Scanner;

public class F1_Ex16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int tam, menor = 0, maior = 0, soma = 0;
		
		System.out.println("Informe o tamanho do conjunto: ");
		tam = in.nextInt();
		
		int n[] = new int[tam];
		
		for (int i = 0; i < tam; i++) {
			System.out.println("Informe o " + (i+1) + "º número do conjunto: ");
			n[i] = in.nextInt();
			if (i == 0) {
				maior = menor = n[i];
			} else {
				if (n[i] > maior) {
					maior = n[i];
				}
				if (n[i] < menor) {
					menor = n[i];
				}
			}
			
			soma += n[i];
		}
		
		System.out.println("Menor número do conjunto: " + menor);
		System.out.println("Maior número do conjunto: " + maior);
		System.out.println("Soma do número do conjnto: " + soma);
		
		in.close();

	}

}
