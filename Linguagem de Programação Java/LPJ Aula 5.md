# Aula 05 — Operadores e Estruturas de Controle em Java

**Linguagem de Programação Java**  
CST em Sistemas para Internet | 2º Período

---

## Slide 1: Abertura

### Aula 05 — Decisões e Repetições

- **Professor:** Ranghetti
- **Temas:**
  - Operadores aritméticos
  - Operadores relacionais e lógicos
  - `if`, `else if` e `else`
  - `switch` e `case`
  - `for`, `while` e `do-while`
- **Prática:** exercícios desenvolvidos em sala
- **Trabalho:** lista com 20 exercícios

---

## Slide 2: Objetivos da Aula

### Ao final desta aula você será capaz de

- Construir expressões aritméticas em Java
- Comparar valores com operadores relacionais
- Combinar condições com operadores lógicos
- Criar decisões com `if`, `else if` e `else`
- Selecionar alternativas com `switch`
- Repetir instruções com `for`, `while` e `do-while`
- Escolher a estrutura de controle adequada para cada problema
- Desenvolver programas interativos usando `Scanner`

---

## Slide 3: Versões de Java Usadas na Aula

| Referência | Situação em agosto de 2026 | Uso nesta aula |
|---|---|---|
| **Java 21** | Versão LTS anterior | Base do projeto e dos exemplos |
| **Java 25** | Versão LTS mais recente | Referência atual da especificação |
| **Java 26** | Versão corrente, não LTS | Versão atual da plataforma |

- Todos os exemplos obrigatórios funcionam em **Java 21, 25 e 26**
- A sintaxe `case ... ->` do `switch` é definitiva desde **Java 14**
- Recursos de preview não serão usados nos exercícios

---

## Slide 4: Agenda

- Revisão da Aula 04
- Expressões e operadores
- Operadores aritméticos
- Operadores relacionais e lógicos
- Decisões com `if`, `else if` e `else`
- Seleção com `switch`
- Repetições com `for`, `while` e `do-while`
- Atividades práticas em sala
- Trabalho em grupo: lista de 20 exercícios
- Glossário e referências

---

## Slide 5: Revisão da Aula 04

### Conhecimentos que usaremos hoje

- Estrutura da classe `Main`
- Método `public static void main(String[] args)`
- Tipos primitivos e variáveis
- Convenções de nomes
- Entrada de dados com `Scanner`
- Saída de dados com `System.out`
- Conversão de entrada em valores numéricos

---

## Slide 6: Programa-base da Aula

```java
package com.unialfa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entrada, processamento e saída

        scanner.close();
    }
}
```

Os exemplos desta aula serão inseridos dentro do método `main`.

---

## Slide 7: Entrada, Processamento e Saída

```text
Entrada → Processamento → Saída
```

Exemplo:

```java
System.out.print("Primeiro número: ");
int primeiro = scanner.nextInt();

System.out.print("Segundo número: ");
int segundo = scanner.nextInt();

int soma = primeiro + segundo;
System.out.println("Resultado: " + soma);
```

---

## Slide 8: O que é uma Expressão?

### Combinação que produz um valor

```java
2 + 3
idade >= 18
aprovado && frequenciaSuficiente
```

Uma expressão pode conter:

- Literais
- Variáveis
- Operadores
- Parênteses

```java
double media = (nota1 + nota2) / 2.0;
```

---

## Slide 9: Categorias de Operadores

| Categoria | Finalidade | Exemplos |
|---|---|---|
| Aritméticos | Realizar cálculos | `+`, `-`, `*`, `/`, `%` |
| Relacionais | Comparar valores | `>`, `<`, `>=`, `<=`, `==`, `!=` |
| Lógicos | Combinar ou inverter condições | `&&`, <code>&#124;&#124;</code>, `!` |
| Atribuição | Armazenar ou atualizar valores | `=`, `+=`, `-=`, `*=`, `/=` |
| Incremento | Aumentar ou diminuir uma unidade | `++`, `--` |

---

## Slide 10: Operadores Aritméticos

| Operador | Operação | Exemplo | Resultado |
|---|---|---|---:|
| `+` | Adição | `10 + 3` | 13 |
| `-` | Subtração | `10 - 3` | 7 |
| `*` | Multiplicação | `10 * 3` | 30 |
| `/` | Divisão | `10 / 3` | 3 |
| `%` | Resto da divisão | `10 % 3` | 1 |

