package br.com.entra21.aulaswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Condicionais - Switch\n");
		
		System.out.println("Serve para escolher entre op��es pr�-definidas");
		
		System.out.println("\nGeralmente quando h� muitos if elses ifs baseados em igualdade\n");

		
		float altura;
		altura=1.5f;
		
		if(altura==1.0) {
			System.out.println("baixinho");
			
		}else if(altura==1.2) {
			System.out.println("ainda baixo");
		}else if(altura==1.5) {
			System.out.println("ainda baixo, mas n�o tantooo");
			
		}else {
			System.out.println("J� n�o � t�o baixo");
		}
		
		System.out.println("\n1 = Intervalo\n");
		System.out.println("\n2 = Exercicio\n");
		System.out.println("\n3 = Prova\n");
		
		Scanner entrada = new Scanner(System.in);
			
		byte opcao;
			System.out.println("Escolha uma das op��es para nossa pr�xima atividade: \n");
			
		opcao = entrada.nextByte();
				
		switch(opcao) {
		case 1:
			System.out.println("Vamos para o intervalo\n");
			break;
			
		case 2:
			System.out.println("Vamos realizar o exerc�cio\n");
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
			System.out.println("\nEnt�o bora l�!!!");
			
			break;
			
		case "nao":
			System.out.println("\nMais um pouco de aula ent�o!");
			break;
			
			default:				
			System.out.println("\nEra uma pergunta t�o simples :(");	
		}
		
		
		System.out.println("Escolha um n�mero:\n");
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
			System.out.println("Op��o Inv�lida");
			break;
				
			
		}
	}

}
