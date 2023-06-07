import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Classe utilizada para ler as informa��es de um arquivo e imprimir
 * no console.
 */
public class ExemploFileInputStream {
  public static void main(String[] args) {
    ExemploFileInputStream exemplo = new ExemploFileInputStream();
    exemplo.lerArquivo("C:\\Users\\cassianomoralles\\Documents\\teste.txt");
  }

  /**
   * M�todo utilizado para ler os dados de uma arquivo.
   *
   * @param caminho
   */
  public void lerArquivo(String caminho) {
    FileInputStream fis = null;

    try {
      /* Cria um objeto do tipo FileInputStream para ler o arquivo. */
      fis = new FileInputStream(caminho);
      /* Cria uma variavel interia para ler os caracteres do arquivo,
        lembrando que todo caractere no Java � representado por um
        numero inteiro. */
      int c;
      /* Le o caracter do arquivo e guarda na variavel inteira c, quando
        o caracter lido for igual a -1, significa que chegou ao final
        do arquivo. */
      while((c = fis.read()) != -1) {
        System.out.println((char) c);
      }
    } catch (FileNotFoundException ex) {
      System.out.println("Erro ao abrir o arquivo.");
    } catch (IOException ex) {
      System.out.println("Erro ao ler o arquivo.");
    } finally {
      try {
        if(fis != null) {
          /* Fecha o arquivo que est� sendo lido. */
          fis.close();
        }
      } catch (IOException ex) {
        System.out.println("Erro ao fechar o arquivo.");
      }
    }
  }
}