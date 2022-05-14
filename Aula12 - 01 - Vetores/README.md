# Vetores

> Os vetores constituem uma forma muito conveniente de organizar informa��es.


## Sintaxes

````java
 <tipo>[] variavel = new [tamanho];
ou
 <tipo> variavel[] = new [tamanho];
````

> A utiliza��o de vetores e matrizes em Java envolve tr�s etapas:

> - Declarar o vetor ou matriz. Para isto, basta acrescentar um par de colchetes antes ou depois do nome da vari�vel. Por exemplo:

````java
byte[] idades;  

float notas[];
````

> - Reservar espa�o de mem�ria e definir o tamanho. � preciso definir o tamanho do vetor, isto �, a quantidade total de elementos que ter� de armazenar. Em seguida � necess�rio reservar espa�o de mem�ria para armazenar os elementos. Isto � feito de maneira simples pelo operador new:

````java
idades= new byte[10];

notas= new float[3]; 
````

> -Armazenar elementos no vetor ou matriz. Para armazenar uma informa��o em um dos elementos de um vetor ou matriz, � necess�rio fornecer um �ndice que indique a posi��o desse elemento. Por exemplo, para armazenar um valor na quarta posi��o do vetor idades, fazemos o seguinte:

````java
idades[3] = 18;