package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		
		  byte idade; // podemos criar a variavel e diretamente j� atribuir um valorpara ela.
		  idade=27;
		  
		  short ano=2022;
		  
		  short anoPassado=2021;
		  
		  System.out.println("Minha idade �: "+idade);
		  
		  System.out.println("Estamos em "+ano+ " e ano passado foi "+anoPassado+".");
		  
		  int habitantesBrasil=2012060000;
		  
		  System.out.println("No Brasil, em "+ano+", temos cerca de "
		  +habitantesBrasil+" habitantes.");
		  
		  long habitantesTerra1500;
		  
		  habitantesTerra1500=438000000;
		  
		  double habitantesAtualmente=7900000000.00; 
		  //foi necess�rio utilizar a parte decimal para poder utilizar um numero t�o grande.
		  
		  System.out.println("Na Terra, em 1500, tinhamos cerca de "
		  +habitantesTerra1500+" habitantes. Hoje em dia, temos cerca de "+
		  habitantesAtualmente+" habitantes.");
		  
		  float peso= 93.5f, altura=1.73f; 
		  //� necess�rio utilizar o f para mostrar no c�digo, apenas quando for inserida manualmente
		  
		  System.out.println("Meu peso �: "+peso+ " e minha altura �: "+altura+".");
		  
		  char letra='R'; 
		  //char � apenas para UMA LETRA OU CARACTERE, sempre usar aspas simples
		  
		  boolean intervaloAntesdasOito=false;
		  boolean intervaloAgora=true;
		 

	

		String nome;
		byte minhaIdade;
		float salario , minhaAltura;
		
		
		  //qualquer variavel que o usuario ir� digitar no formul�rio deve ser criada anteriormente
		  
		  Scanner entrada; // importar classe scanner, clicando na lampada 
		  entrada =new Scanner(System.in); // assim, estar� pronto para receber informa��es do teclado. 
		  // O console vai parar, esperando que o usuario digite alguma informa��o para continuar.
		  
		  System.out.println("Por favor, digite seu nome:"); nome = entrada.next(); 
		  // captura o texto digitado pelo usu�rio
		  
		  System.out.println("Informe sua idade:"); minhaIdade = entrada.nextByte();
		  
		  //entrada.nextLine(); - o usu�rio fica com a mensagem na tela at� apertar enter.
		  
		  System.out.println("Informe sua Altura:"); minhaAltura = entrada.nextFloat();
		  
		  System.out.println("Por favor, informe seu �ltimo sal�rio:"); salario =
		  entrada.nextFloat();
		  
		  System.out.println("Bem vindo " +nome + " agora consigo interagir com humanos"); 
		  System.out.println("Voc� tem " +minhaIdade + " anos."); 
		  System.out.println("Voc� tem " + minhaAltura +" cm."); //para quando for digitar no console, utiliza-se a v�rgula
		  System.out.println("Seu �ltimo sal�rio foi: R$" + salario);
		 

		// OS COMENT�RIOS DE V�RIAS LINHAS FORAM FEITAS PARA DIMINUIR OS C�DIGOS USADOS NO COME�O DA AULA

		nome = JOptionPane.showInputDialog("Informe novamente o seu nome completo"); //syso + scanner ao mesmo tempo
		
		JOptionPane.showMessageDialog(null, "Legal, agora eu sei seu nome " + nome);
		
		minhaIdade = Byte.parseByte (
				JOptionPane.showInputDialog("Informe sua Idade: ")
				);
		
				JOptionPane.showMessageDialog(null, "Sua idade � " +minhaIdade); //null, serve para um objeto que ainda n�o tem valor
								
		salario = Float.parseFloat(
				JOptionPane.showInputDialog("Informe seu sal�rio: ")
				);
		
			JOptionPane.showMessageDialog(null, "Seu sal�rio � " +salario);
		
				// Tive um problema na execu��o. As janelas estavam abrindo fora do Eclipse.
			
			
	}

}
