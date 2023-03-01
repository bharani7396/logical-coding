package prime;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter  first number ");
		int  i = in.nextInt();
		System.out.println(" enter second number");
		int  j = in.nextInt();


		if(i > j  )	
		{
			System.out.println(i + " is a big number");
		}
		else
		{
			System.out.println(j + " is a big number");
		}
	}
}
