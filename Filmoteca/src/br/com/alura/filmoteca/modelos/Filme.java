package br.com.alura.filmoteca.modelos;

import br.com.alura.filmoteca.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel { //Filme tem tudo o que Título tem e faz tudo o que Titulo faz.
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);

    }

    //GETTER Permite leitura dos atributos
    public String getDiretor() {
        return diretor;
    }

    //SETTER Permite modificação dos atributos
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
