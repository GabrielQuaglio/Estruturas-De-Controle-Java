package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class jogoDaAdivinha�ao {

	public static void main(String[] args) {
		// neste programa foi feito um jogo onde o usuario deve adivinhar o numero escolhido, ele tem 10 tentativas
		
		double segredo = 1 + (int) (Math.random()*100); 
		System.out.println(segredo);
		System.out.println("Voc� deve adivinhar o n�mero secreto,\n ele est� localizado entre 0 e 100, boa sorte!");
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
         
		for (int i = 9; i >-1 ^ valor == segredo; i--) {
			System.out.print("\nD� seu palpite: ");
			valor = entrada.nextInt();
			
			
			if(valor < segredo) {
			System.out.printf("Voc� errou, agora tem %d tentativas", i);
			System.out.printf("\nO n�mero secreto � maior que %d", valor);
		}else if(valor > segredo) {
			System.out.printf("Voc� errou, agora tem %d tentativas", i);
			System.out.printf("\nO n�mero secreto � menor que %d", valor);
		}else if(valor == segredo) {
			System.out.println("Parab�ns voc� acertou, seu pr�mio � o amor do bibi");
		}
		
		}
		
		System.out.println("\nSinto muito,\n voc� n�o acertou pegue seu banquinho e saia de mansinho");

		entrada.close();
	}
}




