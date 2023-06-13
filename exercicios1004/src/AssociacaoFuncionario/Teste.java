package AssociacaoFuncionario;

public class Teste {
	public static void main(String[] args) {

		Calculadora myCal = new Calculadora("azul");
		System.out.println(myCal.soma(2, 5));
		System.out.println(myCal.subtracao(2, 5));
		System.out.println(myCal.multiplica(2, 5));
		System.out.println(myCal.divide(2, 5));
		System.out.println(myCal.elevaAoQuadrado(2));
		System.out.println(myCal.elevaAoCubo(2));
		System.out.println(myCal.imprimeInfo());
	}
}
