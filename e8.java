package listaexercicios;

import java.util.Scanner;

public class e8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int numeros [] = new int [10],soma=0, repeticao=0;

		while(repeticao<10) {
			
			System.out.println("informe um número: ");
			numeros[repeticao]=ler.nextInt();
			
			soma=soma+numeros[repeticao];
			
			repeticao++;

		}
		System.out.println("O resultado da soma é: "+soma);

		ler.close();

	}

}
