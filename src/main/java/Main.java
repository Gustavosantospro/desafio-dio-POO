import br.com.gustavogithub.desafiodio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitle(" Curso Java ");
        curso1.setDescription(" curso de java feito para iniciantes ");
        curso1.setWorkload(8);

        Curso curso2 = new Curso();
        curso2.setTitle(" Curso de Mysql ");
        curso2.setDescription(" curso de Mysql básico para iniciantes ");
        curso2.setWorkload(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitle(" Mentoria de Java ");
        mentoria.setDescription(" Mentoria feita para curso de Java ");
        mentoria.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Curso Avançado para programadores Java");
        bootcamp.getContent().add(curso1);
        bootcamp.getContent().add(curso2);
        bootcamp.getContent().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.setName("Gustavo");
        devGustavo.BootcampRegister(bootcamp);
        System.out.println("Conteúdos Inscritos Gustavo: " + devGustavo.getSubscribedContent());

        devGustavo.toProgress();
        System.out.println("*-*");
        System.out.println("Conteúdos Inscritos Gustavo: " + devGustavo.getSubscribedContent());
        System.out.println("Conteúdos Concluidos Gustavo: " + devGustavo.getSubscribedContent());
        System.out.println("XP: " + devGustavo.calculateTotalXp());
        System.out.println("*----*");

        Dev devJoao = new Dev();
        devJoao.setName("João");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getSubscribedContent());

        devJoao.toProgress();
        System.out.println("*-*");
        devJoao.BootcampRegister(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getSubscribedContent());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getSubscribedContent());
        System.out.println("XP: " + devJoao.calculateTotalXp());


    }
}
