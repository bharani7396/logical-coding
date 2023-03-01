package prime;

import java.util.Scanner;

public class A17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("pls supply the number ");
		int i = in.nextInt();
		int j = 0 ;
		int k = 0 ;
		int n = i;

		while(i != 0)
		{
			j = i % 10 ;
			k = k * 10 + j ;
			i = i / 10;
		}
		if(k == n)
		{
			System.out.println(k + " is a palindrome ");
		}
		else
		{
			System.out.println(n +"is not a palindrome");
		}
		
	}
}
