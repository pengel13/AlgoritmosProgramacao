package exercicios1906;

public class Ex05 {
	public static void main(String[] args) {
		int[] A = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int[] B = new int[10];

		for (int i = 0; i < 10; i++) {
			B[i] = A[i] * i;
			System.out.println(A[i] + " * " + i + " = " + B[i]);
		}

	}

}