package TASKS_Assignments;

import java.util.Scanner;

public class TASK7_MAXNo_Nested_IF {

	public static void main(String[] args) {
		int x,y,z;
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Any 3 Numbers");
	    System.out.print("X = ");
	     x=sc.nextInt();
	     
	     System.out.print("Y= ");
	     y=sc.nextInt();

	     System.out.print("Z= ");
	     z=sc.nextInt();
	     
		if(x>y)
		 {
			 if(x>z)
			  {  
				System.out.println("X is Greater no");
			  }
			 else
			  {
				System.out.println("Z is Greater no");
			  }
         }
		else
		{
			if(y>z)
			{
				System.out.println("Y is Greater no");
			}
			else
			{
				System.out.println("Z is Greater no");
			}
			
		}
				
		}

}
