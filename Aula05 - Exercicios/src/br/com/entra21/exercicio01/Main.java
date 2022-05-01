package br.com.entra21.exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Capturar 2 números e informar qual é o maior\n");
		
		Scanner entrada = new Scanner(System.in);
		
		byte numeroA;
		byte numeroB;
		
		System.out.println("Informe o valor do numero A:");
		numeroA= entrada.nextByte();
		
		System.out.println("\nInforme o valor do numero B:\n");
		numeroB= entrada.nextByte();
		
		if(numeroA>numeroB) {
			System.out.println("\nNumeroA é maior");
		} else if(numeroA==numeroB) {
			System.out.println("\nNumeroA e NumeroB são iguais");
			
		}	
		else {
			System.out.println("\nNumeroB é maior");
		}
		
		System.out.println("\n==========================================\n");
		
		System.out.println("Capturar ano de nascimento e informar se já tem idade para votar\n");
		
		short anoNascimento;
		short calculo;
		
		System.out.println("Informe o ano de nascimento:\n");
		anoNascimento= entrada.nextShort();
		
		calculo = (short) (2022-anoNascimento);
		
		if(calculo>=16) {
			System.out.println("\nEstá apto para votar");
		} else {
			System.out.println("Ainda não está apto para votar\n");
			
		}
		System.out.println(calculo>=16? "Está apto para votar":"Ainda não está apto para votar");
		//abreviação do código utilizando operador ternario
		
		System.out.println("=============================================\n");
		
		System.out.println("Capturar 3 notas do aluno para calcular a "
				+ "média e informar se está aprovado ou reprovado\n");
		
		float nota1, nota2, nota3,media,media2;
						
		
		
		System.out.println("Informe a primeira nota:\n");
		nota1= entrada.nextFloat();
		
		System.out.println("Informe a segunda nota:\n");
		nota2 = entrada.nextFloat();
		
		System.out.println("Informe a terceira nota:\n");
		nota3 = entrada.nextFloat();
		
		media = nota1+nota2+nota3;
		media2 = media/3;
		
		System.out.println(media2>=6? "Aprovado": "Reprovado\n");
		
		System.out.println("=============================================\n");
		
		System.out.println("Capturar peso e altura para calcular o IMC e "
				+ "exibir o resultado e em qual faixa de peso \n");
		
		float peso, altura, imc;
				
		
		System.out.println("Informe o peso:\n");
		peso = entrada.nextFloat();
		
		System.out.println("Informe sua altura:\n");
		altura = entrada.nextFloat();
		
		imc = peso/(altura*altura);
		
		System.out.println(imc);
		
		if(imc<=18.5) {
			System.out.println("Abaixo do peso");
		} else if(imc>=18.5 && imc<=24.9) {
			System.out.println("Peso normal");
		} else if(imc>=25 && imc<=29.9) {
			System.out.println("Pré-obesidade");
		} else if(imc>=30 && imc<=34.9) {
			System.out.println("Obesidade Grau 1");
		} else if(imc>=35 && imc<=39.9) {
			System.out.println("Obesidade Grau 2");
		} else{
			System.out.println("Obesidade Grau 3");
		}
		
				
	
	}

}
