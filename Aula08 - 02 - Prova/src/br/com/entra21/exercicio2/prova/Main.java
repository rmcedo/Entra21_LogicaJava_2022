package br.com.entra21.exercicio2.prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Crie um programa que faça vários cálculos Informe qual operação matemática
		 * deseja realizar caso informe 0 deve encerrar o programa 1 = somar 2 =
		 * subtrair 3 = multiplicar 4 = dividir Capturar os 2 valores e informar o
		 * resultado e esperar o próximo calculo
		 */

		System.out.println("Olá, seja bem vindo\n");
		System.out.println("Por favor, selecione o tipo de cálculo que deseja efetuar\n");
		System.out.println("1 = SOMAR\n ");
		System.out.println("2 = SUBTRAIR\n");
		System.out.println("3 = MULTIPLICAR\n");
		System.out.println("4 = DIVIDIR\n");
		System.out.println("0 = ENCERRAR PROGRAMA");

		Scanner entrada = new Scanner(System.in);

		String menu;

		menu = entrada.nextLine();

		switch (menu.toLowerCase()) {

		// TENHO QUE CRIAR ALGO PARA PEDIR A ENTRADA DOS NUMEROS
		case "1":
		case "somar":
			float entradaA, entradaB, resultado;
			System.out.println("Por favor, insira o primeiro número: \n");
			entradaA = entrada.nextFloat();
			System.out.println("Por favor, insira o segundo número: \n");
			entradaB = entrada.nextFloat();
			resultado = verSomar(entradaA, entradaB);
			System.out.println("O resultado foi: " + resultado);

			break;

		case "2":
		case "subtrair":
			float entradaC, entradaD, resultado1;
			System.out.println("Por favor, insira o primeiro número: \n");
			entradaC = entrada.nextFloat();
			System.out.println("Por favor, insira o segundo número: \n");
			entradaD = entrada.nextFloat();
			resultado1 = verSubtrair(entradaC, entradaD);
			System.out.println("O resultado foi: " + resultado1);

			break;

		// Tive que ir mudando o nome das entradas para não duplicar as variaveis.
		// Ver se é possível evitar essas mudanças

		case "3":
		case "multiplicar":
			float entradaE, entradaF, resultado2;
			System.out.println("Por favor, insira o primeiro número: \n");
			entradaE = entrada.nextFloat();
			System.out.println("Por favor, insira o segundo número: \n");
			entradaF = entrada.nextFloat();
			resultado2 = verMultiplicar(entradaE, entradaF);
			System.out.println("O resultado foi: " + resultado2);

			break;

		case "4":
		case "dividir":
			float entradaG, entradaH, resultado3;
			System.out.println("Por favor, insira o primeiro número: \n");
			entradaG = entrada.nextFloat();
			System.out.println("Por favor, insira o segundo número: \n");
			entradaH = entrada.nextFloat();
			resultado3 = verDividir(entradaG, entradaH);
			System.out.println("O resultado foi: " + resultado3);
			break;

		case "0":
			System.out.println("\nPROGRAMA ENCERRADO");
			
		default:
			System.out.println("\nCaso queira realizar uma operação, reinicie o programa ");
			break;
		}

	}

	public static float verSomar(float numeroA, float numeroB) {
		return numeroA + numeroB;
	}

	public static float verSubtrair(float numeroA, float numeroB) {
		return numeroA - numeroB;
	}

	public static float verMultiplicar(float numeroA, float numeroB) {
		return numeroA * numeroB;
	}

	public static float verDividir(float numeroA, float numeroB) {
		return numeroA / numeroB;
	}

}
