package exercicios;

import java.util.Scanner;

public class F1_Ex33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float divida, perc_juros, parcela = 0, juros = 0;
		
		System.out.println("Informe o valor da dívida: ");
		divida = in.nextFloat();
		
		System.out.println("Valor da Divida / Juros / Parcelas / Valor Parcela");
		for (int i = 0; i <= 12; i += 3) {
			if (i == 0) {
				i++;
				perc_juros = 0;
				juros = 0;
				parcela = divida;
			} else if (i == 3) {
				perc_juros = 0.1f;
				juros = divida * perc_juros;
				parcela = divida/i;
			} else if (i == 6) {
				perc_juros = 0.15f;
				juros = divida * perc_juros;
				parcela = divida/i;
			} else if (i == 9) {
				perc_juros = 0.2f;
				juros = divida * perc_juros;
				parcela = divida/i;
			} else if (i == 12) {
				perc_juros = 0.25f;
				juros = divida * perc_juros;
				parcela = divida/i;
			} 
		
			System.out.println((divida+juros) + " / " + juros + " / " + i + " / " + parcela);
			
			if (i==1) {
				i--;
			}
		}
		
		in.close();

	}

}
