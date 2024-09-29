package exercicios;
import java.util.Scanner;
public class F2_Ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIntercalado = new int[20];

        System.out.println("Digite 10 elementos para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 10 elementos para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorIntercalado[i * 2] = vetor1[i];       
            vetorIntercalado[i * 2 + 1] = vetor2[i];    
        }

        System.out.println("\nVetor intercalado:");
        for (int i = 0; i < vetorIntercalado.length; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }

        scanner.close();

	}

}
