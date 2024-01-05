package br.com.nogueira.record.domain;

public record Filme(String nome, String genero, int duracao) {

    public Filme {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio");
        }
        if (duracao <= 20) {
            throw new IllegalArgumentException("A duração deve ser maior que zero");
        }
    }

    public static class Builder {
        private String nome;
        private String genero;
        private int duracao;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder genero(String genero) {
            this.genero = genero;
            return this;
        }

        public Builder duracao(int duracao) {
            this.duracao = duracao;
            return this;
        }

        public Filme build() {
            return new Filme(nome, genero, duracao);
        }
    }
}
