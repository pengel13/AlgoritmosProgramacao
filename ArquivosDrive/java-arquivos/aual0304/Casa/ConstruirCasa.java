package Casa;

public class ConstruirCasa {

	public static void main(String[] args) {
		
		Janela window = new Janela("Madeira", 2.5, 0.80, 0.10, "Branca", "Sem vidro", false);
		Janela window2 = new Janela("PVC", 1.3, 1.0, 2.10, "Verde", "Sem vidro", false);
		Casa nome = new Casa(window, window2);
		System.out.println(nome.j1);
		
		
	}

}
