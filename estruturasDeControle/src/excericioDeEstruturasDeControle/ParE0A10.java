package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class ParE0A10 {

	public static void main(String[] args) {
		//verifica se o numero inserido � par ou impar
		//quando numero dividido por modulo 2 der zero � par e 1 � impar
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o n�mero: ");
		double nota =entrada.nextDouble();
		
		if( nota>=0 && nota<=10) {
		double par = nota%2;
		
		if(par == 0) {
			System.out.printf("O n�mero %.1f � par", nota);
			
		}else {
			System.out.printf("O n�mero %.1f � �mpar", nota);
			
		}
		
		
		}else {
			System.out.println("N�mero inval�do");
		}
			
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
	}
}
