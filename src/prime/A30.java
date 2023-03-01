package prime;

public class A30 {
    public static void main(String[] args) {
    	
		for(int i = 9; i<= 200; i++)
		{
			boolean isPrime = true;
			for(int j = 2; j<= i/2; j++)
			{
				if (i % j == 0)
				{
				    isPrime = false;
				    break;
				}
			}
			if(isPrime)
			{
			   if( i % 10 == 9)
				System.out.println(i);
			}
			i++;
		}
	}
}
