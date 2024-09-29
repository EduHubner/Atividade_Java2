package exercicios;
import java.util.Scanner;
public class F2_Ex06 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
        int numAlunos = 10;
        double[] medias = new double[numAlunos];
        int contadorAprovados = 0;

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            double somaNotas = 0;

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }

            medias[i] = somaNotas / 4;

            if (medias[i] >= 7.0) {
                contadorAprovados++;
            }
        }

        System.out.println("\nNúmero de alunos com média maior ou igual a 7.0: " + contadorAprovados);
        
        scanner.close();

	}

}