O resultado de `10 / 3` é `3` porque os dois operandos são inteiros.

---

## Slide 11: Divisão Inteira e Divisão Real

```java
int divisaoInteira = 10 / 3;
double divisaoReal = 10.0 / 3.0;

System.out.println(divisaoInteira); // 3
System.out.println(divisaoReal);    // 3.333...
```

### Atenção

```java
double resultado = 10 / 3; // primeiro calcula 3; depois converte para 3.0
```

Para preservar a parte decimal, ao menos um operando deve ser `double` ou `float`.

---

## Slide 12: Operador de Resto `%`

```java
int resto = 10 % 3; // 1
```

Usos comuns:

- Verificar se um número é par
- Testar divisibilidade
- Criar ciclos de valores

```java
boolean par = numero % 2 == 0;
boolean multiploDeCinco = numero % 5 == 0;
```

---

## Slide 13: Precedência de Operadores

```java
int resultado = 2 + 3 * 4; // 14
```

Ordem simplificada:

1. Parênteses
2. Multiplicação, divisão e resto
3. Adição e subtração
4. Comparações
5. Operadores lógicos
6. Atribuição

```java
int resultadoComParenteses = (2 + 3) * 4; // 20
```

Use parênteses quando eles melhorarem a clareza.

---

## Slide 14: Operadores de Atribuição Composta

```java
int total = 10;

total += 5; // total = total + 5
total -= 2; // total = total - 2
total *= 3; // total = total * 3
total /= 2; // total = total / 2
total %= 4; // total = total % 4
```

- Atualizam a própria variável
- Tornam operações acumulativas mais curtas
- O tipo da variável continua sendo respeitado

---

## Slide 15: Incremento e Decremento

```java
int contador = 0;

contador++; // soma 1
contador--; // subtrai 1
```

Formas equivalentes em instruções isoladas:

```java
contador = contador + 1;
contador += 1;
contador++;
```

Nesta aula, prefira usar `++` e `--` como instruções isoladas para evitar ambiguidades.

---

## Slide 16: Atividade Rápida — Operadores Aritméticos

Sem executar o código, determine os resultados:

```java
int a = 17 / 5;
int b = 17 % 5;
double c = 17 / 5.0;
int d = 2 + 3 * 4;
int e = (2 + 3) * 4;
```

Depois:

- Execute o programa
- Compare previsão e resultado
- Explique qualquer diferença

**Tempo sugerido:** 10 minutos.

---

## Slide 17: Operadores Relacionais

| Operador | Significado | Exemplo |
|---|---|---|
| `>` | Maior que | `idade > 18` |
| `<` | Menor que | `nota < 7` |
| `>=` | Maior ou igual | `idade >= 18` |
| `<=` | Menor ou igual | `quantidade <= limite` |
| `==` | Igual | `opcao == 1` |
| `!=` | Diferente | `opcao != 0` |

Toda expressão relacional produz `true` ou `false`.

---

## Slide 18: Atribuição `=` vs. Comparação `==`

```java
int idade = 20;          // atribuição
boolean adulto = idade == 20; // comparação
```

- `=` armazena um valor
- `==` compara valores

### Erro comum

```java
// if (idade = 18) { } // não produz uma condição boolean válida
```

Para comparar números primitivos, use `==` ou outro operador relacional.

---

## Slide 19: Operadores Lógicos

| Operador | Nome | Resultado verdadeiro quando... |
|---|---|---|
| `&&` | E lógico | Todas as condições são verdadeiras |
| <code>&#124;&#124;</code> | OU lógico | Pelo menos uma condição é verdadeira |
| `!` | NÃO lógico | Inverte o valor da condição |

```java
boolean aprovado = media >= 7 && frequencia >= 75;
boolean acesso = administrador || usuarioAtivo;
boolean bloqueado = !usuarioAtivo;
```

---

## Slide 20: Tabela-Verdade do `&&`

| A | B | `A && B` |
|---|---|---|
| `false` | `false` | `false` |
| `false` | `true` | `false` |
| `true` | `false` | `false` |
| `true` | `true` | `true` |

Exemplo:

```java
boolean podeDirigir = idade >= 18 && possuiHabilitacao;
```

As duas condições precisam ser verdadeiras.

---

## Slide 21: Tabela-Verdade do `||`

