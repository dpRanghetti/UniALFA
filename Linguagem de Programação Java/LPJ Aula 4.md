# Aula 04 — Fundamentos da Sintaxe Java e Entrada de Dados

**Linguagem de Programação Java**  
CST em Sistemas para Internet | 2º Período

---

## Slide 1: Abertura

### Aula 04 — Da Classe `Main` à Entrada de Dados

- **Professor:** Ranghetti
- **Revisão:** Aulas 01, 02 e 03
- **Projeto-base:** `projeto-aula3`
- **Temas:**
  - Elementos da classe `Main`
  - Convenções Java
  - Palavras reservadas e tipos primitivos
  - Entrada e saída com `Scanner` e `System`

---

## Slide 2: Objetivos da Aula

### Ao final desta aula você será capaz de

- Explicar cada elemento do projeto da Aula 03
- Identificar o ponto de entrada de uma aplicação Java
- Aplicar convenções de nomes e formatação
- Reconhecer palavras reservadas e palavras-chave contextuais
- Declarar e utilizar os oito tipos primitivos
- Diferenciar tipos primitivos e tipos por referência
- Exibir textos e valores no console
- Ler textos e números com a classe `Scanner`

---

## Slide 3: Versões de Java Usadas na Aula

| Referência | Situação em agosto de 2026 | Uso nesta aula |
|---|---|---|
| **Java 21** | Versão LTS anterior | Configurada no projeto da Aula 03 |
| **Java 25** | Versão LTS mais recente | Referência principal da especificação e da API |
| **Java 26** | Versão atual, não LTS | Versão corrente da plataforma |

- **LTS:** Long-Term Support — versão com suporte de longo prazo
- Os exemplos tradicionais desta aula funcionam em **Java 21, 25 e 26**
- Quando houver diferença de versão, ela será indicada no próprio slide

---

## Slide 4: Agenda

- Revisão das três aulas anteriores
- Leitura guiada do arquivo `Main.java`
- Convenções de código Java
- Identificadores e palavras reservadas
- Tipos primitivos e variáveis
- Saída de dados com `System.out`
- Entrada de dados com `Scanner`
- Exercício prático integrado
- Glossário e referências

---

## Slide 5: Revisão da Aula 01

### História e relevância do Java

- Projeto iniciado na Sun Microsystems em 1991
- James Gosling é reconhecido como criador da linguagem
- Nomes anteriores: GreenTalk e Oak
- Java foi lançado publicamente em 1995
- Popularização com aplicações para a internet
- Aquisição da Sun Microsystems pela Oracle em 2010

### Ideia central

Java foi projetado com forte preocupação com portabilidade entre plataformas.

---

## Slide 6: Revisão da Aula 01 — WORA

### Write Once, Run Anywhere

```text
Código-fonte (.java)
        ↓ javac
Bytecode (.class)
        ↓ JVM da plataforma
Programa em execução
```

- O compilador produz bytecode
- A JVM executa o bytecode na plataforma correspondente
- Portabilidade não significa ausência de diferenças de ambiente

---

## Slide 7: Revisão da Aula 02 — JDK, JRE e JVM

| Elemento | Função |
|---|---|
| **JVM** | Executa o bytecode e gerencia a execução |
| **JRE** | Ambiente necessário para executar aplicações Java |
| **JDK** | Kit de desenvolvimento: compilador, ferramentas e runtime |

### Ferramentas importantes

- `javac`: compila código-fonte
- `java`: inicia uma aplicação
- `javadoc`: gera documentação de API
- IDE: auxilia edição, execução, depuração e organização do projeto

---

## Slide 8: Revisão da Aula 02 — Ambiente do Projeto

### Configuração encontrada no projeto da Aula 03

```text
Language level: JDK 21
JDK: GraalVM JDK 21
IDE: IntelliJ IDEA
```

- **JDK 21 é LTS** e continua adequado para a disciplina
- **Java 25 é a LTS mais recente** em agosto de 2026
- Não é necessário migrar o projeto para aprender os fundamentos desta aula

---

## Slide 9: Revisão da Aula 03 — Estrutura do Projeto

```text
projeto-aula3/
├── src/
│   └── com/
│       └── unialfa/
│           └── Main.java
├── out/
├── .idea/
└── projeto-aula3.iml
```

