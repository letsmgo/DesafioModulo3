package com.br.zup;


public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Sistema.executarFuncoes();
        }catch (Exception possivelErro){
            System.out.println(possivelErro.getMessage());
        }

    }
}
