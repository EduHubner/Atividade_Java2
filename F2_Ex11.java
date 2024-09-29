package exercicios;
import java.util.Scanner;
public class F2_Ex11 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite várias palavras separadas por ';': ");
        String entrada = scanner.nextLine();
        
        String[] palavras = entrada.split(";");
        
        System.out.println("\nPalavras separadas:");
        for (String palavra : palavras) {
            System.out.println(palavra.trim());
        }
        
        scanner.close();

	}

}
