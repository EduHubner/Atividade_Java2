package exercicios;

public class F1_Ex25 {

	public static void main(String[] args) {
		
		final float PRECO = 1.99f;
		
		System.out.println("Quantidade   /   Preço");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "   /   " + (i*PRECO));
		}

	}

}
