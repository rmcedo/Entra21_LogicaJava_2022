package br.com.entra21.aula.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in); // ASSIM EU DEIXO O SCANNER GLOBAL, SEM PRECISAR INICIALIZAR EM
														// TODAS FUNÇÕES

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println(escreverMenuMatrizes());
			option = entrada.nextByte();
			switch (option) {
			case 0:
				System.out.println("\n\nSaindo...");
				break;
			case 1:
				aprenderMatrizesSimples();
				break;
			case 2:
				aprenderMatrizesInicializadas();
			default:
				break;

			}

		} while (option != 0);
	}

	private static String escreverMenuMatrizes() {

		String conteudoMenu = "";
		conteudoMenu += "Escolha uma opcao para aprender:\n";
		conteudoMenu += "\t1 - Inicializando matrizes com tamanho definidos\n";
		conteudoMenu += "\t2 - Inicializando matrizes com valores predeterminados";
		return conteudoMenu;

	}

	private static void aprenderMatrizesSimples() {

		System.out.println("\n\nAprendendo sobre Matrizes Simples:\n");

		System.out.println("Armazenar as 3 notas de todos os 10 alunos:\n");
		float notas[][];
		notas = new float[10][3]; // aqui eu defini diretamente no código o tamanho da minha matriz;
		// primeiro indice é a quantidade de vetores
		// segundo indice é a capacidade de cada vetor
		// apenas no ultimo indice ficam os valores

		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos:\n");
		quantidadeAlunos = entrada.nextByte();

		System.out.println("Informe a quandade de notas para cada aluno:\n");
		quantidadeNotas = entrada.nextByte();

		// quem decide o tamanho da minha matriz é o usuário
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (byte aluno = 0; aluno < novasNotas.length; aluno++) {
			System.out.println("Nessa posição [" + aluno + "] temos " + novasNotas[aluno].length + " notas");

			for (byte nota = 0; nota < novasNotas[aluno].length; nota++) {
				System.out.println("\t Valor da Notas [" + nota + "] ===>" + novasNotas[aluno]);
			}

		}
	}

	private static void aprenderMatrizesInicializadas() {
		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares\n");
		
		float salarioAlunos[][]= {
				{1000, 1250.50f, 2500.35f},
				{2600, 3500, 4500},
				{50000, 150000, 2000000}
		};
		
		byte matrizIrregular[][]= {
				{1,2,3,4,5,6,7},
				{4,3,2,1},
				{10,12},
				{-127,0,127},
				
		};
		String ementa[][]= {
				{"Metodologias Ágeis","Introdução","Metodologias", "git"},
				{"Lógica com Java", "Variáveis", "Constantes", "Comentários", "Desvios Condicionais", "Laços de repetição","Operadores","Funções", "Vetores", "Matrizes",},
				{"POO", "Classes", "Objetos", "Herança", "Polimorfismo", "Encapsulamento"}
				
		};

	}

}
