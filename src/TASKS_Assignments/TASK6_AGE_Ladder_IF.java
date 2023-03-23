package TASKS_Assignments;

import java.util.Scanner;

public class TASK6_AGE_Ladder_IF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Ur AGE = ");
		int age=sc.nextInt();
		if (age>0 && age<=18)
		{
			System.out.println("U Are CHILD ");
		}
		else if(age>18 && age<=40)
		{
			System.out.println("U Are YOUNG");
		}
		else if(age>40 && age<=100)
		{
			System.out.println("U Are OLD");
		}
		else if(age==0)
		{
			System.out.println(" Not Valid Age");
		}
		else
		{
			System.out.println(" InValid Age Problem");
		}
}
}
