//Exemplo de um programa que a partir de um caminho, verifica se este caminho � referente a um diret�rio ou um arquivo.
import java.io.File;

/**
 * Classe utilizada para demonstrar o uso da classe File.
 */
public class ExemploFile {
  public static void main(String[] args) {
    ExemploFile ef = new ExemploFile();
    ef.verificarCaminho("C:\\Users\\cassianomoralles\\Documents");
    ef.verificarCaminho("C:\\Users\\cassianomoralles\\Documents\\teste.txt");
  }

  public void verificarCaminho(String caminho) {
    File f = new File(caminho);

    System.out.println(caminho);
    if(f.isFile()) {
      System.out.println("Este caminho eh de um arquivo.");
    } else if(f.isDirectory()) {
      System.out.println("Este caminho eh de um diretorio.");
    }
  }
}
