package exercicios;

import java.util.Scanner;

public class F1_Ex32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cod, soma_vei = 0, soma_aci = 0, cod_maior_ind = 0, cod_menor_ind = 0, med_aci = 0;
		float acidentes,veiculos, maior_indice = 0, menor_indice = 0;
		final int CIDADES = 5
				;
		for (int i = 0; i < CIDADES; i++) {
			System.out.println("Informe o código da cidade " + (i+1));
			cod = in.nextInt();
			System.out.println("Informe o número de veículos em passeio: ");
			veiculos = in.nextInt();
			System.out.println("Informe o número de acidentes: ");
			acidentes = in.nextInt();
			
			soma_vei += veiculos;
			
			if (veiculos < 2000) {
				soma_aci += acidentes;
				med_aci++;
			}
			
			if (i == 0) {
				maior_indice = menor_indice = (acidentes/veiculos);
				cod_maior_ind = cod_menor_ind = cod;
			}
			
			if ((acidentes/veiculos) > maior_indice) {
				maior_indice = (acidentes/veiculos);
				cod_maior_ind = cod;
			} else if ((acidentes/veiculos) < menor_indice) {
				menor_indice = (acidentes/veiculos);
				cod_menor_ind = cod;
			}
			
		}
		
		System.out.println("Cidade " + cod_maior_ind + " foi que com maior indice tendo " + maior_indice*100 + "%");
		System.out.println("Cidade " + cod_menor_ind + " foi que com menor indice tendo " + menor_indice*100 + "%");
		System.out.println("Média de veículos nas 5 cidades foi " + soma_vei/CIDADES);
		System.out.println("Média de acidente nas " + med_aci + " cidades que possuem menos de 2000 veículos foi" + soma_aci/med_aci);
		
		in.close();
	}

}
