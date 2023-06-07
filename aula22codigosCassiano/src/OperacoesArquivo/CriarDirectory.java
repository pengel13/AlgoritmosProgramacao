package OperacoesArquivo;


import java.io.File;  // Import the File class


public class CriarDirectory {

        public static void main(String[] args) {
            File diretorio = new File("./PASTA1");
			
           
			
			if (diretorio.mkdirs()) {
			    System.out.println("Directory created: " + diretorio.getAbsolutePath());
			} else {
			    System.out.println("Directory already exists.");
			}
        }
    }

