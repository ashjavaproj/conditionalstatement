package TASKS_Assignments;

import java.util.Scanner;

public class TASK5_Votting {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Ur AGE = ");
		int age=sc.nextInt();
		if (age>=18)
		{
			System.out.println("U Are Eligible for Votting");
			
		}
		else
		{
			System.out.println("U Are Not Eligible for Votting");
		}


	}

}
