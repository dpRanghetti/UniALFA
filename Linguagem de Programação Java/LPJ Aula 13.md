# Aula 13 — Exceções e Arquivos de Texto em Java

**Linguagem de Programação Java**  
CST em Sistemas para Internet | 2º Período

---

## Slide 1: Abertura

### Aula 13 — Programas que Tratam Erros e Preservam Resultados

- Validação e tratamento de exceções
- Leitura e escrita de arquivos de texto
- Integração entre entrada, processamento e persistência

---

## Slide 2: Objetivos

- Classificar erros de compilação, execução e lógica
- Reconhecer exceções comuns
- Utilizar `try-catch` adequadamente
- Diferenciar validação de tratamento de exceções
- Criar caminhos com `Path`
- Escrever e ler textos com `Files`
- Tratar falhas com `IOException`

---

## Slide 3: Versões e Limites

- Exemplos compatíveis com Java 21, 25 e 27
- `Files.readString` e `Files.writeString` existem desde o Java 11
- Usaremos apenas a biblioteca padrão
- Não criaremos exceções próprias
- Não utilizaremos banco de dados, JSON, serialização ou GUI

---

## Slide 4: Três Categorias de Erro

| Categoria | Exemplo | Momento |
|---|---|---|
| Compilação | `;` ausente ou tipo incompatível | Antes de executar |
| Execução | Divisão por zero ou arquivo inexistente | Durante a execução |
| Lógico | Fórmula ou condição incorreta | Executa, mas produz resultado errado |

---

## Slide 5: O que é uma Exceção?

- Evento que interrompe o fluxo normal do programa
- Possui um tipo e uma mensagem
- Pode ser tratada quando existe uma resposta possível
- O tratamento evita encerramento abrupto em falhas previstas
- Tratar não significa esconder o erro

### Exemplos

- Texto digitado onde era esperado um número
- Acesso a uma posição inexistente do array
- Tentativa de abrir um arquivo inexistente

---

## Slide 6: Exceções Verificadas e Não Verificadas

### Exceções verificadas — checked exceptions

- O compilador exige que sejam tratadas com `try-catch` ou declaradas com `throws`
- Normalmente representam falhas externas que o programa não controla completamente
- Exemplos: arquivo inexistente, falha de leitura, permissão negada ou problema de comunicação
- `IOException` é a principal exceção verificada desta aula

```java
try {
    String texto = Files.readString(Path.of("dados.txt"));
    System.out.println(texto);
} catch (IOException erro) {
    System.out.println("Não foi possível ler o arquivo.");
}
```

### Exceções não verificadas — unchecked exceptions

- O compilador não obriga o uso de `try-catch`
- São subclasses de `RuntimeException`
- Frequentemente indicam entrada inválida, estado incorreto ou erro de programação
- Exemplos: `NumberFormatException`, `ArithmeticException` e `ArrayIndexOutOfBoundsException`

```java
int idade = Integer.parseInt("vinte"); // NumberFormatException
```

### Decisão prática

- Trate quando o programa puder responder ou orientar a correção
- Valide dados para evitar falhas previsíveis
- Não use `try-catch` apenas para esconder erros de lógica

---

## Slide 7: Exceções Comuns

| Exceção | Situação comum |
|---|---|
| `NumberFormatException` | Conversão de texto inválido em número |
| `ArithmeticException` | Operação aritmética inválida |
| `ArrayIndexOutOfBoundsException` | Índice fora do array |
| `StringIndexOutOfBoundsException` | Posição fora da `String` |
| `InputMismatchException` | Entrada incompatível no `Scanner` |
| `IOException` | Falha em entrada ou saída |

---

## Slide 8: Estrutura `try-catch`

```java
try {
    int idade = Integer.parseInt(scanner.nextLine());
    System.out.println("Idade: " + idade);
} catch (NumberFormatException erro) {
    System.out.println("Informe um número inteiro.");
}
```

