package br.com.entra21.exercicio.custo.produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer, "
				+ "após, processe um aumento de 65% e informe qual será o preço de venda.");
		
		Scanner entrada = new Scanner(System.in);
		
		float custo;
		double aumento;
		String produto;
		double precoVenda;
		
		System.out.println("Insira o nome do produto:");
		produto = entrada.next();
		
		System.out.println("Qual é o preço de custo do produto? ");
		custo = entrada.nextFloat();
		
		aumento = custo*0.65; //se colocar 1.65f, iria excluir a necessidade da variavel preçoVenda.
		precoVenda = custo+aumento;
		System.out.println("O novo valor sugerido é: "+precoVenda);
		
		

	}

}
