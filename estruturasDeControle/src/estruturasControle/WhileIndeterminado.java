package estruturasControle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		//tem o usuo mais comum pois quando queremos ter algo determinado usamos o for
		Scanner entrada = new Scanner(System.in);
		
		String valor  = "";
		
		while(!valor.equalsIgnoreCase("sair") ) {
			System.out.print("voce diz: ");
			valor = entrada.nextLine();
		}
		entrada.close();
		
	}
}
