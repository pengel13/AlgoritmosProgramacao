import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
	
			File dir = new File(".");
		    File arq = new File(dir, "filename.txt");

		    try {
		        //Indicamos o arquivo que ser� lido
		        FileReader fileReader = new FileReader(arq);

		        //Criamos o objeto bufferReader que nos
		        // oferece o m�todo de leitura readLine()
		        BufferedReader bufferedReader = new BufferedReader(fileReader);

		        //String que ir� receber cada linha do arquivo
		        String linha = "";

		        //Fazemos um loop linha a linha no arquivo,
		        // enquanto ele seja diferente de null.
		        //O m�todo readLine() devolve a linha na
		        // posicao do loop para a variavel linha.
		        while ( ( linha = bufferedReader.readLine() ) != null) {
		        //Aqui imprimimos a linha
		        System.out.println(linha);
		    }
				//liberamos o fluxo dos objetos ou fechamos o arquivo
		        fileReader.close();
		        bufferedReader.close();
			} catch (IOException e) {
		    	e.printStackTrace();
		    }
		}

	}


