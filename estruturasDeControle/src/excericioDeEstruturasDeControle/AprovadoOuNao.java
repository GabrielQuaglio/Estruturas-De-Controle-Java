package excericioDeEstruturasDeControle;

import java.util.Scanner;

public class AprovadoOuNao {

	public static void main(String[] args) {

		// duas notas, calc media final, nota > 7 aprovado , se 4> recupera�ao, menor
		// que tudo 0

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a nota: ");
		double nota = entrada.nextDouble();

		System.out.print("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();

         if( nota<=10 && nota >= 0 && nota2<=10 && nota2 >= 0  ) {

        	  double media = (nota + nota2) / 2;
         
			if (media >= 7.0) {
				System.out.println("Parab�ns, voc� foi aprovado");
			} else if (media >= 4.0) {
				System.out.println("Sinto muito, voc� est� de recupera��o");
			} else if (media < 4){
				System.out.println("Sinto muito, voc� foi reprovado");
			}
       
         }else {
        	 System.out.println("Notas inv�lidas, as notas devem ser de 0 a 10");
         }

		entrada.close();
	
	}
}
