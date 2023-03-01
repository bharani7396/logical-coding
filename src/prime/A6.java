package prime;

import java.util.Scanner;

public class A6 {
     public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
   		System.out.println(" enter first  number ");
   		int  i = in.nextInt();
   		System.out.println("enter second number");
   		int  j = in.nextInt();
   		System.out.println("enter 3rd number");
   		int  k = in.nextInt();
   		
   		if(i * i + j *j == k)
   		{
   			System.out.println("true");
   		}
   		else
   		{
   			System.out.println("false");
   		}
   		
	}
}