| A | B | <code>A &#124;&#124; B</code> |
|---|---|---|
| `false` | `false` | `false` |
| `false` | `true` | `true` |
| `true` | `false` | `true` |
| `true` | `true` | `true` |

Exemplo:

```java
boolean possuiDesconto = idade < 12 || idade >= 60;
```

Basta uma condição ser verdadeira.

---

## Slide 22: Operador de Negação `!`

```java
boolean ativo = true;
boolean inativo = !ativo;
```

| Expressão | Resultado |
|---|---|
| `!true` | `false` |
| `!false` | `true` |

Exemplo:

```java
if (!possuiSaldo) {
    System.out.println("Saldo insuficiente");
}
```

---

## Slide 23: Curto-Circuito

### `&&` e `||` podem evitar a segunda avaliação

```java
boolean valido = divisor != 0 && numero / divisor > 2;
```

- Se `divisor != 0` for falso, a divisão não é executada
- Isso evita divisão por zero

```java
boolean permitido = idade >= 18 || possuiAutorizacao;
```

- Se `idade >= 18` for verdadeiro, a segunda condição não precisa ser avaliada

---

## Slide 24: Agrupando Condições

```java
boolean aprovado = media >= 7 && frequencia >= 75;
```

Com mais condições:

```java
boolean acesso = usuarioAtivo
        && (administrador || possuiPermissao);
```

- Parênteses tornam a intenção explícita
- Evite expressões longas demais
- Variáveis booleanas com bons nomes melhoram a leitura

---

## Slide 25: Estruturas de Controle

### Alteram o fluxo normal do programa

```text
Sequência → Decisão → Repetição
```

- Decisão:
  - `if`, `else if`, `else`
  - `switch`
- Repetição:
  - `for`
  - `while`
  - `do-while`

As condições de controle precisam resultar em `boolean`.

---

## Slide 26: Estrutura `if`

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

- Avalia uma condição booleana
- Executa o bloco apenas quando a condição é verdadeira
- Se a condição for falsa, o bloco é ignorado

### Convenção

Use chaves mesmo quando houver apenas uma instrução.

---

## Slide 27: Estrutura `if-else`

```java
if (numero % 2 == 0) {
    System.out.println("Número par");
} else {
    System.out.println("Número ímpar");
}
```

- `if`: caminho da condição verdadeira
- `else`: caminho alternativo
- Apenas um dos blocos será executado

---

## Slide 28: Estrutura `if-else if-else`

```java
if (media >= 9) {
    System.out.println("Conceito A");
} else if (media >= 7) {
    System.out.println("Conceito B");
} else if (media >= 5) {
    System.out.println("Conceito C");
} else {
    System.out.println("Conceito D");
}
```

As condições são testadas de cima para baixo até uma delas ser verdadeira.

---

## Slide 29: A Ordem das Condições Importa

### Ordem incorreta

```java
if (media >= 5) {
    System.out.println("C");
} else if (media >= 7) {
    System.out.println("B");
}
```

Uma média `8` entra no primeiro bloco; o segundo nunca será alcançado.

### Regra prática

Em faixas sobrepostas, teste primeiro a condição mais restritiva.

---

## Slide 30: Condições Compostas no `if`

```java
if (media >= 7 && frequencia >= 75) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

Outra possibilidade:

```java
if (idade < 12 || idade >= 60) {
    System.out.println("Possui desconto");
}
```

---

## Slide 31: `if` Aninhado

```java
if (usuarioAtivo) {
    if (idade >= 18) {
        System.out.println("Acesso permitido");
    } else {
        System.out.println("Idade insuficiente");
    }
} else {
    System.out.println("Usuário inativo");
}
```

- Um `if` pode existir dentro de outro
- Aninhamento excessivo dificulta a leitura
- Condições compostas podem ser mais claras em casos simples

---

## Slide 32: Prática — Classificação de Idade

Crie um programa que:

- Leia a idade com `Scanner`
- Exiba:
  - “Criança” para idade até 11
  - “Adolescente” de 12 a 17
  - “Adulto” de 18 a 59
  - “Idoso” a partir de 60
- Informe “Idade inválida” para valor negativo

**Tempo sugerido:** 15 minutos.

---

## Slide 33: Quando Usar `switch`?

Use `switch` quando:

- Uma expressão é comparada com opções discretas
- As alternativas são valores conhecidos
- Muitos `else if` verificariam igualdade sobre a mesma variável

Exemplos:

- Opção de menu
- Dia da semana
- Código de operação
- Mês do ano

Para faixas numéricas, `if-else if-else` costuma ser mais adequado.

---

## Slide 34: `switch` Tradicional

```java
switch (opcao) {
    case 1:
        System.out.println("Cadastrar");
        break;
    case 2:
        System.out.println("Consultar");
        break;
    case 0:
        System.out.println("Sair");
        break;
    default:
        System.out.println("Opção inválida");
}
```

---

## Slide 35: `case`, `break` e `default`

- `case`: identifica uma alternativa
- `break`: encerra o `switch` tradicional
- `default`: executa quando nenhum `case` corresponde

### Sem `break`

No formato tradicional, a execução pode continuar nos casos seguintes — comportamento chamado **fall-through**.

```java
case 1:
    System.out.println("Um");
    // sem break: continua no próximo caso
