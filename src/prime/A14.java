package prime;

import java.util.Scanner;

public class A14 {
      public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("given a number");
		int i = in.nextInt();
		int j = i;
		int k = 0;
		while(j != 0)
		{
			k++;
			j = j/10;
		}
		System.out.println("total of number is :" + k);
		
	}
}
