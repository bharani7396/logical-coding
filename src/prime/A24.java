package prime;

import java.util.Scanner;

public class A24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		boolean isPrime;
		while(num1 <= num2)
		{
			isPrime = true;
			for(int i = 2;i<=(num1/2);i++)
			{
				if(num1%i ==0)
				{
					isPrime = false;
					break; 
				}

			}
			if(isPrime)
			{
				System.out.print(num1 + ",");

			}
			num1++;
		}
	}

}
/*

     public static void main(String[] args) {
    	  Scanner in = new Scanner(System.in);
  		System.out.println(" enter  first number ");
  		int  a = in.nextInt();
  		System.out.println(" enter second number");
  		int  b = in.nextInt();
    		int k = 0;


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
    				System.out.println(i);

    			}
    			k = 0;
    		}
	}
 */