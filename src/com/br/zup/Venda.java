package com.br.zup;

public class Venda {
    //---------------------------------------------------ATRIBUTOS
    private Cliente cliente;
    private Vendedor vendedorResponsavel;
    private double valorASerPago;
    private String dataDeRegistro;

    //---------------------------------------------------MÉTODO CONSTRUTOR
    public Venda(Cliente cliente, Vendedor vendedorResponsavel, double valorASerPago, String dataDeRegistro) {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.valorASerPago = valorASerPago;
        this.dataDeRegistro = dataDeRegistro;
    }

    //---------------------------------------------------GETTERS AND SETTERS
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    //---------------------------------------------------toString
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome do cliente: " + cliente);
        dados.append("\nNome do vendedor: " + vendedorResponsavel);
        dados.append("\nValor a ser pago: R$" + valorASerPago);
        dados.append("\nData de registro: " + dataDeRegistro);

        return dados.toString();
    }
}
