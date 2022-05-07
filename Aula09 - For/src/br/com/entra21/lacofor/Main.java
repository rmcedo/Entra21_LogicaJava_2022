package br.com.entra21.lacofor;

public class Main {

	public static void main(String[] args) {

		System.out.println("Aprendendo sobre For:");
		System.out.println("_____________________\n");

		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {
			System.out.println("Repetindo " + contador1);
		}

		System.out.println("====================");

		for (int contador = 1; contador <= 10; contador += 2) {
			System.out.println("Repetindo " + contador);
			// System.out.println("Repetindo "+ contador1);
			// Não é possível usar a variável contador1 pois ela só existe no outro escopo
			// do for

		}
		System.out.println("====================");

		for (int contador = 4; contador <= 10; contador += 2) {
			System.out.println("Repetindo: " + contador);
		}
		System.out.println("====================");
		for (int contador = 10; contador > 1; contador -= 1) {
			System.out.println("Repetindo = " + contador);
		}
		System.out.println("====================");
		int numero = 5;
		int contador;
	
		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Tabuada " + contador + " x " + numero + " = " + (contador * numero));
		}
		System.out.println("====================");
		System.out.println("Olha como o contador ficou: " + contador);
	}

}
