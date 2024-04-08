package com.api.target.service;

public class Fibonacci {

    public String calculaFibonacci(Integer entradaUsuario) {

        int primeiroNumero = 0;
        int segundoNumero = 1;
        int auxLocal;

        for(int i = 0 ; i <= entradaUsuario ; i++){

            auxLocal = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = auxLocal;

            if (entradaUsuario.equals(auxLocal)) {
                return "O número fornecido: (" + entradaUsuario + ") se encontra em fibonacci";
            } else if(auxLocal > entradaUsuario){
                return "O número fornecido (" + entradaUsuario +") não está contido em fibonacci";
            }
        }

       return "";
    }

    /*
    Q2. Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o
    próximo valor sempre será a soma dos 2 valores anteriores
    (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
    escreva um programa na linguagem que desejar onde, informado um número,
    ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se
    o número informado pertence ou não a sequência.

    IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou
     pode ser previamente definido no código;
     */
}