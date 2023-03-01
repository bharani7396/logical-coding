package prime;

import java.util.Scanner;

public class A9 {
      public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
		 System.out.println("given first number");
		 int i = in. nextInt();
		 System.out.println("given second number");
		 int j = in.nextInt();
		  while(i < j)
		  {
			  if(i % 2 == 1)
			  {
				 System.out.println(i);
				  
			  }
			  i++;
		  }
		  
	}
}
