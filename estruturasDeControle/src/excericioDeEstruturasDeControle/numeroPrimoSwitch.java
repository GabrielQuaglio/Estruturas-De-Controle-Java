package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class numeroPrimoSwitch {
	public static void main(String[] args) {
		
		// refatoramos o mesmo exercio de verificar se é ou nao numero primo para switch case
Scanner entrada = new Scanner(System.in);
		
		int contadordedivisores = 0;
		
		System.out.print("digite número: ");
		int numero = entrada.nextInt();
		 
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0){
			contadordedivisores ++;
			}
		}
		switch(contadordedivisores) {
		case 0:
			System.out.println("É primo");
			break;
		case 1:
			System.out.println("não é primo");
		}
		entrada.close();
	}
}
