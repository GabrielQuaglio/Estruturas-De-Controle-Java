package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class EnquantoParSoma {

	public static void main(String[] args) {
		//neste programas occorrera a soma enquanto o numero for par, quando nao mais ele para
	
		Scanner entrada = new Scanner(System.in);

		double numero = 0;
		double somadenumeros = 0;
		
		while(numero>= 0) {
			System.out.print("digite um numero postivo: \n(um numero negativo para sair)");
			 numero = entrada.nextDouble();
			 if(numero>=0) {
				 somadenumeros += numero;
				 System.out.println("A soma por enquanto é " + somadenumeros);
			 }
			
			
		}

		entrada.close();
		
		
		
		
	}
}
