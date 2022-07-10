package secao8Application;

import java.util.Scanner;

import secao8Entities.Alunes;

public class ProgramAlunes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alunes alu = new Alunes();
		System.out.println("Insira o nome");
		alu.name = sc.nextLine();
		System.out.println("Insira as notas 1, 2, 3: ");
		alu.nota1 = sc.nextDouble();
		alu.nota2 = sc.nextDouble();
		alu.nota3 = sc.nextDouble();
		
		System.out.printf("Total de pontos : %.2f%n" , alu.pontos());
		System.out.println(alu.apOrRep());
	}

}
