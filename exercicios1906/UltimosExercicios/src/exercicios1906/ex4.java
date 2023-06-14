package exercicicos1;

public class ex4 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		double[] B = new double[15];
		System.out.println(" A / B ");
		for (int c = 0; c < 15; c++) {
			
			B[c] =  Math.sqrt(A[c]);
			System.out.println(A[c] + " / " + B[c]);

		}
	}

}
