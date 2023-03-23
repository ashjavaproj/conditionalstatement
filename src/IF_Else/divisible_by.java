package IF_Else;

import java.util.Scanner;

public class divisible_by {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any No ");
		x=sc.nextInt();
		System.out.print("Enter any  No for division ");
		y=sc.nextInt();
		
		if (x%y==0)
		{
			System.out.println(x+" is Divisible By "+y);
			
		}
		else
		{
			System.out.println(x+" is Not Divisible By "+y);
		}



	}

}
