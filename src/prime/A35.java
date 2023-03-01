package prime;

public class A35 {
	public static void main(String[] args) {
		int d1 = 0;
		int d2 = 1;
		int count =0;
		while(count <10)
		{
			d2 = d1+d2;
			d1 = d2-d1;
			System.out.println(d2);
			count++;
		}
//		while(d2 <=89)
//		{
//			System.out.println(d2);
//			d2 = d1+d2;
//			d1 = d2-d1;
//			//System.out.println(d1);
//		}
	}   
}
      