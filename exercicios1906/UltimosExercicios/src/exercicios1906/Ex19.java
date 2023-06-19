package exercicios1906;

public class Ex15 {
	public static void main(String[] args) {
		int a[] = { 1, 5, 3, 4, 2, 10, 3, 0, 11, 13 };
		int soma =0;
		int cont =0;
		for (int x : a) {
			if (x %2 == 1) {
				soma += x;
				cont += 1;
			}
		}
		System.out.println("A média dos números ímpares do vetor A é " + soma/cont);

	}
}
