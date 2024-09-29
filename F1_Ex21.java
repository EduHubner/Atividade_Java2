package exercicios;

import java.util.Scanner;

public class F1_Ex21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num, idade;
		float soma = 0, media;
		
		System.out.println("Informe o número de idade de pessoas que deseja informar: ");
		num = in.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Informe a idade da " + (i+1) + "ª pessoa: ");
			idade = in.nextInt();
			soma += idade;
		}
		media = soma/num;
		System.out.println("A média dessas idade é: " + media);
		
		if (media < 25) {
			System.out.println("Turma Jovem!");
		} else if (media < 60) {
			System.out.println("Turma Adulta!");
		} else {
			System.out.println("Turma Idosa!");
		}
		
		in.close();

	}

}
