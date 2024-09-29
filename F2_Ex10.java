package exercicios;
import java.util.Scanner;
public class F2_Ex10 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[3];
        
        while (true) {
            System.out.print("Digite uma data no formato dd/mm/aaaa: ");
            String entrada = scanner.nextLine();
            
            String[] partes = entrada.split("/");
            if (partes.length != 3) {
                System.out.println("Data inválida! Tente novamente.");
                continue;
            }

            boolean dataValida = true;

            for (int i = 0; i < partes.length; i++) {
                if (!partes[i].matches("\\d+")) {
                    dataValida = false;
                    break;
                }
                data[i] = Integer.parseInt(partes[i]); 
            }

            if (dataValida) {
                int dia = data[0];
                int mes = data[1];
                int ano = data[2];

                if (ano < 1900 || ano > 2100 || mes < 1 || mes > 12) {
                    dataValida = false; 
                } else {
                    int[] diasNoMes = {0, 31, 28 + (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                    if (dia < 1 || dia > diasNoMes[mes]) {
                        dataValida = false; 
                    }
                }
            }

            if (dataValida) {
                System.out.println("Data válida: " + data[0] + "/" + data[1] + "/" + data[2]);
                break;
            } else {
                System.out.println("Data inválida! Tente novamente.");
            }
        }

        scanner.close();

	}

}
