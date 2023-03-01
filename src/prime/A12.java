package prime;

import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("given a number");
       int num = in.nextInt();
			boolean  isRaising = true;
			int d1 = num % 10, d2;
			num = num/10;
			while(num != 0)
			{
				d2 = num %10;
				if(d2>d1)
				{
					isRaising = false;
					break;

				}
				d1= d2;
				num = num/10;
			}
			System.out.println(isRaising);
	}
}
