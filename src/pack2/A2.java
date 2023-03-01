package pack2;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg blow 10 ");
		int i = in.nextInt();
		if(i < 10)
		{
			System.out.println("given number is lessthan 10");

		}
		else if (i >= 10)
		{
			System.out.println("given number is greaterthan or equals 10 "); 
		}
	}
}
