package prime;

import java.util.Scanner;

public class A16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("pls supply the number ");
		int i = in.nextInt();
		int j = 0 ;
		int k = 0 ;

		while(i != 0)
		{
			j = i % 10 ;
			k = k * 10 + j ;
			i = i /10 ;
		}
		System.out.println("reverse the numberis:" + k);
	}
}