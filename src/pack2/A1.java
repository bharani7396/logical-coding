package pack2;

import java.util.Scanner;

public class A1 {
      public static void main(String[] args) {
    	  Scanner in = new Scanner(System.in);
  		System.out.println(" pls supply one int command line arg ");
  		int i = in.nextInt();
  		  if(i %2 == 0)
  		  {
  			  System.out.println("given number is even");
  		  }
  		  else if (i %2 == 1)
  		  {
  			  System.out.println("given number is odd ");
  		  }
	}
}
