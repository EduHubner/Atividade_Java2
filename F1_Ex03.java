package exercicios;
import java.util.Scanner;

public class F1_Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int idade;
		float salario;
		char sexo, estadoCiv;
		
		do {
			System.out.print("Informe seu nome (min 4 caracteres): ");
			nome = in.nextLine();
			if (nome.length() < 4) {
				System.out.println("O nome não contem o minimo de caracteres possiveis!");
			}
		} while (nome.length() < 4);
		
		do {
			System.out.println("Informe sua idade (max 150): ");
			idade = in.nextInt();
			if (idade < 0 || idade > 150) {
				System.out.println("A idade não está dentro dos parâmetros da realidade!!");
			}
		} while (idade < 0 || idade > 150);
		
		do {
			System.out.println("Informe seu salário: ");
			salario = (float) in.nextDouble();
			if (salario < 0) {
				System.out.println("O salário não pode ser negativo!!");
			}
		} while (salario < 0);
		
		do {
			System.out.println("Informe seu sexo (F/M): ");
			sexo = in.nextLine().charAt(0);
			if (sexo != 'f' && sexo != 'm'){
				System.out.println("Dado informado não corresponde com os possiveis!!");
			}
		} while (sexo != 'f' && sexo != 'm');
		
		do {
			System.out.println("Informe seu estado civil (S - solteiro / C - casado / V - viúvo / D - divorciado: ");
			estadoCiv = in.nextLine().charAt(0);
			if (estadoCiv != 's' && estadoCiv != 'c' && estadoCiv != 'v' && estadoCiv != 'd') {
				System.out.println("Dado informado não corresponde com os possiveis!!");
			}
		} while (estadoCiv != 's' && estadoCiv != 'c' && estadoCiv != 'v' && estadoCiv != 'd');
		
		System.out.println("Cadastro concluído!");
		
		in.close();
	}

}
