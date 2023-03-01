package pack2;

import java.util.Scanner;

public class A38 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg ");
		int i = in.nextInt();
		int j = 0;
		while (i >0)
		{
			j += i % 10;
			i = i/10;
		}
		System.out.println(j);
	}
}
