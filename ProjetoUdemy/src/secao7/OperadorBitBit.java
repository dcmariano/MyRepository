package secao7;

public class OperadorBitBit {

	public static void main(String[] args) {
		int n1 = 89; // 0101 1001
		int n2 = 60; // 0011 1100
		
		//SE A COMPARAÇÃO DE CADA BIT DER VERDADEIRO MUDA PARA 1 SENÃO MUDA PARA 0
		
		
		
		// "E" QUANDO OS DOIS BIT FOREM VERDADEIRO 
		System.out.println(n1 & n2); // 0001 1000 (24)
		
		// "OU" QUANDO UM DOS BITS FOREM VERDADEIROS
		System.out.println(n1 | n2); // 0111 1101 (125)
		
		// "OU EXCLUSIVO" NÃO DÁ VERDADEIRO QUANDO AMBAS FOREM VERDADEIRAS "DEREM 1" 
		System.out.println(n1 ^ n2); // 0110 0101 (101)

		
		

	}

}
