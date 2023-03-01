package pack1;

public class K {
      public static void main(String[] args) {
		int i = 12398756;
		int j = 0;
		int k = 0;
		int m = i;
		int count = 0;
		while(m >0)
		{
			count++;  // 8
			m = m/10;
		}
	  int factor = 1;
	  for (int n = 1; n<= count /2;n++) 
	  {
		  factor = factor *10;
	  }
	  j = i/factor;
	  k = i%factor;
	  System.out.println(j);
	  System.out.println(k);
	}
}
