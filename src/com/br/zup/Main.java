package com.br.zup;


public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Sistema.cadastrarCliente();
            Sistema.cadastrarCliente();

            //Sistema.cadastrarVendedor();
            //Sistema.cadastrarVendedor();

            //Sistema.cadastrarVenda();
            //Sistema.cadastrarVenda();

            System.out.println(Servico_Cliente.motrarListaDeClientes());
            System.out.println(Servico_Vendedor.mostrarListaDeVendedores());
            System.out.println(Servico_Venda.mostrasVendas());

        }catch (Exception possivelErro){
            System.out.println(possivelErro.getMessage());
        }

    }
}
