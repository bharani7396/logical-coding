package pack1;

import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" pls supply one int command line arg ");
		int i = in.nextInt();
		int j = 0;
		int k = 0;
		while (i != 0)
		{
			k = i % 10;
			j = j * 10 + k;
			i = i /10;
		}
		while(j != 0)
		{
			System.out.println(j % 10);
			j = j/10;
		}
	} 
}
