package secao8Application;

import java.util.Scanner;

import secao8Entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os valores do Retangulo Altura e Largura");
		ret.height = sc.nextDouble();
		ret.width = sc.nextDouble();
		
		System.out.printf("Area : %.2f%n", ret.area());
		System.out.printf("Perimetro : %.2f%n", ret.perimeter());
		System.out.printf("Diagonal : %.2f%n ", ret.diagonal());
		
		sc.close();
	}

}
