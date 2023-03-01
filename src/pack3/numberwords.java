package pack3;

import java.util.Scanner;

public class numberwords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter three digits number");
		int n = in.nextInt();

		if( n< 0 || n > 999)
		{
			System.out.println("it is a wrong number");
		}
		else
		{
			int u = n % 10;  // last digit
			int tt = n / 10;
			int t = tt % 10; // second int
			int h = n/100;    // first digit
			String uw[] = { " " , "one","two" ,"three","four","five" ,"six", "seven","eight","nine","ten","eleven","twelve",
					                      "thirteen", "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			String tw[] = { " ", "ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
			String hw = "Hundred";
			if(n <20)
			{
				System.out.println(uw[n]);
			}
			else if(n <100)
			{
				System.out.println(tw[t] + uw[u]);
			}
			else
			{
				System.out.println(uw[h]+hw+tw[t]+uw[u]);
			}
		}
	}
}

