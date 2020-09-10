package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class entreDezOMaior {

	public static void main(String[] args) {
		
		//este programa recebera 10 valores e ao final dira qual foi o maoir valor inserido
		
		Scanner entrada = new Scanner(System.in);
		double maior = 0;
		double valor;
		for (int i = 0; i < 10; i++) {
		System.out.println("informe o numero:");
		valor = entrada.nextDouble();
		if(valor>= maior) {
		maior = valor;
		}
		}
		System.out.printf("o maior valor é %.0f",maior);

		entrada.close();
	}
}
