package exercicios;
import java.util.Scanner;
public class F2_Ex15 {

	public static void main(String[] args) {
		final int N = 10; 
        int[] valores = new int[N];
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < N; i++) {
            System.out.print("Informe o valor " + (i + 1) + " (entre 0 e 20): ");
            int valor = scanner.nextInt();

            
            while (valor < 0 || valor > 20) {
                System.out.println("Valor inválido. Informe um número entre 0 e 20.");
                System.out.print("Informe o valor " + (i + 1) + " (entre 0 e 20): ");
                valor = scanner.nextInt();
            }
            valores[i] = valor;
        }

        
        System.out.println("\nGráfico de Valores Informados:");
        for (int valor : valores) {
            for (int j = 0; j < valor; j++) {
                System.out.print("█");
            }
            System.out.println(" (" + valor + ")");
        }

        scanner.close();

	}

}
