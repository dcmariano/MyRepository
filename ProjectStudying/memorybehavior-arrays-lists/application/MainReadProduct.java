package application;

import java.util.Scanner;

import entities.Product2;

public class MainReadProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number products: ");
		int n = sc.nextInt();
		Product2[] product = new Product2[n];
		double sum = 0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Enter the name and price of the " + (i + 1) + "º product: ");
			String name = sc.next();
			double price = sc.nextDouble();
			product[i] = new Product2(name, price);
			sum += product[i].getPrice();
		}
		System.out.printf("Average price = %.2fn", sum);

		sc.close();

	}

}
