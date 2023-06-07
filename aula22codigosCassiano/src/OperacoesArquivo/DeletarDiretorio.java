package OperacoesArquivo;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
//https://www.techiedelight.com/pt/delete-directory-in-java/#:~:text=Podemos%20usar%20o%20deleteRecursively(Path,n%C3%A3o%20o%20destino%20do%20link.
public class DeletarDiretorio {

	public static void main(String[] args) {
		File file = new File("./PASTA1");
		 
        try {
            deleteDirectory(file.toPath());
            System.out.println("Directory deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	
	
	
	public static void deleteDirectory(Path directory) throws IOException
    {
        if (Files.exists(directory))
        {
            Files.walkFileTree(directory, new SimpleFileVisitor<Path>()
            {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attr)
                        throws IOException
                {
                    Files.delete(path);
                    return FileVisitResult.CONTINUE;
                }
 
                @Override
                public FileVisitResult postVisitDirectory(Path path, IOException ex)
                        throws IOException
                {
                    Files.delete(path);
                    return FileVisitResult.CONTINUE;
                }
            });
        }
    }

}
