package pack1;

public class J {
    public static void main(String[] args) {
		int i = 456219887;
		int count = 0;
		 int j = i ;
		 while(j > 0)
		 {
			 count++;
			 j = j/10;
		 }
		  System.out.println("total number of digits in " + i + "is" + count);
	}
}
