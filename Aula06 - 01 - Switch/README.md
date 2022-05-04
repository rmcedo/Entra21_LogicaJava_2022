# Switch

> O switch case Java é uma estrutura muito importante para testar condições de uma forma simples e intuitiva, reduzindo a necessidade de criar blocos de código complexo usando vários if else encadeados.



> No entanto, é preciso cuidado ao utilizá-la, pois qualquer pequeno erro na lógica empregada para definir as condições de teste pode causar diversos erros no programa.



> Para evitar que isso aconteça, é necessário entender como de fato o switch case funciona e quando é melhor utilizar essa estrutura no lugar do if else.

> Além disso, a estrutura switch case no Java trabalha com vários tipos de dados, como byte, short, long, string, int, enum, entre outros.

## Como funciona o Switch case?

> O funcionamento da estrutura switch é bastante simples. Inicialmente, o valor da variável passada no switch é comparado com os valores fornecidos em cada case. Se um desses valores for igual ao valor da variável, o bloco de código do case em questão será executado.



> As comparações da estrutura switch são sempre feitas de forma sequencial e não há limite para a quantidade de cases que cada switch pode ter. Além disso, a estrutura switch também pode conter as declarações opcionais “break” e “default”

### Sintaxe

````java

switch (expressão) {

case valor1:

   // bloco de código que será executado

   break;

case valor2:

   // bloco de código que será executado

   break;

case valorN:

   // bloco de código que será executado

   break;

default:

   // bloco de código que será executado se nenhum dos cases for aceito

}```` 