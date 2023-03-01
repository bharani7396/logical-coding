package pack2;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg blow 10 ");
		int i = in.nextInt();
		if(i < 100)
		{
			System.out.println("given number is lessthan 100");

		}
		else if (i >= 1000)
		{
			System.out.println("given number is greaterthan or equals 1000 "); 
		}
		else
		{
			System.out.println("this number is beetween 100 and 1000");
		}
	}
}
