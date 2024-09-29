package exercicios;

import java.util.Scanner;

public class F1_Ex22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int candidato[] = new int[3];
		int num_vot, voto;
		
		System.out.println("Informe o número de votantes: ");
		num_vot = in.nextInt();
		
		for (int i = 0; i < num_vot; i++) {
			do {
				System.out.println("Votante nº" + (i+1) + " informe seu voto: ");
				voto = in.nextInt();
				if (voto < 1 || voto > 3) {
					System.out.println("Esse número não corresponde a um candidato!");
				}
			} while (voto < 1 || voto > 3);
			
			if (voto == 1) {
				candidato[0]++;
			} else if (voto == 2) {
				candidato[1]++;
			} else if (voto == 3) {
				candidato[2]++;
			}
		}
		
		for (int k = 0; k < 3; k++) {
			System.out.println("O número de votos para o candidato " + (k+1) + " foi de " + candidato[k] + " votos");
		}
		
		in.close();

	}

}
