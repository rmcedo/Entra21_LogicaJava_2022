# Exercício SIGNOS da PROVA

> Crie um programa que informe o signo do usuário

> Capturar nome , dia e mês de aniversário

> Criar constante para numero limite do dia do mês, no caso 31

```` java
Se (o dia for maior que o limite){
			Informar o valor limite para um dia do mês
			}Senão { escolher o mês correspondente para fazer as validações especificas
			nesse mês existe esse dia?
			com base no dia do mês qual é o signo
			mês invalido
		
		=============================	
//Utilizei a seguinte sintaxe:

if ((mes == 3 && DIA >= 21) || (mes == 4 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo é Áries");

			} else if ((mes == 4 && DIA >= 21) || (mes == 5 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo é Touro");

			} else if ((mes == 5 && DIA >= 21) || (mes == 6 && DIA <= 20)) {
				System.out.println("Legal " + nome + " seu signo é Gêmeos");
				
				//... e assim por diante, de acordo com as datas dos signos
				