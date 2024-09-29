package exercicios;
import java.util.Scanner;
public class F1_Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, max = 10, min = 0;
		
		do {
			System.out.print("Informe um número entre 0 e 10: ");
			n = in.nextInt();
			if (n > max || n < min) {
				System.out.println("O número informado não está dentro do pedido!!!");
			}
		} while (n > max || n < min);
		
		System.out.println("Programa Finalizado com sucesso!");
		in.close();
	}

}
