package unisinos.Onibus;

public class TesteOnbus {
    public static void main(String[] args){
        String[] horarios = {"07:30", "08:30", "09:00"};
        onbus onibus = new onbus(7877, "Passagem de POA para Floripa", horarios);
        System.out.println(onibus.toString());

        String[] horarios2 = {"19:30", "21:30", "23:00"}; 
        onbus onibus2 = new onbus();
        onibus2.setDescricao("Floripa para POA");
        onibus2.setLinha(7888);
        onibus2.setHorarios(horarios2);
        System.out.println(onibus2.getHorarios());




    }
}
