package heranca4;

public class testeIngresso {
	public static void main(String[] args) {
		IngressoVIP ing = new IngressoVIP(100, 25);
		System.out.println(ing.toString());
		
		Ingresso ing2 = new Ingresso(200);
		System.out.println(ing2.toString());
		
	}
}
