package IF_Else;

import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {

		int saleprice,purprice;
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Sale Price & Purches Price ");
	         
	     System.out.print("Purches Price = ");
	     purprice=sc.nextInt();
	     
	     System.out.print("Sale Price = ");
	     saleprice=sc.nextInt();
	
			if(saleprice<purprice)
			{
				System.out.println("U have LOSS");
			}
			else
			{
				System.out.println("U Got PROFIT");
			}


      

	}

}
