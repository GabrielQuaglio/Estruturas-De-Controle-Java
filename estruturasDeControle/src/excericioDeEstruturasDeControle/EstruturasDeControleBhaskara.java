package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class EstruturasDeControleBhaskara {

	public static void main(String[] args) {
		// delta <0 nenhuma raiz real possivel
		// delta = 0 uma raiz
		// delta > 0 duas raizes
		Scanner entrada = new Scanner(System.in);
		String start = "";

		while (!start.equalsIgnoreCase("sair")) {
			System.out.print("quer sair? digite sair: ");
			start = entrada.next();

			if (!start.equalsIgnoreCase("sair")) {

				System.out.print("Digite o valor de A: ");
				double a = entrada.nextDouble();

				System.out.print("Digite o valor de B: ");
				double b = entrada.nextDouble();

				System.out.print("Digite o valor de C: ");
				double c = entrada.nextDouble();

				double delta = (b * b) - 4 * a * c;
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				if (delta > 0) {

					System.out.printf("O valor do x1 é %.2f e de x2 é %.2f", x1, x2);

				} else if (delta == 0) {
					System.out.printf("O valor da unica raiz é  %.2f", x1);
				} else if (delta < 0) {
					System.out.println("Não existe raiz");
				}
			}
		}
		System.out.println("Fim!abraços");
		entrada.close();

	}
}