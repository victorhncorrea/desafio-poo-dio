import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();

    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();

    curso2.setTitulo("curso js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria de java");
    mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);



        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devVictor.getConteudosInscritos());

        devVictor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Victor" + devVictor.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Victor" + devVictor.getConteudosConcluidos());
        System.out.println("XP:" + devVictor.calcularTotalXp());

        System.out.println("-------");


        Dev devRafa = new Dev();
        devVictor.setNome("Rafa");
        devRafa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rafa" + devRafa.getConteudosInscritos());

        devRafa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Rafa" + devRafa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafa" + devRafa.getConteudosConcluidos());
        System.out.println("XP:" + devRafa.calcularTotalXp());





    //S ystem.out.println(curso1);
   // System.out.println(curso2);
   // System.out.println(mentoria);


    }
}
