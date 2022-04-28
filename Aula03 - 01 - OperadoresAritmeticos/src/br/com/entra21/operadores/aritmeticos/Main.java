package br.com.entra21.operadores.aritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Operadores Aritméticos\n");
		System.out.println("Realizando uma soma " + (1+7)); //operações de soma dentro do syso, utiliza os ()
		System.out.println((4*10));
	
	
	float numeroA, numeroB;
	float calculoSoma;
	float resto;
	
	//objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso ao teclado
	Scanner entrada =new Scanner(System.in); //irá observar a entrada de dados
	// new Scanner significa construa um objeto da classe Scanner e attribua na variavel entrada
	System.out.println("Informe o número A: ");
	numeroA = entrada.nextFloat();
	
	System.out.println("Informe o numero B:");
	
	numeroB = entrada.nextFloat();
	
	System.out.println("A soma entre esses números é: " + (numeroA+numeroB));
	// no syso é necessário isolar, principalmente sub ou adição
	
	calculoSoma= (numeroA+numeroB); //Assim é mais fácil para cálculos mais complexos, para deixar mais didático
	
	System.out.println("A soma é: " + calculoSoma);
	System.out.println("A subtração entre esses números é: " +(numeroA-numeroB) );

	System.out.println("A multiplicação dos dois números é: "+  numeroA*numeroB);
	
	System.out.println("A divisão dos dois números é: " + numeroA/numeroB); //geralmente precisamos utilizar a variavel float
	
	resto = numeroA%numeroB;
	
	System.out.println("O resto da divisão é: " + resto);
	
	boolean ehDivisivel = numeroA % numeroB == 0;
	
	System.out.println("é divisivel entre si? " + ehDivisivel);
	
	
	
	}

}
