package listaexercicios;

import java.util.Scanner;

public class e10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade[] = new int [20],soma=0,repeticao=0;

		while(repeticao<20) {

			System.out.println("Quais as idades das pessoas?");
			idade[repeticao]=ler.nextInt();
			
			soma=soma+idade[repeticao];
			
			repeticao++;

		}
		
		System.out.println("A soma das idades é igual a: "+soma);

		ler.close();

	}

}
