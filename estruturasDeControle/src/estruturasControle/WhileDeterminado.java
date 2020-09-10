package estruturasControle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		//while quer dizer que enquanto uma determinada expressão for verdadeira ele ira ficar executando um bloco ou linha de codigo mutiplas
		// vezes ate que uma condição vire false
		
		int contador = 1;// sem um limitador o while repetira a expressao repetidas vezes sem parar
		
		while(contador <= 10) { //é determminado pois sabemos quantas vezes queremos repetir(esta determinado dentro da expressao booleana)
			System.out.printf("i = %d\n", contador);	
			contador++; //podemos usar o ++ ou uma atribuição aditiva("variavel += valor") porque toda vez que o programa for ler o codigo a cada vez lida ele incrementa 1 ao valor
		}
		
		
		
		//System.out.println("Bom dia!"); para nao termos que repetir essa escrita varias vezes, criaremos uma variavel que determinara
		//System.out.println("Bom dia!"); quantas vezes sera repetido a expressao,feito acima
		//System.out.println("Bom dia!");
		//System.out.println("Bom dia!");
		//System.out.println("Bom dia!");
		//System.out.println("Bom dia!");
		//System.out.println("Bom dia!");
		//System.out.println("Bom dia!");
	}
}
