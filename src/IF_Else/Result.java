package IF_Else;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {

    int eng,sci,math,tot,per;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 3 Subject Marks ");
    System.out.print(" English = ");
    eng=sc.nextInt();
    System.out.print(" Maths = ");
    math=sc.nextInt();
    System.out.print(" Science = ");
    sci=sc.nextInt();
    System.out.println(" *~*~*STUDENT REPORT*~*~*~ ");
    System.out.println("-----------------------------------");
    tot=eng+math+sci;
    System.out.println(" Total      = "+tot);
  
    per=tot/3;
    System.out.println(" Percentage = "+per+"%");
   
    if(per>40)
    {
    System.out.println(" Result     = Congratulations ");
    	  
    }
    else
    {
    	 System.out.println(" Result     = Try Again");
    	   
    }
	}

}
