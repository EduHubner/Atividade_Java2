package exercicios;
import java.util.Scanner;
public class F3_Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        final int NUM_SUPERMERCADOS = 5;
        final int NUM_PRODUTOS = 5;


        double[][] precos = new double[NUM_SUPERMERCADOS][NUM_PRODUTOS];


        for (int i = 0; i < NUM_SUPERMERCADOS; i++) {
            System.out.println("Supermercado " + (i + 1) + ":");
            for (int j = 0; j < NUM_PRODUTOS; j++) {
                System.out.print("Informe o preço do produto " + (j + 1) + ": ");
                precos[i][j] = scanner.nextDouble();
            }
        }


        double[] somaPorSupermercado = new double[NUM_SUPERMERCADOS];
        double[] mediaPorProduto = new double[NUM_PRODUTOS];


        for (int j = 0; j < NUM_PRODUTOS; j++) {
            mediaPorProduto[j] = 0;
        }


        for (int i = 0; i < NUM_SUPERMERCADOS; i++) {
            for (int j = 0; j < NUM_PRODUTOS; j++) {
                somaPorSupermercado[i] += precos[i][j];
                mediaPorProduto[j] += precos[i][j];
            }
        }


        for (int j = 0; j < NUM_PRODUTOS; j++) {
            mediaPorProduto[j] /= NUM_SUPERMERCADOS;
        }


        double menorPreco = Double.MAX_VALUE;
        double maiorPreco = Double.MIN_VALUE;
        double totalMaisBarato = 0;
        double totalMaisCaro = 0;
        
        for (int i = 0; i < NUM_SUPERMERCADOS; i++) {
            if (somaPorSupermercado[i] < menorPreco) {
                menorPreco = somaPorSupermercado[i];
                totalMaisBarato = somaPorSupermercado[i];
            }
            if (somaPorSupermercado[i] > maiorPreco) {
                maiorPreco = somaPorSupermercado[i];
                totalMaisCaro = somaPorSupermercado[i];
            }
        }


        System.out.println("\nPreços em cada supermercado:");
        for (int i = 0; i < NUM_SUPERMERCADOS; i++) {
            System.out.print("Supermercado " + (i + 1) + ": ");
            for (int j = 0; j < NUM_PRODUTOS; j++) {
                System.out.printf("%.2f ", precos[i][j]);
            }
            System.out.printf("| Soma: %.2f%n", somaPorSupermercado[i]);
        }

        System.out.println("\nMédia de preço por produto:");
        for (int j = 0; j < NUM_PRODUTOS; j++) {
            System.out.printf("Produto %d: %.2f%n", (j + 1), mediaPorProduto[j]);
        }

        System.out.printf("%nTotal no supermercado mais barato: %.2f%n", totalMaisBarato);
        System.out.printf("Total no supermercado mais caro: %.2f%n", totalMaisCaro);

        scanner.close();

	}

}