- `try`: operação que pode falhar
- `catch`: resposta para uma exceção compatível
- Sem erro, o `catch` não é executado

---

## Slide 9: Exceção não Substitui Validação

```java
try {
    int idade = Integer.parseInt(texto);
    if (idade < 0 || idade > 130) {
        System.out.println("Idade fora do intervalo.");
    }
} catch (NumberFormatException erro) {
    System.out.println("A idade deve ser um número inteiro.");
}
```

- `"vinte"`: falha de conversão tratada pelo `catch`
- `250`: conversão válida, mas regra tratada pelo `if`

---

## Slide 10: Leitura Segura em Método

```java
private static int lerInteiro(Scanner scanner, String mensagem) {
    while (true) {
        System.out.print(mensagem);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException erro) {
            System.out.println("Entrada inválida. Tente novamente.");
        }
    }
}
```

- O laço continua até receber um valor válido
- O método pode ser reutilizado

---

## Slide 11: Vários Blocos `catch`

```java
try {
    int indice = Integer.parseInt(scanner.nextLine());
    System.out.println(valores[indice]);
} catch (NumberFormatException erro) {
    System.out.println("O índice deve ser inteiro.");
} catch (ArrayIndexOutOfBoundsException erro) {
    System.out.println("Posição inexistente.");
}
```

- Cada falha recebe uma mensagem específica
- Capture apenas exceções que possam ser tratadas

---

## Slide 12: `finally` e Boas Práticas

```java
try {
    // operação
} catch (RuntimeException erro) {
    // tratamento
} finally {
    // executado ao final
}
```

- `finally` é executado ocorrendo ou não a exceção
- Não é obrigatório em todo tratamento
- Evite `catch (Exception erro)` sem justificativa
- Mensagens devem orientar o usuário

---

## Slide 13: Lendo o Stack Trace

1. Identifique o tipo da exceção
2. Leia a mensagem
3. Localize a primeira linha que pertence ao seu código
4. Observe o caminho de chamadas até a falha

- O stack trace ajuda a localizar a causa
- Para o usuário, apresente uma mensagem compreensível

---

## Slide 14: Memória e Persistência

- Variáveis existem enquanto o programa está executando
- Ao encerrar, seus valores são perdidos
- Um arquivo permite conservar e compartilhar resultados
- O arquivo não substitui validação nem processamento

```text
entrada → validação → processamento → relatório → arquivo
```

---

## Slide 15: Caminhos com `Path`

```java
import java.nio.file.Path;

Path caminho = Path.of("relatorio.txt");
```

- Caminho relativo parte da pasta de execução
- Caminho absoluto informa toda a localização
- Usaremos caminhos relativos
- `toAbsolutePath()` ajuda a localizar o arquivo

---

## Slide 16: Escrevendo Texto

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

Path caminho = Path.of("relatorio.txt");

try {
    Files.writeString(caminho, "Relatório da turma\n");
    System.out.println("Arquivo salvo com sucesso.");
} catch (IOException erro) {
    System.out.println("Não foi possível salvar o arquivo.");
}
```

---

## Slide 17: Lendo Texto

```java
try {
    String conteudo = Files.readString(caminho);
    System.out.println(conteudo);
} catch (IOException erro) {
    System.out.println("Não foi possível ler o arquivo.");
}
```

- O conteúdo é retornado como uma `String`
- Arquivo inexistente ou inacessível pode produzir `IOException`
- Arquivos muito grandes exigem estratégias fora do escopo

---

## Slide 18: Entendendo `IOException`

- Operações externas dependem do sistema de arquivos
- O arquivo pode não existir
- A pasta pode não permitir escrita
- Outro programa pode estar usando o recurso
- O dispositivo pode apresentar falha

```java
catch (IOException erro) {
    System.out.println("Falha no arquivo: " + erro.getMessage());
}
```

---

## Slide 19: Método para Salvar

```java
private static boolean salvarRelatorio(Path caminho, String texto) {
    try {
        Files.writeString(caminho, texto);
        return true;
    } catch (IOException erro) {
        System.out.println("Falha: " + erro.getMessage());
        return false;
    }
}
```

- Concentra a responsabilidade de salvar
- O retorno informa ao `main` se a operação funcionou

---

## Slide 20: Construindo o Relatório

```java
String relatorio = "=== RELATÓRIO ===\n"
        + "Quantidade: " + valores.length + "\n"
        + "Soma: " + soma + "\n"
        + "Média: " + media + "\n"
        + "Maior: " + maior + "\n";
