# Operadores L�gicos

Os operadores l�gicos representam o recurso que nos permite criar express�es l�gicas maiores a partir da jun��o de duas ou mais express�es. Para isso, aplicamos as opera��es l�gicas E (representado por �&&�) e OU (representado por �||�).

## Tipos

> - && - Utilizado quando desejamos que as duas express�es sejam verdadeiras.

> Para && � necess�rio que os 2 booleans necessitam possuir mesmo valor TRUE para que seja TRUE

| A | B | RESULTADO |
|---|---|-----------|
| T | T |     T     |
| T | F |     F     |
| F | T |     F     |
| F | F |     F     |


> - || - Utilizado quando precisamos que pelo menos um das express�es seja verdadeira.

> Para || para ser TRUE, apenas um dos valores booleanos necessita ser TRUE.

| A | B | RESULTADO |
|---|---|-----------|
| T | T |     T     |
| T | F |     T     |
| F | T |     T     |
| F | F |     F     |