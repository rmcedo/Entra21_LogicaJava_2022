package br.com.entra21.exercicio.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fa�a um programa que capture 3 informa��es o nome,  "
				+ "idade e altura. Deve ser informado se o usu�rio � maior ou "
				+ "igual que 170cm E tem � maior de idade (utilizar o &&)");
		
		byte idade;
		String nome;
		float altura;
		boolean resultado;
		idade = 27;
		altura = 1.73f;
		
		resultado= idade>=18 && altura>=1.70;
		
		System.out.println("O usu�rio cumpre os requisitos? "+resultado);
		
		System.out.println("Fa�a um programa que capture 3 informa��es o nome,  "
				+ "idade e altura. Deve ser informado se o usu�rio � maior ou igual "
				+ "que 170cm OU tem � maior de idade (utilizar o ||)");
		
		resultado = idade>=18 || altura>=1.70;
		
		System.out.println("O usu�rio cumpre os requisitos? " +resultado);
	
		
		
		

	}

}
