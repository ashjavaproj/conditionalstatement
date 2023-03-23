package Ladder_IF_Else;

import java.util.Scanner;

public class positive_Negative_Zero {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any  Number");
    System.out.print("X = ");
    int x=sc.nextInt();
     
		if(x>0)
		{
			System.out.println(" No is Positive");
		}
		else if(x<0)
		{
			System.out.println("No is Negative");
		}
		else 
		{
			System.out.println("No is Zero");
		}

}
}