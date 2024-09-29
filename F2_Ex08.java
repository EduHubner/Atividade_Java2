package exercicios;
import java.util.Scanner;
public class F2_Ex08 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String consoantes = "bcdfghjklmnpqrstvwxyz";
        String vogais = "aeiou";

        System.out.print("Informe o tamanho da senha (menor que " + alfabeto.length + "): ");
        int tamanhoSenha = scanner.nextInt();

        if (tamanhoSenha <= 0 || tamanhoSenha >= alfabeto.length) {
            System.out.println("Tamanho inválido! Deve ser maior que 0 e menor que " + alfabeto.length);
        }

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanhoSenha; i++) {
            if (i % 2 == 0) { 
                senha.append(consoantes.charAt((int)(Math.random() * consoantes.length())));
            } else { 
                senha.append(vogais.charAt((int)(Math.random() * vogais.length())));
            }
        }

        if (tamanhoSenha % 2 != 0) { 
            senha.setCharAt(tamanhoSenha - 1, consoantes.charAt((int)(Math.random() * consoantes.length())));
        }

        System.out.println("Senha gerada: " + senha.toString());
        
        scanner.close();
	}

}
