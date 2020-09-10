package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class UmaPalavraLetraALetra {

	public static void main(String[] args) {
		//aqui o usuario escreve uma palavra e n terminal é devolvido a mesma palavra letra por letra
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("informe a palavra:");
         String palavra = entrada.next();
         
         char[] letras  = palavra.toCharArray();
         
         
         for (int i = 0;  i < letras.length; i ++) {
			System.out.println(letras[i]);
		}
         
       
         
        		 
        		 entrada.close();
	}
}
