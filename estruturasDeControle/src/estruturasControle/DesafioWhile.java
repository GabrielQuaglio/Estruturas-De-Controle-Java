package estruturasControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		//neste desafio iremos querer calcular a media das notas de uma turma
		//nao sabemos quantos alunos tem na turma
		//usuario digitara uma nota valida de 10 a 0 armazenaremos as notas em uma variavel total
		//usaremos uma outra variavel para ver quantas notas foram digitadas
		//quando o usuario digitar -1 quer dizer que ele quer sair
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.print("Digite a nota \ne se quiser sair digite (-1): ");
		double nota = entrada.nextDouble();
		
		double notasDigitadas = 2.0;
		
		double total1 = nota;
		
		  double numeroDeAlunos = notasDigitadas++;
	      double total = total1 += nota;
	      
		if(nota >= -1 && nota<=10) {
		
		}else {
			System.out.println("nota invalida,digite uma nota de 0 a 10!");
		}		
		
		while(!(nota==-1) ) {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
	     
	      
	}
		System.out.println("A média geral da sala é: " + total/numeroDeAlunos);
      System.out.println("Até a proxima");
		entrada.close();
		
		/*Scanner entrada = new Scanner(System.in)
		 * 
		 * int quantidaddeDeNotas = 0;                     JEITO QUE ELE FEZ
		 * double nota = 0;
		 * double total =0;
		 * 
		 * while(nota != -1) {
		 * System.out.print(informe a nota (ou -1 p/ sair));
		 * nota = entrada.nextDouble
		 * 
		 * if(nota <= 10 && nota >=0){
		 * total += nota;
		 * quantidadeDeNotas++;
		 * }else if(nota != -1){
		 * System.out.println("nota ivalida)
		 * }
		 * double media = total/quantidadeDeNotas;
		 * System.out.println("media =" + media		 * 
		 * entrada.close();
		 * 
		 * 
		 */
	}
}
