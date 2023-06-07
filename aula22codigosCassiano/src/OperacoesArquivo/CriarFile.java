package OperacoesArquivo;


import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
//import java.io.*;


public class CriarFile {

        public static void main(String[] args) {
            try {
                File myObj = new File("filename.txt");//como colocar o full path??
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

