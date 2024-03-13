package org.example;

import java.util.Objects;
import java.util.StringJoiner;

public class Aluno {
    private String nome;
    private int idade;
    private String RM;

    public Aluno(String nome, int idade, String RM) {
        this.nome = nome;
        this.idade = idade;
        this.RM = RM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRM() {
        return RM;
    }

    public void setRM(String RM) {
        this.RM = RM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nome, aluno.nome) && Objects.equals(RM, aluno.RM);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, RM);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Aluno.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("idade=" + idade)
                .add("RM='" + RM + "'")
                .toString();
    }
}
