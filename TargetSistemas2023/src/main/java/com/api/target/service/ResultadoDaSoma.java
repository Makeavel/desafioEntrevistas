package com.api.target.service;

public class ResultadoDaSoma {


    public Integer somaValores(Integer indice){
        int k;
        int soma = 0;
        for(k = 0; k<indice; k++){
            k += 1;
            soma += k;
        }

        return soma;
    }
}

/*    Q1. Observe o trecho de código abaixo:

        int INDICE = 13, SOMA = 0, K = 0;
        enquanto K < INDICE faça
        {
        K = K + 1;
        SOMA = SOMA + K;
        }

        imprimir(SOMA);

        - Ao final do processamento, qual será o valor da variável SOMA?

 */