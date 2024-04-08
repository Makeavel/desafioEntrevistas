package com.api.target.service;

import com.api.target.model.PercentFaturamentoModel;

import java.text.DecimalFormat;

public class PercentualFaturamento {

    public String cadastroFaturamentos() {

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        PercentFaturamentoModel faturamentoSP = new PercentFaturamentoModel("SP", 67836.43);
        PercentFaturamentoModel faturamentoRJ = new PercentFaturamentoModel("RJ", 36678.66);
        PercentFaturamentoModel faturamentoMG = new PercentFaturamentoModel("MG", 29229.88);
        PercentFaturamentoModel faturamentoES = new PercentFaturamentoModel("ES", 27165.48);
        PercentFaturamentoModel faturamentoOutros = new PercentFaturamentoModel("Outros", 19849.53);

        Double faturamentoTotal = faturamentoSP.getValor() + faturamentoRJ.getValor() + faturamentoMG.getValor()+
                faturamentoES.getValor()+faturamentoOutros.getValor();

        double percentualSP = (faturamentoSP.getValor()/faturamentoTotal * 100);
        double percentualRJ = (faturamentoRJ.getValor()/faturamentoTotal * 100);
        double percentualMG = (faturamentoMG.getValor()/faturamentoTotal * 100);
        double percentualES = (faturamentoES.getValor()/faturamentoTotal * 100);
        double percentualOutros = (faturamentoOutros.getValor()/faturamentoTotal * 100);


        return "\nPercentuais: " +
                "\n SP: "+ decimalFormat.format(percentualSP)+
                "\n RJ: "+ decimalFormat.format(percentualRJ)+
                "\n MG: "+ decimalFormat.format(percentualMG)+
                "\n ES: "+ decimalFormat.format(percentualES)+
                "\n Outros: " + decimalFormat.format(percentualOutros);
    }
}

/*
Questao 4 de 5 Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

SP – R$67.836,43
RJ – R$36.678,66
MG – R$29.229,88
ES – R$27.165,48
Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que
cada estado teve dentro do valor total mensal da distribuidora.
 */