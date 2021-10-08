package com.br.zup;

public class Vendedor {
    //---------------------------------------------------ATRIBUTOS
    private String nome;
    private String matricula;
    private String ctps;

    //---------------------------------------------------MÉTODO CONSTRUTOR
    public Vendedor(String nome, String matricula, String ctps) {
        this.nome = nome;
        this.matricula = matricula;
        this.ctps = ctps;
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

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    //---------------------------------------------------toString

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome do vendedor: " + nome);
        dados.append("\nMatrícula: " + matricula);
        dados.append("\nNúmero da CTPS: " + ctps);

        return dados.toString();
    }
}
