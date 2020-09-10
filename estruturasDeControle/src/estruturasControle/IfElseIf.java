package estruturasControle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {              //SEMPRE SE INICIA O FLUXO COM UM IF
			System.out.println("nota invalida!"); 
			
		}     else if(nota >= 8.1) {             //podemos criar um if dentro de um else para criar uma condiçao de realizar o else
			System.out.println("conceito A");   //podemos ainda simplificar o codigo deixando apenas a identaçao do if e colocando os dois na mesma linha
				
			}else if (nota >= 6.1) {          //o java cai apenas em uma expressao ou seja, ele caiu na primeira quer dizer que ele nao vai pras proximas
				System.out.println("conceito B");//se a nota for invalida ele ja para la,assim como em outos casos
				
				
			} else if (nota >= 4.1 ) {
				System.out.println("conceito C");
				
			}else if(nota >= 2.1) {
				System.out.println("conceito D ");
				
			}else {
				System.out.println("conceito E");
			}
				
		
	
		
		entrada.close();
		
	}
}
