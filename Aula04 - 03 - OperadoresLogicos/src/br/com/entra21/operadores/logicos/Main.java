package br.com.entra21.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores Logicos \n");

		System.out.println("E  - AND  - && = expressão restritiva\n\n");
		
		byte idade;
		float altura;
		double dinheiro;
		
		idade=27;
		altura= 1.73f; // como o valor já está sendo atribuido, precisamos colocar o f.
		boolean resultado;
		
		resultado = idade>=18 && altura>=1.73f;
		
		System.out.println("Os valores passam pelos requisistos? "+resultado);
		System.out.println("\nPodemos usar também do seguinte modo:\n");
		
		System.out.println("O valor da idade: "+idade+ " e o valor da altura: "+altura+ 
				" atendem os requisitos? "+resultado);
		
		idade=20;
		altura=2.10f;
		dinheiro=20000;
		
		resultado = (idade>=18) && (altura>=2.0f) && (dinheiro>=50000);
		//				(true)	&& 		(true)	&&		(false)
		//						(true)	&& 		(false)
		//								(false)
		System.out.println(resultado);
		idade = 30;
		altura=2.15f;
		dinheiro=100000;
		
		resultado = (idade>=18) && (altura>=2.0f) &&(dinheiro>=50000);
		//				(true)	&&		(true)	&&		(true)
		//					(true)	&& (true)
		//						(true)
		System.out.println(resultado+"\n");
	
		
		//-----------------------------------------------------------------
		
		System.out.println("OU  - OR  -  ||  - pipe  = expressão inclusiva\n");
		
		idade = 17;
		dinheiro = 1000;
		
		resultado = (idade>=18 || dinheiro>=1000);
		//				false  ||	true
		//					  true
		
		System.out.println(resultado);
		
		resultado = (idade<=14 || idade>=18);
		//				false  ||  false
		//					  false
		
		System.out.println(resultado);
		
		idade=3;
		
		resultado = (idade<=3 || idade>=18);
		//				true  ||   false
		//					 true
		
		System.out.println(resultado);
		
		
		
		
				
	}

}
