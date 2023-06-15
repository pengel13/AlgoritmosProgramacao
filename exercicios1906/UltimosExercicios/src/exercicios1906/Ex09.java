package exercicios1906;

public class Ex09 {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 4, 2, 10, 3, 0, 11, 13 };
		int b[] = { 5, 6, 7, 4, 8, 9, 2, 15, 20, 10 };

		float c[] = new float[10];

		for (int i = 0; i < 10; i++) {
			c[i] = a[i] /(float) b[i];
			System.out.println(a[i] + " / " + b[i] + " = " + c[i]);
		}

	}
}
