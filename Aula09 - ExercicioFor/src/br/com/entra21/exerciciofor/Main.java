package br.com.entra21.exerciciofor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que tenha as seguintes opções de execução:
		 * 
		 * Um menu de ação para escolher entre os algorítimos Solicite ao usuário uma
		 * quantidade limite e exiba em tela a repetição de 1 até o limite Solicite ao
		 * usuário uma quantidade inicial e final, para exibir em tela a repetição do
		 * inicio até o final Solicite ao usuário um valor numero para exibir a contagem
		 * regressiva até o zero Retorne a tabuada do numero escolhido Retornar todas as
		 * tabuadas de 1 até a tabuada do numero informado pelo usuário OBS: Com os
		 * conceitos de switch e funções é possível fazer tudo isso em um só projeto
		 */

		System.out.println("Exercício sobre FOR");
		System.out.println("___________________\n");

		System.out.println("Menu:\n");
		System.out.println("1 = Contagem Crescente\n");
		System.out.println("2 = Intervalo de números\n");
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
			System.out.println("\nPor favor, reinicie o programa e selecione uma opção válida.");
		}

	}

	public static void verCrescente() {

		int numA;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número limite para a contagem crescente: \n");

		numA = entrada.nextInt();

		for (int contador = 1; contador <= numA; contador += 1) {
			System.out.println(contador);
		}

	}

	public static void verIntervalo() {

		int numA, numB;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inicial do seu intervalo: \n");

		numA = entrada.nextInt();
		System.out.println("Digite o número final do seu intervalo: \n");
		numB = entrada.nextInt();

		for (int contador = numA; contador <= numB; contador += 1) {
			System.out.println(contador);
		}

	}

	public static void verDecrescente() {

		int numA;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inicial para a contagem Decrescente: \n");

		numA = entrada.nextInt();

		for (int contador = numA; contador >= 0; contador -= 1) {
			System.out.println(contador);
		}

	}

	public static void verTabuada() {

		int numA;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inicial para a contagem Decrescente: \n");

		numA = entrada.nextInt();

		for (int contador = numA; contador >= 0; contador -= 1) {
			System.out.println(contador);
		}
		for (int contador = numA; contador >= 0; contador -= 1) {
			System.out.println("Tabuada do número selecionado: " + numA + " X " + contador + " = " + (numA * contador));
		}

	}

	public static void verTodasTabuadas() {
			
		for (int num = 1; num <= 10; num++) {
			System.out.println("Quero ver a tabuada do: "+num);
		}
		for(int contador = 10; contador>=0; contador--) {
			System.out.println("Tabuada do número selecionado: " + contador + " X " + contador + " = " + (contador * contador));
		} ///PRECISO ARRUMAR ISSO AQUI
		
		
		}

	}
