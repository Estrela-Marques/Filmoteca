package br.com.alura.filmoteca.principal;

import br.com.alura.filmoteca.modelos.Filme;
import br.com.alura.filmoteca.modelos.Serie;
import br.com.alura.filmoteca.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Guia do Mochileiro das Galáxias", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Sim senhor", 2021);
        outroFilme.avalia(6);
        var filmeDoBruno = new Filme("O Máskara", 2003);
        filmeDoBruno.avalia(10);
        Serie lost = new Serie("Lost", 2012);

        Filme f1 = filmeDoBruno;

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(filmeDoBruno);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme && meuFilme.getClassificacao() > 2) {
                Filme filme = (Filme)item;
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Estrela");
        buscaPorArtista.add("Bruno");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);



    }
}
