package br.com.entra21.exerciciofor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que tenha as seguintes op��es de execu��o:
		 * 
		 * Um menu de a��o para escolher entre os algor�timos Solicite ao usu�rio uma
		 * quantidade limite e exiba em tela a repeti��o de 1 at� o limite Solicite ao
		 * usu�rio uma quantidade inicial e final, para exibir em tela a repeti��o do
		 * inicio at� o final Solicite ao usu�rio um valor numero para exibir a contagem
		 * regressiva at� o zero Retorne a tabuada do numero escolhido Retornar todas as
		 * tabuadas de 1 at� a tabuada do numero informado pelo usu�rio OBS: Com os
		 * conceitos de switch e fun��es � poss�vel fazer tudo isso em um s� projeto
		 */

		System.out.println("Exerc�cio sobre FOR");
		System.out.println("___________________\n");

		System.out.println("Menu:\n");
		System.out.println("1 = Contagem Crescente\n");
		System.out.println("2 = Intervalo de n�meros\n");
		System.out.println("3 = Contagem Descrescente\n");
		System.out.println("4 = Tabuada\n");
		System.out.println("5 = Todas Tabuadas\n");

		Scanner entrada = new Scanner(System.in);

		String menu;

		menu = entrada.nextLine();

		switch (menu.toLowerCase()) {

		case "1", "contagem crescente":
			verCrescente();
			break;

		case "2", "intervalo de numeros":
			verIntervalo();
			break;

		case "3", "contagem descrescente":
			verDecrescente();
			break;

		case "4", "tabuada":
			verTabuada();

			break;

		case "5", "todas tabuadas":
			verTodasTabuadas();

			break;

		default:
			System.out.println("\nPor favor, reinicie o programa e selecione uma op��o v�lida.");
		}

	}

	public static void verCrescente() {

		int numA;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero limite para a contagem crescente: \n");

		numA = entrada.nextInt();

		for (int contador = 1; contador <= numA; contador += 1) {
			System.out.println(contador);
		}

	}

	public static void verIntervalo() {

		int numA, numB;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero inicial do seu intervalo: \n");

		numA = entrada.nextInt();
		System.out.println("Digite o n�mero final do seu intervalo: \n");
		numB = entrada.nextInt();

		for (int contador = numA; contador <= numB; contador += 1) {
			System.out.println(contador);
		}

	}

	public static void verDecrescente() {

		int numA;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero inicial para a contagem Decrescente: \n");

		numA = entrada.nextInt();

		for (int contador = numA; contador >= 0; contador -= 1) {
			System.out.println(contador);
		}

	}

	public static void verTabuada() {

		int numA;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero inicial para a contagem Decrescente: \n");

		numA = entrada.nextInt();

		for (int contador = numA; contador >= 0; contador -= 1) {
			System.out.println(contador);
		}
		for (int contador = numA; contador >= 0; contador -= 1) {
			System.out.println("Tabuada do n�mero selecionado: " + numA + " X " + contador + " = " + (numA * contador));
		}

	}

	public static void verTodasTabuadas() {
			
		for (int num = 1; num <= 10; num++) {
			System.out.println("Quero ver a tabuada do: "+num);
		}
		for(int contador = 10; contador>=0; contador--) {
			System.out.println("Tabuada do n�mero selecionado: " + contador + " X " + contador + " = " + (contador * contador));
		} ///PRECISO ARRUMAR ISSO AQUI
		
		
		}

	}
