package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class Servico_Vendedor {
    //-----------------------------------Atributo responsável por criar a lista de vendedores
    private static List<Vendedor> vendedores = new ArrayList<>();

    //-----------------------------------MÉTODO PARA CADASTRAR UM VENDEDOR
    public static Vendedor cadastrarVendedor(String nome, String matricula, String email){
        Vendedor vendedor = new Vendedor(nome, matricula, email);
        vendedores.add(vendedor);

        return vendedor;
    }

    //-----------------------------------MÉTODO PARA EXIBIR LISTA DE VENDEDORES
    public static List<Vendedor> mostrarListaDeVendedores(){
        List<Vendedor> exibirVendedores = new ArrayList<>();
        for (Vendedor vendedorReferencia : vendedores) {
            exibirVendedores.add(vendedorReferencia);
        }
        return exibirVendedores;
    }

    //-----------------------------------MÉTODO PARA VERIFICAR SE O VENDEDOR ESTÁ CADASTRADO
    public static Vendedor validarVendedor(String email) throws Exception{
        for (Vendedor vendedorReferencia : vendedores) {
            if (vendedorReferencia.getEmail().equalsIgnoreCase(email)){
                return vendedorReferencia;
            }
        }
        throw new Exception("Vendedor não cadastrado! Vamos tentar novamente?");
    }


}
