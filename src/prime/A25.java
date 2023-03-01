package prime;

public class A25 {
	public static void main(String[] args) {
		int count =0;
		int num = 100;
		boolean isPrime;
		while(count <20)
		{
			isPrime = true;
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
				System.out.println(num + ",");
				count ++;
			}
			num++;
		}

	}
}
	 /* public static void main(String[] args) {
  		int k = 0;
  		int m = 1;

  		for(int i = 100; m<= 20; i++)
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
	}*/

