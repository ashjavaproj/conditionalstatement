package IF_Else;

import java.util.Scanner;

public class Odd_Or_Even {

	public static void main(String[] args) {

		int x;
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Any  Number");
	    System.out.print("X = ");
	     x=sc.nextInt();
	     
			if(x%2==0)
			{
				System.out.println(" No is Even");
			}
			else
			{
				System.out.println("No is Odd");
			}


	}

}
