package prime;

public class A23 {
	public static void main(String[] args) {
		int count =0;
		int num = 50;
		boolean isPrime;
		while(num <100)
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
				System.out.print(num + ",");
				
			}
			num++;
		}
	}
}	
	
	
	
	
	













	
	/*public static void main(String[] args) {

		int k = 0;
		for(int i = 50; i<= 100; i++)
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
				
			}
			k = 0;
		}
	
	}*/

