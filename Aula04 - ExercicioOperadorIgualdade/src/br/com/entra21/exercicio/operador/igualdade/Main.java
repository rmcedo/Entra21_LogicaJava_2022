package br.com.entra21.exercicio.operador.igualdade;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Fa�a um programa que compare 2 n�meros e"
				+ " informe se o 1� � igual ao 2� numero");

		byte numeroA, numeroB;
		boolean resultado;
		
		numeroA= 15;
		numeroB= 14;
				
		resultado = numeroA == numeroB;
		
		System.out.println("O numero A: " +numeroA+ " � igual ao numero B: "+numeroB+ "? " +resultado);	
		;
	}

}
