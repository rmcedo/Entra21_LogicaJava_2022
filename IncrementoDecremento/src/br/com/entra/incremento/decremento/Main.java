package br.com.entra.incremento.decremento;

public class Main {

	public static void main(String[] args) {
	
		int idade;
		idade=27;
		/*
		 * //aniversario
		 * 
		 * idade = idade+1; //34
		 * 
		 * System.out.println(idade);
		 * 
		 * //ano bissexto
		 * 
		 * idade = idade+4; System.out.println(idade); //forma curta
		 * 
		 * idade++; //adicionar +1. System.out.println(idade); idade+=2; //adicionar+2
		 * System.out.println(idade); idade*=2; //multiplicar por 2 idade= idade*2
		 * System.out.println(idade);
		 * 
		 * //só mudamos as operações
		 * 
		 * idade/=2; System.out.println(idade);
		 * 
		 * idade--; System.out.println(idade);
		 * 
		 * idade -=2; System.out.println(idade);
		 * 
		 * idade -=10; System.out.println(idade);
		 */
		
	System.out.println("Minha idade com pre incremento é: "+ (idade++)); //++idade coloca o incremento na mesma linha
	System.out.println("Minha idade pos incremento é: " +idade);//funciona também para decremento
	
	//pre incremento é apenas para valores simples, de um em um.
	
		
		
		
		
	}

}
