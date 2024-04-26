package com.api.target;

import com.api.target.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TargetSistemasApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TargetSistemasApplication.class, args);

        //Questão 1 - Resultado da Soma

        ResultadoDaSoma service = new ResultadoDaSoma();
        Integer resultadoSoma = service.somaValores( 13);
        System.out.println("\n\nQ1 - Resultado da soma:" + resultadoSoma);

        //Questão 2 - Fibonacci

        Fibonacci fibonacci = new Fibonacci();
        String resultadoFibonacci = fibonacci.calculaFibonacci(89);
        System.out.println("\nQ2 - Resultado Fibonacci: " + resultadoFibonacci);

        //Questão 3 - Estatistica de vendas

        EstatisticaVendas estatisticaVendas = new EstatisticaVendas();
        String resultadoEstatistica = estatisticaVendas.estatisticas();
        System.out.println("\nQ3 - Estatistica de vendas: " + resultadoEstatistica);

        //Questão 4 - Percentual de faturamentos

        PercentualFaturamento percentualFaturamento = new PercentualFaturamento();
        String resultadoFaturamento = percentualFaturamento.cadastroFaturamentos();
        System.out.println("\nQ4 - Percentual de Faturamentos: " + resultadoFaturamento);

        //Questão 5 - Inverter String

        InverteString inverteString = new InverteString();
        String resultadoInvercao = inverteString.inverterStringFornecida("Makeavel");
        System.out.println("\nQ5 - Resultado Inversão: " + resultadoInvercao + "\n");







    }

}
