package prime;

public class A31
{
	public static void main(String[] args) {
		int num = 11,count = 0;
		while(count < 30)
		{
			boolean isPrime = true;
			for(int i = 2;i<=num/2;i++)
			{
				if(num % i ==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime && raisingOrder(num))
			{
				System.out.println(num + ",");
				count ++ ;
			}
			num ++;
		}
	}	
	static boolean raisingOrder(int num)
	{
		boolean  isRaising = true;
		int d1 = num % 10, d2;
		num = num/10;
		while(num != 0)
		{
			d2 = num %10;
			if(d2>d1)
			{
				isRaising = false;
				break;

			}
			d1= d2;
			num = num/10;
		}
		return isRaising;
	}
}


/*public class A31 {
    public static void main(String[] args) {
    	int k = 0;
    	int m = 0;
		for(int i = 10; m<= 40; i++)
		{
			for(int j = 1; j<= i/2; j++)
			{
				if (i % j == 0)
				{
					k++;
				}
			}
			if(k == 1)
			{
			   if(i % 10 !=1)
				System.out.println(i);
			   m++;

			}
			k = 0;
		}	
	}
}
 */