- `src`: código-fonte
- `out`: arquivos compilados gerados pela IDE
- `.idea` e `.iml`: configurações do IntelliJ IDEA
- O pacote `com.unialfa` corresponde à estrutura de diretórios

---

## Slide 10: Revisão da Aula 03 — Comportamentos do Programa

O projeto demonstra:

- Declaração de pacote e classe
- Método `main`
- Argumentos de linha de comando
- Chamada de métodos
- Criação e preenchimento de um array de inteiros
- Retorno de um método
- Saída de texto no console

### Resultado esperado

O programa imprime uma saudação e a soma dos valores `2` e `3`.

---

## Slide 11: Código da Aula 03

```java
package com.unialfa;

public class Main {
    public static void main(String[] args) {
        imprimir("Olá UniALFA! " + args[2]);

        int[] numeros = new int[2];
        numeros[0] = 2;
        numeros[1] = 3;

        int total = somar(numeros);
        imprimir("O resultado da soma é: " + total);
    }
}
```

**Versão:** sintaxe compatível com Java 21, 25 e 26.

---

## Slide 12: Atenção ao `args[2]`

```java
imprimir("Olá UniALFA! " + args[2]);
```

- Arrays começam no índice `0`
- `args[2]` representa o **terceiro argumento**
- Sem três argumentos, ocorre `ArrayIndexOutOfBoundsException`

### Forma segura

```java
String nome = args.length >= 3 ? args[2] : "Aluno";
imprimir("Olá UniALFA! " + nome);
```

---

## Slide 13: Elemento 1 — `package`

```java
package com.unialfa;
```

- Declara o pacote ao qual a classe pertence
- Organiza classes e evita conflitos de nomes
- Deve aparecer antes de imports e declarações de tipos
- Termina com ponto e vírgula
- No projeto, corresponde ao caminho:

```text
src/com/unialfa/Main.java
```

---

## Slide 14: Elemento 2 — `public class Main`

```java
public class Main {
```

- `public`: classe acessível por código de outros pacotes
- `class`: declara uma classe
- `Main`: nome da classe
- `{`: inicia o corpo da classe
- Uma classe pública de nível superior deve estar em arquivo de mesmo nome:

```text
Classe: Main
Arquivo: Main.java
```

---

## Slide 15: Elemento 3 — Método `main`

```java
public static void main(String[] args) {
```

No modelo clássico:

- `public`: o launcher pode acessar o método
- `static`: não exige criar um objeto `Main`
- `void`: não retorna um valor
- `main`: nome reconhecido como ponto de entrada
- `String[] args`: recebe argumentos da linha de comando

---

## Slide 16: Diferença de Versão — Formas do `main`

### Forma clássica adotada no curso

```java
public static void main(String[] args) {
    System.out.println("Olá!");
}
```

### Desde Java 25

Arquivos-fonte compactos e métodos `main` de instância permitem, em programas simples:

```java
void main() {
    System.out.println("Olá!");
}
```

**Decisão didática:** continuaremos com a forma clássica do projeto Java 21 para tornar classe, modificadores e argumentos explícitos.

---

## Slide 17: Elemento 4 — Parâmetro `String[] args`

```java
String[] args
```

- `String[]`: array de textos
- `args`: nome convencional do parâmetro
- Cada posição contém um argumento fornecido ao executar o programa

```bash
java com.unialfa.Main um dois Ranghetti
```

```text
args[0] = "um"
args[1] = "dois"
args[2] = "Ranghetti"
```

---

## Slide 18: Elemento 5 — Blocos e Chaves

```java
public class Main {              // corpo da classe
    public static void main(String[] args) { // corpo do método
        // instruções
    }
}
```

- Chaves `{ }` delimitam blocos de código
- Blocos definem o escopo de variáveis
- A indentação não altera a execução, mas torna a estrutura visível
- Chaves desequilibradas causam erro de compilação

---

## Slide 19: Elemento 6 — Instruções e `;`

```java
int total = somar(numeros);
imprimir("Resultado: " + total);
```

- Muitas instruções Java terminam com ponto e vírgula
- Declarações de classe e método não recebem `;` após o bloco
- O operador `=` realiza atribuição
- O operador `+` soma números ou concatena textos

```java
int soma = 2 + 3;             // 5
String texto = "Total: " + 5; // "Total: 5"
```

---

