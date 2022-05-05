package br.com.entra21.funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String opcao;

		System.out.println("Quero executar o assunto abaixo:");
		System.out.println("\n1: Procedimento");
		System.out.println("\n2: Parametros");
		System.out.println("\n3: Retornos");
		System.out.println("\n4: Completo");
		System.out.println("\n11: Exercicio1");
		System.out.println("\n12: Exercicio2");

		opcao = entrada.nextLine();
		// opcao=opcao.toLowerCase();

		switch (opcao.toLowerCase()) {

		case "1":
		case "procedimento":
			verProcedimentos();

			break;

		case "2":
		case "parametros":
			verParametros(2); // como argumento passei o valor 2 para o metodo
			verParametros(18);
			verParametros(5);
			verMaisParametros(opcao, "rafael", 10);
			verMaisParametros(opcao, "teste", 180);

			break;

		case "3":
		case "retornos":
			byte retorno = retornarValorInteiro(); // o retorno para atribuir variaveis
			// usar diretamente em saidas em tela syso
			System.out.println("Esse metodo retornou " + retornarValorInteiro());
			if (retornarValorInteiro() < 20) { // usar o retorno para logica booleana.
				System.out.println("Retornou menor que 20");
			} else {
				System.out.println("Retornou maior ou igual a 20");
			}

			break;

		case "4":
		case "completo":
			calcularDivisao(4, 2); // com retorno e parametro
			operacoesCalculadora(10,5);
			System.out.println(operacoesCalculadora(10,5));
			float entradaA, entradaB;
			System.out.println("Informe o primeiro float: ");
			entradaA = entrada.nextFloat();
			System.out.println("Informe o segundo float: ");
			entradaB = entrada.nextFloat();

			float calculo = calcularDivisao(entradaA, entradaB);
			System.out.println("Resultou em: " + calculo);
			break;

		default:
			System.out.println("Não tem essa opção no menu");
			break;
		}

	}

	// declaração de função
	// as regras de uso e como será executado

	public static void capturarFrase() {

		System.out.println("Escreva uma frase...");
		System.out.println("\n--------------------------");
		System.out.println("---ENTER PARA CONFIRMAR---");
		System.out.println("--------------------------\n");

	}

	public static void verProcedimentos() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n1 - Procedimento\n");
		String frase;
		System.out.println("Escreva uma frase...");
		frase = entrada.nextLine();

		System.out.println("\n--------------------------");
		System.out.println("---ENTER PARA CONFIRMAR---");
		System.out.println("--------------------------\n");

		System.out.println("Você disse: " + frase);
		capturarFrase(); // posso criar um metodo e chamar ele dessa forma, para diminuir linhas de
							// codigo.

		frase = entrada.nextLine();

		System.out.println("\n--------------------------");
		System.out.println("---ENTER PARA CONFIRMAR---");
		System.out.println("--------------------------\n");

		System.out.println("Você disse: " + frase);
		capturarFrase();
		frase = entrada.nextLine();

		System.out.println("\n--------------------------");
		System.out.println("---ENTER PARA CONFIRMAR---");
		System.out.println("--------------------------\n");

		System.out.println("Você disse: " + frase);

	}

	public static void verParametros(int numero) { // o valor informado cai nessa variavel temporaria

		System.out.println("\nVocê me passou por parametro o numero: " + numero);

		if (numero % 2 == 0) {
			System.out.println("\nBoa, esse numero é par!!");
		} else {
			System.out.println("\nÉ, esse numero é impar!!");
		}

	}

	public static void verMaisParametros(String escolha, String nome, int numero) {
		System.out.println("\nRecebi isso tudo de você");
		System.out.println(escolha);
		System.out.println(numero);
		if (numero < 100) {
			System.out.println("\nO numero selecionado é menor que 100");
		} else {
			System.out.println("\nO numero escolhido é maior que 100");
		}

	}

	public static byte retornarValorInteiro() {
		byte variavelParaRetorno = 15;
		System.out.println("Aqui sempre retornando 15 pq nao tenho parametros para deixar isso dinamico");
		return variavelParaRetorno;

	}

	public static float calcularDivisao(float numeroA, float numeroB) {
		return numeroA / numeroB;
	}
	public static String operacoesCalculadora(float numeroA, float numeroB) {
		float soma =  numeroA+ numeroB;
		float subtracao =  numeroA- numeroB;
		float multiplicacao =  numeroA* numeroB;
		float divisao =  numeroA/ numeroB;
		
		return "Executei tudo soma="+soma+" sub= "+subtracao+" mult= "+multiplicacao+" div= "+divisao ;
	}
}
