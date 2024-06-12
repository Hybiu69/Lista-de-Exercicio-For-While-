package listaexercicios;

import java.util.Scanner;

public class e14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int idade[] = new int [20],maioridade=0,repeticao=0;

		while(repeticao<20) {

			System.out.println("Quais as idades das pessoas?");
			idade[repeticao]=ler.nextInt();

			if(idade[repeticao]>17) {
				maioridade++;
			}

			repeticao++;
		}


		System.out.println("O número de pessoas maior de idade é: "+maioridade);

		ler.close();
	}

}