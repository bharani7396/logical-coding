package prime;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter  first number ");
		int  a = in.nextInt();
		System.out.println(" enter second number");
		int  b = in.nextInt();
		System.out.println(" enter third number");
		int  c = in.nextInt();
		 
		 int  min = a< b ?(a < c ? a:c):(b<c?b:c);
		 int  max = a> b ?(a > c ? a:c):(b>c?b:c);
		 int  mid = a + b + c - max -min;
		 System.out.println(min+ " " + mid + " " + max);
	}
}