## Slide 20: Elemento 7 — Array de Inteiros

```java
int[] numeros = new int[2];
numeros[0] = 2;
numeros[1] = 3;
```

- `int[]`: tipo “array de inteiros”
- `numeros`: variável que referencia o array
- `new int[2]`: cria duas posições
- Índices válidos: `0` e `1`
- Elementos de um novo `int[]` começam com valor `0`

### Convenção preferida

Use `int[] numeros`, embora `int numeros[]` também seja aceito pela linguagem.

---

## Slide 21: Elemento 8 — Chamada de Método

```java
int total = somar(numeros);
```

- `somar`: método chamado
- `numeros`: argumento enviado
- O valor retornado é armazenado em `total`

```java
private static int somar(int[] numeros) {
    return numeros[0] + numeros[1];
}
```

- O parâmetro recebe a referência do array
- `return` encerra o método e devolve um `int`

---

## Slide 22: Elemento 9 — Modificadores dos Métodos

```java
private static void imprimir(String conteudo) { ... }
private static int somar(int[] numeros) { ... }
```

- `private`: acesso restrito à própria classe
- `static`: método pertence à classe, não a uma instância
- `void`: não devolve valor
- `int`: método deve devolver um valor compatível com `int`

### Por que `static`?

O método `main` é estático e chama esses métodos diretamente, sem criar um objeto.

---

## Slide 23: Assinatura de um Método

```java
private static int somar(int[] numeros)
```

Elementos da declaração:

- Modificador de acesso: `private`
- Modificador: `static`
- Tipo de retorno: `int`
- Nome: `somar`
- Lista de parâmetros: `int[] numeros`

### Assinatura para sobrecarga

Em Java, considera-se o nome do método e os tipos dos parâmetros; o tipo de retorno sozinho não diferencia métodos.

---

## Slide 24: O que é Convenção Java?

### Regras sociais para tornar o código previsível

- Convenções não são, em geral, exigências do compilador
- Facilitam leitura, revisão e manutenção
- Reduzem discussões repetidas na equipe
- Devem ser aplicadas de modo consistente

### Diferença importante

- **Sintaxe:** precisa ser obedecida para compilar
- **Convenção:** padrão recomendado para comunicar intenção

---

## Slide 25: Convenção — Pacotes

### Nomes em letras minúsculas

```java
package com.unialfa;
package br.com.empresa.financeiro;
```

- Use domínio invertido quando aplicável
- Evite letras maiúsculas, espaços, hífens e acentos
- Escolha nomes que representem organização e finalidade

### Evite

```java
package Com.UniALFA;
package meu-pacote;
```

---

## Slide 26: Convenção — Classes e Interfaces

### UpperCamelCase ou PascalCase

```java
class Cliente { }
class PedidoService { }
interface RepositorioDePedidos { }
```

- Cada palavra começa com letra maiúscula
- Use substantivos que representem responsabilidades
- Evite abreviações obscuras

```text
Preferir: CalculadoraDeFrete
Evitar: calcFreteClass
```

---

## Slide 27: Convenção — Métodos e Variáveis

### lowerCamelCase

```java
int quantidadeDeAlunos;
String nomeCompleto;

void imprimirRelatorio() { }
int calcularTotal() { return 0; }
```

- Comece com letra minúscula
- Métodos normalmente usam verbos
- Variáveis devem revelar o significado do valor
- Evite nomes genéricos como `x`, `coisa` e `valor1`, salvo em contextos muito curtos

---

## Slide 28: Convenção — Constantes

### UPPER_SNAKE_CASE

```java
private static final int IDADE_MINIMA = 18;
private static final double TAXA_JUROS = 0.015;
```

- Letras maiúsculas
- Palavras separadas por `_`
- Geralmente declaradas com `static final`
- O nome deve representar um valor estável e significativo

---

## Slide 29: Convenção — Formatação

- Uma instrução por linha
- Chaves e indentação consistentes
- Espaço após vírgulas e ao redor de operadores
- Linhas curtas o suficiente para leitura
- Blocos pequenos e objetivos
- Remover código comentado sem utilidade

```java
if (idade >= IDADE_MINIMA) {
    System.out.println("Acesso permitido");
}
```

**Padrão do curso:** indentação com quatro espaços.

---

## Slide 30: Identificadores

### Nomes criados pelo programador

São identificadores:

