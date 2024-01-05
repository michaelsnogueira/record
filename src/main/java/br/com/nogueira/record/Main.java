package br.com.nogueira.record;


import br.com.nogueira.record.domain.Filme;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Filme filme = new Filme("", "Drama", 10);
        filme.nome();

        Filme build = new Filme.Builder()
                .nome("O Poderoso Chefão")
                .genero("Drama")
                .duracao(175)
                .build();
        build.genero();
    }
}