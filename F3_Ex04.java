package exercicios;
import java.util.Scanner;
public class F3_Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de atletas: ");
        int N = scanner.nextInt();
        double[][] saltos = new double[N][5];
        double[] medias = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Atleta " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Informe o salto " + (j + 1) + ": ");
                saltos[i][j] = scanner.nextDouble();
            }
            double menorSalto = Double.MAX_VALUE;
            double soma = 0;

            for (int j = 0; j < 5; j++) {
                soma += saltos[i][j];
                if (saltos[i][j] < menorSalto) {
                    menorSalto = saltos[i][j];
                }
            }
            medias[i] = (soma - menorSalto) / 4;
            System.out.printf("Média do atleta %d: %.2f%n", (i + 1), medias[i]);
        }

        double maiorMedia = -1;
        double menorMedia = Double.MAX_VALUE;
        int indiceCampeao = -1;
        int indiceUltimo = -1;

        for (int i = 0; i < N; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                indiceCampeao = i;
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                indiceUltimo = i;
            }
        }

        System.out.println("\nResultados finais:");
        for (int i = 0; i < N; i++) {
            System.out.print("Atleta " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%.2f ", saltos[i][j]);
            }
            System.out.printf("| Média: %.2f%n", medias[i]);
        }

        System.out.printf("Média do campeão (Atleta %d): %.2f%n", (indiceCampeao + 1), maiorMedia);
        System.out.printf("Média do último lugar (Atleta %d): %.2f%n", (indiceUltimo + 1), menorMedia);

        scanner.close();

	}

}