- Nomes de classes
- Métodos
- Variáveis
- Parâmetros
- Pacotes

### Regras básicas

- Podem conter letras, dígitos, `_` e `$`
- Não podem começar com dígito
- Não podem ser palavras reservadas
- Java diferencia maiúsculas e minúsculas

```java
int total;  // diferente de Total e TOTAL
```

---

## Slide 31: Palavras Reservadas

### Termos com significado definido pela linguagem

Exemplos usados no projeto:

```text
package  public  class  static  void
private  int  new  return
```

Outros exemplos:

```text
if  else  switch  for  while  do
try  catch  finally  throw  throws
extends  implements  interface  enum
```

Uma palavra reservada não pode ser usada como nome de variável, método ou classe.

---

## Slide 32: Categorias de Palavras da Linguagem

### Java SE 25

- **Palavras reservadas:** sempre possuem tratamento especial
- **Palavras-chave contextuais:** têm significado especial apenas em contextos específicos
- **Literais reservados:** `true`, `false` e `null` não são palavras-chave

Exemplos contextuais:

```text
var  record  sealed  non-sealed  permits
yield  module  requires  exports  when
```

**Versão:** a classificação pode variar ao comparar versões antigas da especificação.

---

## Slide 33: Diferenças de Versão — Palavras Especiais

| Termo | Situação | Versão relevante |
|---|---|---|
| `_` | Palavra reservada; não pode ser identificador isolado | Java 9+ |
| `var` | Palavra-chave contextual para variável local | Java 10+ |
| `yield` | Contextual em expressão `switch` | Java 14+ |
| `record` | Contextual na declaração de records | Java 16+ |
| `sealed`, `permits`, `non-sealed` | Contextuais em hierarquias seladas | Java 17+ |
| `when` | Contextual em guardas de padrões | Java 21+ |

O projeto da Aula 03 usa Java 21 e reconhece todos esses termos conforme seus contextos.

---

## Slide 34: Palavras Reservadas Curiosas

- `const` e `goto` são reservadas, mas não implementam comandos Java
- `strictfp` continua reservada
- Desde Java 17, expressões de ponto flutuante já são avaliadas de forma estrita; `strictfp` deixou de alterar esse comportamento
- `true` e `false` são literais booleanos
- `null` é o literal nulo para tipos por referência

### Regra prática

Consulte a especificação da versão usada quando um identificador gerar erro inesperado.

---

## Slide 35: Tipos em Java

### Duas grandes categorias

```text
Tipos
├── Primitivos
│   ├── boolean
│   ├── char
│   └── numéricos
└── Referência
    ├── classes
    ├── interfaces
    └── arrays
```

- Primitivos armazenam valores definidos pela linguagem
- Referências apontam para objetos ou arrays
- `String` é uma classe, não um tipo primitivo

---

## Slide 36: Os Oito Tipos Primitivos

| Categoria | Tipo | Tamanho definido | Exemplo |
|---|---|---:|---|
| Inteiro | `byte` | 8 bits | `byte nivel = 10;` |
| Inteiro | `short` | 16 bits | `short ano = 2026;` |
| Inteiro | `int` | 32 bits | `int alunos = 35;` |
| Inteiro | `long` | 64 bits | `long habitantes = 8_000_000_000L;` |
| Real | `float` | 32 bits | `float taxa = 1.5F;` |
| Real | `double` | 64 bits | `double preco = 19.90;` |
| Caractere | `char` | 16 bits | `char conceito = 'A';` |
| Lógico | `boolean` | tamanho não fixado pela JLS | `boolean ativo = true;` |

---

## Slide 37: Tipos Inteiros

| Tipo | Menor valor | Maior valor |
|---|---:|---:|
| `byte` | -128 | 127 |
| `short` | -32.768 | 32.767 |
| `int` | -2³¹ | 2³¹ - 1 |
| `long` | -2⁶³ | 2⁶³ - 1 |

```java
int quantidade = 42;
long populacaoMundial = 8_000_000_000L;
```

- Literais inteiros são `int` por padrão
- Use `L` para um literal `long` que não cabe em `int`
- `_` pode separar dígitos para melhorar a leitura

---

## Slide 38: Tipos de Ponto Flutuante

```java
float temperatura = 36.5F;
double preco = 199.90;
```

