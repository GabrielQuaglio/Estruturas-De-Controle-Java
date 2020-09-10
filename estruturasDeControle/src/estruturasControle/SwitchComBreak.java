package estruturasControle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        String conceito = "";
        
        System.out.print("informe a nota");
      int nota = entrada.nextInt();
        
		
		switch(nota) {
		case 10: case 9: //podemos associar dois cases no mesma linha se eles fizerem a mesma coisa ou em linhas diferentes
			conceito = "A";
			break;
			
		case 8: case 7:
			conceito = "B";
			break;
			
		case 6: case 5:
			conceito = "C";
			break;
			
		case 4: case 3:
			conceito = "D";
			break;
			
		case 2: case 1:
			conceito = "E";
			break;
			
		case 0:
			conceito = "reprovado";
			break;
			
			default:
				conceito = "nao encontrado";
				System.out.println("nota invalida");
		//break; como esta no ultimo entao o break é opcional
	
		}
		entrada.close();
		System.out.println("conceito é "+ conceito);
	}
}
