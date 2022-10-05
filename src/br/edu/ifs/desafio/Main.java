package br.edu.ifs.desafio;

import java.time.LocalDate;

import br.edu.ifs.desafio.domain.Curso;
import br.edu.ifs.desafio.domain.Mentoria;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Curso de java básico.", 20);

        Curso curso2 = new Curso("Curso Git e Github", "Curso de Git e Github para iniciantes.", 10);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição mentoria java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
    
}
