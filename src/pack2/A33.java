package pack2;

import java.util.Scanner;

public class A33 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg ");
		int i = in.nextInt();
		int j = 0 ;
		while(j<=i)
		{
			j++;
			if(i % j == 0)
			{
				System.out.println(j);
			}
		}	
	}
}
