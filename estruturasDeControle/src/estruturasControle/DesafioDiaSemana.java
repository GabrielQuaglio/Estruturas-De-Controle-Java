package estruturasControle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//desafio será digitarmos domingo e o programa retornar 1
		//quarta -> 4
		//terça -> 3 e assim por diante
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.toLowerCase().equals("domingo")) {   //o mentor acha melhor usar o .equalsIgnoreCase do que todas as adaptçoes feitas
			System.out.println("1");
			
		}else if(dia.toLowerCase().equals("segunda")){ //LEMBRAR SEU FILA DA PUTA È IF NO COMEÇO,DEPOIS ELSE DEPOIS IF
			System.out.println("2");
			
		}else if(dia.toLowerCase().equals("terça")){
			System.out.println("3");
		
		}else if(dia.toLowerCase().equals("quarta")){
			System.out.println("4");
			
		}else if(dia.toLowerCase().equals("quinta")){
			System.out.println("5");
		
		}else if(dia.toLowerCase().equals("sexta")){
			System.out.println("6");
		
		}else if(dia.toLowerCase().replaceAll("sabado", "sábado").equals("sábado")){//e neste caso ele prefere criar outa condiçao usando "||"
			System.out.println("7"); 
			
		}else if(dia.toLowerCase().equals("domingo")){
			System.out.println("1");
			
	} entrada.close();
}
}
