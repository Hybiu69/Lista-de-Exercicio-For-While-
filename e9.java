package listaexercicios;

import java.util.Scanner;

public class e9 {

	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);

		int idade[] = new int [20],soma=0;

		for(int i=0;i<20;i++) {

			System.out.println("Quais as idades das pessoas?");
			idade[i]=ler.nextInt();
			
			soma=soma+idade[i];

		}
		
		System.out.println("A soma das idades é igual a: "+soma);

		ler.close();
	}

}
