package com.api.targetsistema;

import com.api.targetsistema.service.Fibonacci;
import com.api.targetsistema.service.InverteString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TargetSistemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TargetSistemaApplication.class, args);


		//Questão 2 - Fibonacci

		Fibonacci fibonacci = new Fibonacci();
		String resultadoFibonacci = fibonacci.calculaFibonacci(89);
		System.out.println("\nQ2 - Resultado Fibonacci: " + resultadoFibonacci);

		//Questão 5 - Inverter String

		InverteString inverteString = new InverteString();
		String resultadoInvercao = inverteString.inverterStringFornecida("Makeavel");
		System.out.println("\nQ5 - Resultado Inversão: " + resultadoInvercao + "\n");


	}

}
