package prime;

import java.util.Scanner;

public class A3 {     
	    public static void main(String[] args) {
	    	  Scanner in = new Scanner(System.in);
	    		System.out.println(" enter  first number ");
	    		int  i = in.nextInt();
	    		System.out.println(" enter second number");
	    		int  j = in.nextInt();
	    		System.out.println(" enter 3 rd number ");
	    		int  k = in.nextInt();
	    		  
	    		 if(j < i && i < k || k < i && i < j)
	    		 {
	    			  System.out.println(i + "is the middle number");
	    		 }
	    		 
	    		 else if(i < j && j < k || k < j && j < i)
	    		 {
	    			 System.out.println(j + "is the middle number");
	    		 }
	    		 else
	    		 {
	    			 System.out.println(k + "is the middle number ");
	    		 }		 
		}
}
