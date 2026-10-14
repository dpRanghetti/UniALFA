# Aula 10 — Strings, Caracteres e Conversões em Java

**Linguagem de Programação Java**  
CST em Sistemas para Internet | 2º Período

---

## Slide 1: Abertura

### Aula 10 — Trabalhando com Textos

- Entrega e demonstração do Trabalho 1
- `String`, `char`, comparação e transformação
- Trabalho 2: analisador de textos — até 1,0 ponto

---

## Slide 2: Objetivos

- Diferenciar `String` e `char`
- Comparar textos corretamente
- Consultar e transformar uma `String`
- Percorrer caracteres com `for`
- Converter textos em números
- Criar métodos para processar textos

---

## Slide 3: Versões

- Base: Java 21
- LTS mais recente: Java 25
- Versão corrente: Java 27
- Os recursos obrigatórios desta aula existem nas três versões
- Não usaremos recursos de preview

---

## Slide 4: Revisão e Entrega do Trabalho 1

- Demonstração do menu
- Explicação dos métodos
- Parâmetros e retornos utilizados
- Testes realizados
- Feedback rápido do professor

---

## Slide 5: `char` e `String`

```java
char inicial = 'A';
String nome = "Ana";
```

- `char` representa uma unidade UTF-16 e usa aspas simples
- `String` representa texto e usa aspas duplas
- `String` é um tipo por referência da biblioteca padrão
- Usaremos seus métodos sem iniciar conteúdo de POO

---

## Slide 6: Tamanho e Posições

```java
String curso = "Java";
System.out.println(curso.length()); // 4
System.out.println(curso.charAt(0)); // J
```

- A primeira posição é `0`
- A última posição é `length() - 1`
- Índice inválido provoca `StringIndexOutOfBoundsException`

---

## Slide 7: Comparação Correta

```java
if (resposta.equals("sim")) { ... }
if (resposta.equalsIgnoreCase("SIM")) { ... }
```

- Não use `==` para comparar o conteúdo de textos
- `equals` considera maiúsculas e minúsculas
- `equalsIgnoreCase` ignora essa diferença

---

## Slide 8: Limpeza e Normalização

```java
String entrada = "  Java  ";
String limpa = entrada.trim();
String normalizada = limpa.toLowerCase();
```

- `trim()` remove espaços das extremidades mais comuns
- `strip()` considera espaços Unicode e existe desde Java 11
- `isBlank()` reconhece texto vazio ou composto por espaços

---

## Slide 9: Pesquisas em Textos

```java
texto.contains("Java");
texto.startsWith("Aula");
texto.endsWith(".java");
texto.indexOf('a');
```

Cada operação produz uma informação que pode controlar decisões.

---

## Slide 10: Recortes

```java
String codigo = "2026-JAVA";
String ano = codigo.substring(0, 4);
String nome = codigo.substring(5);
```

- O início é incluído
- O limite final é excluído
- Valide o tamanho antes de recortar

---

## Slide 11: Percorrendo Caracteres

```java
int vogais = 0;
String texto = scanner.nextLine().toLowerCase();

for (int i = 0; i < texto.length(); i++) {
    char c = texto.charAt(i);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        vogais++;
    }
}
```

---

## Slide 12: Conversão de Texto

```java
int idade = Integer.parseInt("18");
double valor = Double.parseDouble("19.90");
String quantidade = String.valueOf(25);
```

- Texto inválido produz `NumberFormatException`
- O separador esperado por `parseDouble` é ponto
- Tratamento de exceções será estudado na Aula 13

---

## Slide 13: Prática — Analisador de Frase

Leia uma frase e informe:

- Quantidade de caracteres
- Primeiro e último caractere, quando existirem
- Quantidade de vogais
- Se contém uma palavra escolhida pelo usuário
- Versões em maiúsculas e minúsculas

Divida a solução em métodos.

---

## Slide 14: Trabalho 2 — Analisador de Texto

- Equipes de até 4 alunos
- Menu com pelo menos cinco operações textuais
- Utilizar métodos separados
- Tratar texto vazio com condições
- Não utilizar arrays, coleções, regex ou recursos não estudados
- Entrega e demonstração na Aula 11

---

## Slide 15: Critérios do Trabalho 2

| Critério | Valor |
|---|---:|
| Operações corretas |  |
| Uso de métodos de `String` e percurso |  |
| Organização em métodos |  |
| Validações e mensagens |  |
| Demonstração |  |
| **Total** | **1,00** |

---

## Slide 16: Erros Comuns

- Comparar textos com `==`
- Usar índice igual a `length()`
- Recortar sem validar o tamanho
- Confundir `char` com `String`
- Ignorar espaços nas entradas
- Não atribuir o resultado de uma transformação

---

## Slide 17: Glossário

| Termo | Significado |
|---|---|
| `String` | Sequência de caracteres |
| `char` | Unidade de caractere representada pelo tipo primitivo |
| Índice | Posição de um elemento, iniciada em zero |
| Normalização | Transformação para uma forma padronizada |
| Substring | Parte de uma sequência de texto |
| Parsing | Conversão de texto para outro tipo |

---

## Slide 18: Referências

- DEITEL; DEITEL. *Java: como programar*. Pearson, 2017.
- Oracle. *Class String — Java SE 27*. https://docs.oracle.com/en/java/javase/27/docs/api/java.base/java/lang/String.html
- Oracle. *Class Character — Java SE 27*. https://docs.oracle.com/en/java/javase/27/docs/api/java.base/java/lang/Character.html

---

## Slide 19: Encerramento

- Textos exigem comparação por conteúdo
- Índices começam em zero
- Métodos de `String` permitem consultar e transformar textos
- Próxima aula: arrays e processamento de conjuntos de valores

---

## Slide 20: Perguntas?

### Dúvidas e organização do Trabalho 2
