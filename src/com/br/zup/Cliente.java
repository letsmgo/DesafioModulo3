package com.br.zup;

public class Cliente {
    //---------------------------------------------------ATRIBUTOS
    private String nome;
    private String cpf;
    private String email;

    //---------------------------------------------------MÉTODO CONSTRUTOR
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    //---------------------------------------------------GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        dados.append("\nNome do cliente: " + nome);
        dados.append("\nCpf do cliente: " + cpf);
        dados.append("\nE-mail do cliente: " + email);

        return dados.toString();
    }
}
