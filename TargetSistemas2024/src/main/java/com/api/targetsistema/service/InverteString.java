package com.api.targetsistema.service;

public class InverteString {

    public String inverterStringFornecida(String entradaUsuario){

        int tamString = entradaUsuario.length();
        char[] entrada = entradaUsuario.toCharArray();
        char[] invertido = new char[tamString];

        for(int i = 0; i < tamString ; i++){
            invertido[i] = entrada[tamString -1 -i];
        }

        return new String(invertido);
    }
}
