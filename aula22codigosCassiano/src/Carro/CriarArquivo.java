package Carro;

import java.io.File;
import java.io.IOException;

public class CriarArquivo {
	
	public static void CreateFile(String filename) {
	try {
        File myObj = new File(filename);//como colocar o full path??
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}

}
