# Exercício CÁLCULOS da PROVA

> Crie um programa que faça vários cálculos

> Informe qual operação matemática deseja realizar

> caso informe 0 deve encerrar o programa

> 1 = somar

> 2 = subtrair

> 3 = multiplicar

> 4 = dividir

> Capturar os 2 valores e informar o resultado e esperar o próximo calculo


```` java
case "1":
case "somar":
			float entradaA, entradaB, resultado;
			System.out.println("Por favor, insira o primeiro número: \n");
			entradaA = entrada.nextFloat();
			System.out.println("Por favor, insira o segundo número: \n");
			entradaB = entrada.nextFloat();
			resultado = verSomar(entradaA, entradaB);
			System.out.println("O resultado foi: " + resultado);

			break;
//Para cada operação, criei uma função contendo o cálculo e apenas mudei as entradas