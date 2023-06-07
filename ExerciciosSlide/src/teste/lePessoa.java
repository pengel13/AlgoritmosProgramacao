package teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lePessoa {

	public static void main(String[] args) {
		String filename = "C:\\Users\\User\\eclipse-workspace\\java05\\src\\atividade1705\\pessoas.txt";

		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ocorreu um erro:");
			e.printStackTrace();
		}

	}

}
