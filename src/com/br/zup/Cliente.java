package com.br.zup;

public class Cliente {
    //---------------------------------------------------ATRIBUTOS
    private String nome;
    private String cpf;

    //---------------------------------------------------MÉTODO CONSTRUTOR
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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

    //---------------------------------------------------toString
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome do cliente: " + nome);
        dados.append("\nCpf do cliente: " + cpf);

        return dados.toString();
    }
}
