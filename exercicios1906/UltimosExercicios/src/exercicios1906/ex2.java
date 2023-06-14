package exercicicos1;

public class ex2 {
	public static void main(String[] args) {
		int[] A = { 5, 8, 10, 13, 15, 21, 30, 45 };
		int[] B = new int[8];
		System.out.println(" A / B ");
		for (int c = 0; c < 8; c++) {
			B[c] = 2 * A[c];
			System.out.println(A[c] + " / " + B[c]);

		}
	}

}
