package br.com.entra21.exerciciosswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		byte opcao;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Dentre as op��es a seguir, qual � sua op��o favorita?\n");
		System.out.println("1 = Primavera\n");
		System.out.println("2 = Outono\n");
		System.out.println("3 = Inverno\n");
		System.out.println("4 = Ver�o\n");
		
		opcao = entrada.nextByte();
		
		switch(opcao) {
		
		case 1:
			System.out.println("\nSua esta��o preferida �: Primavera");
			break;
		case 2:
			System.out.println("\nSua esta��o preferida �: Outono");
			break;
		case 3:
			System.out.println("\nSua esta��o preferida �: Inverno");
			break;
		case 4:
			System.out.println("\nSua esta��o preferida �: Ver�o");
			break;
			default:
				System.out.println("\nVoc� nao possui esta��o preferida!");
				break;
		}

		String opcao2;
		Scanner entrada2= new Scanner(System.in);
		
		System.out.println("Dentre as op��es a seguir, qual � sua cor favorita?\n");
		System.out.println("1 = Verde\n");
		System.out.println("2 = Azul\n");
		System.out.println("3 = Amarelo\n");
		System.out.println("4 = Vermelho\n");
		
		opcao2 = entrada2.next();
		
		switch(opcao2) {
		
		case "1":
			System.out.println("\nSua cor favorita �: Verde");
			break;
		case "2":
			System.out.println("\nSua cor favorita �: Azul");
			break;
		case "3":
			System.out.println("\nSua cor favorita �: Amarelo");
			break;
		case "4":
			System.out.println("\nSua cor favorita �: Vermelho");
			break;
			default:
				System.out.println("\nNenhuma dessas cores � sua favorita!");
				break;
	}

	}}
