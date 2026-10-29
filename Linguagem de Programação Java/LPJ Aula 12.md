# Aula 12 — Matrizes e Laços Aninhados em Java

**Linguagem de Programação Java**  
CST em Sistemas para Internet | 2º Período

---

## Slide 1: Abertura

### Aula 12 — Dados em Linhas e Colunas

- Entrega do Trabalho 3
- Matrizes, laços aninhados e processamento tabular
- Práticas desenvolvidas em sala

---

## Slide 2: Objetivos

- Representar dados em linhas e colunas
- Criar e preencher arrays bidimensionais
- Usar laços aninhados
- Calcular totais por linha e coluna
- Buscar e localizar valores
- Dividir o processamento em métodos

---

## Slide 3: Versões e Revisão

- Conteúdo compatível com Java 21, 25 e 27
- Revisão de arrays, índices, `length` e métodos
- Entrega e demonstração do Trabalho 3

---

## Slide 4: O que é uma Matriz?

```java
double[][] notas = new double[3][2];
```

- Primeiro índice: linha
- Segundo índice: coluna
- Exemplo: três alunos e duas avaliações
- Em Java, é um array cujos elementos são outros arrays

---

## Slide 5: Índices

```java
notas[0][0] = 8.5;
notas[0][1] = 7.0;
```

- `notas.length`: quantidade de linhas
- `notas[linha].length`: quantidade de colunas daquela linha
- Índices começam em zero

---

## Slide 6: Preenchimento

```java
for (int linha = 0; linha < notas.length; linha++) {
    for (int coluna = 0; coluna < notas[linha].length; coluna++) {
        System.out.print("Valor: ");
        notas[linha][coluna] = scanner.nextDouble();
    }
}
```

Cada repetição externa percorre uma linha completa.

---

## Slide 7: Exibição Tabular

```java
for (int linha = 0; linha < notas.length; linha++) {
    for (int coluna = 0; coluna < notas[linha].length; coluna++) {
        System.out.printf("%.1f\t", notas[linha][coluna]);
    }
    System.out.println();
}
```

---

## Slide 8: Soma Total

```java
double total = 0;
for (double[] linha : notas) {
    for (double valor : linha) {
        total += valor;
    }
}
```

O `for-each` é conveniente quando as posições não são necessárias.

---

## Slide 9: Total por Linha

```java
for (int linha = 0; linha < notas.length; linha++) {
    double soma = 0;
    for (int coluna = 0; coluna < notas[linha].length; coluna++) {
        soma += notas[linha][coluna];
    }
    System.out.println("Linha " + linha + ": " + soma);
}
```

O acumulador é reiniciado para cada linha.

---

## Slide 10: Total por Coluna

```java
for (int coluna = 0; coluna < notas[0].length; coluna++) {
    double soma = 0;
    for (double[] linha : notas) {
        soma += linha[coluna];
    }
    System.out.println("Coluna " + coluna + ": " + soma);
}
```

Antes de usar `notas[0]`, verifique se existe ao menos uma linha.

---

## Slide 11: Busca com Posição

Ao encontrar um valor, registre ou exiba:

- Valor encontrado
- Linha
- Coluna
- Possíveis repetições

Evite encerrar cedo quando o objetivo for contar todas as ocorrências.

---

## Slide 12: Matriz Retangular e Irregular

```java
int[][] regular = new int[3][4];
int[][] irregular = { {1, 2}, {3, 4, 5} };
```

- Matrizes regulares têm o mesmo número de colunas
- Java também permite linhas com tamanhos diferentes
- Nas atividades, utilizaremos matrizes regulares

---

## Slide 13: Prática 1 — Notas da Turma

Crie uma matriz para 4 alunos e 3 avaliações:

- Preencha as notas
- Exiba a tabela
- Calcule a média de cada aluno
- Calcule a média de cada avaliação
- Informe a maior nota e sua posição

---

## Slide 14: Prática 2 — Ocupação de Sala

Use uma matriz `int` em que:

- `0` representa lugar livre
- `1` representa lugar ocupado
- O usuário escolhe linha e coluna
- O programa valida limites e disponibilidade
- Ao final, exibe o mapa atualizado

---

## Slide 15: Preparação para o Trabalho 4

O trabalho integrador da Aula 14 poderá usar:

- Métodos
- Textos
- Arrays ou matrizes
- Validação
- Arquivos de texto

Hoje, organize uma ideia de relatório que possa ser salvo em arquivo.

---

## Slide 16: Erros Comuns

- Trocar linha por coluna
- Usar o tamanho da linha errada
- Não reiniciar acumuladores
- Acessar a primeira linha de uma matriz vazia
- Criar laços com limites fixos em vez de `length`

---

## Slide 17: Glossário

| Termo | Significado |
|---|---|
| Matriz | Array bidimensional organizado por linhas e colunas |
| Laço aninhado | Repetição executada dentro de outra |
| Linha | Primeiro nível de índice |
| Coluna | Segundo nível de índice |
| Dimensão | Quantidade de índices necessários para acessar um elemento |

---

## Slide 18: Referências

- ASCENCIO; CAMPOS. *Fundamentos da programação de computadores*. Pearson, 2012.
- Oracle. *Java Language Specification — Arrays*. https://docs.oracle.com/javase/specs/jls/se27/html/jls-10.html

---

## Slide 19: Encerramento

- Matrizes representam tabelas
- Laços aninhados percorrem linhas e colunas
- `length` deve definir os limites
- Próxima aula: erros, exceções e entradas seguras

---

## Slide 20: Perguntas?

### Dúvidas e revisão das práticas
