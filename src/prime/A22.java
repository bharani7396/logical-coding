package prime;


public class A22 {
	public static void main(String[] args) {
		int count =0;
		int num = 1;
		while(count <20)
		{
			boolean isPrime = true;
			for(int i = 2;i<=(num/2);i++)
			{
				if(num%i ==0)
				{
					isPrime = false;
					break; 
				}

			}
			if(isPrime)
			{
				System.out.print(num + ",");
				count ++;
			}
			num++;
		}
	}
}



















/*public static void main(String[] args) {
		int k = 0;
		int m = 1;

		for(int i = 2; m<= 20; i++)
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
				System.out.println(i);
				m++;
			}
			k = 0;
		}
	}  */

