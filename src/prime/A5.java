package prime;

import java.util.Scanner;

public class A5 {
     public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("given first number");
		int i = in.nextInt();
		System.out.println("given second number");
		int j = in.nextInt();
		System.out.println("given 3 rd number");
		int k = in.nextInt();
		
		if(i + j == k)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
