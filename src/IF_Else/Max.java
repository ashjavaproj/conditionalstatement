package IF_Else;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
	
		int x,y;
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Any 2 Numbers");
    System.out.print("X = ");
     x=sc.nextInt();
     
     System.out.print("Y= ");
     y=sc.nextInt();
     
		if(x>y)
		{
			System.out.println("X is Maximum no");
		}
		else
		{
			System.out.println("Y is Maximum no");
		}

	}

}
