package exercicios;
import java.util.Scanner;
public class F3_Ex05 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Quantas cartelas deseja preencher? ");
	        int cartelasCount = scanner.nextInt();
	        int[][] cartelas = new int[cartelasCount][6];
	        int[] numerosSorteados = new int[6];

	        for (int i = 0; i < 6; i++) {
	            int numero;
	            boolean isUnique;
	            do {
	                numero = (int)(Math.random() * 60) + 1;
	                isUnique = true;
	                for (int j = 0; j < i; j++) {
	                    if (numerosSorteados[j] == numero) {
	                        isUnique = false;
	                        break;
	                    }
	                }
	            } while (!isUnique);
	            numerosSorteados[i] = numero;
	        }

	        for (int i = 0; i < cartelasCount; i++) {
	            System.out.println("Cartela " + (i + 1) + ":");
	            for (int j = 0; j < 6; j++) {
	                int numero;
	                boolean isUnique;
	                do {
	                    numero = (int)(Math.random() * 60) + 1;
	                    isUnique = true;
	                    for (int k = 0; k < j; k++) {
	                        if (cartelas[i][k] == numero) {
	                            isUnique = false;
	                            break;
	                        }
	                    }
	                } while (!isUnique);
	                cartelas[i][j] = numero;
	            }
	            java.util.Arrays.sort(cartelas[i]);
	        }

	        System.out.println("\nNúmeros sorteados:");
	        java.util.Arrays.sort(numerosSorteados);
	        for (int numero : numerosSorteados) {
	            System.out.print(numero + " ");
	        }
	        System.out.println();

	        for (int i = 0; i < cartelasCount; i++) {
	            System.out.print("Cartela " + (i + 1) + ": ");
	            int acertos = 0;
	            for (int numero : cartelas[i]) {
	                System.out.print(numero + " ");
	                for (int sorteado : numerosSorteados) {
	                    if (sorteado == numero) {
	                        acertos++;
	                    }
	                }
	            }
	            System.out.println("| Acertos: " + acertos);
	        }

	        scanner.close();

	}

}
