package com.br.zup;

import java.util.Scanner;

public class Sistema {
    //-------------------------------------------------MÉTODO PARA CAPTURAR DADOS DO CONSOLE
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //-------------------------------------------------MÉTODO PARA CADASTRAR UM CLIENTE
    public static Cliente cadastrarCliente() throws Exception{
        String nome = capturarDados("Digite o nome completo do cliente: ").nextLine();
        String cpf = capturarDados("Digite o CPF do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();

        return Servico_Cliente.cadastrarCliente(nome,cpf, email);

    }

    //-------------------------------------------------MÉTODO PARA CADASTRAR UM VENDEDOR
    public static Vendedor cadastrarVendedor() throws Exception{
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String matricula = capturarDados("Digite a matrícula do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o CPF do vendedor: ").nextLine();
        String email = capturarDados("Digite o e-mail do vendedor: ").nextLine();

        return Servico_Vendedor.cadastrarVendedor(nome, matricula, cpf, email);
    }


    //-------------------------------------------------MÉTODO PARA CADASTRAR UMA VENDA
    public static Venda cadastrarVenda() throws Exception {
        String cliente = capturarDados("Digite o CPF do cliente: ").nextLine();
        String vendedorResponsavel = capturarDados("Digite o e-mail do vendedor: ").nextLine();
        double valorASerPago = capturarDados("Digite o valor da venda: ").nextDouble();
        String dataDeRegistro = capturarDados("Digite a data de registro: ").nextLine();

        return Servico_Venda.cadastrarVenda(cliente, vendedorResponsavel, valorASerPago, dataDeRegistro);
    }

    //-----------------------------------MÉTODO PARA VISUALIZAR TODAS AS COMPRAS DE UM CLIENTE
    public static void exibirComprasCliente() throws Exception{
        String cpf = capturarDados("Digite o cpf do cliente que deseja visualizar as compras: ").nextLine();
        Servico_Venda.exibirComprasCliente(cpf);

    }

    //-----------------------------------MÉTODO PARA VISUALIZAR TODAS AS VENDAS DE UM VENDEDOR
    public static void exibirVendasVendedor() throws Exception{
        String email = capturarDados("Digite o e-mail do vendedor que deseja visualizar as vendas: ").nextLine();
        Servico_Venda.exibirVendasVendedor(email);
    }

    //-----------------------------------MÉTODO PARA EXIBIR VENDEDORES
    public static void exibirVendedores(){
        System.out.println(Servico_Vendedor.mostrarListaDeVendedores());
    }

    //-----------------------------------MÉTODO PARA EXIBIR CLIENTES
    public static void exibirCliente(){
        System.out.println(Servico_Cliente.motrarListaDeClientes());
    }

    //-----------------------------------MÉTODO PARA EXIBIR VENDAS
    public static void exibirVendas(){
        System.out.println(Servico_Venda.mostrasVendas());
    }

    //-----------------------------------MÉTODO PARA EXIBIR UM MENU PRINCIPAL PARA O USUÁRIO DO SISTEMA
    public static void  menuInterativo(){
        System.out.println("\n| Bem vinde ao Manage Yourself seu gerenciador de vendas!   |");
        System.out.println("|                                                           | ");
        System.out.println("|  Digite 1 para cadastrar um vendedor                      |");
        System.out.println("|  Digite 2 para cadastrar um cliente                       |");
        System.out.println("|  Digite 3 para cadastrar uma venda                        |");
        System.out.println("|  Digite 4 para exibir os vendedores cadastrados           |");
        System.out.println("|  Digite 5 para exibir os cliente cadastrados              |");
        System.out.println("|  Digite 6 para exibir as vendas gerais                    |");
        System.out.println("|  Digite 7 para exibir as compras de um cliente            |");
        System.out.println("|  Digite 8 para exibir as vendas de um vendedor            |");
        System.out.println("|  Digite 9 para encerrar o Manage Yourself                 |");


    }

    public static void executarFuncoes() throws Exception {
        boolean executarMenu = true;

        while (executarMenu){
            menuInterativo();
            int opcaoEscolhida = capturarDados("Digite a opção que deseja executar: ").nextInt();
            if (opcaoEscolhida == 1){
                cadastrarVendedor();
            } else if (opcaoEscolhida == 2){
                cadastrarCliente();
            } else if (opcaoEscolhida == 3){
                cadastrarVenda();
            } else if (opcaoEscolhida == 4){
                exibirVendedores();
            } else if (opcaoEscolhida == 5){
                exibirCliente();
            } else if (opcaoEscolhida == 6){
                exibirVendas();
            } else if (opcaoEscolhida == 7){
                exibirComprasCliente();
            } else if (opcaoEscolhida == 8){
                exibirVendasVendedor();
            } else if (opcaoEscolhida == 9){
                System.out.println("Obrigado por utilizar nosso sistema até a próxima! ");
                executarMenu = false;
            }
        }
    }

}
