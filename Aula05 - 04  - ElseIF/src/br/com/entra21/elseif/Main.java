package br.com.entra21.elseif;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aprendendo sobre else if (ou seja, renovando o if antes do else)");
		
		float altura;
		double dinheiro;
		
		altura = 1.5f;
		dinheiro = 5000;
				
		if(altura<1.5) {// � baixinho?
			
			System.out.println("� bem baixinho");
			
				}else if(altura<=1.9f) {//� alto
			
			System.out.println("� alto");
			
						} else {
								//mesmo que eu n�o queira fazer nada aqui, � uma boa pr�tica ter o else
			}
		//se ate 1200, ate 1800, ate 2000
		if(dinheiro<=1200) {
			System.out.println("salario minimo");
		}else if(dinheiro<=1800) {
			System.out.println("salario melhor");
		}else if(dinheiro<=2000) {
			System.out.println("salario decente");
			}
		else {
			System.out.println("Salario bom");
		}
		}
}
				
			
		
	


