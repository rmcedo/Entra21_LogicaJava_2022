package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores Relacionais\n\n");
		
		System.out.println("Menor <\n");
		
		byte idadeA, idadeB;
		boolean resultado;
		idadeA = 27;
		idadeB = 26;
		
		resultado = idadeA < idadeB; // idadeA é menor que idadeB?
				
		System.out.println("idadeA é menor que idadeB?\n"+resultado);
		System.out.println("idadeA é menor que idadeB? \n"+(idadeA<idadeB));
		
		
		System.out.println("\nMaior >\n");
		resultado = idadeA > idadeB; //idadeA é menor que idadeB?
		
		System.out.println("idadeA é maior que idadeB?\n"+resultado);
		System.out.println("idadeA é maior que idadeB?\n"+(idadeA>idadeB));
		
		System.out.println("\nMenor ou igual <=\n");
		
		resultado = idadeA <= idadeB; //idadeA é menor ou igual que idadeB?
		
		System.out.println("idadeA é menor ou igual que idadeB?\n"+resultado);
		System.out.println("idadeA é menor ou igual que idadeB?\n"+(idadeA<=idadeB));
				
		System.out.println("\nMaior ou igual >=\n");
		
		resultado = idadeA >= idadeB; // idadeA é maior ou igual que idadeB?
		
		System.out.println("idadeA é maior ou igual que idadeB?\n"+resultado);
		System.out.println("idadeA é maior ou igual que idadeB?\n"+(idadeA>=idadeB));
		
		//podemos utilizar o +idadeA ou +idadeB dentro do syso para podermos mostrar os valores em tela.
	
	
	}

}