```

---

## Slide 36: `switch` com Setas

### Sintaxe definitiva desde Java 14

```java
switch (opcao) {
    case 1 -> System.out.println("Cadastrar");
    case 2 -> System.out.println("Consultar");
    case 0 -> System.out.println("Sair");
    default -> System.out.println("Opção inválida");
}
```

- Não exige `break`
- Não ocorre fall-through entre os casos
- Funciona no Java 21 usado pelo curso

---

## Slide 37: Vários Valores no Mesmo `case`

```java
switch (dia) {
    case 1, 7 -> System.out.println("Fim de semana");
    case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
    default -> System.out.println("Dia inválido");
}
```

- A lista de constantes compartilha o mesmo comportamento
- Disponível na sintaxe moderna de `switch`
- Os valores precisam ser compatíveis com o seletor

---

## Slide 38: Diferenças de Versão no `switch`

| Recurso | Versão |
|---|---|
| `switch` tradicional com `case:` e `break` | Desde as primeiras versões do Java |
| `switch` com `case ... ->` | Definitivo desde Java 14 |
| Expressão `switch` que retorna valor | Definitiva desde Java 14 |
| Pattern matching no `switch` | Definitivo desde Java 21 |
| Suporte ampliado a primitivos em padrões | Preview no Java 25 |

### Nesta aula

Usaremos apenas comparação com constantes, sem pattern matching ou recursos de preview.

---

## Slide 39: Prática — Menu com `switch`

Crie um programa que leia uma opção:

```text
1 - Somar
2 - Subtrair
3 - Multiplicar
4 - Dividir
0 - Sair
```

- Leia dois números quando a operação exigir
- Use `switch`
- Trate divisão por zero
- Informe quando a opção for inválida

**Tempo sugerido:** 20 minutos.

---

## Slide 40: Por que Repetir Código é um Problema?

### Sem estrutura de repetição

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

### Com repetição

```java
for (int numero = 1; numero <= 5; numero++) {
    System.out.println(numero);
}
```

Loops reduzem duplicação e permitem trabalhar com quantidades variáveis.

---

## Slide 41: Estrutura `for`

```java
for (int contador = 1; contador <= 5; contador++) {
    System.out.println(contador);
}
```

Partes:

1. Inicialização: `int contador = 1`
2. Condição: `contador <= 5`
3. Atualização: `contador++`
4. Corpo: instruções repetidas

Use `for` quando a quantidade de repetições é conhecida ou controlada por contador.

---

## Slide 42: Rastreamento do `for`

```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}
```

| Iteração | `i` antes do corpo | Condição | Saída | Atualização |
|---:|---:|---|---:|---|
| 1 | 1 | `true` | 1 | `i = 2` |
| 2 | 2 | `true` | 2 | `i = 3` |
| 3 | 3 | `true` | 3 | `i = 4` |
| fim | 4 | `false` | — | — |

---

## Slide 43: Contagem Crescente e Decrescente

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

Verifique sempre:

- Valor inicial
- Condição de continuidade
- Direção da atualização

---

## Slide 44: Acumulador com `for`

```java
int soma = 0;

for (int numero = 1; numero <= 5; numero++) {
    soma += numero;
}

System.out.println("Soma: " + soma); // 15
```

- `numero`: contador
- `soma`: acumulador
- O acumulador deve ser inicializado antes do loop

---

## Slide 45: Tabuada com `for`

```java
System.out.print("Número: ");
int numero = scanner.nextInt();

