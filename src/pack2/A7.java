package pack2;

import java.util.Scanner;

public class A7 {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println(" pls supply one int command line arg ");
//		int i = in.nextInt();
		int i = 9;
		int j = i;
		while (j  <= 200)
		{ 
			 if(i % 9 == 0)
			 {
				 System.out.println(j);
			 }
			 else
			 {
				 System.out.println(i);
			 }
//			 System.out.println(j); 
//			 j = j + 9;
		}
	} 
}
 