package br.com.entra21.exercicio.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Fa�a um programa que informe se o 1� numero � maior que o 2� numero");
		
		byte numeroA, numeroB;
		boolean resultado;
		
		numeroA = 10;
		numeroB = 11;
		
		resultado = numeroA > numeroB;
		
		System.out.println("O numero A: "+numeroA+ " � maior que o numero B:" +numeroB+ " ? " +resultado );

		System.out.println("Fa�a um programa que informe se o 1� numero � maior ou igual que o 2� numero");
		
		numeroA=10;
		numeroB=10;
		
		resultado = numeroA>=numeroB;
			
		
		System.out.println("O numero A: "+numeroA+ " � maior que o numero B: "+ numeroB+ " ? " +resultado);
		

	}

}
