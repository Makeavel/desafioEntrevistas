# Desafio Estágio Target Sistemas

Para executar os códigos do desafio é necessário o uso de uma IDE e ter o java 17 instalado na máquina ou,
utilizar um compilador online, porém, para poder usar no compilador online é necessário colocar 
o código do arquivo TargetSistemaApplication.java + o das outras classes da pasta service, juntos, para compilar.

## Q1. Observe o trecho de código abaixo:

    int INDICE = 13, SOMA = 0, K = 0;
    enquanto K < INDICE faça
    {
    K = K + 1;
    SOMA = SOMA + K;
    }
    
    imprimir(SOMA);

 Ao final do processamento, qual será o valor da variável SOMA?

<b>Resposta:</b> 49

## Q2. Fibonacci:

Dado a sequência de Fibonacci onde se inicia por 0 e 1 e o
próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
escreva um programa na linguagem que desejar onde, informado um número,
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se
o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou
 pode ser previamente definido no código;

<b>Resposta:</b> <p><a href="https://github.com/Makeavel/desafioEntrevistas/blob/targetSistemas2024/src/main/java/com/api/targetsistema/service/Fibonacci.java">Link do Código</a></p>  

     
## Q3. Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___

<b>Próximo elemento:</b> 9.

<b>Lógica:</b> Intervalo entre o número atual e o próximo é sempre de n+2.

b) 2, 4, 8, 16, 32, 64, ____

<b>Próximo elemento:</b> 128.

<b>Lógica:</b> O próximo número sempre será o quadrado do número que o antecede (n²).

c) 0, 1, 4, 9, 16, 25, 36, ____

<b>Próximo elemento:</b> 49.

<b>Lógica:</b> O intervalo entre o atual e o próximo é baseado na soma do número atual com um número impar que a cada iteração cresce (1,3,5,7,9,11,13,...).

d) 4, 16, 36, 64, ___

<b>Próximo elemento:</b> 100.

<b>Lógica:</b> Cada valor por trás dessa sequência é resultado da operação de (n+2)² onde n, que é a base, sempre será um número par maior que zero. A lógica se inicializa com 2² e assim segue sucessivamente, sempre adicionando +2 no valor da base (2,4,6,8,10...). 

e) 1, 1, 2, 3, 5, 8, ___

<b>Próximo elemento:</b> 13 .

<b>Lógica:</b> A soma dos dois números anteriores resulta no valor do próximo número.

f) 2,10, 12, 16, 17, 18, 19, ____

<b>Próximo elemento:</b> 200 .

<b>Lógica:</b> todos os números listados começam com a letra "D"


## Q4. Sala com três interruptores:

Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. 
Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. 
Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, 
qual interruptor controla cada lâmpada?

<b>Resposta:</b>

1º Ligaria o interruptor 1 e esperaria alguns minutos até que a lampada do interruptor que escolhi esquente

2º Desligando o Interruptor 1, ligo o interruptor 2 e iria para a sala das luzes averiguar qual lampada está acessa.

2.1 - Após descobrir qual a lampada o interruptor 2 controla, toco nas demais para saber qual o interruptor 1 controla com base no calor.

2.2 - Descobrindo qual que o interruptor 1 e do interruptor 2 controla, eu volto para a sala inicial, desligo o interruptor 2 e ligo o terceiro.

2.3 - Voltando para a sala das lampadas descubro qual lampada o interruptor 3 controla.



## Q5. Convertendo de String

Escreva um programa que inverta os caracteres de um string.


IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

<b>Resposta:</b> <p><a href="https://github.com/Makeavel/desafioEntrevistas/blob/targetSistemas2024/src/main/java/com/api/targetsistema/service/InverteString.java">Link do Código</a></p>  

