package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre operador ternario");
		
		// : OPERADOR TERNARIO IF:ELSE
		
		String nome;
		boolean condicao=true;
		
		nome= (true)? "Nome":"Sobrenome"; // se nome TRUE "Nome", se FALSE "Sobrenome"
		
		System.out.println("Entao voc� � " +(condicao? "de maior":"de menor") );
		
		byte idade=30;
		
		if(idade>18) {
			System.out.println("Voc� � de maior");
			} else {
				System.out.println("Voc� � de maior");
			}
		
		System.out.println("Vc � de "+ (idade>17? "de maior ": " de menor"));
		
		//ap�s o + � a condi��o ... se idade � maior de 17 aparece de maior SEN�O(:) de menor
		

		
		

	}

}
