package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class EstruturasDeControleCalculadora {
	public static void main(String[] args) {

		// Calculadora 

		Scanner entrada = new Scanner(System.in);

		String start = "";

		while (!start.equalsIgnoreCase("sair")) {
			System.out.print("quer sair? digite sair: ");
			start = entrada.next();

			if (!start.equalsIgnoreCase("sair")) {

				System.out.print("Digite o primeiro valor: ");
				double x = entrada.nextDouble();

				System.out.print("Digite o segundo valor: ");
				double y = entrada.nextDouble();

				System.out.print("Digite o operador: ");
				String operador = entrada.next();

				if (operador.equalsIgnoreCase("+")) {
					double soma = x + y;
					System.out.println("O resultado é: " + soma);

				} else if (operador.equalsIgnoreCase("-")) {
					double subtraçao = x - y;
					System.out.println("O resultado é: " + subtraçao);

				} else if (operador.equalsIgnoreCase("x")) {
					double vezes = x * y;
					System.out.println("O resultado é: " + vezes);

				} else if (operador.equalsIgnoreCase("/")) {
					double divisao = x / y;
					System.out.println("O resultado é: " + divisao);
				}
			}
		}
		System.out.println("fim,abraços!");

		entrada.close();

	}
}
