package pack2;

public class A37 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0 ;
		int k = 0;
		while(j<=i)  // for (int j = 1; j<=i /2 ;j++)
		{
			j++;
			if(i % j == 0)
			{
				k = k+j;

				System.out.println(j);

			}
		}
		System.out.println(k);
	}
}
