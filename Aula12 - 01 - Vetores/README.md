# Vetores

> Os vetores constituem uma forma muito conveniente de organizar informações.


## Sintaxes

````java
 <tipo>[] variavel = new [tamanho];
ou
 <tipo> variavel[] = new [tamanho];
````

> A utilização de vetores e matrizes em Java envolve três etapas:

> - Declarar o vetor ou matriz. Para isto, basta acrescentar um par de colchetes antes ou depois do nome da variável. Por exemplo:

````java
byte[] idades;  

float notas[];
````

> - Reservar espaço de memória e definir o tamanho. É preciso definir o tamanho do vetor, isto é, a quantidade total de elementos que terá de armazenar. Em seguida é necessário reservar espaço de memória para armazenar os elementos. Isto é feito de maneira simples pelo operador new:

````java
idades= new byte[10];

notas= new float[3]; 
````

> -Armazenar elementos no vetor ou matriz. Para armazenar uma informação em um dos elementos de um vetor ou matriz, é necessário fornecer um índice que indique a posição desse elemento. Por exemplo, para armazenar um valor na quarta posição do vetor idades, fazemos o seguinte:

````java
idades[3] = 18;