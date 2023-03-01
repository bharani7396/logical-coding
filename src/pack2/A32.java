package pack2;

import java.util.Scanner;

public class A32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg in beetween 4 to 9 numbers ");
		int i = in.nextInt();
		int j = 0;
		int k = i;
		int n = 1;
		while(k != 0)
		{
			j++;
			k = k/10;

		}
		
		for(int m = 1; m<= j-5; m++)
		{
			n = n*10;
			System.out.println(n);
		}
		
		int l = i /n;
		System.out.println(l);
		
		
		
		
		
		
		
		
		/*	int j = 0;
			int k = i;
			int m = 0;
			int n = 0;	
			while(j <= 4)
			{
				j++;
				k = k /100;
				k = k % 100000;   
				m +=  k %10;
				k = k*10;
				System.out.println(m);
			}

			while(j <=6)
			{
				j++;
				n += m % 10;
				m  = m /10;
			}
			System.out.println(n);  */
	}
}
