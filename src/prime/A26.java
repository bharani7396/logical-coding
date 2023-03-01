package prime;

public class A26 {
	  public static void main(String[] args) {
		int i = 1, count = 0,sum = 0;
		boolean isPrime = true;
		while(count < 30)
		{
			isPrime = true;
			for(int j = 2; j<=(i/2);j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				sum += i;
				count ++;
			}
			i++;
		}
		System.out.println(sum);
	}  
}






















/*public static void main(String[] args) {
		int k = 0;
		int m = 1;
		int l = 0 ;

		for(int i = 2; m<= 30; i++)
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
				 l += i;
		      //    System.out.println(l);
				m++;	 
			}
			k = 0;
		}
		System.out.println(l);
	}  
 */

