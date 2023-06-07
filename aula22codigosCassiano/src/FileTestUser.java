import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileTestUser {
    public static void main(String[] args) {
        //criando um objeto User
        User user = new User();
        user.setId(1);
        user.setNome("Bart Simpson");
        user.setObservacao("Personagem de desenho animado.");

        //Chamando o m�todo escrever e passando user como par�metro
        escrever(user);

    }

    private static void escrever(User user) {
        File dir = new File("C:\\Users\\cassianomoralles\\Documents");
        File arq = new File(dir, "C:\\Users\\cassianomoralles\\Documents\\teste.txt");

        try {

            //neste ponto criamos o arquivo fisicamente
            arq.createNewFile();

            //Devemos passar no construtor do FileWriter qual arquivo
            // vamos manipular.
            // Esse construtor aceita dois tipos de par�metros,
            // File ou String.
            //O par�metro true indica que reescrevemos no arquivo
            // sem apagar o que j� existe.
            // O false apagaria o conte�do do arquivo e escreveria
            // o novo conte�do.
            // Se n�o usar o 2� par�metro, ele por padr�o ser� false.
            //O mais importante, essa linha abre o fluxo do arquivo 
            FileWriter fileWriter = new FileWriter(arq, false);

            //Agora vamos usar a classe PrintWriter para escrever
            //fisicamente no arquivo.
            //Precisamos passar o objeto FileReader em seu construtor
            PrintWriter printWriter = new PrintWriter(fileWriter);

            //Agora vamos escrever no arquivo com o m�todo  println(),
            // que nos permite escrever linha a linha no arquivo
            printWriter.println(user.getId());
            printWriter.println(user.getNome());
            printWriter.println(user.getObservacao());

            //o m�todo flush libera a escrita no arquivo
            printWriter.flush();

            //No final precisamos fechar o arquivo
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}