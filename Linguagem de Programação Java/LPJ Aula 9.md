# Aula 09 — Métodos e Organização do Programa

**Linguagem de Programação Java**  
CST em Sistemas para Internet | 2º Período

---

## Slide 1: Abertura

### Aula 09 — Dividir para Resolver

- **Professor:** Ranghetti
- **Tema:** métodos estáticos, parâmetros, retorno e escopo
- **Prática:** reorganização de programas já conhecidos
- **Trabalho 1 do 2º bimestre:** programa com menu e métodos — até 1,0 ponto

---

## Slide 2: Contexto do Segundo Bimestre

- Esta é a primeira aula do segundo bimestre
- Na próxima semana haverá Jornada Acadêmica e não teremos aula regular
- Restarão cinco encontros após a Jornada
- O foco continuará em fundamentos de programação
- Não abordaremos POO, GUI ou banco de dados nesta disciplina

---

## Slide 3: Objetivos

- Explicar por que dividir um problema em métodos
- Criar métodos `static` com nomes claros
- Diferenciar parâmetro e argumento
- Usar `void` e valores de retorno
- Reconhecer o escopo de variáveis
- Separar entrada, processamento e saída

---

## Slide 4: Versões de Java

| Referência | Situação em outubro de 2026 | Uso |
|---|---|---|
| Java 21 | LTS anterior | Base dos projetos existentes |
| Java 25 | LTS mais recente | Referência LTS |
| Java 27 | Versão corrente, não LTS | Consulta da API atual |

- Todos os exemplos funcionam em Java 21, 25 e 27
- Não usaremos recursos de preview

---

## Slide 5: Revisão das Aulas 04 e 05

- Classe `Main` e método `main`
- Tipos primitivos, `String` e `Scanner`
- Operadores e expressões
- Decisões e repetições
- Métodos `imprimir` e `somar` apareceram no projeto da Aula 03

---

## Slide 6: Por que Criar Métodos?

Um método representa uma tarefa específica.

- Reduz repetição
- Facilita leitura e teste
- Permite reaproveitar uma solução
- Divide um problema grande em partes menores

```text
main → ler dados → calcular → exibir resultado
```

---

## Slide 7: Estrutura de um Método

```java
private static double calcularMedia(double n1, double n2) {
    return (n1 + n2) / 2.0;
}
```

- `private`: acesso dentro da classe
- `static`: pode ser chamado diretamente pelo `main`
- `double`: tipo devolvido
- `calcularMedia`: nome do método
- `n1` e `n2`: parâmetros

---

## Slide 8: Parâmetros e Argumentos

```java
double media = calcularMedia(8.0, 7.5);
```

- Parâmetros aparecem na declaração do método
- Argumentos aparecem na chamada
- Quantidade, ordem e tipos precisam ser compatíveis
- Nomes devem revelar o papel de cada valor

---

## Slide 9: Métodos `void`

```java
private static void exibirTitulo() {
    System.out.println("=== Calculadora ===");
}
```

- `void` indica ausência de valor de retorno
- O método pode produzir uma saída ou executar uma tarefa
- Não deve ser usado para esconder cálculos que poderiam ser retornados

---

## Slide 10: Métodos com Retorno

```java
private static boolean notaValida(double nota) {
    return nota >= 0 && nota <= 10;
}
```

- `return` encerra o método e devolve um valor
- Todo caminho de um método não `void` precisa retornar valor
- O resultado pode ser armazenado ou usado em uma condição

---

## Slide 11: Escopo

```java
private static int dobrar(int numero) {
    int resultado = numero * 2;
    return resultado;
}
```

- `numero` e `resultado` existem apenas durante a chamada
- Uma variável declarada em um bloco não existe fora dele
- Evite variáveis globais para resolver os exercícios

---

## Slide 12: Entrada, Processamento e Saída

```java
double n1 = lerNota(scanner, "Nota 1: ");
double n2 = lerNota(scanner, "Nota 2: ");
double media = calcularMedia(n1, n2);
exibirResultado(media);
```

- Cada método possui uma responsabilidade
- O `main` coordena a execução
- Cálculo não precisa conhecer detalhes da tela

---

## Slide 13: Exemplo Integrado

```java
private static double somar(double a, double b) { return a + b; }
private static double subtrair(double a, double b) { return a - b; }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("A: ");
    double a = scanner.nextDouble();
    System.out.print("B: ");
    double b = scanner.nextDouble();
    System.out.println("Soma: " + somar(a, b));
    System.out.println("Diferença: " + subtrair(a, b));
    scanner.close();
}
```

---

## Slide 14: Prática 1 — Refatoração

Escolha um exercício da lista anterior e:

1. Identifique entrada, processamento e saída
2. Extraia pelo menos dois métodos
3. Use nomes em `lowerCamelCase`
4. Teste novamente os casos válidos e inválidos

**Tempo sugerido:** 25 minutos.

---

## Slide 15: Prática 2 — Utilitários Numéricos

Crie métodos para:

- Verificar se um número é par
- Retornar o maior entre dois números
- Calcular uma porcentagem
- Validar um valor dentro de um intervalo
- Exibir um menu

O `main` deve demonstrar todos os métodos.

---

## Slide 16: Trabalho 1 — Programa com Menu

- Equipes de até 4 alunos
- Criar um programa com menu repetitivo
- Disponibilizar pelo menos quatro operações
- Cada operação deve ser implementada em um método
- Usar `Scanner`, decisões e repetições
- Entrega e demonstração na Aula 10

---

## Slide 17: Critérios do Trabalho 1

| Critério | Valor |
|---|---:|
| Funcionamento e atendimento ao enunciado |  |
| Uso correto de métodos, parâmetros e retorno |  |
| Organização, nomes e formatação |  |
| Testes e validações |  |
| Demonstração e explicação |  |
| **Total** | **1,00** |

---

## Slide 18: Erros Comuns

- Criar um método que faz muitas tarefas
- Imprimir dentro de todo método de cálculo
- Ignorar o valor retornado
- Confundir parâmetro com argumento
- Declarar o método dentro do `main`
- Esquecer `static` nos métodos chamados pelo `main`

---

## Slide 19: Glossário

| Termo | Significado |
|---|---|
| Método | Bloco nomeado que executa uma tarefa |
| Parâmetro | Variável declarada pelo método para receber um valor |
| Argumento | Valor fornecido durante a chamada |
| Retorno | Valor devolvido por um método |
| Escopo | Região na qual um nome pode ser utilizado |
| Refatoração | Melhoria da estrutura sem alterar o comportamento esperado |

---

## Slide 20: Referências

- DEITEL, P. J.; DEITEL, H. M. *Java: como programar*. Pearson, 2017.
- PUGA, S. G.; RISSETTI, G. *Lógica de programação e estruturas de dados, com aplicações em Java*. Pearson, 2016.
- Oracle. *Java Language Specification — Methods*. https://docs.oracle.com/javase/specs/
- Oracle. *Java SE 27 API Specification*. https://docs.oracle.com/en/java/javase/27/docs/api/

---

## Slide 21: Encerramento

- Métodos dividem o problema em partes compreensíveis
- Parâmetros levam dados ao método
- `return` devolve resultados
- O escopo limita onde cada variável existe
- Próxima aula: `String`, `char` e conversões

---

## Slide 22: Perguntas?

### Dúvidas, comentários e organização do Trabalho 1
