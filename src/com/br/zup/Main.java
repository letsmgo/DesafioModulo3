package com.br.zup;


public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Sistema.cadastrarCliente();

            Sistema.cadastrarVendedor();

            Sistema.cadastrarVenda();
            Sistema.cadastrarVenda();

            System.out.println(Servico_Venda.mostrasVendas());

            Sistema.exibirComprasCliente();

            //System.out.println(Servico_Cliente.motrarListaDeClientes());
           // System.out.println(Servico_Vendedor.mostrarListaDeVendedores());


        }catch (Exception possivelErro){
            System.out.println(possivelErro.getMessage());
        }

    }
}
