package pack2;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
   		System.out.println(" pls supply one int command line arg ");
   		int i = in.nextInt();
   		System.out.println(i / 10 %10);
	}
}
