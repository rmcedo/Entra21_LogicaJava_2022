# WHILE & DO-WHILE

> S�o 2 estruturas de repeti��o baseadas em decis�o onde a quantidade de repeti��es � potencialmente infinita


>Como em todo la�o de repeti��o � importante ter aten��o ao crit�rio de perman�ncia para que em algum momento seja poss�vel sair dele.

## SINTAXE

```` java

Scanner entrada = new Scanner(System.in);

String resposta="sim";



while(resposta.equal("sim")){

   System.out.println("Gostaria de repetir mais uma vez? (sim ou n�o)")

   resposta=entrada.next();

}



//para entrar no while � necess�rio atender a condi��o de perman�ncia, que ser� testada novamente ao termino de cada loop