- `float`: precisão simples, 32 bits
- `double`: precisão dupla, 64 bits
- Literais decimais são `double` por padrão
- Use `F` ou `f` para indicar `float`
- `float` e `double` seguem o padrão IEEE 754

### Atenção

Valores monetários normalmente exigem `BigDecimal`, que é uma classe e será estudada posteriormente.

---

## Slide 39: `char` e Unicode

```java
char letra = 'A';
char novaLinha = '\n';
char codigo = '\u0041'; // A
```

- Usa aspas simples
- Representa uma unidade de código UTF-16 de 16 bits
- Nem todo símbolo Unicode completo cabe em um único `char`
- Emojis e alguns símbolos precisam de dois `char` ou de APIs de code point

```java
String emoji = "😊"; // String, não char
```

---

## Slide 40: `boolean`

```java
boolean aprovado = true;
boolean maiorDeIdade = idade >= 18;
```

- Possui os valores `true` e `false`
- Não é convertido implicitamente para `0` ou `1`
- É usado em condições e expressões lógicas
- A especificação Java não determina um tamanho de armazenamento em bits para `boolean`

```java
if (aprovado) {
    System.out.println("Aluno aprovado");
}
```

---

## Slide 41: Declaração e Inicialização

```java
int idade;          // declaração
idade = 20;         // atribuição

double media = 8.5; // declaração + inicialização
```

- Variáveis locais precisam ser inicializadas antes do uso
- Campos e posições de arrays recebem valores-padrão

```java
int[] notas = new int[3];
System.out.println(notas[0]); // 0
```

Não confunda valor-padrão de campo/array com variável local não inicializada.

---

## Slide 42: Inferência com `var`

```java
var nome = "Ana";   // inferido como String
var idade = 20;     // inferido como int
```

- Disponível desde **Java 10**
- Apenas para variáveis locais com inicializador
- `var` não transforma Java em linguagem de tipagem dinâmica
- O tipo é definido em compilação e não muda

```java
var valor = 10;
// valor = "dez"; // erro: valor é int
```

**No início da disciplina, prefira tipos explícitos quando ajudarem a aprendizagem.**

---

## Slide 43: Saída com `System.out`

```java
System.out.print("Olá");
System.out.println(" UniALFA!");
System.out.printf("Média: %.2f%n", 8.5);
```

- `print`: escreve sem adicionar quebra de linha
- `println`: escreve e termina a linha
- `printf`: escreve texto formatado
- `%n`: quebra de linha adequada à plataforma

```text
Olá UniALFA!
Média: 8,50 ou 8.50, conforme o locale
```

---

## Slide 44: Sequências de Escape

```java
System.out.println("Linha 1\nLinha 2");
System.out.println("Nome:\tAna");
System.out.println("Ela disse: \"Olá\"");
System.out.println("C:\\projetos\\java");
```

| Sequência | Efeito |
|---|---|
| `\n` | Nova linha |
| `\t` | Tabulação |
| `\"` | Aspas duplas |
| `\\` | Barra invertida |

---

## Slide 45: A Classe `Scanner`

### Leitura e conversão de texto

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

- `Scanner` pertence ao pacote `java.util`
- `System.in` representa a entrada padrão
- Divide a entrada em tokens usando espaços em branco por padrão
- Converte tokens em tipos primitivos e `String`

**Versão:** `Scanner` existe desde Java 5 (1.5).

---

## Slide 46: Métodos Essenciais do `Scanner`

| Método | Leitura |
|---|---|
| `nextLine()` | Linha completa de texto |
| `next()` | Próximo token de texto |
| `nextInt()` | Próximo token como `int` |
| `nextLong()` | Próximo token como `long` |
| `nextDouble()` | Próximo token como `double` |
| `nextBoolean()` | Próximo token como `boolean` |
| `hasNextInt()` | Verifica se o próximo token é um `int` |

Uma operação de leitura pode aguardar até que o usuário informe um valor.

---

## Slide 47: Exemplo — Ler um Texto

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "!");
        scanner.close();
    }
}
```

`nextLine()` preserva os espaços dentro da linha digitada.

---

## Slide 48: Exemplo — Ler Números

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Primeiro número: ");
int primeiro = scanner.nextInt();

System.out.print("Segundo número: ");
int segundo = scanner.nextInt();

int total = primeiro + segundo;
System.out.println("Soma: " + total);

scanner.close();
```

