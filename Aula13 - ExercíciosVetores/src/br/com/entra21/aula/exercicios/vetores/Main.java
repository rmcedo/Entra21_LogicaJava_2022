package br.com.entra21.aula.exercicios.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		byte option;
		
		
		do {
			//utilizando do-while, pois me permite entrar no bloco antes de testar a coondição de permanencia.
			System.out.println("\t0 - Sair\n");
			System.out.println("\t1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n");
			System.out.println("\t2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n");
			System.out.println("\t3 - Criar 1 vetor de 5 posições, para que o usuário alimente esses valores\n");
			System.out.println("\t4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores\n");
			System.out.println("\t5 - Criar um vetor de inteiros inicializado , para percorrer:\n"
					+ "\t\t*Do inicio ao fim\r\n"
					+ "\t\t*Do fim ao inicio\r\n"
					+ "\t\t*Para exibir os valores\n");
			System.out.println("\t6 - Criar um vetor de inteiros não inicializado\n");
			System.out.println("----------------------------------------------------------------------------------------------------------------------------");
			
			option = input.nextByte();
			
			switch(option) {
			
			case 0:
				System.out.println("Tchau");
			
			case 1:
				ExibirTamanhosVetores();
				
				break;
				
			case 2:
				
				break;
			
			case 3:
				
				break;
				
			case 4: 
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
				
				default:
					
					break;
			}
			//caso a condição de permanência seja true, repitta o bloco 
		}while(option!=0); // enquanto não for zero, repita
		System.out.println("Obrigado por utilizar esse programa, volte sempre!!!");
		
	
		
	}

	private static void ExibirTamanhosVetores() {
		
		byte vetorBytes[]= new byte[1];
		short vetorShorts[]= new short[2];
		int vetorInts[]= new int [3];
		long vetorLongs[]=new long[4];
		char vetorChars[]=new char[5];
		float vetorFloats[]=new float[6];
		double vetorDoubles[]=new double[7];
		boolean vetorBooleans[]=new boolean[8];
		
		System.out.println("vetorBytes tamanho= " +vetorBytes.length);
		System.out.println("vetorShorts tamanho= " +vetorShorts.length);
		System.out.println("vetorInts tamanho= " +vetorInts.length);
		System.out.println("vetorLongs tamanho= " +vetorLongs.length);
		System.out.println("vetorChars tamanho= " +vetorChars.length);
		System.out.println("vetorFloats tamanho= " +vetorFloats.length);
		System.out.println("vetorDoubles tamanho= " +vetorDoubles.length);
		System.out.println("vetorBooleans tamanho= " +vetorBooleans.length);
		
		
		
		
		
	}

}
