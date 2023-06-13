package heranca3;

public class TesteAnimais {

	public static void main(String[] args) {
		Mamifero camelo = new Mamifero("Camelo", "Amarelo", "", 150, 2, 4);
		Peixe tubarao = new Peixe("Tubarão", 300, 1.5f, "Barbatanas e Cauda" );
		Mamifero urso = new Mamifero("Urso-do-Canadá", "Vermelho", "Mel", 180, 0.5f, 4);
		camelo.dados();
		tubarao.dados();
		urso.dados();
	}

}
