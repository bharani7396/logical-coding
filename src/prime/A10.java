package prime;

import java.util.Scanner;

public class A10 {
     public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
		 System.out.println("given first number");
		 int i = in. nextInt();
		 System.out.println("given second number");
		 int j = in.nextInt();
		 int l = 0;
		 boolean odd = true;
		  while(i < j)
		  {
			  if(i % 2 == 0)
			  {
				  l += i;
				 System.out.println(i);
			  }
			  i++;
		  }
		  System.out.println(l);
	}
}
