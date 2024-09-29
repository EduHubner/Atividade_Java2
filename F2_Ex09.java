package exercicios;
import java.util.Scanner;
public class F2_Ex09 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();
        
        char[] vetorCaracteres = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            vetorCaracteres[i] = texto.charAt(i);
        }

        System.out.println("\nVetor de caracteres:");
        for (char c : vetorCaracteres) {
            System.out.print(c + " ");
        }
        
        scanner.close();

	}

}
