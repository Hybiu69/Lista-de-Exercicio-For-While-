package listaexercicios;

import java.util.Scanner;

public class e13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade[] = new int [20],maioridade=0;

		for(int i=0;i<20;i++) {

			System.out.println("Quais as idades das pessoas?");
			idade[i]=ler.nextInt();
			
			if(idade[i]>17) {
				maioridade++;
			}
			
		}
				
		
		System.out.println("O número de pessoas maior de idade é: "+maioridade);
		
		ler.close();
	}

}