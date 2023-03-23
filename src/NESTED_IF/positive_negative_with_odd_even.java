package NESTED_IF;

import java.util.Scanner;

public class positive_negative_with_odd_even {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Any  Number");
	    System.out.print("X = ");
	    int x=sc.nextInt();
	     if(x>0)
	     {
			if(x%2==0)
			{
				System.out.println(" No is Even +ve");
			}
			else
			{
				System.out.println("No is Odd +ve ");
			}
	     }
	     else if(x<0)
	     {
	    	 System.out.println("No is -ve");
	     }
	     else
	     {
	    	 System.out.println("No is  ZERO ");
	    	 
	     }

	}

}
