package listaexercicios;

import java.util.Scanner;

public class e5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual o seu nome?");
		String nome = ler.next();
		
		
		
		for (int i=0; i<10;i++) {
			
			System.out.println("Seu nome é: "+nome);
		}
		
		ler.close();
	}

}
