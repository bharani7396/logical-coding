package prime;

import java.util.Scanner;

public class A37 {
	public static void main(String[] args)
	{
//		for(int n = 5000; n>=500; n--)
//		{
		 Scanner in = new Scanner(System.in);
		 System.out.println("given the number");
		 int n = in.nextInt();
			int fib[] = new int[n];
			if(n>=0)
				fib[0] = 0;
			if(n>=1)
				fib[1] = 1;
			for(int i=2;i<n;i++)
				fib[i] = fib[i-1] + fib[i-2];
			for(int i=n-1;i>=0;i--)
				if(fib[i]<10)
				System.out.println(fib[i]+" ");
//		}

	}
}
