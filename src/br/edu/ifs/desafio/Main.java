package br.edu.ifs.desafio;

import java.time.LocalDate;
import java.util.Set;

import br.edu.ifs.desafio.domain.Bootcamp;
import br.edu.ifs.desafio.domain.Curso;
import br.edu.ifs.desafio.domain.Dev;
import br.edu.ifs.desafio.domain.Mentoria;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Curso de java básico.", 20);

        Curso curso2 = new Curso("Curso Git e Github", "Curso de Git e Github para iniciantes.", 10);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição mentoria java", LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */

        Bootcamp bootcampIfood = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer", Set.of(curso1, curso2, mentoria1));

        Dev alexBrown = new Dev("Alex Brown");
        alexBrown.inscreverBootcamp(bootcampIfood);
        System.out.println("Conteúdos inscritos: " + alexBrown.getConteudosInscritos());
        alexBrown.progedir();
        System.out.println("------{ Após progressão }------");
        System.out.println("Conteúdos inscritos: " + alexBrown.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + alexBrown.getConteudosConcluidos());
        
        System.out.println("------------------------------------------------------------------");

        Dev alessandroGreen = new Dev("Alessandro Green");
        alessandroGreen.inscreverBootcamp(bootcampIfood);
        System.out.println("Conteúdos inscritos: " + alessandroGreen.getConteudosInscritos());
        alessandroGreen.progedir();
        System.out.println("------{ Após progressão }------");
        System.out.println("Conteúdos inscritos: " + alessandroGreen.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + alessandroGreen.getConteudosConcluidos());

    }

}
