package estruturasControle;

public class DesafioFor {
	public static void main(String[] args) {
		 //String valor = "#";
		//for (int i = 1; i <= 5; i++) {
//System.out.println(valor);
//valor += "#";
		//}
		
		//versao do desafio
		//nao pode usar valor numerico pra controlar o la�o!
		
		
		for (String valor = "#"; !valor.equalsIgnoreCase("######");valor += "#" ) {
System.out.println(valor);

		}
		
		
	}
}
