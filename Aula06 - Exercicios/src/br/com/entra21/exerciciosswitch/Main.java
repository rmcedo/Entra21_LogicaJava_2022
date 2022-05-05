package br.com.entra21.exerciciosswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		byte opcao;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Dentre as opções a seguir, qual é sua opção favorita?\n");
		System.out.println("1 = Primavera\n");
		System.out.println("2 = Outono\n");
		System.out.println("3 = Inverno\n");
		System.out.println("4 = Verão\n");
		
		opcao = entrada.nextByte();
		
		switch(opcao) {
		
		case 1:
			System.out.println("\nSua estação preferida é: Primavera");
			break;
		case 2:
			System.out.println("\nSua estação preferida é: Outono");
			break;
		case 3:
			System.out.println("\nSua estação preferida é: Inverno");
			break;
		case 4:
			System.out.println("\nSua estação preferida é: Verão");
			break;
			default:
				System.out.println("\nVocê nao possui estação preferida!");
				break;
		}

		String opcao2;
		Scanner entrada2= new Scanner(System.in);
		
		System.out.println("Dentre as opções a seguir, qual é sua cor favorita?\n");
		System.out.println("Verde\n");
		System.out.println("Azul\n");
		System.out.println("Amarelo\n");
		System.out.println("Vermelho\n");
		
		opcao2 = entrada2.next();
		
		switch(opcao2) {
		
		case "verde":
			System.out.println("\nSua cor favorita é: Verde");
			break;
		case "azul":
			System.out.println("\nSua cor favorita é: Azul");
			break;
		case "amarelo":
			System.out.println("\nSua cor favorita é: Amarelo");
			break;
		case "vermelho":
			System.out.println("\nSua cor favorita é: Vermelho");
			break;
			default:
				System.out.println("\nNenhuma dessas cores é sua favorita!");
				break;
	}
		
		final float ALTURA;
		float altura;
		String nome;
		ALTURA = 1.70f;
		
		Scanner entrada3 = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome:\n");
		nome = entrada3.next();
		
		System.out.println("Digite sua altura:\n");
		
		altura = entrada3.nextFloat();
		
		if(altura<ALTURA) {
			System.out.println("Não atinge a altura mínima");
		} else {
			System.out.println("Possui a altura necessária");
		}
		
		
		
		
				
	}}
