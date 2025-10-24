# TDE 3 - Ordenação

Os algoritmos de Comb sort, Gnome sort e Bucket sort, além dos implementados em sala (Bubble sort, Selection sort e Cocktail sort) foram implementados e comparados com base nos seguintes vetores:

Vetor 1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

Vetor 2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

Vetor 3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

Vale notar que o bucket sort foi implementado com 1/4 do tamanho do vetor para tender a ser mais equilibrado em todos os tipos de vetores.

Caso queira, o arquivo resultadosSorting.csv contém todos os resultados juntos.

## Vetor 1 (Aleatório)

### Ranking por Menor Número de Trocas

| Tipo de Ordenação   |   Trocas |
|:--------------------|---------:|
| Selection Sort      |       18 |
| CombSort            |       22 |
| Bucket Sort         |       22 |
| Bubble Sort         |       78 |
| Cocktail Sort       |       78 |
| Gnome Sort          |       78 |

### Ranking por Menor Número de Iterações

| Tipo de Ordenação   |   Iterações |
|:--------------------|------------:|
| Bucket Sort         |          32 |
| CombSort            |         129 |
| Cocktail Sort       |         154 |
| Gnome Sort          |         176 |
| Bubble Sort         |         180 |
| Selection Sort      |         190 |

Melhor em trocas: Selection Sort

Melhor em iterações: Bucket Sort

---

## Vetor 2 (Já ordenado)

### Ranking por Menor Número de Trocas

| Tipo de Ordenação   |   Trocas |
|:--------------------|---------:|
| Bubble Sort         |        0 |
| Selection Sort      |        0 |
| Cocktail Sort       |        0 |
| CombSort            |        0 |
| Gnome Sort          |        0 |
| Bucket Sort         |        0 |

### Ranking por Menor Número de Iterações

| Tipo de Ordenação   |   Iterações |
|:--------------------|------------:|
| Bubble Sort         |          19 |
| Cocktail Sort       |          19 |
| Gnome Sort          |          20 |
| Bucket Sort         |          32 |
| CombSort            |         110 |
| Selection Sort      |         190 |

Melhor em trocas: Bubble Sort

Melhor em iterações: Bubble Sort

---

## Vetor 3 (Ordem inversa)

### Ranking por Menor Número de Trocas

| Tipo de Ordenação   |   Trocas |
|:--------------------|---------:|
| Selection Sort      |       10 |
| CombSort            |       18 |
| Bucket Sort         |       63 |
| Bubble Sort         |      190 |
| Cocktail Sort       |      190 |
| Gnome Sort          |      190 |

### Ranking por Menor Número de Iterações

| Tipo de Ordenação   |   Iterações |
|:--------------------|------------:|
| Bucket Sort         |          63 |
| CombSort            |         129 |
| Bubble Sort         |         190 |
| Selection Sort      |         190 |
| Cocktail Sort       |         190 |
| Gnome Sort          |         400 |

Melhor em trocas: Selection Sort

Melhor em iterações: Bucket Sort