Se o usuário digitar texto no lugar do número, poderá ocorrer `InputMismatchException`.

---

## Slide 49: Armadilha — `nextInt()` e `nextLine()`

```java
int idade = scanner.nextInt();
String nome = scanner.nextLine(); // pode ler apenas o fim da linha
```

`nextInt()` consome o número, mas deixa o separador de linha pendente.

### Correção

```java
int idade = scanner.nextInt();
scanner.nextLine(); // consome o restante da linha

System.out.print("Nome: ");
String nome = scanner.nextLine();
```

---

## Slide 50: Alternativa — Ler Tudo como Texto

```java
System.out.print("Idade: ");
String textoIdade = scanner.nextLine();
int idade = Integer.parseInt(textoIdade);
```

### Vantagens didáticas

- Fluxo de leitura mais previsível
- Evita a quebra de linha pendente
- Separa entrada textual de conversão

### Atenção

Texto inválido causa `NumberFormatException`; tratamento de exceções será estudado depois.

---

## Slide 51: Locale e Números Decimais

```java
import java.util.Locale;
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
scanner.useLocale(new Locale("pt", "BR"));

System.out.print("Preço: ");
double preco = scanner.nextDouble(); // exemplo: 19,90
```

- `Scanner` considera o locale ao interpretar números
- Separador decimal pode ser vírgula ou ponto conforme configuração
- Defina o locale quando o formato de entrada fizer parte do requisito

---

## Slide 52: Fechamento do `Scanner`

```java
Scanner scanner = new Scanner(System.in);
// leituras...
scanner.close();
```

- `Scanner` implementa `Closeable`
- Fechá-lo também fecha a fonte de entrada quando ela é fechável
- Ao usar `System.in`, normalmente feche apenas quando não haverá novas leituras
- Em um programa curto com uma única entrada, o fechamento ao final é adequado

### Regra prática

Evite criar vários objetos `Scanner` para o mesmo `System.in`.

---

## Slide 53: Programa Integrado

```java
package com.unialfa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Segundo número: ");
        int segundo = scanner.nextInt();

        int total = somar(primeiro, segundo);
        System.out.println(nome + ", o resultado é " + total);

        scanner.close();
    }
}
```

---

## Slide 54: Método do Programa Integrado

```java
private static int somar(int primeiro, int segundo) {
    return primeiro + segundo;
}
```

### Comparação com a Aula 03

Antes:

```java
somar(int[] numeros)
```

Agora:

```java
somar(int primeiro, int segundo)
```

As duas soluções são válidas; a escolha depende da forma como os dados são modelados.

---

## Slide 55: Prática — Parte 1

### Leitura do projeto da Aula 03

No arquivo `Main.java`:

1. Identifique pacote, classe e métodos
2. Marque modificadores, retornos e parâmetros
3. Explique o papel de `String[] args`
4. Corrija o risco existente em `args[2]`
5. Altere `int numeros[]` para a convenção `int[] numeros`
6. Execute o programa com e sem argumentos

**Tempo sugerido:** 15 minutos.

---

## Slide 56: Prática — Parte 2

### Entrada de dados pelo teclado

Adapte o projeto para:

- Solicitar o nome do usuário com `nextLine()`
- Solicitar dois números inteiros
- Calcular a soma em um método separado
- Imprimir uma frase com nome e resultado
- Usar nomes conforme as convenções Java
- Fechar o `Scanner` ao final

**Tempo sugerido:** 25 minutos.

---

## Slide 57: Prática — Desafio

### Amplie o programa

Solicite:

- Nome completo
- Idade
- Altura
- Resposta para “está matriculado?”

Depois, exiba um resumo formatado com:

```text
Nome: Ana Silva
Idade: 20
Altura: 1,68
Matriculado: true
```

Considere o locale necessário para ler a altura.

---

## Slide 58: Checklist da Prática

- O pacote corresponde ao diretório?
- A classe pública corresponde ao nome do arquivo?
- O método `main` está correto para Java 21?
- Os nomes seguem as convenções Java?
- Cada variável possui tipo adequado?
- O programa lida corretamente com linhas e números?
- A quebra de linha pendente foi considerada?
- O `Scanner` foi fechado apenas após a última leitura?
- A saída permite compreender os valores informados?

---

