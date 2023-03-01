package pack2;

public class A26 {
	  public static void main(String[] args) {
		  int i = 2345678;
			System.out.println(i/10000);
			int j = 0;
			int k = i;
			int m = 0;
			int n = 0;	
			while(j <= 3)
			{
				j++;
				k = k/10000;
				k = k % 1000;   
				m +=  k %10;
				k = k*1000;
				//System.out.println(m);
			}

			while(j <=5)
			{
				j++;
				n += m % 10;
				m  = m /10;
			}
			System.out.println(n);
	}
}
