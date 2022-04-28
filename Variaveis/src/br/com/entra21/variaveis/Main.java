package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		
		  byte idade; // podemos criar a variavel e diretamente já atribuir um valorpara ela.
		  idade=27;
		  
		  short ano=2022;
		  
		  short anoPassado=2021;
		  
		  System.out.println("Minha idade é: "+idade);
		  
		  System.out.println("Estamos em "+ano+ " e ano passado foi "+anoPassado+".");
		  
		  int habitantesBrasil=2012060000;
		  
		  System.out.println("No Brasil, em "+ano+", temos cerca de "
		  +habitantesBrasil+" habitantes.");
		  
		  long habitantesTerra1500;
		  
		  habitantesTerra1500=438000000;
		  
		  double habitantesAtualmente=7900000000.00; 
		  //foi necessário utilizar a parte decimal para poder utilizar um numero tão grande.
		  
		  System.out.println("Na Terra, em 1500, tinhamos cerca de "
		  +habitantesTerra1500+" habitantes. Hoje em dia, temos cerca de "+
		  habitantesAtualmente+" habitantes.");
		  
		  float peso= 93.5f, altura=1.73f; 
		  //é necessário utilizar o f para mostrar no código, apenas quando for inserida manualmente
		  
		  System.out.println("Meu peso é: "+peso+ " e minha altura é: "+altura+".");
		  
		  char letra='R'; 
		  //char é apenas para UMA LETRA OU CARACTERE, sempre usar aspas simples
		  
		  boolean intervaloAntesdasOito=false;
		  boolean intervaloAgora=true;
		 

	

		String nome;
		byte minhaIdade;
		float salario , minhaAltura;
		
		
		  //qualquer variavel que o usuario irá digitar no formulário deve ser criada anteriormente
		  
		  Scanner entrada; // importar classe scanner, clicando na lampada 
		  entrada =new Scanner(System.in); // assim, estará pronto para receber informações do teclado. 
		  // O console vai parar, esperando que o usuario digite alguma informação para continuar.
		  
		  System.out.println("Por favor, digite seu nome:"); nome = entrada.next(); 
		  // captura o texto digitado pelo usuário
		  
		  System.out.println("Informe sua idade:"); minhaIdade = entrada.nextByte();
		  
		  //entrada.nextLine(); - o usuário fica com a mensagem na tela até apertar enter.
		  
		  System.out.println("Informe sua Altura:"); minhaAltura = entrada.nextFloat();
		  
		  System.out.println("Por favor, informe seu último salário:"); salario =
		  entrada.nextFloat();
		  
		  System.out.println("Bem vindo " +nome + " agora consigo interagir com humanos"); 
		  System.out.println("Você tem " +minhaIdade + " anos."); 
		  System.out.println("Você tem " + minhaAltura +" cm."); //para quando for digitar no console, utiliza-se a vírgula
		  System.out.println("Seu último salário foi: R$" + salario);
		 

		// OS COMENTÁRIOS DE VÁRIAS LINHAS FORAM FEITAS PARA DIMINUIR OS CÓDIGOS USADOS NO COMEÇO DA AULA

		nome = JOptionPane.showInputDialog("Informe novamente o seu nome completo"); //syso + scanner ao mesmo tempo
		
		JOptionPane.showMessageDialog(null, "Legal, agora eu sei seu nome " + nome);
		
		minhaIdade = Byte.parseByte (
				JOptionPane.showInputDialog("Informe sua Idade: ")
				);
		
				JOptionPane.showMessageDialog(null, "Sua idade é " +minhaIdade); //null, serve para um objeto que ainda não tem valor
								
		salario = Float.parseFloat(
				JOptionPane.showInputDialog("Informe seu salário: ")
				);
		
			JOptionPane.showMessageDialog(null, "Seu salário é " +salario);
		
				// Tive um problema na execução. As janelas estavam abrindo fora do Eclipse.
			
			
	}

}
