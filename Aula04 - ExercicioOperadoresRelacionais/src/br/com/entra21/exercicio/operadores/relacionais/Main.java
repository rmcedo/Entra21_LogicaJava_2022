package br.com.entra21.exercicio.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Faça um programa que informe se o 1º numero é maior que o 2º numero");
		
		byte numeroA, numeroB;
		boolean resultado;
		
		numeroA = 10;
		numeroB = 11;
		
		resultado = numeroA > numeroB;
		
		System.out.println("O numero A: "+numeroA+ " é maior que o numero B:" +numeroB+ " ? " +resultado );

		System.out.println("Faça um programa que informe se o 1º numero é maior ou igual que o 2º numero");
		
		numeroA=10;
		numeroB=10;
		
		resultado = numeroA>=numeroB;
			
		
		System.out.println("O numero A: "+numeroA+ " é maior que o numero B: "+ numeroB+ " ? " +resultado);
		

	}

}
