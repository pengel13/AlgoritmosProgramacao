


import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Integer.*;

import java.io.IOException;


public class Principal {

    //DECLARACAO DE CONSTANTES;
    public static final int TAXA = 20;  // constantes
    public static final float TAM_MIN = 20.50f;

    public static final String SENHASECRETA = "123456";
   public static void values(){
        // 1 byte - 8 bits 00000000 binária
        byte b = (byte) 255;
        Byte bbb = 100;
        // 2 bytes 16 bits
        short s = 512;
        Short ss = 512;
        // 4 bytes 32 bits
        int i = 4444444;
        // 8 bytes 64 bits
        long l = 999999999;

      //Ponto flutuante
        //8 bytes
        double d = 556.00;
        //4 bytes
       float f = 34.99f;
       boolean bo = true;
       System.out.println(b);
       System.out.println(bbb.byteValue());
       System.out.println(s);
       System.out.println(Short.toString(ss));
       System.out.println(i);
       System.out.println(l);
       System.out.println(d);
       System.out.println(f);
       System.out.println(bo);

       System.out.println("VALORES");
       char value = 65;                    // Compila!
       System.out.println(value);

       value = (char) (value + 1);         // Compila!
       System.out.println(value);

       String palavra = " tecnologia";
       System.out.println(palavra);

       palavra = palavra + 2020;
       System.out.println(palavra);

        //inferência de tipos
        var a = 4.5;
       System.out.println(a);


       var bb = "Texto";
       System.out.println(bb);
       bb = "OUTRO TEXTO";
       System.out.println(bb);
       //não funciona se trocar para outro tipo, pq java é fortemente TIPADA

       Boolean boo = Boolean.parseBoolean("true");
       System.out.println(boo);
       System.out.println(boo.toString().toUpperCase());
    }
    public static void operadoresAaritmeticos(){
        int area = 2 * 2;
        System.out.println(area);
        area *= 2; //area *= 2;
        System.out.println(area);
        area = 4 -2;
        System.out.println(area);
        area = 4/2;
        System.out.println(area);
        double area1 = (double)4/3;
        System.out.println(area1);

        // A diferença é que se você usar ** a resposta é um valor real e se você usar ^ o resultado é um inteiro.

        System.out.println("Operadores Aritmeticos");
        System.out.println(Math.pow(3,8));

        System.out.println(12 / 3); // Outputs 4
        System.out.println(12 % 5); // Outputs 0
   }
    public static void ordemAtribuicao(){
        System.out.println("ATRIBUICAO");
        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;
        primeiro = 10;

        primeiro = (10 + 2)-20;

// quanto vale o segundo?

        System.out.println(segundo);

        System.out.println(primeiro);
    }
    public static void concatenacaoString(){
        System.out.println("CONCATENACAO");
        String saudacao = "Olá, meu nome é ";
        String nome = "Rômulo ";
        String continuacao = "e minha idade é ";
        int idade = 100;
        System.out.println(saudacao+nome+continuacao+idade);
    }
    public static void soma(){
        System.out.println("SOMA");
        /*     Perceba que podemos usar operadores aritméticos:
        + para Soma
        - para Subtração
        * para Multiplicação
        / para Divisão
        % resto da divisão
 */

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
        System.out.println(valor1 * valor2);
    }
    public static void castVariaveis() {
        System.out.println("CAST - Casting ou conversão de tipos é uma operação feita com o objetivo de alterar o tipo de um determinado valor.");
        double salario;
        salario = 1250.70;
        System.out.println("meu salário é " + salario);
        int valor = (int) salario;
        System.out.println(valor);
    }
    public static void lerDadosTeclado() throws IOException  {
        System.out.println("Ler Dados do Teclado");

        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Informe um número para a tabuada: ");
        n = ler.nextInt();
        System.out.println("O número para a tabuada é: " + n);

        float preco;

        System.out.println("Informe o preço da mercadoria = R$ ");
        preco = ler.nextFloat();
        System.out.println("O preço da mercadoria = R$ " + preco);

        double salario;

        System.out.printf("Informe o salário do Funcionário = R$ ");
        salario = ler.nextDouble();
        System.out.printf("O salário do Funcionário = R$ " + salario);

        //Lendo uma String, usado na leitura de palavras simples que não usam o caractere de espaço (ou barra de espaço):
        String s;

        System.out.printf("Informe uma palavra simples:\n");
        s = ler.next();
        System.out.printf("Informe uma palavra simples:\n" + s);

        //Lendo uma String, usado na leitura de palavras compostas, por exemplo, Pato Branco:
        String s2;

        System.out.printf("Informe uma cadeia de caracteres:\n");
        s2 = ler.nextLine();
        System.out.printf("A cadeia de caracteres:\n" + s2);

        // leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do teclado antes da leitura do valor String, por exemplo:
        int n1;
        String s3;

        System.out.printf("Informe um Número Inteiro: ");
        n1 = ler.nextInt();

        ler.nextLine(); // esvazia o buffer do teclado

        System.out.printf("Informe uma cadeia de caracteres:\n");
        s3 = ler.nextLine();

        char c;

        System.out.printf("Informe um Caractere: ");
        c = (char)System.in.read();

    }
    public static void manipulacaoStrings(){
        int number = 30;
        StringBuilder sb = new StringBuilder();
        sb.append("Frente");
        sb.append(number);
        System.out.println(sb.toString());

        sb.delete(6,8);

        sb.insert(6, " ");
        sb.append(number);
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        String text = "texto";
        System.out.println(text.toString().toUpperCase());
    }
    public static void parserConversao(){

        int inte = 34;
        System.out.println(inte);
        double o = (double) inte;
        System.out.println(o);
        System.out.println("Conversão de inteiro para String: " + parseInt("1234") );
    }
    public static void conversaoParaString(){

        System.out.println("Saída convertida em string: " + Integer.toString(TAXA));
    }
    public static void numeroRandomico() {
        int randomico = (int) Math.round(Math.random() * 10);
        System.out.println("Numero randomico: " + randomico);

        /*Entendendo a atribuição:
Math.random() retorna um número aleatório, do tipo double, no intervalo de 0.0 até 1.0;
Math.random() * 10 tem como resultado um número no intervalo de 0.0 até 10.0;
Math.round(Math.random() * 10) retorna um número do tipo long mais próximo (ou arredondado)
 do resultado;
(int) faz a conversão (ou coerção, em inglês "cast") do tipo long para o tipo int.
    */
    }
    public static void enumeracao(){
        enum Level {
            LOW,
            MEDIUM,
            HIGH,
            HYPER_HIGH
        }
        Level myVar = Level.MEDIUM;

        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

    }
    public static void constantes(){
        //The eight primitives defined in Java are int, byte, short, long, float, double, boolean, and char
        System.out.println("ola novo teste");

        double idade = 37;
        System.out.println(idade);
        System.out.println(TAXA);
        System.out.println(TAM_MIN);
        System.out.println("a idade é "+ idade + ", parabéns!");


    }
    public static void operadoresLogicos(){

       boolean t = true;
       boolean tt = 3 > 7;

        System.out.println(t);
        System.out.println(tt);
        System.out.println(t && tt);
        System.out.println(t || tt);
        System.out.println(t ^ tt);
        System.out.println(!t);
        System.out.println(!tt);

    }
    public static void operadoresRelacionais (){

       int a = 97;
       int b = 'a';
        System.out.println(a == b);
        System.out.println('\u0061');
        System.out.println(3 > 4);
        System.out.println(3 >= 4);
        System.out.println(3 <  7);
        System.out.println(30 >= 7);
        System.out.println(30 != 7);


    }
    public static void estruturaSequencial(){

        System.out.println("Estrutura sequencial é uma estrutura de código linear");
        int idade = 33;
        System.out.println("Idade: " + idade + " /n Fim da sequencia.");
    }
    public static void estruturaCondicionalIf(){
        System.out.println("Estrutura condicional!");
        System.out.println("Uso de IF");

        int idade = 18;
        System.out.printf("Idade: %d%n", idade);
        System.out.println("IF com uma linha de código só funciona sem {}");
        System.out.println("if (idade >=18) System.out.println(\"Maior de idade!\");");

        if (idade >=18) System.out.println("Maior de idade!");

        int idadeMenor = 15;
        System.out.println("\nUso do if () { } else{ }");
        System.out.printf("Idade: %d%n", idadeMenor);
        if (idadeMenor >=18) {
            System.out.println("Maior de idade!");
        }else {
            System.out.println("Menor de Idade!");
        }
        System.out.println("Aninhamento de IFs, é possível, mas a complexidade ciclomática aumenta!");

        int resposta = 10;
        if (resposta == 10) {
            System.out.println("A resposta é exatamente 10!");
        } else if (resposta > 10) {
            System.out.println("A resposta é maior que 10!");
        } else {
            System.out.println("A resposta é menor que 10!");
        }

        if(resposta == 10 && idadeMenor == 15) System.out.println("Não deu com o uso de && AND E");

        if(resposta == 10 || idadeMenor == 15) System.out.println("Não deu com o uso de || OR OU");

        if(resposta >= 10 && idadeMenor != 14) System.out.println("Não deu com o uso de maior ou igual >=  e != diferente");

        if(idadeMenor <= 17) System.out.println("Menor de idade!");


    }
    public static void estruturaCondicionalSwitchCase(){
        /*A estrutura condicional switch/case vem como alternativa em momentos em que temos
         que utilizar múltiplos ifs no código. Múltiplos if/else encadeados tendem a tornar
          o código muito extenso, pouco legível e com baixo índice de manutenção.O switch/case
        testa o valor contido em uma variável, realizando uma comparação com cada uma das opções.
         Cada uma dessas possíveis opções é delimitada pela instrução case.Podemos ter quantos casos
          de análise forem necessários e, quando um dos valores corresponder ao da variável,
           o código do case correspondente será executado. Caso a variável não corresponda a nenhum
            dos casos testados, o último bloco será executado, chamado de default (padrão).A análise de
             cada caso também precisa ter seu final delimitado. Essa delimitação é feita através
              da palavra break.*/
        int mes;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o mês: ");
        mes = ler.nextInt();
        switch (mes) {
            case 1:
                System.out.println("O mês é janeiro");
                break;
            case 2:
                System.out.println("O mês é fevereiro");
                break;
            case 3:
                System.out.println("O mês é março");
                break;
            case 4:
                System.out.println("O mês é abril");
                break;
            case 5:
                System.out.println("O mês é maio");
                break;
            case 6:
                System.out.println("O mês é junho");
                break;
            case 7:
                System.out.println("O mês é julho");
                break;
            case 8:
                System.out.println("O mês é agosto");
                break;
            case 9:
                System.out.println("O mês é setembro");
                break;
            case 10:
                System.out.println("O mês é outubro");
                break;
            case 11:
                System.out.println("O mês é novembro");
                break;
            case 12:
                System.out.println("O mês é dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
    public static void estruturaRepetitivaFor(){
        System.out.println("Estrutura repetitiva FOR!");
        for (int i = 0; i <= 10; i++) {
            System.out.println("A variável i agora vale "+ i);
            System.out.print(MessageFormat.format("Formatado: A variável i agora vale {0}\n", i));
        }

    }
    public static void estruturaRepetitivaForAninhado() {
        System.out.println("Estrutura repetitiva FOR Aninhada, ou seja, for dentro de for. \nServe para percorrer os espeços de uma matriz 2x2!");
        System.out.println("Posição matrix 3x3, formato ixj, i é linha e j é coluna:");
        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {
                System.out.println("A variável i agora vale "+ i + " e " + "a variável j agora vale "+ j);
                System.out.println("Posição: " + i +"x" + j);
            }
        }

    }
    public static void operadorTernario(){
            System.out.println("Operador Ternario!");
            int numeroDias = 5; //valor entre 1 e 30


            System.out.println((numeroDias < 15) ? "Primeira quinzena" : "Segunda quinzena");

        }
    public static void estruturaRepetitivaWhile(){
        System.out.println("Estrutura repetitiva WHILE!");
        int numero = 0;
        while (numero != 11) {
// enquanto a variável não for 11, ou seja, diferente de 11, o trecho de código será repetido

            if (numero == 10) {
                System.out.println("Terminou em 10!");
            } else {
                System.out.println(numero);
                System.out.println("Ainda não chegou em 10!");
            }
            numero= numero+1;
        }
    }

//Aula 03 - 07/03/2022
    public static void estruturaRepetitivaDoWhile(){

        int n=5;
        do {
            System.out.println ("tick " + n);
        } while (--n>0);
    }
    public static void continueBBreak(){

       for (int i =0;i<10;i++){
           if(i % 2 == 1){
               System.out.println("Usou continue!");
               continue;
           }
           if(i==9) {

               break;

           }
           System.out.println(i);

       }
        System.out.println("Saiu no Break!");

    }

    public static int passagemParametrosInt(int nota1, int nota2){
        int total = nota1 + nota2;

        //return total;
        return nota1 + nota2;
    }
    public static double passagemParametrosDouble(double nota){
        nota = nota*2;

        return nota;
    }
    public static String passagemParametrosString(String nome){
        String name = nome;
        return name;
    }
    public static void comparacaoStrings(){

       System.out.println("2"=="2");

        String s = new String("2");
        System.out.println("2"==s);

        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.next();
        //String s2 = entrada.nextLine();
       //System.out.println("2"==s2.trim());
       System.out.println("TESTETESTE".equals(s2.trim()));
      //  System.out.println("2"==s2);

       entrada.close();

}

//    Crie um programa que receba 3 números inteiros e apresente a soma dos números.
    public static int somaNumeros(int num1, int num2, int num3){  // funcao(python) - metodo (java)
       int soma = num1 + num2 + num3;
       return soma;

    }
    public static void somaNumeros2() {
            Scanner entrada = new Scanner(System.in);
            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();
            int num3 = entrada.nextInt();
        System.out.println(num1+num2+num3);
        entrada.close();
    }

//   Crie um programa que receba 3 números e calcule a média dos números.
    public static void mediaNotas(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite as 3 notas:");
        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        double num3 = entrada.nextDouble();
        double media = (num1 + num2 + num3)/3;

        System.out.printf("A media é %.2f",media);
        entrada.close();
    }

//    Crie um programa que receba o nome e as notas de um aluno, calcule a média e dê o resultado:

    //Desafio fazer um programa que recebe dois numeros e a operação a ser feita e imprime os numeros, operação e resultado (CALCULADORA)

  public static void calculadora(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informa a operação: ");
        String op = entrada.next();

        System.out.println("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = entrada.nextDouble();

        //Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.4f", num1, op, num2, resultado);
        entrada.close();

    }

     //Converte
    public static void converteTemperaturas (){
       Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite a tempertura em Celsius: ");


        String Celsius = entrada.next();
        double C, K, F, Re, Ra;
        C = Double.parseDouble(Celsius);


        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é: " + Re);
       entrada.close();
    }


    // Datas import
    public static void tempo(){

        Calendar c = Calendar.getInstance();

        System.out.println("Data/Hora atual: "+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));

        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);

        if(hora > 6 && hora < 12){
            System.out.println("Bom Dia");
        }else if(hora > 12 && hora < 18){
            System.out.println("Boa Tarde");
        }else{
            System.out.println("Boa Noite");
        }
    }
    public static void formatandoDatas(){

        Calendar c = Calendar.getInstance();
        c.set(2013, Calendar.FEBRUARY, 28);
        Date data = c.getTime();
        System.out.println("Data atual sem formatação: "+data);

        //Formata a data
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: "+ formataData.format(data));

        //Formata Hora
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: "+hora.format(data));

        //Formata Data e Hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));
    }

    public static void saidaDatas(){
        Calendar c = Calendar.getInstance();
        c.set(2013, Calendar.FEBRUARY, 28);
        Date data = c.getTime();
        System.out.println("Data atual sem formatação: "+data);

        //Formata a data
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: "+ formataData.format(data));

        //Formata Hora
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: "+hora.format(data));

        //Formata Data e Hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));

    }

    public static void conversaoDatas() throws ParseException {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance();

       // Date data2 = f.parse("12/01/1995");
       // System.out.println(data2);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data formatada: "+sdf.format(data));

        //Converte Objetos
        System.out.println("Data convertida: "+sdf.parse("02/08/1970"));
    }

    public static void internacionalizacaoDatas(){
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        Locale brasil = new Locale("pt", "BR"); //Retorna do país e a língua
        Locale eua = Locale.US;
        Locale italia = Locale.ITALIAN;

        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println("Data e hora brasileira: "+f2.format(data));

        DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, eua);
        System.out.println("Data e hora americana: "+f3.format(data));

        DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, italia);
        System.out.println("Data e hora italiana: "+f4.format(data));
    }
    //Recursão
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static int fatorialInterativo(int numero){
        //variável para armazenar o valor a ser calculado
        int fatorial = 1;
        //laço de repetição
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }

    public static int fatorialRecursivo(int fatRec){
        //condição de parada
        if(fatRec < 0){
            System.out.println("Valor negativo");
            return 0;
        }
        if(fatRec == 0){
            return 1 ;
        }
        //5!
        //5 * 4! = 120
        //4 * 3! = 24
        //3 * 2! = 6
        //2 * 1! = 2
        // 1! = 1
        // se o valor for igual a um, para a recursão e retorna calculando os valores
        return (fatRec*fatorialRecursivo(fatRec - 1));
    }


    public static void recursao(){
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static void fatorial(){
       int n = 5;
       n = n*(n-1);
    }

  
	 
    public static void arrayExemplo() {
    	
    	int c[] = {1,2,3,4,5,6,7,8,9,10,11,12};
    	
    	for(int i =0;i<= c.length;i++) {
    		System.out.println(i);
    		
    	}
    	
    }

   
    public static void main(String[] args) {
    	//estruturaRepetitivaForAninhado();
    	//for(int i = 0; i < 3; i++) {
    		//for(int j = 0; j < 3; j++) {
    			//System.out.printf("Posição (%d x %d) \n", i, j);}}
    	//Double x = passagemParametrosDouble(5.8);
    	//System.out.println(x);
    	
    	/*int c[] = {1,2,3,4,5,6,7,8,9,10,11,12};  // isso é um array unidimensional
    	for (int i =0; i< c.length; i++) {
    		System.out.println(c[i]);
    	}*/
    	//int d[][] = {{0, 1},{2,3}};

    
    
    }
}





