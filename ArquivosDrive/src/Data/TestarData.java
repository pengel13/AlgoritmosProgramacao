package Data;

public class TestarData {
	public static void main(String[] args) {
		Data hoje = new Data(05, 04, 2023);
		Data amanha = new Data(06, 04, 2023);
		Data Natal = new Data(25, 12, 2023);
		hoje.escreverAData();
		amanha.escreverAData();
		hoje.escreverOMes();
		amanha.escreverOMes();
		Natal.escreverAData();
		Data errada = new Data(31, 02, 1990);
		errada.escreverAData();
		
		
	}
}
