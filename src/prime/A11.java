package prime;

import java.util.Scanner;

public class A11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg ");
		int i = in.nextInt();
		if(i %4 == 0 && i % 5== 0) 
		{
			System.out.println("lara");
		}
		else if (i %4 == 0 )
		{
			System.out.println("java");
		}
		else if( i % 5== 0)
	    {
            System.out.println("j2ee");
		}
	}
}
