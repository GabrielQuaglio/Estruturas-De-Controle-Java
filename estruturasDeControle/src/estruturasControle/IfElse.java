package estruturasControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
	String valor = JOptionPane.showInputDialog
			("informe o n�mero: ");	// funciona apenas com String por conta disso usaremos um Wrapper depois para passar para inteiro
	int numero = Integer.parseInt(valor);
	//queremos descobrir se o numero � par ou �mpar para isso dividimos qualquer numero por %2
	
	if(numero % 2 == 0) {		
	System.out.println("n�mero par");	
	}
	
	if (numero % 2 == 1) {
		System.out.println("n�mero �mpar");
			}
	
	if(numero %2 == 0) {
		System.out.println("numero par");//ao �nves de criarmos duas express�es com If podemos usar o else que quer dizer "se nao"
	}                                     // if = se sim - true / else = se n�o - false
	else {
		System.out.println("numero �mpar");
	}
	
	
	
	
	
	
	
	
	
	
	}
}
