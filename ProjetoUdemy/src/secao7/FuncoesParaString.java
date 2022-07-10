package secao7;

public class FuncoesParaString {

	public static void main(String[] args) {
		
		// Funcoes Interessantes para Strings
		
		String original = "abcde FHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); // CONVERTE PARA LETRAS MINUSCULAS
		String s02 = original.toUpperCase(); // CONVERTE PARA LETRAS MAIUSCULA
		String s03 = original.trim(); // ELIMINA ESPACOS NOS CANTOS DA STRING
		String s04 = original.substring(2); // PEGA OS CARACTERES DA POSICAO (2) EM DIANTE E FORMA UMA NOVA STRING
		String s05 = original.substring(2,9); // RECORTA A STRING DA POSICAO (2) A (9)
		String s06 = original.replace('a','x'); // TROCA LETRA 'a' POR 'x'
		String s07 = original.replace("abc","xy"); // TROCA STRINGS "abc" POR "xy"
		int i = original.indexOf("bc"); // PEGA APRIMEIRA OCORRENCIA DO "bc"
		int j = original.lastIndexOf("bc"); // PEGA ULTIMA OCORRENCIA DO "bc"

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2,9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("indexOf('bc'): -" + i + "-");
		System.out.println("lastIndexOf('bc'): -" + j + "-");

	}

}
