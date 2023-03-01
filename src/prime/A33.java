package prime;

public class A33 {
	public static void main(String[] args) {
         int i = 10, j = 100;
         int count = 0;
         boolean isPrime;
         while(i < j)
         {
        	 isPrime = true;
        	 for(int k = 2;k<= i/2;k++)
        	 {
        		 if(i % k == 0)
        		 {
        			 isPrime = false;
        			 break;
        		 }
        	 }
        	 if(!isPrime)
        	 {
        		 count++;
        	 }
        	 else
        	 {
        		 count = 0;
        	 }
        	 if(count == 3)
        	 {
        		 System.out.println((i + 1 ) );
        		 count =0;
        	 }
        	 i++;
         }
	}
}
