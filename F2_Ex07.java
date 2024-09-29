package exercicios;
import java.util.Scanner;
public class F2_Ex07 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nNúmeros digitados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        
        scanner.close();

	}

}
