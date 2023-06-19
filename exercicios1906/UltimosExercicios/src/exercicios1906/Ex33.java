package exercicios1906;

public class Ex11 {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 4, 2, 10, 3, 0, 11, 13 };
		int pares =0;
		for (int x : a) {
			if (x%2 ==0) {
				pares++;
			}
		}
		System.out.println("A quantidade de números pares no vetor A é " + pares);

	}
}
