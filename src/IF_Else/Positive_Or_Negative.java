package IF_Else;

import java.util.Scanner;

public class Positive_Or_Negative {

	public static void main(String[] args) {

		int x;
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Any  Number");
	    System.out.print("X = ");
	    x=sc.nextInt();
	     
	     
			if(x>0)
			{
				System.out.println(" No is Positive");
			}
			else
			{
				System.out.println("No is Negative");
			}



	}

}
