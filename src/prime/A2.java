package prime;

import java.util.Scanner;

public class A2 {
      public static void main(String[] args) {
    	  Scanner in = new Scanner(System.in);
  		System.out.println(" enter  first number ");
  		int  i = in.nextInt();
  		System.out.println(" enter second number");
  		int  j = in.nextInt();
  		System.out.println(" enter 3 rd number ");
  		int  k = in.nextInt();
  		     
  		 if(i< j && i < k)
  		 {
  			 System.out.println( i + "is the small number");
  		 }
  		 else if(j < i && j < k)
  		 {
  			 System.out.println(j + "is the small number");
  		 }
  		 else
  		 {
  			 System.out.println(k + "is the small number");
  		 }
	}
}
