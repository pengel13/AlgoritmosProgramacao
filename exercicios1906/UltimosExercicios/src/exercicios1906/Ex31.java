package exercicios1906;

public class Ex13 {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 4, 2, 10, 3, 0, 11, 13 };
		int soma =0;
		for (int x : a) {
			if (x %5 == 0) {
				soma += x;
			}
		}
		System.out.println("A soma dos números múltiplos de 5 do vetor A é " + soma);

	}
}
