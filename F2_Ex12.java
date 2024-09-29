package exercicios;
import java.util.Scanner;
public class F2_Ex12 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        
        int numPessoas = 5;
        int[] idades = new int[numPessoas];
        double[] alturas = new double[numPessoas];
        int somaIdades = 0;
        double somaAlturas = 0;

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
            somaIdades += idades[i];
            somaAlturas += alturas[i];
        }

        double mediaIdade = (double) somaIdades / numPessoas;
        double mediaAltura = somaAlturas / numPessoas;

        System.out.println("\nIdades e alturas na ordem inversa:");
        for (int i = numPessoas - 1; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] + ", Altura = " + alturas[i]);
        }

        int maisVelho = idades[0];
        int maisNovo = idades[0];
        double maisAlto = alturas[0];
        double maisBaixo = alturas[0];

        for (int i = 1; i < numPessoas; i++) {
            if (idades[i] > maisVelho) maisVelho = idades[i];
            if (idades[i] < maisNovo) maisNovo = idades[i];
            if (alturas[i] > maisAlto) maisAlto = alturas[i];
            if (alturas[i] < maisBaixo) maisBaixo = alturas[i];
        }

        System.out.println("\nMais velho: " + maisVelho);
        System.out.println("Mais novo: " + maisNovo);
        System.out.println("Mais alto: " + maisAlto);
        System.out.println("Mais baixo: " + maisBaixo);

        System.out.println("\nAbaixo da média de idade (" + mediaIdade + "):");
        for (int i = 0; i < numPessoas; i++) {
            if (idades[i] < mediaIdade) {
                System.out.println("Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        System.out.println("\nAbaixo da média de altura (" + mediaAltura + "):");
        for (int i = 0; i < numPessoas; i++) {
            if (alturas[i] < mediaAltura) {
                System.out.println("Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        System.out.println("\nAcima da média de idade (" + mediaIdade + "):");
        for (int i = 0; i < numPessoas; i++) {
            if (idades[i] >= mediaIdade) {
                System.out.println("Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        System.out.println("\nAcima da média de altura (" + mediaAltura + "):");
        for (int i = 0; i < numPessoas; i++) {
            if (alturas[i] >= mediaAltura) {
                System.out.println("Idade = " + idades[i] + ", Altura = " + alturas[i]);
            }
        }

        scanner.close();

	}

}
