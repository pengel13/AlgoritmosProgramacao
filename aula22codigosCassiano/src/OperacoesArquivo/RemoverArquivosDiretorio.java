package OperacoesArquivo;

import java.io.File;

public class RemoverArquivosDiretorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void removerArquivos(File f) {
        // Se o arquivo passado for um diretório
        if (f.isDirectory()) {
                /* Lista todos os arquivos do diretório em um array 
                   de objetos File */
                File[] files = f.listFiles();
                // Identa a lista (foreach) e deleta um por um
                for (File file : files) {
                        file.delete();
                }
        }
}

}
