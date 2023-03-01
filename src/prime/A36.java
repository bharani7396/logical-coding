package prime;

public class A36 {
	public static void main(String[] args) {
		int d1 = 100;
		int d2 = 101;
		while(d1 < 10000)  // 100 < 10000
		{
			System.out.println(d1);
			d2 = d1 + d2;    
			d1 = d2 - d1;     
			
		}

	}
}  





