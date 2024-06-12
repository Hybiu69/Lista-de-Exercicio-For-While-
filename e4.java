package listaexercicios;

public class e4 {

	public static void main(String[] args) {
		
		int repeticao =0, soma =0;
		
		while(repeticao<=15) {
			
			soma += repeticao;
			
			repeticao++;
		}
		System.out.println("O resultado da soma de 1 a 15 = "+soma);
	}

}