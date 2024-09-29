package exercicios;
import java.util.Scanner;

public class F1_Ex07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1, n2, guarda;
		
		System.out.println("Informe um número inteiro: ");
		n1 = in.nextInt();
		System.out.println("Informe outro número inteiro: ");
		n2 = in.nextInt();
		
		if (n2 < n1) {
			guarda = n2;
			n2 = n1;
			n1 = guarda;
		}
		
		System.out.println("Numero inteiros entre esse dois informados: ");
		
		for (int i=n1+1;i<n2;i++) {
			System.out.println(i);
		}
		
		in.close();
	}
	
}
