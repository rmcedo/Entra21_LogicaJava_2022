package br.com.entra21.exercicio.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		System.out.println("Faça um programa que capture 3 informações o nome,  "
				+ "idade e altura. Deve ser informado se o usuário é maior ou "
				+ "igual que 170cm E tem é maior de idade (utilizar o &&)");
		
		byte idade;
		String nome;
		float altura;
		boolean resultado;
		idade = 27;
		altura = 1.73f;
		
		resultado= idade>=18 && altura>=1.70;
		
		System.out.println("O usuário cumpre os requisitos? "+resultado);
		
		System.out.println("Faça um programa que capture 3 informações o nome,  "
				+ "idade e altura. Deve ser informado se o usuário é maior ou igual "
				+ "que 170cm OU tem é maior de idade (utilizar o ||)");
		
		resultado = idade>=18 || altura>=1.70;
		
		System.out.println("O usuário cumpre os requisitos? " +resultado);
	
		
		
		

	}

}
