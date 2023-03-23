package TASKS_Assignments;

import java.util.Scanner;

public class TASK4_Result {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter ur Percentage ");
	    System.out.print(" Percentage = ");
	    int per=sc.nextInt();
		
		
		if(per<33)
	    {
	    System.out.println(" Result  = Fail");
	    	  
	    }
	    else if(per>33&&per<=60)
	    {
	    	 System.out.println(" Result  = Pass");
	    	   
	    }
	    else if(per>60&&per<=74)
	    {
	    	 System.out.println(" Resul = Top");
	    	   
	    }
	    else
	    { 
	    	System.out.println(" Result  = Distinction");
	    	   
	    }
		}


	}


