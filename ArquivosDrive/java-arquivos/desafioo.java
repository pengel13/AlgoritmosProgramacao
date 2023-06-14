
public class desafioo {
	
	public static boolean ehPrimo(int numero) {
		if(numero == 0 || numero == 1) {
			return false;
		}
		for(int j =2; j<numero; j++) {
			if(numero % j == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int lista[]= new int[20];
		for(int x=0; x <20; x++) {
			lista[x] = x+1;
		}
		for(int x=0; x<20; x++) {
			if (lista[x]%2 == 0) {
				System.out.println("Par: " + lista[x]);
			}
			if (ehPrimo(lista[x]) == true) {
				System.out.println("Primo " + lista[x]);
			}
		}
	}
}
