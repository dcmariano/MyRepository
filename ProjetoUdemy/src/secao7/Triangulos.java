package secao7;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com os valores do Triangulo X ");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		System.out.println("Entre com os valores do Triangulo Y ");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		double px = (xa+xb+xc)/2.00;
		double py = (ya+yb+yc)/2.00;

		double areax = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
		double areay = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));

		
		System.out.println("triangulo x " + areax);
		System.out.println("triangulo y " + areay);

		sc.close();
	}

}
