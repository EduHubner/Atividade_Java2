package exercicios;

import java.util.Scanner;

public class F1_Ex26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float preco;
		
		System.out.println("Informe o valor do preço: ");
		preco = in.nextFloat();
		
		System.out.println("Quantidade   /   Preço");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "   /   " + (i*preco));
		}
		
		in.close();

	}

}
