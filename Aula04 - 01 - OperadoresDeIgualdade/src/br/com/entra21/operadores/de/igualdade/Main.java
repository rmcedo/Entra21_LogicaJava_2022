package br.com.entra21.operadores.de.igualdade;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores de Igualdade");
		
		System.out.println("igual  =="); // == para saber se as variaveis são iguais.
		
		byte idadeA, idadeB;
		boolean resultado;
		idadeA = 10;
		idadeB = 10;
		
		resultado= idadeA == idadeB;
		
		System.out.println("Ao comparar a igualdade resultou em: " +resultado);
		
		resultado = idadeA != idadeB; // != para saber se as variaveis são iguais
		
		System.out.println("Ao comparar a desigualdade resultou em: " +resultado);
		
	}

}
