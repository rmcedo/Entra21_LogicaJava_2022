package br.com.entra21.aula11.exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte opcao;
		System.out.println("\tExercícios Aula 11:\n");
		System.out.println("Por favor, insira qual exercício quer visualizar: \n");
		System.out.println("\t1 = SOMA 1 AO 15");
		System.out.println("\t2 = EU GOSTO DE ESTUDAR ALGORITMOS");
		System.out.println("\t3 = IDADE 20 PESSOAS ");
		System.out.println("\t4 = PESSOAS MAIORES DE IDADE");
		System.out.println("\t5 = NOME E IDADE");
		System.out.println("\t6 = PARES");
		System.out.println("\t7 = 0 A 100");
		System.out.println("\t8 = SOMA COM ENCERRAMENTO");
		System.out.println("\t9 = MÉDIA ALUNOS");
		System.out.println("\t0 = SAIR");

		// POSSO FAZER ESSE MESMO MENU EM APENAS UMA LINHA, MAS PARA FICAR UM VISUAL
		// MELHOR, RESOLVI FAZER UM A UM

		do {
			opcao = entrada.nextByte();
			switch (opcao) {

			case 0:
				System.out.println("Saindo do programa...");
				System.exit(0);
				break;

			case 1:
				verSoma();
				break;
			case 2:
				verAlgoritmos();
				break;
			case 3:
				verIdades();
				break;
			case 4:
				verMaiores();
				break;
			case 5:
				verNomeEIdade();
				break;
			case 6:
				verPares();
				break;

			case 7:
				verZeroACem();
				break;

			case 8:
				verSomaComEncerramento();
				break;

			case 9:
				verMedia();
				break;

			default:
				System.out.println("Por favor, insira uma opçao válida");
				main(null);
			}

		} while (opcao != 0);
		System.out.println("Obrigado por usar o programa Lista de Exercícios");

	}

	public static void verSoma() {
		System.out.println("Exercício SOMA:\n");
		int soma = 0;
		for (int contador = 1; contador <= 15; contador++) {
			System.out
					.println("Soma = soma + contador " + "= " + soma + " + " + contador + " ==> " + (soma + contador));
			soma = soma + contador;

		}

	}

	public static void verAlgoritmos() {
		System.out.println("\nExercício Eu Gosto de Estudar Algoritmos\n");
		for (byte cont = 1; cont <= 20; cont++) {
			System.out.println("Eu gosto de algoritmos" + (cont % 5 == 0 ? "\n" : ""));
			/*
			 * if (cont%5==0) { System.out.print("\n"); }
			 */
		}

	}

	public static void verIdades() {
		System.out.println("\nExercício Soma de Idades:\n");
		Scanner input = new Scanner(System.in);
		int soma = 0;
		byte idade;

		for (byte cont = 1; cont <= 20; cont++) {
			System.out.println("No momento a soma é: " + soma);
			System.out.println("Informa a idade da pessoa: " + cont);
			idade = input.nextByte();
			soma = soma + idade;
		}
		System.out.println("A soma das idade foi: " + soma);
	}

	public static void verMaiores() {
		System.out.println("\nExercício Maiores de Idade:\n ");
		byte maiores = 0;
		byte idade, cont;
		Scanner input = new Scanner(System.in);
		for (cont = 1; cont <= 20; cont++) {
			System.out.println("Informe a idade da pessoa " + cont);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era maior de idade");
			}
		}
		System.out.println("Entre " + (cont - 1) + " pessoas, apenas " + maiores + " pessoas são maiores de idade");
	}

	public static void verNomeEIdade() {
		System.out.println("\nExercício Nomes e Idades, Exibir mais Nova");

		Scanner input = new Scanner(System.in);
		String name, youngerName = "";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 10; count++) {
			System.out.println("\nPor favor, insira o nome: \n");
			name = input.next();
			System.out.println(name + ", por favor, digite sua idade: ");
			age = input.nextByte();
			// no primeiro laço, sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("\nSou o primeiro, então sou o mais novo: " + name + " " + age);
			} else {
				// a partir do segundo laço já tenho como comparar com "ageMinimal"
				System.out.println("\nEstou no laço " + count + " e preciso verificar");
				if (age < ageMinimal) {
					ageMinimal = age;
					youngerName = name;
					System.out.println(
							"Ainda bem que testei, pois a pessoa mais nova é: " + name + " com " + age + " anos.");
				}
			}
		}
		System.out.println("Após isso tudo, o mais novo é: " + youngerName + " com" + ageMinimal + " anos.");

	}

	public static void verPares() {

	}

	public static void verZeroACem() {

	}

	public static void verSomaComEncerramento() {

	}

	public static void verMedia() {

	}
}
