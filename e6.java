package listaexercicios;

import java.util.Scanner;

public class e6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = ler.next();
		
		int repeticao =0;
		
		while(repeticao<10) {

			repeticao++;

			System.out.println("Seu nome é: "+nome);
		}

		ler.close();

	}

}