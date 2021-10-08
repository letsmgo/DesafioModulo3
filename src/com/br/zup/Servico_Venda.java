package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class Servico_Venda {
    //-----------------------------------Atributo responsável por criar a lista de clientes
    private static List<Venda> vendas = new ArrayList<>();

    //-----------------------------------MÉTODO PARA CADASTRAR UMA VENDA
    public static Venda cadastrarVenda(String cpfCliente, String emailVendedor, double valorASerPago, String dataDeRegistro) throws Exception{
        Cliente cliente =  Servico_Cliente.buscarClientePeloEmail(cpfCliente);
        Vendedor vendedor = Servico_Vendedor.validarVendedor(emailVendedor);
        Servico_Vendedor.validarVendedor(emailVendedor);
        Venda venda = new Venda(cliente, vendedor, valorASerPago, dataDeRegistro);
        vendas.add(venda);

        return venda;
    }

    //-----------------------------------MÉTODO PARA EXIBIR UMA VENDA
    public static List<Venda> mostrasVendas(){
        List<Venda> exibirVendas = new ArrayList<>();
        for (Venda vendaReferencia : vendas) {
            exibirVendas.add(vendaReferencia);
        }
        return exibirVendas;
    }



}
