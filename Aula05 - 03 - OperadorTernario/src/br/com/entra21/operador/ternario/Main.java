package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre operador ternario");
		
		// : OPERADOR TERNARIO IF:ELSE
		
		String nome;
		boolean condicao=true;
		
		nome= (true)? "Nome":"Sobrenome"; // se nome TRUE "Nome", se FALSE "Sobrenome"
		
		System.out.println("Entao você é " +(condicao? "de maior":"de menor") );
		
		byte idade=30;
		
		if(idade>18) {
			System.out.println("Você é de maior");
			} else {
				System.out.println("Você é de maior");
			}
		
		System.out.println("Vc é de "+ (idade>17? "de maior ": " de menor"));
		
		//após o + é a condição ... se idade é maior de 17 aparece de maior SENÃO(:) de menor
		

		
		

	}

}
