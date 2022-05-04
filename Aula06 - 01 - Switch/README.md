# Switch

> O switch case Java � uma estrutura muito importante para testar condi��es de uma forma simples e intuitiva, reduzindo a necessidade de criar blocos de c�digo complexo usando v�rios if else encadeados.



> No entanto, � preciso cuidado ao utiliz�-la, pois qualquer pequeno erro na l�gica empregada para definir as condi��es de teste pode causar diversos erros no programa.



> Para evitar que isso aconte�a, � necess�rio entender como de fato o switch case funciona e quando � melhor utilizar essa estrutura no lugar do if else.

> Al�m disso, a estrutura switch case no Java trabalha com v�rios tipos de dados, como byte, short, long, string, int, enum, entre outros.

## Como funciona o Switch case?

> O funcionamento da estrutura switch � bastante simples. Inicialmente, o valor da vari�vel passada no switch � comparado com os valores fornecidos em cada case. Se um desses valores for igual ao valor da vari�vel, o bloco de c�digo do case em quest�o ser� executado.



> As compara��es da estrutura switch s�o sempre feitas de forma sequencial e n�o h� limite para a quantidade de cases que cada switch pode ter. Al�m disso, a estrutura switch tamb�m pode conter as declara��es opcionais �break� e �default�

### Sintaxe

````java

switch (express�o) {

case valor1:

   // bloco de c�digo que ser� executado

   break;

case valor2:

   // bloco de c�digo que ser� executado

   break;

case valorN:

   // bloco de c�digo que ser� executado

   break;

default:

   // bloco de c�digo que ser� executado se nenhum dos cases for aceito

}```` 