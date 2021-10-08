package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class Servico_Cliente {
    //-----------------------------------Atributo responsável por criar a lista de clientes
    private static List<Cliente> clientes = new ArrayList<>();

    //-----------------------------------MÉTODO PARA CADASTRAR UM CLIENTE
    public static Cliente cadastrarCliente(String nome, String cpf, String email){
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
