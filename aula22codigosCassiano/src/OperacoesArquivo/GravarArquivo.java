package OperacoesArquivo;


import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class GravarArquivo {
        public static void main(String[] args) {
            try {
                File f = new File("filename.txt");
                f.setReadable(false);
                //f.setWritable(true);
                FileWriter myWriter = new FileWriter("filename.txt" , true);
                //myWriter.write("Gravando no arquivo!");
                //myWriter.write("\n");
                myWriter.append("NOVA GRAVAÇÂO" + "\n");
                myWriter.close();

                System.out.println("Arquivo gravado!");
            } catch (IOException e) {
                System.out.println("Erro ao tentar gravar.");
                e.printStackTrace();
            }
        }
    }


