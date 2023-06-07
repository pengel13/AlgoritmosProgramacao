package atividade1705;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class GravaPessoa {
	public static void main(String[] args) {
		String filename = "C:\\Users\\User\\eclipse-workspace\\java05\\src\\atividade1705\\pessoas.txt";
		ArrayList<String> lista = new ArrayList<>();
		
		Pessoa p1 = new Pessoa("Pedro Engel", 18, "054.263.660-39");
		Pessoa p2 = new Pessoa("Arthur Kellerman", 18, "026.654.785-99");
		
		lista.add(p1.toString());
		lista.add(p2.toString());
			
        try {
            File pessoas = new File(filename);
            if (pessoas.createNewFile()) {
                System.out.println("Arquivo criado: " + pessoas.getName());
            } else {
                System.out.println("Arquivo não precisou ser criado, pois já existe.");
            }
            pessoas.setReadable(false);
            FileWriter myWriter = new FileWriter(filename, true);
            for (String pessoa: lista) {
            	myWriter.append(pessoa + "\n");  
            }
            System.out.println("Pessoas adicionadas nos arquivos");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro:");
            e.printStackTrace();
        }
		
		
	}
}
