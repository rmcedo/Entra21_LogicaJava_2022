package br.com.entra21.aulaswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Condicionais - Switch\n");
		
		System.out.println("Serve para escolher entre opções pré-definidas");
		
		System.out.println("\nGeralmente quando há muitos if elses ifs baseados em igualdade\n");

		
		float altura;
		altura=1.5f;
		
		if(altura==1.0) {
			System.out.println("baixinho");
			
		}else if(altura==1.2) {
			System.out.println("ainda baixo");
		}else if(altura==1.5) {
			System.out.println("ainda baixo, mas não tantooo");
			
		}else {
			System.out.println("Já não é tão baixo");
		}
		
		System.out.println("\n1 = Intervalo\n");
		System.out.println("\n2 = Exercicio\n");
		System.out.println("\n3 = Prova\n");
		
		Scanner entrada = new Scanner(System.in);
			
		byte opcao;
			System.out.println("Escolha uma das opções para nossa próxima atividade: \n");
			
		opcao = entrada.nextByte();
				
		switch(opcao) {
		case 1:
			System.out.println("Vamos para o intervalo\n");
			break;
			
		case 2:
			System.out.println("Vamos realizar o exercício\n");
			break;
						
		case 3:
			System.out.println("Vamos realizar uma prova\n");
			break;
		}
		
		String resposta;
		
		System.out.println("Queremos intervalo?\n");
		resposta = entrada.next();
		
		switch(resposta) {
		case "sim":
			System.out.println("\nEntão bora lá!!!");
			
			break;
			
		case "nao":
			System.out.println("\nMais um pouco de aula então!");
			break;
			
			default:				
			System.out.println("\nEra uma pergunta tão simples :(");	
		}
		
		
		System.out.println("Escolha um número:\n");
		System.out.println("1 = Azul\n");
		System.out.println("2 = Vermelho\n");
		System.out.println("nenhuma = nenhuma");
		
		resposta = entrada.next();
		
		switch(resposta) {
		
		case "1":
			System.out.println("Azul");
			break;
		case "2":
			System.out.println("Vermelho");
			break;
		case "nenhuma":
			System.out.println("Nenhuma");
			
		default:
			System.out.println("Opção Inválida");
			break;
				
			
		}
	}

}
