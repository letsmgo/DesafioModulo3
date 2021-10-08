package com.br.zup;

public class Vendedor {
    //---------------------------------------------------ATRIBUTOS
    private String nome;
    private String matricula;
    private String email;

    //---------------------------------------------------MÉTODO CONSTRUTOR
    public Vendedor(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    //---------------------------------------------------GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //---------------------------------------------------toString

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome do vendedor: " + nome);
        dados.append("\nMatrícula: " + matricula);
        dados.append("\nE-mail do vendedor: " + email);

        return dados.toString();
    }
}
