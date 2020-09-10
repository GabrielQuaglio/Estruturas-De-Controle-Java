package estruturasControle;

public class SwitchSemBreak {
	public static void main(String[] args) {

		// menos usual, quase nunca usamos
		// if(boolean) ...
		// whgile (boolean) ...
		// for(;boolean;) ...

		String faixa = "preta"; //SEM A EXRESSAO BREAK A IDE EXECUTA TOADAS AS LINHAS DE CODIGO ABAIXO DA EXECUTADA
		//NESTE CASO FAZ SENTIDO POIS QUEM ESTA UMA FAIXA ACIMA SABE FAZER AS COISAS DA FAIXA ABAIXO

		switch (faixa.toLowerCase()) { // sem expressao booleana
		case "preta":// criamos o case, que quer dizer "caso" alguma coisa execute isso
			System.out.println("sei o bassai-dai");
		case "marrom":
			System.out.println("sei o tekki Shodan");
		case "roxa":
			System.out.println("sei o heidan godan");
		case "verde":
			System.out.println("sei o heian yodan");
		case "laranja":
			System.out.println("sei o heian sandan");
		case "vermelha":
			System.out.println("sei o heidan nidan");
		case "amarela":
			System.out.println("sei o heian shodan");
			break;
		default:
			System.out.println("nao sei de porra nenhuma");

			//switch recebe uma expressao que nao é verdadeiro ou falso é o proximo valor
		}
	}

}
