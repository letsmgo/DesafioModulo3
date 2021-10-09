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

    //-----------------------------------MÉTODO PARA BUSCAR TODAS AS COMPRAS DE UM CLIENTE  USANDO COMO PARAMETRO CPF
    public static void exibirComprasCliente (String cpf) throws Exception{
        List<Venda> vendasDoCliente = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getCliente().getCpf().equals(cpf)){
                System.out.println(referencia);
                vendasDoCliente.add(referencia);
            }
        }
        if (vendasDoCliente.size() == 0) {
            throw new Exception("Este cliente ainda não realizou nenhuma compra. ");
        }
    }

    //-----------------------------------MÉTODO PARA BUSCAR TODAS AS VENDAS REALIZADAS POR UM VENDEDOR EM ESPECÍFICO
    public static void exibirVendasVendedor (String email) throws Exception{
        List<Venda> vendasDoVendedor = new ArrayList<>();
        for (Venda vendedorReferencia : vendas){
            if (vendedorReferencia.getVendedorResponsavel().getEmail().equalsIgnoreCase(email)){
                System.out.println(vendedorReferencia);
                vendasDoVendedor.add(vendedorReferencia);
            }
        }
        if (vendasDoVendedor.size() == 0) {
            throw new Exception("Não existe vendas realizadas por este vendedor. ");
        }
    }
}

