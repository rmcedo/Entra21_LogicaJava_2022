package br.com.entra21.exercicio.operador.igualdade;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que compare 2 números e"
				+ " informe se o 1º é igual ao 2º numero");

		byte numeroA, numeroB;
		boolean resultado;
		
		numeroA= 15;
		numeroB= 14;
				
		resultado = numeroA == numeroB;
		
		System.out.println("O numero A: " +numeroA+ " é igual ao numero B: "+numeroB+ "? " +resultado);	
		;
	}

}
