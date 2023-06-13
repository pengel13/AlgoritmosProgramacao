package exercicios1906;

public class Ex37 {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0 };
		int[] B = new int[15];

		for (int a = 0; a < 15; a++) {
			int fatorial = 1;
			int b = 1;
			while (b != A[a]) {
				b++;
				fatorial = fatorial * b;
			}

			B[a] = fatorial;
		}

		for (int x = 0; x < 15; x++) {
			System.out.println(A[x] + "! = " + B[x]);

		}
	}

}
