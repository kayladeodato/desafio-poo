package br.com.faculdade.desafio.dominio;

import br.com.faculdade.desafio.dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("br.com.faculdade.desafio.dominio.Curso introdutório a linguagem Java");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo("Git e Github");
        curso2.setDescricao("br.com.faculdade.desafio.dominio.Curso voltado a uso do Git e Github");
        curso2.setCargaHoraria(25);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como iniciar os estudos em Java");
        mentoria.setDescricao("br.com.faculdade.desafio.dominio.Mentoria voltada para todos que queiram iniciar os estudos em Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp voltado ao desenvolvimento Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do aluno(a) " + devMaria.getNome() +" " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteúdos Inscritos do aluno(a) " + devMaria.getNome() +" " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos do aluno(a) " + devMaria.getNome() +" " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXP());

        System.out.println("------------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do aluno(a) " + devJoao.getNome() + " " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos do aluno(a) " + devJoao.getNome() + " " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos do aluno(a) " + devJoao.getNome() +" " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());

        System.out.println("------------------------------------------------------------------");
    }
}
