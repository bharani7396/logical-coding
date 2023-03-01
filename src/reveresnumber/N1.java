package reveresnumber;

import java.util.Scanner;

public class N1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one number");
		int num = sc.nextInt();  // 1234

		int i = num;   // 1234 
		int revNum = 0;
		int lastDigit;
		while(i !=0)
		{
			lastDigit = i % 10;  //4 
			revNum = revNum *10 + lastDigit;  // 0* 10 +4 = 4 
			i = i /10;       // 123/10
		}

		System.out.println("given number:" + num);
		System.out.println("reveresed number:" + revNum);		
	}
}
