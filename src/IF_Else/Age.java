package IF_Else;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Ur AGE = ");
			int age=sc.nextInt();
			if (age>18)
			{
				System.out.println("U are a Young");
				
			}
			else
			{
				System.out.println("U are a Child");
			}
}
	}
