# Aula 14 — Revisão e Trabalho Final

**Linguagem de Programação Java**  
CST em Sistemas para Internet | 2º Período

---

## Slide 1: Abertura

### Aula 14 — Consolidação dos Conteúdos

- Revisão orientada
- Resolução de dúvidas
- Desenvolvimento e entrega do Trabalho 4 final
- Valor: até 1,0 ponto

---

## Slide 2: Objetivos

- Retomar os conceitos fundamentais da disciplina
- Relacionar estruturas de controle, métodos, arrays e textos
- Revisar validação, exceções e arquivos
- Planejar uma solução antes da implementação
- Desenvolver, testar e explicar um programa completo

---

## Slide 3: Roteiro da Aula

1. Revisão dos principais conceitos
2. Questões de fixação
3. Apresentação do Trabalho 4
4. Planejamento em equipe
5. Desenvolvimento e testes
6. Demonstração e entrega

---

## Slide 4: Revisão — Fundamentos

- Classe `Main` e método `main`
- Convenções de nomes
- Tipos primitivos e variáveis
- Entrada com `Scanner`
- Saída com `System.out`

### Pergunta de revisão

Quais tipos são adequados para armazenar idade, preço e uma resposta de verdadeiro ou falso?

### Resposta com código

```java
int idade = 20;
double preco = 49.90;
boolean pagamentoConfirmado = true;

System.out.println("Idade: " + idade);
System.out.println("Preço: R$ " + preco);
System.out.println("Pagamento confirmado? " + pagamentoConfirmado);
```

- `int`: números inteiros, como idade
- `double`: valores com casas decimais, como preço
- `boolean`: apenas `true` ou `false`

---

## Slide 5: Revisão — Operadores e Decisões

- Operadores aritméticos, relacionais e lógicos
- `if`, `else if` e `else`
- `switch`

### Pergunta de revisão

Quando um `switch` torna um menu mais legível que uma sequência de `if-else`?

### Resposta com código

Quando uma única variável é comparada com várias opções fixas, como os números de um menu:

```java
int opcao = 2;

switch (opcao) {
    case 1:
        System.out.println("Cadastrar livro");
        break;
    case 2:
        System.out.println("Listar livros");
        break;
    case 3:
        System.out.println("Buscar livro");
        break;
    case 0:
        System.out.println("Sair");
        break;
    default:
        System.out.println("Opção inválida");
}
```

- O exemplo utiliza a sintaxe tradicional, compatível com Java 8 ou superior
- Para intervalos e condições compostas, `if-else` costuma ser mais adequado

---

## Slide 6: Revisão — Repetição

| Estrutura | Uso comum |
|---|---|
| `for` | Quantidade conhecida de repetições |
| `while` | Repetir enquanto uma condição for verdadeira |
| `do-while` | Executar ao menos uma vez |

### Pergunta de revisão

Qual estrutura é apropriada para repetir um menu até o usuário escolher sair?

### Resposta com código

O `do-while` é adequado porque o menu precisa aparecer pelo menos uma vez:

```java
Scanner scanner = new Scanner(System.in);
int opcao;

do {
    System.out.println("1 - Cadastrar");
    System.out.println("2 - Listar");
    System.out.println("0 - Sair");
    System.out.print("Escolha: ");
    opcao = scanner.nextInt();

    System.out.println("Opção escolhida: " + opcao);
} while (opcao != 0);

scanner.close();
```

---

## Slide 7: Revisão — Métodos

- Dividem o problema em tarefas menores
- Podem receber parâmetros
- Podem retornar um valor
- Evitam repetição de código
- Devem possuir nomes claros

```java
private static double calcularMedia(double soma, int quantidade) {
    return soma / quantidade;
}
```

---

## Slide 8: Revisão — `String`

- `length()` e `charAt()`
- `equals()` e `equalsIgnoreCase()`
- `contains()`
- `toLowerCase()` e `toUpperCase()`
- `substring()`

### Atenção

- Compare conteúdo com `equals`, não com `==`
- A primeira posição de uma `String` é zero

---

## Slide 9: Revisão — Arrays e Matrizes

- Armazenam valores do mesmo tipo
- O tamanho é definido na criação
- O primeiro índice é zero
- `length` informa a quantidade de posições
- Matrizes organizam dados em linhas e colunas
- Laços facilitam o processamento

### Pergunta de revisão

Quais são os índices válidos de um array com cinco posições?

### Resposta com código

Os índices válidos são `0`, `1`, `2`, `3` e `4`:

```java
int[] valores = {10, 20, 30, 40, 50};

for (int indice = 0; indice < valores.length; indice++) {
    System.out.println(
        "Índice " + indice + ": " + valores[indice]
    );
}
```

- `valores.length` é igual a `5`
- O último índice é sempre `length - 1`
- Acessar `valores[5]` causaria `ArrayIndexOutOfBoundsException`

---

## Slide 10: Revisão — Validação e Exceções

- Validação verifica regras do programa
- Exceção representa uma falha durante a execução
- `try` envolve a operação que pode falhar
- `catch` fornece uma resposta controlada

### Exemplo

- `"abc"` convertido para inteiro: `NumberFormatException`
- Nota `15`: conversão válida, mas regra inválida

---

## Slide 11: Revisão — Arquivos de Texto

