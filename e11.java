package listaexercicios;

import java.util.Scanner;

public class e11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade[] = new int [20],soma=0,media;

		for(int i=0;i<20;i++) {

			System.out.println("Quais as idades das pessoas?");
			idade[i]=ler.nextInt();
			
			soma=soma+idade[i];
			
		}
		
		media=soma/20;
		System.out.println("A soma das idades é igual a: "+soma+" e a média é: "+media);

		ler.close();
	}

}
