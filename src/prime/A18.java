package prime;

import java.util.Scanner;

public class A18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("pls supply the number ");
		int i = in.nextInt();
		int j = 0;
		int k= i;
		int l =0;
		int half;
		int n =1;
		while( k!=0)
		{
			k = k/10;
			j++;

			if(j%2==0)
			{
				n = n*10;
			}
		} 
		int rev = 0;
		if( j % 2==0)
		{
			half = i/n;
			System.out.println(half);
			while(half != 0)
			{
				l=half%10;
				rev = rev*10+l;
				half= half/10;
			}
		}
		System.out.println(rev);
	}
}
