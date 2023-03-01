package prime;

import java.util.Scanner;

public class A34 {
	public static void main(String[] args) {
      Scanner  in = new Scanner(System.in);
      System.out.println("enter the number");
      int i = in.nextInt();
      int num1 = 0;
      int num2 = 1;
      int num3 = num1+ num2;
      System.out.println(num1);
      System.out.println(num2);
      while(num3 <= i)
      {
    	 //if(num3 >500)
    	 System.out.println(num3);
    	  num1 = num2;
    	  num2 = num3;
    	  num3 = num1 + num2;
      }
	}
}










/*		Scanner in = new Scanner(System.in);
//System.out.println("given first number");
//int i = in. nextInt();
  int d1 = 0;
  int d2 = 1;
  while(d2 < 100)
  { 
	   System.out.println(d1);
	  d2 = d1 +d2;
	  d1 = d2-d1;
	  //System.out.println(d1);
  }*/