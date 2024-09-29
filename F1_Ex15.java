package exercicios;

public class F1_Ex15 {

	public static void main(String[] args) {
		
		int n = 1, s = 0;
		
		for (int i = 37; i >= 1; i--) {
			s += (i * (i+1)) / n;
			n++;
		}
		
		System.out.println(s);

	}

}
