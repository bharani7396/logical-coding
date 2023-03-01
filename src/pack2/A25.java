package pack2;

public class A25 {
	public static void main(String[] args) {
		int i = 345678;
		System.out.println(i/1000);
		int j = 0;
		int k = i;
		int m = 0;
		int n = 0;	
		while(j <= 3)
		{
			j++;
			k = k/1000;
			k = k % 1000;   
			m +=  k %10;
			k = k*100;
			System.out.println(m);
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
