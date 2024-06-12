package listaexercicios;

import java.util.Scanner;

public class e7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int numeros [] = new int [10],soma  =0;	
		
		for(int i=0;i<10;i++) {
			System.out.println("informe um número: ");
			numeros[i]=ler.nextInt();
			
			soma=soma+numeros[i];
			
		}
		System.out.println("O resultado da soma é: "+soma);

		ler.close();
	}

}
