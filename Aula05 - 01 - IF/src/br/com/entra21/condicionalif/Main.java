package br.com.entra21.condicionalif;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Aprendendo sobre If");
		
		if(true) {
			
			System.out.println("Vai fazer isso quando der true");
			System.out.println("Somente true");
		}
		
		System.out.println("Aqui vai acontecer naturalmente pq "
				+ "o codigo segue sempre em frente");
		
		if(false) {
			//nunca passaria aqui pois apenas quando resulta em true passa por esse bloco
		}
		
		
		byte idade=12;
		
		
		if(idade>=18) {//é maior de idade?
			//sim
			
			System.out.println("O usuário é maior de idade");	
			}
		
		if(idade>=12 && idade<=17) {// é adolescente?
			
			System.out.println("O usuário é adolescente!");
		}
		
		
		}

	}


