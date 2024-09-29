package exercicios;
import java.util.Scanner;

public class F1_Ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome, senha;
		
		do {
			System.out.print("Informe o nome: ");
			nome = in.nextLine();
			System.out.print("Informe sua senha: ");
			senha = in.nextLine();
			
			if (nome.equals(senha)) {
				System.out.println("O nome não pode ser igual a senha");
			} 
		} while (nome.equals(senha));
		
		System.out.println("Cadastro realizado");
		
		in.close();

	}

}
