package listaexercicios;

import java.util.Scanner;

public class e12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade[] = new int [20],soma=0,media,repeticao=0;

		while(repeticao<20) {

			System.out.println("Quais as idades das pessoas?");
			idade[repeticao]=ler.nextInt();
			
			soma=soma+idade[repeticao];
			repeticao++;
			
		}
		
		media=soma/20;
		System.out.println("A soma das idades é igual a: "+soma+" e a média é: "+media);

		ler.close();

	}

}
