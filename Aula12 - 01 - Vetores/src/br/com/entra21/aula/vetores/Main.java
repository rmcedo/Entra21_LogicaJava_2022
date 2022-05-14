package br.com.entra21.aula.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("\t0 = Exit\n");
			System.out.println("\t1 = Declarando Vetores\n");
			System.out.println("\t2 = Acessando Indices\n");
			System.out.println("\t3 = Média com Vetores\n");

			option = input.nextByte();

			switch (option) {
			case 0:
				break;
			case 1:
				declararVetores();
				break;
			case 2:
				acessandoIndices();
			case 3:
				mediaComVetores();
				break;
			default:
				System.out.println("");
			}

		} while (option != 0);// CONDIÇÃO DE PERMANENCIA

	}

	private static void declararVetores() {
		System.out.println("\t\tDeclarar Vetores\n");
		byte idades[]; // primeiro criar a variavel que é um vetor de algum tipo

		idades = new byte[15]; // segundo definir o tamanho

		System.out.println("O tamanho é " + idades.length); // depos usar ou atualizar

		float notas[] = { 1, 3.5f, 8 }; // 1 criei a variavel e 2 defini o tamanho e os valores respectivamente.

		System.out.println("Quantas notas tem na lista? " + notas.length);

		// ---------------------------------------

		// como acessar cada posição e ver o que tem em cada

		System.out.println("O que tem no indice 1? \n" + notas[1]);
		System.out.println("\nO que na ultima posição do indice?\n" + notas[2]);

	}

	private static void acessandoIndices() {
		
		String alunos[] = new String[20];
		Scanner entrada = new Scanner(System.in);
		for (byte contador = 1; contador < alunos.length; contador++) {
			System.out.println("Qual o nome do aluno " + contador + "ª?");
			alunos[contador - 1] = entrada.next();
		}
		
	}

	private static void mediaComVetores() {

			Scanner entrada = new Scanner(System.in);
			float notas[] = new float[2];

			 for (byte contador = 0; contador < notas.length; contador++) {
			// System.out.println("Contagem em "+contador);
			System.out.println("Informe a " + (contador + 1) + "ª nota:");
			notas[contador] = entrada.nextFloat();

			 }
			System.out.println("A segunda nota foi " + notas[1]);
			float soma = 0;
			for (byte contador = 0; contador < notas.length; contador++) {
			System.out.println(notas[contador]);
			soma = soma + notas[contador];
			}
			System.out.println("Soma = "+soma);
			System.out.println("Média = "+ soma/notas.length);
			}
	
}
