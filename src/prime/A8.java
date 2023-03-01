package prime;

import java.util.Scanner;

public class A8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("pls supply the given number");
		int i = in.nextInt();
		int j = i;
		int k = 1;
		while(k <= 5)
		{
			if(j % i == 0)
			{
				k++;
				System.out.println(j);
				
			}
			j++;
		}
	}
}
