# Aula 11 — Arrays e Processamento de Dados

**Linguagem de Programação Java**  
CST em Sistemas para Internet | 2º Período

---

## Slide 1: Abertura

### Aula 11 — Vários Valores sob um Mesmo Nome

- Entrega do Trabalho 2
- Arrays, índices, percursos, buscas e estatísticas
- Trabalho 3: análise de dados — até 1,0 ponto

---

## Slide 2: Objetivos

- Criar e preencher arrays
- Acessar posições com segurança
- Percorrer dados com `for`
- Calcular soma, média, maior e menor
- Realizar busca sequencial
- Passar arrays para métodos

---

## Slide 3: Versões e Revisão

- Exemplos compatíveis com Java 21, 25 e 27
- Arrays fazem parte da linguagem desde suas primeiras versões
- Revisão: `for`, métodos, parâmetros e retorno
- Entrega e breve demonstração do Trabalho 2

---

## Slide 4: O Problema das Variáveis Separadas

```java
double nota1, nota2, nota3, nota4, nota5;
```

Com um array:

```java
double[] notas = new double[5];
```

Um array reúne valores do mesmo tipo e possui tamanho fixo.

---

## Slide 5: Criação e Inicialização

```java
int[] numeros = new int[5];
int[] prontos = {10, 20, 30};
```

- Posições começam em zero
- Novos inteiros começam com zero
- `boolean` começa com `false`
- Referências começam com `null`

---

## Slide 6: Acesso e Limites

```java
numeros[0] = 15;
System.out.println(numeros[0]);
System.out.println(numeros.length);
```

- Último índice: `length - 1`
- Índice inválido gera `ArrayIndexOutOfBoundsException`

---

## Slide 7: Preenchimento

```java
for (int i = 0; i < notas.length; i++) {
    System.out.print("Nota " + (i + 1) + ": ");
    notas[i] = scanner.nextDouble();
}
```

O índice controla simultaneamente a repetição e a posição.

---

## Slide 8: Exibição

```java
for (int i = 0; i < notas.length; i++) {
    System.out.println("Posição " + i + ": " + notas[i]);
}
```

Use o `for` tradicional quando precisar do índice.

---

## Slide 9: `for-each`

```java
double soma = 0;
for (double nota : notas) {
    soma += nota;
}
```

- Lê cada elemento em sequência
- É adequado quando o índice não é necessário
- Alterar a variável local não substitui o elemento primitivo no array

---

## Slide 10: Maior e Menor

```java
double maior = notas[0];
double menor = notas[0];

for (int i = 1; i < notas.length; i++) {
    if (notas[i] > maior) maior = notas[i];
    if (notas[i] < menor) menor = notas[i];
}
```

Antes de acessar `[0]`, garanta que o array não esteja vazio.

---

## Slide 11: Busca Sequencial

```java
private static int buscar(int[] valores, int procurado) {
    for (int i = 0; i < valores.length; i++) {
        if (valores[i] == procurado) return i;
    }
    return -1;
}
```

`-1` representa “não encontrado”.

---

## Slide 12: Arrays em Métodos

```java
private static double calcularMedia(double[] valores) {
    double soma = 0;
    for (double valor : valores) soma += valor;
    return soma / valores.length;
}
```

- O método recebe uma referência ao mesmo array
- Valide tamanho zero antes da divisão

---

## Slide 13: Prática — Temperaturas

Leia sete temperaturas e informe:

- Média
- Maior e menor
- Quantidade acima de 30 graus
- Todas as posições e valores

Separe leitura, cálculos e exibição em métodos.

---

## Slide 14: Trabalho 3 — Análise de Dados

- Equipes de até 4 alunos
- Escolher um contexto: notas, vendas, temperaturas ou pesquisa
- Usar array com pelo menos 8 valores
- Calcular soma, média, maior, menor e uma contagem
- Permitir uma busca
- Organizar cada operação em método
- Entrega na Aula 12

---

## Slide 15: Critérios do Trabalho 3

| Critério | Valor |
|---|---:|
| Preenchimento e percurso corretos |  |
| Estatísticas e busca |  |
| Organização em métodos |  |
| Validações e clareza |  |
| Demonstração |  |
| **Total** | **1,00** |

---

## Slide 16: Erros Comuns

- Usar `<= array.length`
- Confundir índice com valor
- Inicializar maior com zero quando podem existir negativos
- Dividir pelo tamanho sem verificar se é zero
- Criar vários arrays quando um é suficiente

---

## Slide 17: Glossário

| Termo | Significado |
|---|---|
| Array | Estrutura de tamanho fixo com elementos do mesmo tipo |
| Elemento | Valor armazenado em uma posição |
| Índice | Número da posição, iniciado em zero |
| Percurso | Visita aos elementos de uma estrutura |
| Busca sequencial | Comparação do procurado com cada elemento |
| `length` | Quantidade de posições do array |

---

## Slide 18: Referências

- ASCENCIO; CAMPOS. *Fundamentos da programação de computadores*. Pearson, 2012.
- PUGA; RISSETTI. *Lógica de programação e estruturas de dados*. Pearson, 2016.
- Oracle. *Java Language Specification — Arrays*. https://docs.oracle.com/javase/specs/jls/se27/html/jls-10.html

---

## Slide 19: Encerramento

- Arrays organizam vários valores do mesmo tipo
- Índices começam em zero
- Laços permitem processar todos os elementos
- Próxima aula: matrizes e laços aninhados

---

## Slide 20: Perguntas?

### Dúvidas e organização do Trabalho 3
