package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class jogoDaAdivinhaçao {

	public static void main(String[] args) {
		// neste programa foi feito um jogo onde o usuario deve adivinhar o numero escolhido, ele tem 10 tentativas
		
		double segredo = 1 + (int) (Math.random()*100); 
		System.out.println(segredo);
		System.out.println("Você deve adivinhar o número secreto,\n ele está localizado entre 0 e 100, boa sorte!");
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
         
		for (int i = 9; i >-1 ^ valor == segredo; i--) {
			System.out.print("\nDê seu palpite: ");
			valor = entrada.nextInt();
			
			
			if(valor < segredo) {
			System.out.printf("Você errou, agora tem %d tentativas", i);
			System.out.printf("\nO número secreto é maior que %d", valor);
		}else if(valor > segredo) {
			System.out.printf("Você errou, agora tem %d tentativas", i);
			System.out.printf("\nO número secreto é menor que %d", valor);
		}else if(valor == segredo) {
			System.out.println("Parabéns você acertou, seu prêmio é o amor do bibi");
		}
		
		}
		
		System.out.println("\nSinto muito,\n você não acertou pegue seu banquinho e saia de mansinho");

		entrada.close();
	}
}




