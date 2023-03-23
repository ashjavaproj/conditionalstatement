package TASKS_Assignments;

import java.util.Scanner;

public class TASK3_Weekday {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("*~*~*WEEKDAY MASSAGE*~*~*");
		 System.out.println("------------------------------ ");
	    System.out.println("1 = MONDAY ");
	    System.out.println("2 = TUESDAY ");
	    System.out.println("3 = WEDNESDAY ");
	    System.out.println("4 = THURSDAY ");
	    System.out.println("5 = FRIDAY ");
	    System.out.println("6 = SATURDAY ");
	    System.out.println("7 = SUNDAY ");
	   
	    
	    System.out.println("Enter UR Choice");
	    System.out.print("X = ");
	    int x=sc.nextInt();
			if(x==1)
			{
				System.out.println(" MONDAY ");
			}
			else if(x==2)
			{
				System.out.println(" TUESDAY ");
			}
			else if(x==3)
			{
				System.out.println(" WEDNESDAY");
			}
			else if(x==4)
			{
				System.out.println(" THURSDAY");
			}
			else if(x==5)
			{
				System.out.println("FRIDAY ");
			}
			else if(x==6)
			{
				System.out.println("SATURDAY ");
			}
			else if(x==7)
			{
				System.out.println(" SUNDAY IS HOLIDAY");
			}
			else
			{
				System.out.println(" INVALID NUMBER ");
			}

	}

}
