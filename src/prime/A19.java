package prime;

import java.util.Scanner;

public class A19 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		System.out.println("given the 3 digits number ");
		int i = in.nextInt();
		int j = i;
		int m =0;
		int n = 0;
		 i= i/10;
		 while(i != 0)
		 {
			 m = i%10;
			 n = n +m;
			 i = i/10;
		 }
		 m = j%10;
		 if(n==m)
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("false");
		 }
		 
	}
}
