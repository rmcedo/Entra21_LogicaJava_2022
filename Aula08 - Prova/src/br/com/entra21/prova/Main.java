package br.com.entra21.prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Bem ao Exerc�cio 1 da Prova\n");

		Scanner entrada = new Scanner(System.in);

		String nome;

		byte mes;

		System.out.println("Por favor, insira seu nome: \n");

		nome = entrada.next();

		System.out.println("Por favor, insira o dia do seu nascimento: \n");

		final byte DIA;
		// conforme solicitado, coloquei uma constante como dia limite
		// para entrar na condicional de realizar a verifica��o do signo

		DIA = entrada.nextByte();

		if (DIA > 31) {
			System.out.println("ops... algo errado, pq esse dia do mes nao existe");
		}

		else {
			System.out.println("Por favor, insira o numero do m�s de seu nascimento: \n");

			mes = entrada.nextByte();

			if ((mes == 3 && DIA >= 21) || (mes == 4 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo � �ries");

			} else if ((mes == 4 && DIA >= 21) || (mes == 5 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo � Touro");

			} else if ((mes == 5 && DIA >= 21) || (mes == 6 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo � G�meos");

			} else if ((mes == 6 && DIA >= 21) || (mes == 7 && DIA <= 21)) {
				System.out.println("Legal " + nome + " seu signo � C�ncer");

			} else if ((mes == 7 && DIA >= 22) || (mes == 8 && DIA <= 22)) {
				System.out.println("Legal " + nome + " seu signo � Le�o");

			} else if ((mes == 8 && DIA >= 23) || (mes == 9 && DIA <= 22)) {
				System.out.println("Legal " + nome + " seu signo � Virgem");

			} else if ((mes == 9 && DIA >= 23) || (mes == 10 && DIA <= 22)) {
				System.out.println("Legal " + nome + " seu signo � Libra");

			} else if ((mes == 10 && DIA >= 23) || (mes == 11 && DIA <= 21)) {
				System.out.println("Legal " + nome + " seu signo � Escorpi�o");

			} else if ((mes == 11 && DIA >= 22) || (mes == 12 && DIA <= 21)) {
				System.out.println("Legal " + nome + " seu signo � Sagit�rio");

			} else if ((mes == 12 && DIA >= 22) || (mes == 1 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo � Capric�rnio");

			} else if ((mes == 1 && DIA >= 21) || (mes == 02 && DIA <= 19)) {
				System.out.println("Legal " + nome + " seu signo � Aqu�rio");

			} else if ((mes == 02 && DIA >= 20) || (mes == 3 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo � Peixes");
			}

		}

	}

}
