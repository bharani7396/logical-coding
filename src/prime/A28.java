package prime;

public class A28 {
       public static void main(String[] args) {
    		int k = 0;
    		for(int i = 70; i>= 20; i--)
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
	}
}
