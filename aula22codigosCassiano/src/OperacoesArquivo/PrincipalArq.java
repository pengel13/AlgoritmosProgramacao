package OperacoesArquivo;

import java.io.File;

public class PrincipalArq {

	public static void main(String[] args) {
		 File myObj = new File("C:\\Users\\cassianomoralles\\Downloads\\filename.txt");
		  
		 
		 if (myObj.exists()) {
             System.out.println("Exist the file: " + myObj.getName());
             System.out.println("Exist the file: " + myObj.getAbsolutePath());
             System.out.println("Exist the file: " + myObj.length());
         } else {
             System.out.println("Failed not exist the file.");
         }
		 
		 System.out.println("Consigo ler o arquivo?.\n");
		 if (myObj.canRead()) {
             System.out.println("Read the file: " + myObj.getName());
         } else {
             System.out.println("Failed to read the file.");
         }
		 
		 myObj.setReadOnly();
		 
		 System.out.println("\nConsigo escrever no arquivo?.\n");
		 if (myObj.canWrite()) {
             System.out.println("Write the file: " + myObj.getName());
         } else {
             System.out.println("Failed to write the file.");
         }

	}

}
