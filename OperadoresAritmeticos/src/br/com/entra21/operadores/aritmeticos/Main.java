package br.com.entra21.operadores.aritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Operadores Aritm�ticos\n");
		System.out.println("Realizando uma soma " + (1+7)); //opera��es de soma dentro do syso, utiliza os ()
		System.out.println((4*10));
	
	
	float numeroA, numeroB;
	float calculoSoma;
	float resto;
	
	//objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso ao teclado
	Scanner entrada =new Scanner(System.in); //ir� observar a entrada de dados
	// new Scanner significa construa um objeto da classe Scanner e attribua na variavel entrada
	System.out.println("Informe o n�mero A: ");
	numeroA = entrada.nextFloat();
	
	System.out.println("Informe o numero B:");
	
	numeroB = entrada.nextFloat();
	
	System.out.println("A soma entre esses n�meros �: " + (numeroA+numeroB));
	// no syso � necess�rio isolar, principalmente sub ou adi��o
	
	calculoSoma= (numeroA+numeroB); //Assim � mais f�cil para c�lculos mais complexos, para deixar mais did�tico
	
	System.out.println("A soma �: " + calculoSoma);
	System.out.println("A subtra��o entre esses n�meros �: " +(numeroA-numeroB) );

	System.out.println("A multiplica��o dos dois n�meros �: "+  numeroA*numeroB);
	
	System.out.println("A divis�o dos dois n�meros �: " + numeroA/numeroB); //geralmente precisamos utilizar a variavel float
	
	resto = numeroA%numeroB;
	
	System.out.println("O resto da divis�o �: " + resto);
	
	boolean ehDivisivel = numeroA % numeroB == 0;
	
	System.out.println("� divisivel entre si? " + ehDivisivel);
	
	
	
	}

}
