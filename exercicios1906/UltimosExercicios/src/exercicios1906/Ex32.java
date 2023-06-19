package exercicios1906;

public class Ex12 {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 4, 2, 10, 3, 0, 11, 13 };
		int soma =0;
		for (int x : a) {
			soma += x;
		}
		System.out.println("A soma do vetor A é " + soma);

	}
}
