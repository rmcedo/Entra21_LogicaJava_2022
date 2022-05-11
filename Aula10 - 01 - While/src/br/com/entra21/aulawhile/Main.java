package br.com.entra21.aulawhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Por favor, insira qual assunto voc� quer saber mais:\n ");
		System.out.println("\thelp - Encerrar Programa\n\t0 - Sair\n\t1 - While\n\t2 - do-while");

		// instanciando um objeto da classe Scanner e j� utilizando o metodo next
		switch (new Scanner(System.in).next().toLowerCase()) {

		case "help":
			System.exit(0); // ENCERRA O PROGRAMA

		case "0", "sair":
			System.out.println("Escolheu SAIR");
			break;

		case "1", "while":
			aprenderWhile();
			break;

		case "2", "do-while":
			aprenderDoWhile();
			break;

		default:
			System.out.println("Op��o Inv�lida");
			main(null); // usamos isso para retornar ao inicio do c�digo, como uma reinicializa��o do
						// programa
			break;
		}
	}

	private static void aprenderDoWhile() {
		System.out.println("\nVamos aprender Do-While aqui:\n");
		Scanner entrada= new Scanner(System.in);
		String resposta;
		
		/*do {
			System.out.println("\nExistiam 2 dogs PITA e REPITA, PITA morreu, quem restou? ");
			resposta=entrada.next();
						
		}while(resposta.equalsIgnoreCase("repita"));
		System.out.println("\nEntendeu?");
		resposta=entrada.next();
		if(resposta.equals("sim")){
		main(null);
		}else {
			aprenderDoWhile();
		}*/
		
		byte dia; //ALT + (SETAS) eu consigo carregar as linhas
		do {
			System.out.println("Informe o dia do seu anivers�rio");
			dia=entrada.nextByte();
			
		}while(dia>31);//repetir enquanto informar algo maior que 31.
		System.out.println("Espero que n�o tenha errado muito...");
		
		byte mes;
		do {
			System.out.println("\nInforme o m�s de nascimento: ");
			mes=entrada.nextByte();
			
		}while(dia<1 || dia>31 ||mes<1 || mes>12);
		
		
		System.out.println("Legal, voce nasceu no dia "+dia+ "/" +mes );
	}

	private static void aprenderWhile() {
		System.out.println("\nVamos aprender o While aqui:\n");

		byte contagem = 1;
		while (contagem <= 10) { // condi��o de permanencia /// enquanto contagem for menor ou igual a 10 execute
			System.out.println("Contando: " + contagem);
			contagem++;

		}
		// Para fazer uma repeti��o com base em quantidade � gerado muito c�digo
		System.out.println("Acabei");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja continuar/iniciar uma repeti��o");
		String resposta = entrada.next(); // em uma variavel, posso dar refactor e mudar todas entradas
		while ((resposta.equals("continuar")) || (resposta.equals("sim"))) { // equalsignorecase ir� ignorar CAIXA ALTA
			System.out.println("Sua resposta �: " + resposta);
			System.out.println("Deseja continuar? ");
			resposta = entrada.next();
		}
		System.out.println("Terminou meu while com base em decis�o");

		main(null);

	}

}
