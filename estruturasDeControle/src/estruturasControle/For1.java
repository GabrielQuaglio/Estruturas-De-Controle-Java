package estruturasControle;

public class For1 {
	public static void main(String[] args) {                
		                                               //estrutura planejada para ter uma quantidade determinada de repeticões
                                                            //teremos tres partes -(declaraçao da variavel)-(expressao booleana)-(manipulaçao da variavel)
	                                                       //nao obrigatoriamente prescisamos das tres partes(exemplo apos esse)
		for(int contador = 0 ;contador <= 10;contador++) { //no primeiro espaço colocamos o valor da variav
			System.out.printf("i = %d\n", contador);       //no segundo o valor booleano
			                                               //e no terceiro o incremento ou uma atribuiçao aditiva ou subtrativa ou etc
	//	int x = 2;
		//for(;x < 10;) {
		//	System.out.println("x = " + x); //so exemplo pois nao faz muito sentido usar for e fazer isso
			//x++;
		//}
			
		//for(;;) {
		//	System.out.println("fim!");//dessa forma teremos um laço infinito
	//	}
	}
}
}