for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
    int resultado = numero * multiplicador;
    System.out.println(numero + " x "
            + multiplicador + " = " + resultado);
}
```

O valor do usuário permanece fixo; o multiplicador varia.

---

## Slide 46: Estrutura `while`

```java
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}
```

- Testa a condição antes de cada repetição
- Pode executar zero vezes
- É adequado quando a quantidade de repetições não é conhecida antecipadamente
- A variável da condição precisa ser atualizada

---

## Slide 47: `while` com Sentinela

### Repetir até o usuário informar um valor especial

```java
System.out.print("Número ou 0 para sair: ");
int numero = scanner.nextInt();

while (numero != 0) {
    System.out.println("Dobro: " + numero * 2);

    System.out.print("Número ou 0 para sair: ");
    numero = scanner.nextInt();
}
```

O valor `0` funciona como **sentinela**.

---

## Slide 48: Loop Infinito

```java
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    // contador não é atualizado
}
```

### Causa

A condição permanece verdadeira indefinidamente.

### Prevenção

- Identifique a variável de controle
- Garanta que ela seja atualizada
- Verifique se a condição pode se tornar falsa

---

## Slide 49: Estrutura `do-while`

```java
int contador = 1;

do {
    System.out.println(contador);
    contador++;
} while (contador <= 5);
```

- Executa o corpo antes de testar a condição
- Executa pelo menos uma vez
- Termina com ponto e vírgula após `while (condicao);`

---

## Slide 50: Menu com `do-while`

```java
int opcao;

