package pack2;

public class A28 {
	 public static void main(String[] args) {
		  int i = 2345678;
			System.out.println(i%10000000/100);
			int j = 0;
			int k = i;
			int m = 0;
			int n = 0;	
			while(j <= 4)
			{
				j++;
				k = k/100;
				k = k % 100000;   
				m +=  k %10;
				k = k*10;
				
				//System.out.println(m);
			}

			while(j <=6)
			{
				j++;
				n += m % 10;
				m  = m /10;
			}
			System.out.println(n);
	}
}
