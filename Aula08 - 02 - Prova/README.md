# Exerc�cio C�LCULOS da PROVA

> Crie um programa que fa�a v�rios c�lculos

> Informe qual opera��o matem�tica deseja realizar

> caso informe 0 deve encerrar o programa

> 1 = somar

> 2 = subtrair

> 3 = multiplicar

> 4 = dividir

> Capturar os 2 valores e informar o resultado e esperar o pr�ximo calculo


```` java
case "1":
case "somar":
			float entradaA, entradaB, resultado;
			System.out.println("Por favor, insira o primeiro n�mero: \n");
			entradaA = entrada.nextFloat();
			System.out.println("Por favor, insira o segundo n�mero: \n");
			entradaB = entrada.nextFloat();
			resultado = verSomar(entradaA, entradaB);
			System.out.println("O resultado foi: " + resultado);

			break;
//Para cada opera��o, criei uma fun��o contendo o c�lculo e apenas mudei as entradas