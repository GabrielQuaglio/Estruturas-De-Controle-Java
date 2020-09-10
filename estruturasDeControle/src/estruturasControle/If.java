package estruturasControle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe a média: ");
		double media = entrada.nextDouble();
		
		// if é uma estrutura de controle condicional, que junto vem () e dentro dos parentese vai ter uma expressao que obrigatoriamente retorne uma expressao true ou false
		if(media >= 7.0 && media <= 10) // para termos um bloco de codigo para podermos associarmos os dois systems ao if usamos {} no inicio e no fim
		  
			//podendo estar a varias linhas abaixo
		{
			System.out.println("aprovado!");//tudo que esta apos o if sera executado seja um bloco de codigo como este ou apenas uma linha
		 System.out.println("parabens!");
		}
		if(media < 7 && media >= 4.5) {
			System.out.println("recuperação");
		}
		if(media <4.5 && media >= 0) {
			System.out.println("reprovado");//melhor sempre usar o bloco de codigo
		}
		entrada.close();
			
		//podemos quebrar em variaveis e nao escrever em expressoes
		//boolean criterioRprovaçaoAtingido = media < 4.5 && media >= 0;
		//if(criterioRprovaçaoAtingido){
		//System.out.println();}
	
		//se ... true faça isso
		
	//	double nota = 1.3; nunca colocar ';' em uma sentença de if ou em outras estruturas de controle
	//	if(nota >= 9.0); {
		
		//	System.out.println("voce");
			//System.out.println("monstro");
		}
	}

