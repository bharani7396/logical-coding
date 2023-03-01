package pack3;

import java.util.Scanner;

// krishna murthy number or strong number
public class krishnamurthy {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int n1 = num ,rem, sum =0;
		while(num != 0)
		{
			rem = num %10;
			sum += fact(rem);
			num /= 10;
		}
		
		if(sum == n1)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");
	}   
    static int fact(int n)
    {
    	int sum1 = 1;
    	for(int i = n; i > 0; i--)
    	{
    		sum1 *= i;
    	}
    	return sum1;
    }
}
