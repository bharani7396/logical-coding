package prime;

import java.util.Scanner;

public class A7 {
       public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("given first number");
		int i = in.nextInt();
		
		
		if(i % 2 == 0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}
	}
}
