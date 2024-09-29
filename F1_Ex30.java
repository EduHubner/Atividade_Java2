package exercicios;

import java.util.Scanner;

public class F1_Ex30 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float peso, alt, maior = 0, menor = 0, gordo = 0, magro = 0, soma_peso = 0, soma_alt = 0;
		int cod, cod_maior, cod_menor, cod_magro, cod_gordo, quant = 0;
		boolean primeiro = true;
		
		System.out.println("Informe seu código (0 para parar de informar): ");
		cod = in.nextInt();
		
		while (cod != 0){
			
			do {
				System.out.println("Informe sua altura: ");
				alt = in.nextFloat();
				if (alt <= 0) {
					System.out.println("Valor da altura não faz sentido");
				} 
			} while (alt <= 0);
			
			do {
				System.out.println("Informe seu peso: ");
				peso = in.nextFloat();
				if (peso <= 0) {
					System.out.println("Valor da altura não faz sentido");
				} 
			} while (peso <= 0);
			
			soma_alt += alt;
			soma_peso += peso;
			quant++;
			
			if (primeiro) {
				cod_maior = cod_menor = cod_gordo = cod_magro = cod;
				maior = menor = alt;
				gordo = magro = peso;
				primeiro = false;
			}
			
			if (alt > maior) {
				cod_maior = cod;
				maior = alt;
			} else if (alt < menor) {
				cod_menor = cod;
				menor = alt;
			}
			
			if (peso > gordo) {
				cod_gordo = cod;
				gordo = peso;
			} else if (peso < magro) {
				cod_magro = cod;
				magro = peso;
			}
			
			if (primeiro == false) {
				System.out.println("Informe seu código (0 para parar de informar): ");
				cod = in.nextInt();
			}
			
		}
		
		System.out.println("Media das Alturas: " + soma_alt/quant);
		System.out.println("Media dos pesos: " + soma_peso/quant);
		System.out.println("Mais pesado: " + gordo + "Kg");
		System.out.println("Mais magro: " + magro + "Kg");
		System.out.println("Mais alto: " + maior + "m");
		System.out.println("Mais baixo: " + menor + "m");

		in.close();
	}

}
