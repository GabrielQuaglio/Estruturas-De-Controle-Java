package estruturasControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
	String valor = JOptionPane.showInputDialog
			("informe o número: ");	// funciona apenas com String por conta disso usaremos um Wrapper depois para passar para inteiro
	int numero = Integer.parseInt(valor);
	//queremos descobrir se o numero é par ou ímpar para isso dividimos qualquer numero por %2
	
	if(numero % 2 == 0) {		
	System.out.println("número par");	
	}
	
	if (numero % 2 == 1) {
		System.out.println("número ímpar");
			}
	
	if(numero %2 == 0) {
		System.out.println("numero par");//ao ínves de criarmos duas expressões com If podemos usar o else que quer dizer "se nao"
	}                                     // if = se sim - true / else = se não - false
	else {
		System.out.println("numero ímpar");
	}
	
	
	
	
	
	
	
	
	
	
	}
}