```java
Path caminho = Path.of("relatorio.txt");

try {
    Files.writeString(caminho, relatorio);
    String conteudo = Files.readString(caminho);
    System.out.println(conteudo);
} catch (IOException erro) {
    System.out.println("Falha no arquivo: " + erro.getMessage());
}
```

- `Path` representa o caminho
- `Files` realiza leitura e escrita
- `IOException` trata falhas de entrada e saída

---

## Slide 12: Desafio de Revisão

Explique como construir um programa que:

1. Leia cinco notas
2. Rejeite textos e valores fora do intervalo de 0 a 10
3. Armazene as notas em um array
4. Calcule média, maior e menor
5. Organize os cálculos em métodos
6. Salve os resultados em um arquivo

Antes de programar, identifique variáveis, métodos e falhas que precisam ser tratadas.

---

## Slide 13: Trabalho 4 — Desafio Final

Em equipes de até 4 alunos, crie um programa que:

1. Leia de 5 a 10 valores de um contexto escolhido
2. Armazene os dados em array ou matriz
3. Valide todas as entradas
4. Calcule pelo menos quatro informações
5. Organize a solução em métodos
6. Gere um relatório textual
7. Salve e leia o relatório em arquivo `.txt`

---

## Slide 14: Contextos Sugeridos

- Notas de uma turma
- Vendas de uma semana
- Temperaturas de cidades
- Pesquisa de satisfação
- Controle de despesas
- Pontuação de jogadores
- Consumo de energia
- Tempos de atendimento

Cada equipe deve informar o contexto e as regras adotadas.

---

## Slide 15: Requisitos Obrigatórios

- Uma classe `Main`
- Métodos `static` com responsabilidades claras
- Entrada de dados pelo teclado
- Validação das regras do contexto
- Tratamento de entradas numéricas inválidas
- Uso de array ou matriz
- Estruturas de decisão e repetição
- Escrita e leitura de arquivo `.txt`
- Tratamento de `IOException`

---

## Slide 16: Limites Técnicos

### Pode usar

- Conteúdos estudados durante a disciplina
- Uma classe `Main` e métodos `static`
- Tipos primitivos, `String`, arrays e matrizes
- `Scanner`, `Path`, `Files` e `IOException`

### Não usar

- Classes de domínio ou conceitos de POO
- Coleções, streams, lambdas ou recursão
- Banco de dados, GUI, rede ou frameworks
- Recursos que a equipe não consiga explicar

---

## Slide 17: Planejamento da Solução

Antes de programar, registre:

1. Contexto escolhido
2. Dados de entrada
3. Regras de validação
4. Estrutura do array ou matriz
5. Cálculos esperados
6. Métodos necessários
7. Estrutura do relatório
8. Possíveis erros e tratamentos

---

## Slide 18: Critérios do Trabalho 4

| Critério | Valor |
|---|---:|
| Funcionamento e atendimento ao enunciado |  |
| Uso correto de métodos, parâmetros e retorno |  |
| Organização, nomes e formatação |  |
| Testes, validações e tratamento de exceções |  |
| Arquivo, demonstração e explicação |  |
| **Total** | **1,00** |

---

## Slide 19: Casos Mínimos de Teste

- Entrada válida
- Texto onde era esperado número
- Valor fora do intervalo definido
- Valores iguais
- Menor e maior valor possíveis
- Arquivo criado com sucesso
- Conteúdo lido após a gravação

---

## Slide 20: Checklist da Entrega

- O projeto compila e executa?
- Entradas inválidas são tratadas?
- Os métodos possuem tarefas claras?
- O array ou a matriz é percorrido corretamente?
- Os cálculos foram conferidos?
- O arquivo é criado e pode ser lido?
- O relatório possui títulos, rótulos e unidades?
- Todos os integrantes conseguem explicar a solução?

---

## Slide 21: Entrega e Demonstração

- Desenvolvimento e entrega nesta Aula 14
- Equipes de até 4 alunos
- Um projeto por equipe
- Todos os integrantes devem estar identificados
- A equipe deve demonstrar o programa em execução
- O professor poderá solicitar um caso de teste
- Valor: até 1,0 ponto

---

## Slide 22: Glossário de Revisão

| Termo | Significado |
|---|---|
| Validação | Verificação de uma regra antes de aceitar o dado |
| Método | Bloco reutilizável que executa uma tarefa |
| Parâmetro | Valor recebido por um método |
| Retorno | Resultado devolvido por um método |
| Array | Estrutura fixa com elementos do mesmo tipo |
| Exceção | Falha que altera o fluxo normal |
| Persistência | Conservação de dados fora da memória |

---

## Slide 23: Referências

- DEITEL; DEITEL. *Java: como programar*. Pearson, 2017.
- ASCENCIO; CAMPOS. *Fundamentos da programação de computadores*. Pearson, 2012.
- PUGA; RISSETTI. *Lógica de programação e estruturas de dados*. Pearson, 2016.
- Oracle. *Java Documentation*. https://docs.oracle.com/en/java/

---

## Slide 24: Encerramento do Percurso

- Fundamentos da plataforma Java
- Tipos, entrada, operadores e estruturas de controle
- Métodos e organização
- Textos, arrays e matrizes
- Validação e exceções
- Leitura e escrita de arquivos
- Planejamento, testes e explicação de soluções

---

## Slide 25: Perguntas e Entrega

### Desenvolvimento, demonstração e envio do Trabalho 4 final

