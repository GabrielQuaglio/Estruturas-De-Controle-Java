package estruturasControle;

public class for3 {
	public static void main(String[] args) {

	//scopo ( quando criamos uma variavel por exemplo com For, ela sera apenas visivel dentro do bloco do For,nos nao teremos como acessa-la
    // fora desse bloco(la�o), basta apenas clocarmos essa variavel fora do la�o(geralmente antes)ou criarmos a mesma variavel apos o la�o
	//dependendo de onde declaramos a variavel ela pode estar disponivel ou nao e dentro de um metodo o algoritmo � declarado de forma sequencial
	//entao nao podemos declarar variavel depois de usarmos um syso pedindo sua "apari�ao"	
		
		//for(int i = 0;i < 10;i++) {
		//	System.out.println(i);
		//}
		//int i = 0;
		//System.out.println(" saiu do for ...");
		//System.out.println(i);
		
		for(int i = 0;i<10;i++) {
			for(int j = 0; j<10;j++) {
				System.out.printf("i = %d\nj = %d", i,j);
			}
		}
		
	}
}