## Slide 59: Glossário — Plataforma e Estrutura

| Termo | Significado |
|---|---|
| **JDK** | Kit de desenvolvimento com compilador, ferramentas e runtime |
| **JRE** | Ambiente de execução das aplicações Java |
| **JVM** | Máquina virtual que executa bytecode Java |
| **LTS** | Versão com suporte de longo prazo |
| **Bytecode** | Instruções geradas pelo compilador para execução na JVM |
| **IDE** | Ambiente integrado de desenvolvimento |
| **Package** | Agrupamento que organiza tipos e seus nomes |
| **Classe** | Declaração que define estrutura e comportamento de um tipo |

---

## Slide 60: Glossário — Código e Tipos

| Termo | Significado |
|---|---|
| **Método** | Bloco nomeado que executa uma operação |
| **Parâmetro** | Variável declarada para receber um valor em um método |
| **Argumento** | Valor fornecido ao chamar um método ou iniciar o programa |
| **Identificador** | Nome criado para classe, método, variável ou outro elemento |
| **Palavra reservada** | Termo com significado fixado pela linguagem |
| **Tipo primitivo** | Tipo básico definido diretamente pela linguagem |
| **Tipo por referência** | Tipo cujo valor referencia um objeto ou array |
| **Array** | Estrutura de tamanho fixo com elementos do mesmo tipo |

---

## Slide 61: Glossário — Entrada e Saída

| Termo | Significado |
|---|---|
| **Scanner** | Classe que lê e converte textos e valores de uma fonte de entrada |
| **System.in** | Fluxo de entrada padrão do programa |
| **System.out** | Fluxo de saída padrão do programa |
| **Token** | Unidade de entrada separada pelo delimitador do `Scanner` |
| **Locale** | Configuração regional usada em formatos como números e datas |
| **Literal** | Representação de um valor diretamente no código-fonte |
| **Inicialização** | Primeira atribuição de valor a uma variável |
| **Concatenação** | União de textos, frequentemente com o operador `+` |

---

## Slide 62: Referências Bibliográficas

### Bibliografia do plano de ensino

- DEITEL, P. J.; DEITEL, H. M. *Java: como programar*. 10. ed. São Paulo: Pearson, 2017.
- ASCENCIO, Ana Fernanda Gomes; CAMPOS, Edilene Aparecida Veneruchi de. *Fundamentos da programação de computadores*. 2. ed. São Paulo: Pearson, 2012.
- PUGA, Sandra Gavioli; RISSETTI, Gerson. *Lógica de programação e estruturas de dados, com aplicações em Java*. 3. ed. São Paulo: Pearson, 2016.
- HORSTMANN, C. S.; CORNELL, G. *Core Java*. 8. ed. São Paulo: Pearson, 2009.

---

## Slide 63: Referências Oficiais e Versões

### Documentação consultada

- Oracle. *Java Platform, Standard Edition Documentation*. Disponível em: https://docs.oracle.com/en/java/javase/
- Oracle. *Java SE Support Roadmap*. Disponível em: https://www.oracle.com/java/technologies/java-se-support-roadmap.html
- Oracle. *Java Language Specification — Java SE 25*. Disponível em: https://docs.oracle.com/javase/specs/jls/se25/html/
- Oracle. *Scanner — Java SE 25 API*. Disponível em: https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Scanner.html
- Oracle. *Compact Source Files and Instance Main Methods — Java SE 25*. Disponível em: https://docs.oracle.com/en/java/javase/25/language/compact-source-files-instance-main-methods.html

---

## Slide 64: Encerramento

### O que consolidamos hoje

- História, portabilidade e arquitetura da plataforma Java
- Estrutura e execução do projeto da Aula 03
- Elementos da classe `Main`
- Convenções de nomes e formatação
- Palavras reservadas e diferenças entre versões
- Tipos primitivos, variáveis e arrays
- Entrada e saída de dados com `Scanner` e `System`

---

## Slide 65: Perguntas?

### Dúvidas, comentários e feedback da aula

- Por que o método `main` clássico é `static`?
- Qual a diferença entre `String` e `char`?
- Quando usar `next()` ou `nextLine()`?
- Por que `nextInt()` pode interferir na leitura seguinte?
- Que convenção torna o código mais fácil de compreender?
- Qual diferença entre Java 21, 25 e 26 importa nesta aula?
