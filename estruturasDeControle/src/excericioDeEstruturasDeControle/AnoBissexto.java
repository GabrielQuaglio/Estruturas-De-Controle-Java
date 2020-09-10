package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		/*
		 * aqui criaremos um programa que tem a funcionalidade de receber um ano do usuario e verificar se é um ano bissexto ou nao
		 * 
		 */

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.print("Informe o ano: ");
			double ano = entrada.nextDouble();

			double bissexto = ano % 4;

			if (bissexto == 0) {
				System.out.printf("O ano %.0f é bissexto\n", ano);

			} else {
				System.out.printf("O ano %.0f não é bissexto\n", ano);
			}
		}

		entrada.close();

	}
}
