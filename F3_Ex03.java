package exercicios;
import java.util.Scanner;
public class F3_Ex03 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de alunos: ");
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] nomes = new String[N];
        double[][] notas = new double[N][2];
        double[] medias = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota 1: ");
            notas[i][0] = scanner.nextDouble();
            System.out.print("Nota 2: ");
            notas[i][1] = scanner.nextDouble();
            scanner.nextLine();
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        double mediaGeral = 0;
        double maiorNota = -1, menorNota = 11;
        String alunoMaiorNota = "", alunoMenorNota = "";
        double maiorMedia = -1, menorMedia = 11;
        String alunoMaiorMedia = "", alunoMenorMedia = "";

        for (int i = 0; i < N; i++) {
            mediaGeral += medias[i];
            for (int j = 0; j < 2; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    alunoMaiorNota = nomes[i];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    alunoMenorNota = nomes[i];
                }
            }
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }

        mediaGeral /= N;

        System.out.println("\nNome e Notas:");
        for (int i = 0; i < N; i++) {
            System.out.printf("%s - Nota 1: %.2f, Nota 2: %.2f, Média: %.2f%n", nomes[i], notas[i][0], notas[i][1], medias[i]);
        }

        System.out.printf("Maior Nota: %s (%.2f)%n", alunoMaiorNota, maiorNota);
        System.out.printf("Menor Nota: %s (%.2f)%n", alunoMenorNota, menorNota);
        System.out.printf("Maior Média: %s (%.2f)%n", alunoMaiorMedia, maiorMedia);
        System.out.printf("Menor Média: %s (%.2f)%n", alunoMenorMedia, menorMedia);
        System.out.printf("Média Geral: %.2f%n", mediaGeral);

        System.out.println("Alunos acima da média geral:");
        for (int i = 0; i < N; i++) {
            if (medias[i] > mediaGeral) {
                System.out.println(nomes[i]);
            }
        }

        System.out.println("Alunos abaixo da média geral:");
        for (int i = 0; i < N; i++) {
            if (medias[i] < mediaGeral) {
                System.out.println(nomes[i]);
            }
        }

        scanner.close();

	}

}
