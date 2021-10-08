package com.br.zup;

import java.util.Scanner;

public class Sistema {
    //-------------------------------------------------MÉTODO PARA CAPTURAR DADOS DO CONSOLE
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //-------------------------------------------------MÉTODO PARA CADASTRAR UM CLIENTE
    public static Cliente cadastrarCliente(){
        String nome = capturarDados("Digite o nome completo do cliente: ").nextLine();
        String cpf = capturarDados("Digite o CPF do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();

        return Servico_Cliente.cadastrarCliente(nome,cpf, email);

    }

    //-------------------------------------------------MÉTODO PARA CADASTRAR UM VENDEDOR
    public static Vendedor cadastrarVendedor(){
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String matricula = capturarDados("Digite a matrícula do vendedor: ").nextLine();
        String email = capturarDados("Digite o e-mail do vendedor: ").nextLine();

        return Servico_Vendedor.cadastrarVendedor(nome, matricula, email);
    }


    //-------------------------------------------------MÉTODO PARA CADASTRAR UMA VENDA
    public static Venda cadastrarVenda() throws Exception {
        String cliente = capturarDados("Digite o CPF do cliente: ").nextLine();
        String vendedorResponsavel = capturarDados("Digite o e-mail do vendedor: ").nextLine();
        double valorASerPago = capturarDados("Digite o valor da venda: ").nextDouble();
        String dataDeRegistro = capturarDados("Digite a data de registro: ").nextLine();

        return Servico_Venda.cadastrarVenda(cliente, vendedorResponsavel, valorASerPago, dataDeRegistro);
    }

}