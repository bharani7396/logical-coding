package prime;

import java.util.Scanner;

public class A27 {
     public static void main(String[] args) {
    	  Scanner in = new Scanner(System.in);
    		System.out.println(" enter  first number ");
    		int  a = in.nextInt();
    		System.out.println(" enter second number");
    		int  b = in.nextInt();
      		int k = 0;
      		int l = 0;

      		for(int i = a; i<=b ; i++)
      		{
      			for(int j = 1; j<= i/2; j++)
      			{
      				if (i % j == 0)
      				{
      					k++;
      				}
      			}
      			if(k == 1)
      			{
      				l += i;
      				System.out.println(i);
      	
      			}
      			k = 0;
      		}
      		System.out.println(l);
	}
}
