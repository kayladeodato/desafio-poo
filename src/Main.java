import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Curso introdutório a linguagem Java");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo("Git e Github");
        curso2.setDescricao("Curso voltado a uso do Git e Github");
        curso2.setCargaHoraria(25);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como iniciar os estudos em Java");
        mentoria.setDescricao("Mentoria voltada para todos que queiram iniciar os estudos em Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
