package br.com.entra21.exercicio.custo.produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer, "
				+ "ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");
		
		Scanner entrada = new Scanner(System.in);
		
		float custo;
		double aumento;
		String produto;
		double precoVenda;
		
		System.out.println("Insira o nome do produto:");
		produto = entrada.next();
		
		System.out.println("Qual � o pre�o de custo do produto? ");
		custo = entrada.nextFloat();
		
		aumento = custo*0.65; //se colocar 1.65f, iria excluir a necessidade da variavel pre�oVenda.
		precoVenda = custo+aumento;
		System.out.println("O novo valor sugerido �: "+precoVenda);
		
		

	}

}
