package pack1;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {	
		//		if(args.length == 0) {
		//			System.out.println("  pls supply one int command line arg");
		//			return;
		//		}
		//		int i = Integer.parseInt(args[0]);
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg ");
		int i = in.nextInt();
		int j = i;
		while (j !=0)
		{
			System.out.println(j % 10);
			j = j /10;
		}
	}
} 