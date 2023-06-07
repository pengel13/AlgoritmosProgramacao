package Objetos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class SalvarObjeto {
    public static void salvar(Object objeto, String caminho) {
           try {
             FileOutputStream saveFile = new FileOutputStream(caminho);
             ObjectOutputStream stream = new ObjectOutputStream(saveFile);
             // salva o objeto
             stream.writeObject(objeto);
             stream.close();
             System.out.println("Objeto Salvo!");
           } catch (Exception exc) {
             exc.printStackTrace();
           }
    }
   }