package exercicios1906;

public class Ex10 {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 4, 2, 10, 3, 0, 11, 13 };

		float b[] = new float[10];

		for (int i = 0; i < 10; i++) {
			b[i] =(float) a[i] % 2;
			System.out.println(a[i] + " % " + 2 + " = " + b[i] );
		}

	}
}
