package secao7;

public class OperacaoSplit {

	public static void main(String[] args) {
		
		// ESTA FUNCAO SERVE PARA ARMAZENAR PARTES DE STRINGS EM VETORES
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" "); // RECORTA PARTES DA SITRNG E GUARDA O RESULTADO EM VETORES 
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);



	}

}
