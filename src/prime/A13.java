package prime;

import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  System.out.println("given a first number");
		  int i = in.nextInt();
		  System.out.println("give a second number");
		  int j = in.nextInt();
		   
		  j = i+j;
		  i = j-i;
		  j = j-i;
		  System.out.println(i + "is swaped");
		  System.out.println(j + "is swaped");
	}
}
