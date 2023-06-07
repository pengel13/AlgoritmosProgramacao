package Objetos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RestaturarObjetos {
	
	
	public ArrayList<Object> recuperarObjetos(String caminho) throws IOException{
	    ArrayList<Object> Objetos = new ArrayList<>();
	    Object obj = new Object();

	    ObjectInputStream leitorObj = null;
	    FileInputStream leitorArquivo = null;
	    try {
	        leitorArquivo = new FileInputStream(caminho);
	        leitorObj = new ObjectInputStream(leitorArquivo);
	        
	        while(true){
	        	   try{
	        	     obj = (Object) leitorObj.readObject();
	        	     Objetos.add(obj);
	        	   }catch(Exception e){
	        	     break;
	        	   }
	        	}
	        
	        	
	        
	        
	        
	    
	    try {
	        leitorArquivo.close();
	    } 
	     catch (Exception ex) {
	        System.out.println(ex.getMessage());
	    } finally {
	        try {
	            if (leitorArquivo != null) leitorArquivo.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        
	    }

	   
	}finally {
	}
	    return Objetos;
	}

}

