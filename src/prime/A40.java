package prime;

import java.util.Scanner;

public class A40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amstrong number");
		int num = sc.nextInt();
		int temp, Amstrong =0;
		int digit = num;
		int count = 0;
		while(num > 0)
		{
			count = num %10;

			while(num > 0)
			{
				temp = num % 10;
				temp = (int) Math.pow(temp, count);
				Amstrong = (Amstrong + temp);
				num = num /10;
			}
		}
		if(Amstrong == digit)
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("not Amstrong");
		}
		/*Scanner in = new Scanner(System.in);
		System.out.println("given the number");
		int i = in.nextInt();
		int j = 0;
		int k = i;
		int am = i;
		int b = i;
		while(k!=0)
		{
			j++;
			k = k/10;
		}
		int n = 0;
		int m = 1;
		int sum = 0;
		while(b != 0)
		{
			n = b % 10;
			for(int a=1;a<=j; a++)
			{
				m = m*n;
			}
			sum += m;
			m = 1;
			b = b/10;
		}
		if(sum == am)
		{
			System.out.println(am + " is amstrong number ");
		}
		else
		{
			System.out.println(am + " is not amstrong number ");
		}*/
	}
}
