package exercicios;
import java.util.Scanner;
public class F2_Ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        int numAlunos = 30;
        int[] idades = new int[numAlunos];
        double[] alturas = new double[numAlunos];
        double somaAlturas = 0;
        
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Digite a altura do aluno " + (i + 1) + " em metros: ");
            alturas[i] = scanner.nextDouble();
            somaAlturas += alturas[i];
        }
        
        double mediaAltura = somaAlturas / numAlunos;
        int contAlunosAbaixoMedia = 0;
        
        for (int i = 0; i < numAlunos; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contAlunosAbaixoMedia++;
            }
        }
        
        System.out.println("Número de alunos com mais de 13 anos e altura abaixo da média: " + contAlunosAbaixoMedia);
        
        scanner.close();

	}

}
