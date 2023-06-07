package Carro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Utils {

	
	public static void delelaArquivo(String nomeArquivo) {
		
		 File myObj = new File(nomeArquivo);
         if (myObj.delete()) {
             System.out.println("Deleted the file: " + myObj.getName());
         } else {
             System.out.println("Failed to delete the file.");
         }
		
	}
	
	public static void gravaArquivo(Carro car, String nomeArquivo) {
		
		try {
					 
			File f = new File(nomeArquivo);
			if(!f.exists()) {
				f.createNewFile();
			}
				f.setReadable(false);
				FileWriter myWriter = new FileWriter(nomeArquivo , true);
				myWriter.append(car.toString() + "\n");
				myWriter.close();
				System.out.println("Arquivo gravado!");
			
        } catch (IOException e) {
            System.out.println("Erro ao tentar gravar.");
            e.printStackTrace();
        }
		
	}
	
	public static void lerArquivo(String nomeArquivo) {
		 try {
             File myObj = new File(nomeArquivo);
             Scanner myReader = new Scanner(myObj);
             while (myReader.hasNextLine()) {
                 String data = myReader.nextLine();
                 System.out.println(data);
             }
             myReader.close();
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred.");
            // e.printStackTrace();
         }
		
		
		
	}
}
