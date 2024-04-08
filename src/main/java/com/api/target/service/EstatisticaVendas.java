package com.api.target.service;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Locale;

public class EstatisticaVendas {

    public String estatisticas() throws Exception {

        String rota = "src/main/java/com/api/target/dados/dados.json";
        Locale ptBr = new Locale("pt","BR");

        try{
            String lerJson = new String(Files.readAllBytes(Paths.get(rota)));
            JSONArray jsonArray = new JSONArray(lerJson);

            double maiorValorFaturamento = 0;
            double menorValorFaturamento = Double.POSITIVE_INFINITY; //inicia com infinito
            double somaValores = 0;
            int diasComFaturamento = 0;
            int diasAcimaMedia = 0;

            for(int i = 0; i < jsonArray.length();i++){

                JSONObject jsonObject = jsonArray.getJSONObject(i);
                double valor = jsonObject.getDouble("valor");

                if(valor > 0){
                    menorValorFaturamento = Math.min(menorValorFaturamento,valor);
                    maiorValorFaturamento = Math.max(maiorValorFaturamento, valor);

                    somaValores += valor;
                    diasComFaturamento++;
                }
            }

            double mediaMensal = somaValores/diasComFaturamento;

            for(int i = 0; i < jsonArray.length();i++){

                JSONObject jsonObject = jsonArray.getJSONObject(i);
                double valor = jsonObject.getDouble("valor");

                if(valor > mediaMensal){
                    diasAcimaMedia++;
                }
            }
            String somaValoresReais = NumberFormat.getCurrencyInstance(ptBr).format(somaValores);
            String menorValorFaturamentoReais = NumberFormat.getCurrencyInstance(ptBr).format(menorValorFaturamento);
            String maiorValorFaturamentoReais = NumberFormat.getCurrencyInstance(ptBr).format(maiorValorFaturamento);


            return "\n Valor Total de faturamento: " + somaValoresReais +
                    "\n Maior valor de faturamento: " + maiorValorFaturamentoReais +
                    "\n Menor valor de faturamento: " + menorValorFaturamentoReais +
                    "\n Numero de dias com faturamento acima da média: "+ diasAcimaMedia ;

        }catch (IOException e){

            return null;
        }

    }
}
/*
Questão 3 de 5 Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
faça um programa, na linguagem que desejar, que calcule e retorne:

• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
Estes dias devem ser ignorados no cálculo da média;
 */
