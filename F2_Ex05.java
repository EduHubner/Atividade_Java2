package exercicios;
import java.util.Scanner;
public class F2_Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contadorPares = 0, contadorImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
            
            if (numeros[i] % 2 == 0) {
                pares[contadorPares++] = numeros[i];
            } else {
                impares[contadorImpares++] = numeros[i];
            }
        }

        System.out.println("\nVetor de Números:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nVetor de Números Pares:");
        for (int i = 0; i < contadorPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nVetor de Números Ímpares:");
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(impares[i] + " ");
        }

        scanner.close();

	}

}
