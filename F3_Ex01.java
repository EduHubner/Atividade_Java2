package exercicios;

import java.util.Scanner;

public class F3_Ex01 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int tamanho;

	     
	        do {
	            System.out.print("Informe um valor ímpar entre 3 e 11: ");
	            tamanho = scanner.nextInt();
	        } while (tamanho < 3 || tamanho > 11 || tamanho % 2 == 0);

	       
	        int[][] matriz = new int[tamanho][tamanho];

	      
	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                System.out.print("Informe o valor para a posição (" + i + ", " + j + "): ");
	                matriz[i][j] = scanner.nextInt();
	            }
	        }


	        int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
	        int contadorPares = 0, contadorImpares = 0;
	        int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;


	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                int valor = matriz[i][j];
	                soma += valor;

	                if (valor > maior) maior = valor;
	                if (valor < menor) menor = valor;

	                if (valor % 2 == 0) contadorPares++;
	                else contadorImpares++;

	                if (i == j) somaDiagonalPrincipal += valor; 
	                if (i + j == tamanho - 1) somaDiagonalSecundaria += valor; 
	            }
	        }

	
	        double media = (double) soma / (tamanho * tamanho);

	
	        System.out.printf("Soma dos elementos: %d%n", soma);
	        System.out.printf("Média dos elementos: %.2f%n", media);
	        System.out.printf("Maior valor: %d%n", maior);
	        System.out.printf("Menor valor: %d%n", menor);
	        System.out.printf("Contador de pares: %d%n", contadorPares);
	        System.out.printf("Contador de ímpares: %d%n", contadorImpares);
	        System.out.printf("Soma da diagonal principal: %d%n", somaDiagonalPrincipal);
	        System.out.printf("Soma da diagonal secundária: %d%n", somaDiagonalSecundaria);

	
	        System.out.println("Matriz:");
	        for (int i = 0; i < tamanho; i++) {
	            for (int j = 0; j < tamanho; j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }

	        scanner.close();
	}

}
