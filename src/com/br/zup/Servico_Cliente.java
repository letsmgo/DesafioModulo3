package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class Servico_Cliente {
    //-----------------------------------Atributo responsável por criar a lista de clientes
    private static List<Cliente> clientes = new ArrayList<>();

    //-----------------------------------MÉTODO PARA VALIDAR E-MAILS
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("E-mail inválido! Vamos tentar novamente?");
        }
    }

    //-----------------------------------MÉTODO PARA VALIDAR SE O CPF DO CLIENTE JÁ FOI CADASTRADO E NÃO TER DUPLICIDADE
    public static void verificarDuplicidadeCpf(String cpf) throws Exception{
        for (Cliente clienteReferencia : clientes) {
            if (clienteReferencia.getCpf().equalsIgnoreCase(cpf)){
                throw new Exception("CPF já cadastrado. Você digitou algo errado, vamos tentar novamente?");
            }
        }
    }

    //-----------------------------------MÉTODO PARA VALIDAR SE O EMAIL DO CLIENTE JÁ FOI CADASTRADO E NÃO TER DUPLICIDADE
    public static void verificarDuplicidadeEmail(String email) throws Exception{
        for (Cliente clienteReferencia : clientes) {
            if (clienteReferencia.getEmail().equalsIgnoreCase(email)){
                throw new Exception("E-mail já cadastrado, digite outro endereço de e-mail.");
            }
        }
    }


    //-----------------------------------MÉTODO PARA CADASTRAR UM CLIENTE
    public static Cliente cadastrarCliente(String nome, String cpf, String email) throws Exception{
        verificarDuplicidadeEmail(email);
        verificarDuplicidadeCpf(cpf);
        validarEmail(email);
        Cliente cliente = new Cliente(nome, cpf, email);
         clientes.add(cliente);

         return cliente;
    }

    //-----------------------------------MÉTODO PARA EXIBIR LISTA DE CLIENTE
    public static List<Cliente> motrarListaDeClientes(){
        List<Cliente> exibirClientes = new ArrayList<>();
        for (Cliente clienteReferencia : clientes) {
            exibirClientes.add(clienteReferencia);
        }

        return exibirClientes;
    }

    //-----------------------------------MÉTODO PARA VERIFICAR SE O CLIENTE ESTÁ CADASTRADO
    public static Cliente buscarClientePeloEmail (String cpf) throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getCpf().equalsIgnoreCase(cpf)){
                return referencia;
            }
        }
        throw new Exception("Não há cliente cadastrado com esse CPF, vamos tentar novamente?");
    }

}
