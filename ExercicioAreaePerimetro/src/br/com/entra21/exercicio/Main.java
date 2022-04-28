package br.com.entra21.exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.\n");
		System.out.println("Sabendo que a área é calculada com base no produto entre base e altura.");
		System.out.println("O perímetro é obtido ao somar todos os vertices do retângulo.\n");
		
		float base;
		float altura;
		float area;
		float perimetro;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a base do retangulo: ");
		base = entrada.nextFloat();
		System.out.println("Insira a altura do retangulo: ");
		altura = entrada.nextFloat();
		
		area = base*altura;
		perimetro = base*2 + altura*2;
		System.out.println("A área do retangulo é: "+ area + "\nO perímetro do retangulo é: "+ perimetro);

	
		
		
		
	
		
		
		
		

	}

}
