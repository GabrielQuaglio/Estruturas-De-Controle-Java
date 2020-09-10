package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class NúmeroPrimo {

	// neste programa verificamos se o numero que o ususario digitou é primo
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double contadoresdedivisores = 0;
		
		System.out.print("digite número: ");
		double numero = entrada.nextDouble();
		 
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0);
			contadoresdedivisores ++;
		}
		
		if(contadoresdedivisores == 0) {
			System.out.println("É um número primo");
		}else {
			System.out.println("Não é um número primo");
		}
				
					
		

		entrada.close();

	}
}