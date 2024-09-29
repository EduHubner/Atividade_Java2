package exercicios;

import java.util.Scanner;

public class F1_Ex27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float preco, soma = 0, dinheiro;
		int cont, i = 1;
		
		do {
			System.out.println("Informe o preço do " + i + "º produto: ");
			preco = in.nextFloat();
			soma += preco;
			i++;
			System.out.println("Desejas informar mais alguma produto? (1 - Sim / 0 - Não): ");
			cont = in.nextInt();
		} while (cont != 0);
		
		do {
			System.out.println("Informe o valor do pagamento: ");
			dinheiro = in.nextFloat();
			if (dinheiro < soma) {
				System.out.println("O valor informado não é o suficiente para o pagamento!");
			}
		} while (dinheiro < soma);
		
		System.out.println("Total: " + soma);
		System.out.println("Dinheiro: " + dinheiro);
		System.out.println("Troco: " + (dinheiro-soma));
		
		in.close();

	}

}