do {
    System.out.println("1 - Continuar");
    System.out.println("0 - Sair");
    System.out.print("Opção: ");
    opcao = scanner.nextInt();

    if (opcao == 1) {
        System.out.println("Continuando...");
    }
} while (opcao != 0);
```

O menu precisa aparecer ao menos uma vez.

---

## Slide 51: Comparação dos Loops

| Estrutura | Testa a condição | Execução mínima | Uso comum |
|---|---|---:|---|
| `for` | Antes | 0 | Repetições controladas por contador |
| `while` | Antes | 0 | Repetir enquanto uma condição for verdadeira |
| `do-while` | Depois | 1 | Menu ou operação que precisa ocorrer uma vez |

### Pergunta norteadora

Sei quantas vezes repetir ou dependo de uma condição informada durante a execução?

---

## Slide 52: Prática — Escolha do Loop

Escolha a estrutura mais adequada e justifique:

1. Exibir números de 1 a 100
2. Solicitar um PIN até o valor correto ser informado
3. Exibir um menu pelo menos uma vez
4. Calcular a soma dos números de 1 até `N`
5. Ler números até o usuário digitar `0`

Depois, implemente dois dos casos.

**Tempo sugerido:** 20 minutos.

---

## Slide 53: Prática Integrada — Caixa Eletrônico Simplificado

Crie um programa que:

- Inicie com saldo de `1000.0`
- Exiba um menu com `do-while`:
  - 1 — Consultar saldo
  - 2 — Depositar
  - 3 — Sacar
  - 0 — Sair
- Use `switch` para tratar a opção
- Valide depósitos positivos
- Permita saque apenas quando houver saldo suficiente
- Encerre quando o usuário escolher `0`

---

## Slide 54: Prática Integrada — Regras

- Use somente:
  - Classe `Main`
  - Tipos primitivos e variáveis
  - `Scanner` e `System.out`
  - Operadores estudados
  - `if-else`
  - `switch`
  - `do-while`
- Não é necessário usar:
  - Arrays
  - Coleções
  - Classes adicionais
  - Tratamento de exceções

**Tempo sugerido:** 30 minutos.

---

## Slide 55: Erros Comuns

- Usar `=` no lugar de `==`
- Comparar faixas em ordem incorreta
- Esquecer `break` no `switch` tradicional
- Esquecer a atualização do contador
- Colocar `;` após a condição do `if` ou `while`
- Criar condição que nunca se torna falsa
- Dividir inteiros esperando resultado decimal
- Não tratar divisão por zero
- Ler a opção, mas não atualizar seu valor dentro do loop

---

## Slide 56: Checklist das Atividades em Sala

- O programa compila?
- As variáveis possuem nomes claros?
- A entrada é solicitada antes de ser usada?
- Operadores correspondem à regra do problema?
- Condições cobrem todos os casos necessários?
- A ordem de `else if` está correta?
- O `switch` possui `default`?
- O loop pode terminar?
- A saída permite conferir o resultado?

---

## Slide 57: Trabalho — Lista de 20 Exercícios

### Organização

- **Valor:** até 1,0 ponto
- **Equipes:** no máximo 4 alunos
- **Entrega:** na próxima aula
- **Apresentação:** na próxima aula, mediante sorteio
- Cada equipe deve desenvolver os 20 exercícios
- Os exercícios usam somente conteúdos das Aulas 04 e 05

---

## Slide 58: Trabalho — Regras da Entrega

- Cada exercício deve possuir um programa executável
- Usar uma classe `Main` separada por exercício ou organização indicada pelo professor
- Identificar número e título do exercício
- Aplicar convenções Java
- Usar `Scanner` quando houver entrada
- Exibir mensagens claras
- Testar ao menos dois valores relevantes por exercício
- Não utilizar conteúdo ainda não estudado como solução obrigatória

---

## Slide 59: Exercícios 1–4 — Operadores Aritméticos

1. **Quatro operações:** leia dois números e exiba soma, subtração, multiplicação e divisão. Não permita divisão por zero.
2. **Resto da divisão:** leia dois inteiros e exiba o quociente inteiro e o resto da divisão. Valide divisor diferente de zero.
3. **Conversão de temperatura:** leia uma temperatura em Celsius e converta para Fahrenheit usando `F = C * 9 / 5 + 32`.
4. **Área e perímetro:** leia largura e altura de um retângulo e calcule área e perímetro.

---

## Slide 60: Exercícios 5–8 — Decisões Simples

5. **Média de notas:** leia três notas, calcule a média e informe se o aluno está aprovado (`>= 7`) ou reprovado.
6. **Par ou ímpar:** leia um número inteiro e classifique-o usando o operador `%`.
7. **Sinal do número:** informe se um número é positivo, negativo ou zero.
8. **Maior de dois:** leia dois números e informe o maior ou se são iguais.

---

## Slide 61: Exercícios 9–12 — Condições e `switch`

9. **Faixa etária:** classifique a idade como criança, adolescente, adulto ou idoso, usando as faixas apresentadas em aula.
10. **Aprovação completa:** leia média e frequência; aprove somente com média `>= 7` e frequência `>= 75`.
11. **Calculadora com menu:** leia dois números e uma opção (`1` somar, `2` subtrair, `3` multiplicar, `4` dividir); use `switch` e trate divisão por zero.
12. **Dia da semana:** leia um número de 1 a 7 e exiba o dia correspondente; informe valor inválido fora da faixa.

---

## Slide 62: Exercícios 13–16 — Repetição com `for`

13. **Contagem crescente:** leia `N` e exiba os números de 1 até `N`.
14. **Contagem decrescente:** leia `N` e exiba de `N` até 0.
15. **Tabuada:** leia um número e exiba sua tabuada de 1 a 10.
16. **Somatório:** leia `N` e calcule a soma dos números de 1 até `N`.

---

## Slide 63: Exercícios 17–20 — `while` e `do-while`

17. **Contagem de pares:** leia `N` e conte quantos números pares existem entre 1 e `N`.
18. **PIN numérico:** solicite um PIN até o usuário digitar `2026`; ao final, informe quantas tentativas foram realizadas.
19. **Números até zero:** leia números com `while` até o usuário digitar `0`; exiba a soma dos valores informados.
20. **Menu repetitivo:** crie um menu com `do-while` para calcular dobro, triplo ou metade de um número; encerre somente com a opção `0`.

---

## Slide 64: Limites do Trabalho

### Pode usar

- Tipos primitivos e `String`
- Variáveis e constantes
- `Scanner` e `System.out`
- Operadores aritméticos, relacionais e lógicos
- `if`, `else if`, `else` e `switch`
- `for`, `while` e `do-while`

### Não é necessário usar

- Arrays ou coleções
- Classes adicionais
- Herança ou interfaces
- Exceções
- Arquivos ou banco de dados

---

## Slide 65: Critérios de Avaliação do Trabalho

| Critério | Peso |
|---|---:|
| Funcionamento e correção dos 20 exercícios | 0,40 |
| Uso adequado dos conteúdos das Aulas 04 e 05 | 0,20 |
| Clareza, organização e convenções Java | 0,15 |
| Validações solicitadas e qualidade das mensagens | 0,15 |
| Apresentação do exercício sorteado | 0,10 |
| **Total** | **1,00** |

---

## Slide 66: Apresentação na Próxima Aula

- As equipes serão sorteadas
- O professor indicará o exercício a ser apresentado
- A equipe deve:
  - Explicar o problema
  - Demonstrar o programa funcionando
  - Explicar operadores e estruturas utilizadas
  - Informar testes realizados
  - Responder perguntas
- Todos os integrantes devem conhecer os 20 exercícios

---

## Slide 67: Checklist Antes da Entrega

- A equipe possui no máximo 4 integrantes?
- Os 20 exercícios estão identificados?
- Todos compilam e executam?
- Divisões por zero foram tratadas quando necessário?
- Loops possuem condição de término?
- Entradas e saídas são claras?
- O código usa somente conteúdos permitidos?
- Todos conseguem explicar qualquer exercício sorteado?

---

## Slide 68: Glossário — Operadores

| Termo | Significado |
|---|---|
| **Expressão** | Combinação de valores, variáveis e operadores que produz um resultado |
| **Operador aritmético** | Operador usado em cálculos numéricos |
| **Operador relacional** | Operador que compara valores e produz `boolean` |
| **Operador lógico** | Operador que combina ou inverte condições booleanas |
| **Precedência** | Ordem em que operadores são avaliados |
| **Curto-circuito** | Interrupção da avaliação lógica quando o resultado já é conhecido |
| **Acumulador** | Variável que reúne resultados ao longo de repetições |

---

## Slide 69: Glossário — Estruturas de Controle

| Termo | Significado |
|---|---|
| **Condição** | Expressão booleana que controla uma decisão ou repetição |
| **Fluxo de controle** | Ordem em que instruções são executadas |
| **Iteração** | Uma execução do corpo de um loop |
| **Contador** | Variável que acompanha o número ou posição de uma repetição |
| **Sentinela** | Valor especial usado para encerrar uma repetição |
| **Fall-through** | Continuação para o próximo `case` no `switch` tradicional sem `break` |
| **Loop infinito** | Repetição cuja condição de término nunca é alcançada |

---

## Slide 70: Referências Bibliográficas

### Bibliografia do plano de ensino

- DEITEL, P. J.; DEITEL, H. M. *Java: como programar*. 10. ed. São Paulo: Pearson, 2017.
- ASCENCIO, Ana Fernanda Gomes; CAMPOS, Edilene Aparecida Veneruchi de. *Fundamentos da programação de computadores*. 2. ed. São Paulo: Pearson, 2012.
- PUGA, Sandra Gavioli; RISSETTI, Gerson. *Lógica de programação e estruturas de dados, com aplicações em Java*. 3. ed. São Paulo: Pearson, 2016.
- HORSTMANN, C. S.; CORNELL, G. *Core Java*. 8. ed. São Paulo: Pearson, 2009.

---

## Slide 71: Referências Oficiais e Versões

### Documentação consultada

- Oracle. *Java Language Specification — Java SE 25, Chapter 14: Blocks, Statements and Patterns*. Disponível em: https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html
- Oracle. *Java Language Specification — Java SE 25, Chapter 15: Expressions*. Disponível em: https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html
- Oracle. *Switch Expressions and Statements*. Disponível em: https://docs.oracle.com/en/java/javase/25/language/switch-expressions-and-statements.html
- Oracle. *Java Language Changes Summary*. Disponível em: https://docs.oracle.com/en/java/javase/25/language/java-language-changes-summary.html

---

## Slide 72: Encerramento

### O que consolidamos hoje

- Operadores aritméticos, relacionais e lógicos
- Precedência e curto-circuito
- Decisões com `if`, `else if` e `else`
- Seleção de alternativas com `switch`
- Repetições com `for`, `while` e `do-while`
- Contadores, acumuladores e sentinelas
- Escolha da estrutura adequada para cada problema
- Organização do trabalho com 20 exercícios

---

## Slide 73: Perguntas?

### Dúvidas, comentários e feedback da aula

- Quando usar `if` ou `switch`?
- Qual diferença entre `while` e `do-while`?
- Por que uma divisão entre inteiros descarta a parte decimal?
- Como identificar um possível loop infinito?
- Todos os integrantes compreenderam as regras do trabalho?
