# Exerc�cio SIGNOS da PROVA

> Crie um programa que informe o signo do usu�rio

> Capturar nome , dia e m�s de anivers�rio

> Criar constante para numero limite do dia do m�s, no caso 31

```` java
Se (o dia for maior que o limite){
			Informar o valor limite para um dia do m�s
			}Sen�o { escolher o m�s correspondente para fazer as valida��es especificas
			nesse m�s existe esse dia?
			com base no dia do m�s qual � o signo
			m�s invalido
		
		=============================	
//Utilizei a seguinte sintaxe:

if ((mes == 3 && DIA >= 21) || (mes == 4 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo � �ries");

			} else if ((mes == 4 && DIA >= 21) || (mes == 5 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo � Touro");

			} else if ((mes == 5 && DIA >= 21) || (mes == 6 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo � G�meos");
				
				//... e assim por diante, de acordo com as datas dos signos
				