```

- Inclua título, rótulos e unidades
- O texto deve ser compreensível fora do programa
- Confira os cálculos antes de salvar

---

## Slide 21: Fluxo Completo

```java
Path caminho = Path.of("relatorio.txt");

if (salvarRelatorio(caminho, relatorio)) {
    try {
        String conteudo = Files.readString(caminho);
        System.out.println(conteudo);
    } catch (IOException erro) {
        System.out.println("O arquivo foi salvo, mas não pôde ser lido.");
    }
}
```

---

## Slide 22: Prática 1 — Calculadora Segura

- Leia dois números como texto
- Converta com tratamento de `NumberFormatException`
- Escolha a operação em um menu
- Impeça divisão por zero
- Repita até o usuário decidir sair

---

## Slide 23: Prática 2 — Relatório em Arquivo

- Leia cinco valores inteiros com segurança
- Armazene-os em um array
- Calcule soma, média, maior e menor
- Monte um relatório textual
- Salve em `relatorio.txt`
- Leia o arquivo e exiba seu conteúdo
- Trate entradas e operações de arquivo

---

## Slide 24: Checklist da Prática

- O programa aceita somente entradas válidas?
- As regras foram verificadas com condições?
- As exceções esperadas foram tratadas?
- Os cálculos foram conferidos?
- O arquivo foi criado na pasta esperada?
- O texto salvo está organizado?
- O programa consegue ler o arquivo novamente?

---

## Slide 25: Preparação para a Aula 14

Na próxima aula teremos:

- Revisão dos principais conteúdos
- Esclarecimento de dúvidas
- Desenvolvimento do Trabalho 4 final
- Testes, demonstração e entrega na mesma aula

---

## Slide 26: Glossário

| Termo | Significado |
|---|---|
| Exceção | Evento que interrompe o fluxo normal |
| `try` | Bloco com operação que pode falhar |
| `catch` | Bloco que trata uma exceção compatível |
| Stack trace | Sequência de chamadas até a falha |
| Persistência | Conservação de dados após o encerramento |
| `Path` | Representação de um caminho |
| `Files` | Classe utilitária para arquivos |
| `IOException` | Exceção associada a entrada e saída |

---

## Slide 27: Referências

- DEITEL; DEITEL. *Java: como programar*. Pearson, 2017.
- Oracle. *Java Language Specification — Exceptions*. https://docs.oracle.com/javase/specs/jls/se27/html/jls-11.html
- Oracle. *Class Path — Java SE 27*. https://docs.oracle.com/en/java/javase/27/docs/api/java.base/java/nio/file/Path.html
- Oracle. *Class Files — Java SE 27*. https://docs.oracle.com/en/java/javase/27/docs/api/java.base/java/nio/file/Files.html
- Oracle. *Class IOException — Java SE 27*. https://docs.oracle.com/en/java/javase/27/docs/api/java.base/java/io/IOException.html

---

## Slide 28: Encerramento

- Condições validam regras; exceções tratam falhas
- `try-catch` permite respostas controladas
- `Path` representa a localização do arquivo
- `Files` permite ler e escrever textos
- `IOException` trata falhas de entrada e saída
- Próxima aula: revisão e Trabalho 4 final

---

## Slide 29: Perguntas?

### Dúvidas sobre exceções e arquivos de texto

