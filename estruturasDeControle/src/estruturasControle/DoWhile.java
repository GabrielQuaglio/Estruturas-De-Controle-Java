package estruturasControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//if(variavel - expressao booleana) + uma senten�a de codigo ou um bloco {}
		//while(variavel - expressao booleana) + uma senten�a de codigo ou um bloco{}
		//for(variavel;expressao booleana,manipula�ao da variavel) + uma senten�a de codigo ou um bloco{}
		
		//do {} while(...); // unica estrutura de controle que termina em ';'
		
		Scanner entrada = new Scanner(System.in);

		String valor ="";
				
		do {
			System.out.println("voce prescisa falar\n as palavras magicas...");//oque muda neste caso � que mesmo se digitarmos a palavra magica
			System.out.print("quer sair?");     //por favor no come�o ele mesmo assim executa o codigo
			 valor = entrada.nextLine();
		}while(!valor .equalsIgnoreCase("por favor"));

		System.out.println("obrigado");//por experiencia do mentor as mais usadas sao for depois while depois Do while
		entrada.close();
	}
}
