package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class ParE0A10 {

	public static void main(String[] args) {
		//verifica se o numero inserido é par ou impar
		//quando numero dividido por modulo 2 der zero é par e 1 é impar
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		double nota =entrada.nextDouble();
		
		if( nota>=0 && nota<=10) {
		double par = nota%2;
		
		if(par == 0) {
			System.out.printf("O número %.1f é par", nota);
			
		}else {
			System.out.printf("O número %.1f é ímpar", nota);
			
		}
		
		
		}else {
			System.out.println("Número invalído");
		}
			
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
	}
}
