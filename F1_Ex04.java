package exercicios;
import java.util.Scanner;

public class F1_Ex04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int popA, popB, anos = 0;
		float taxA, taxB;
		boolean inverte = false;
		
		do {
			System.out.println("Informe a população do país A: ");
			popA = in.nextInt();
			if (popA < 1) {
				System.out.println("O número informado não corresponde a um número de população!");
			}
		} while (popA < 1);
		
		do {
			System.out.println("Informe a taxa de crescimento populacional do país A (em %, minimo de 0%): ");
			taxA = in.nextFloat();
			taxA = taxA / 100;
			if (taxA < 0) {
				System.out.println("O número informado não corresponde a um número possivel de crescimento populacional!");
			}
		} while (taxA < 0);
		
		do {
			System.out.println("Informe a população do país B: ");
			popB = in.nextInt();
			if (popB < 1) {
				System.out.println("O número informado não corresponde a um número de população!");
			}
		} while (popB < 1);
		
		do {
			System.out.println("Informe a taxa de crescimento populacional do país B (em %, minimo de 0%): ");
			taxB = in.nextFloat();
			taxB = taxB / 100;
			if (taxB < 0) {
				System.out.println("O número informado não corresponde a um número possivel de crescimento populacional!");
			}
		} while (taxB < 0);
		
		
		
		if (popA < popB) {
			if (taxA > taxB) {
				while (popA < popB) {
					anos++;
					
					popA += popA * taxA;
					popB += popB * taxB;
				}
			} else {
				System.out.println("A população da cidade A nunca ultrapassará a da cidade B");
			}
		} else if (popB < popA) {
			if (taxB > taxA) {
				while (popA > popB) {
					anos++;
					inverte = true;
					popA += popA * taxA;
					popB += popB * taxB;
				}
			} else {
				System.out.println("A população da cidade B nunca ultrapassará a da cidade A");
			}
		} 
		
		if (popA == popB ) {
			if (taxA > taxB) {
				System.out.println("Demorará 1 ano para a cidade A passar o cidade B");
			} else {
				System.out.println("Demorará 1 ano para a cidade B passar o cidade A");
			}
			
		} else {
			if (anos > 0) {
				if (inverte) {
					System.out.println("Demorará " + anos + " anos para a cidade B passar a cidade A em população");
				} else {
					System.out.println("Demorará " + anos + " anos para a cidade A passar a cidade B em população");
				}
			}
		}
		
		in.close();
		
	}

}
