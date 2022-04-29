# Operadores Lógicos

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões. Para isso, aplicamos as operações lógicas E (representado por “&&”) e OU (representado por “||”).

## Tipos

> - && - Utilizado quando desejamos que as duas expressões sejam verdadeiras.

> Para && é necessário que os 2 booleans necessitam possuir mesmo valor TRUE para que seja TRUE

| A | B | RESULTADO |
|---|---|-----------|
| T | T |     T     |
| T | F |     F     |
| F | T |     F     |
| F | F |     F     |


> - || - Utilizado quando precisamos que pelo menos um das expressões seja verdadeira.

> Para || para ser TRUE, apenas um dos valores booleanos necessita ser TRUE.

| A | B | RESULTADO |
|---|---|-----------|
| T | T |     T     |
| T | F |     T     |
| F | T |     T     |
| F | F |     F     |