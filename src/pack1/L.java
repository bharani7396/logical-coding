package pack1;

import java.util.Scanner;

public class L {
       public static void main(String[] args) {
    	   Scanner in = new Scanner(System.in);
      		System.out.println(" enter a number ");
      		int  i = in.nextInt();
    	    boolean isPrime =  true;  
    	    for(int j = 2; j<= i/2; j++)
    	    {
    	    	if(i % j == 0)
    	    	{ 
    	    		 isPrime = false;
    	    		 break;
    	    	}
    	    }
            System.out.println(i + " is " + (isPrime ? "prime":" not a prime")); 		
	}
}
