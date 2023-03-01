package pack2;

public class A19 {
	public static void main(String[] args) {
		int i = 345678;
		System.out.println(i /100%100);
		int j = 0;
		int k = i;
		int m = 0;
		int n = 0;	
		while(j <= 1)
		{
			j++;
			k = k / 100;   
			m +=  k %10;
		    k = k*10;
		   // System.out.println(j);
		    }
		while(j <=3)
		{
			j++;
			n += m % 10;
			m  = m /10;
		}
		System.out.println(n);
	}
}