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

}
