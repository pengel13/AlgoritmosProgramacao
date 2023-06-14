package exercicicos1;

public class ex1 {

	public static void main(String[] args) {
		int[] a = new int[5];
		int[] b = new int[5];
		
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		System.out.println(" A / B ");
		for (int c = 0; c<5; c++ ) {
			b[c] = a[c];
			System.out.println(a[c] + " / " +  b[c]);
			
		}

		
	}

}
