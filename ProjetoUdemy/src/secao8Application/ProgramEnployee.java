package secao8Application;

import java.util.Scanner;

import secao8Entities.Employee;

public class ProgramEnployee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Entre com o Nome");
		emp.name = sc.nextLine();
		System.out.println("Entre com o Salario");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Insira os impostos");
		emp.tax = sc.nextDouble();
		System.out.println("incluir Aumento");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);

		System.out.println();
		System.out.println(emp.toString());
		sc.close();
	}

}
