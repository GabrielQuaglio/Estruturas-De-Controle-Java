package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class N�meroPrimo {

	// neste programa verificamos se o numero que o ususario digitou � primo
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double contadoresdedivisores = 0;
		
		System.out.print("digite n�mero: ");
		double numero = entrada.nextDouble();
		 
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0);
			contadoresdedivisores ++;
		}
		
		if(contadoresdedivisores == 0) {
			System.out.println("� um n�mero primo");
		}else {
			System.out.println("N�o � um n�mero primo");
		}
				
					
		

		entrada.close();

	}
}