package application;

import java.util.Scanner;
import entities.Student1;

public class MainApproved {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many students will be typed?");
		int n = sc.nextInt();
		Student1[] student = new Student1[n];
		String approved = null;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name, first and second grade of the " + (i + 1) + "º student:");
			sc.nextLine();
			String name = sc.nextLine();
			double firstNote = sc.nextDouble();
			double secondNote = sc.nextDouble();
			student[i] = new Student1(name, firstNote, secondNote);
			if (student[i].getFirstNote() + student[i].getSecondNote() > 6) {
				
			}
		}
		sc.close();
	}

}