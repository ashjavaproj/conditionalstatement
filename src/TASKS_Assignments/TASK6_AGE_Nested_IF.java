package TASKS_Assignments;

import java.util.Scanner;

public class TASK6_AGE_Nested_IF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Ur AGE = ");
		int age=sc.nextInt();
		if(age<=18)
	    {	
		   if (age>0)
		  {
			System.out.println("U are CHILD ");
		  }
		   else 
		  {
			System.out.println("Not Valid Age ");
		  }
	    }
		else
		{
			if(age<=40)
			{
				System.out.println("U are YOUNG");
			}
			else if (age<=100)
			{
				System.out.println("U are OLD");
				
			}
			else
			{
				System.out.println("InValid Age Problem");
				
			}
		}
			
	}
}
