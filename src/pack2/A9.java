package pack2;

import java.util.Scanner;

public class A9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg ");
		int i = in.nextInt();
		if(i %5 == 0 && i % 3== 0) 
		{
			System.out.println("lara");

		}
		else if (i %5 == 0 )
		{
			System.out.println("java");
		}
		else if( i % 3== 0)
	    {
            System.out.println("j2ee");
		}
	}
}
