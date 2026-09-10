# Aula 07 — Apresentação do Trabalho 1 e Lançamento do Trabalho 2

Curso: CST em Sistemas para Internet (2º período)  
Disciplina: Linguagem de Programação Java  

---

## Slide 1: Abertura

### Aula 07 — Apresentar, Praticar e Consolidar

- Apresentação do Trabalho 1
- Orientações para o Trabalho 2
- Lista com 60 exercícios
- Professor Ranghetti

---

## Slide 2: Objetivos da Aula

### Ao final desta aula você será capaz de

- Apresentar e explicar uma solução desenvolvida pela equipe
- Relacionar entrada, processamento e saída em um programa Java
- Reconhecer os critérios de organização do Trabalho 2
- Planejar a implementação de 60 exercícios em um único projeto
- Aplicar somente os recursos estudados até o momento
- Preparar uma entrega clara, executável e organizada

---

## Slide 3: Versões de Java Usadas na Aula

| Referência | Uso nesta aula |
|---|---|
| Java 21 | Versão LTS compatível com todos os exercícios |
| Java 25 | Versão LTS disponível em 2026 |
| Java 26 | Versão corrente em setembro de 2026 |

- Os exercícios funcionam em Java 21, 25 e 26
- O `switch` tradicional funciona em todas essas versões
- O formato `case ... ->` é definitivo desde Java 14
- Não serão usados recursos de preview

---

## Slide 4: Agenda

- Organização das apresentações do Trabalho 1
- Sorteio das equipes e dos exercícios
- Demonstração e explicação das soluções
- Feedback da turma e do professor
- Apresentação do Trabalho 2
- Regras de organização do projeto
- Lista com 60 exercícios
- Critérios de avaliação e entrega

---

## Slide 5: Conteúdos Consolidados até Aqui

- Estrutura da classe `Main`
- Pacotes e convenções de nomes
- Tipos primitivos e `String`
- Variáveis, constantes e inicialização
- Entrada com `Scanner`
- Saída com `System.out`
- Operadores aritméticos, relacionais e lógicos
- Decisões com `if`, `else if`, `else` e `switch`
- Repetições com `for`, `while` e `do-while`
- Contadores, acumuladores e sentinelas

---

## Slide 6: Trabalho 1 — Organização das Apresentações

- As equipes serão chamadas conforme sorteio
- O professor indicará um exercício para demonstração
- Tempo sugerido:
  - 4–6 minutos por equipe
- Todos os integrantes devem estar preparados
- A equipe deve abrir o projeto e executar o programa
- O código apresentado deve corresponder ao material entregue

---

## Slide 7: Trabalho 1 — Roteiro da Apresentação

- Informar o objetivo do exercício
- Explicar quais dados o programa recebe
- Demonstrar o programa em execução
- Explicar os principais operadores e estruturas utilizados
- Mostrar pelo menos dois testes relevantes
- Explicar uma validação importante
- Responder às perguntas do professor e da turma

---

## Slide 8: Trabalho 1 — O que Será Observado

- Programa compila e executa
- Resultado atende ao enunciado
- Entrada e saída são compreensíveis
- Estrutura de controle foi escolhida adequadamente
- Variáveis possuem nomes claros
- Casos inválidos importantes foram tratados
- Integrantes demonstram compreensão da solução
- Explicação é objetiva e coerente com o código

---

## Slide 9: Trabalho 1 — Feedback após Cada Apresentação

- O que a equipe resolveu corretamente?
- A solução utiliza apenas recursos estudados?
- O teste demonstrou o comportamento esperado?
- Existe algum caso de entrada que merece atenção?
- O código pode ficar mais claro sem aumentar sua complexidade?
- Qual aprendizado pode ser aplicado aos próximos exercícios?

---

## Slide 10: Trabalho 2 — Visão Geral

- **Atividade:** lista com 60 exercícios de programação
- **Valor:** até 3,0 pontos
- **Equipes:** no máximo 4 alunos
- **Entrega:** na próxima aula
- Cada equipe deve entregar:
  - Um único projeto Java
  - Um pacote para cada exercício
  - Os 60 exercícios implementados
- Conteúdo limitado ao que foi estudado até o momento

---

## Slide 11: Trabalho 2 — Organização do Projeto

Estrutura sugerida:

```text
trabalho2-equipe/
└── src/
    ├── exercicio01/
    │   └── Main.java
    ├── exercicio02/
    │   └── Main.java
    ├── exercicio03/
    │   └── Main.java
    └── ...
        └── exercicio60/
            └── Main.java
```

- Um único projeto por equipe
- Um pacote independente para cada exercício
- Uma classe `Main` executável dentro de cada pacote

---

## Slide 12: Exemplo de Pacote por Exercício

```java
package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solução do exercício 01

        scanner.close();
    }
}
```

- Substituir o número conforme o exercício
- Manter nome de pacote em letras minúsculas
- Não colocar mais de um exercício no mesmo pacote

---

## Slide 13: Trabalho 2 — Regras da Entrega

- Cada exercício deve compilar e executar separadamente
- Identificar o número e o título na mensagem inicial ou em comentário
- Aplicar as convenções Java estudadas
- Usar `Scanner` quando houver entrada de dados
- Exibir instruções e resultados com mensagens claras
- Tratar as validações solicitadas no enunciado
- Testar pelo menos dois valores relevantes por exercício
- Remover trechos incompletos ou que impeçam a compilação
- Entregar somente um projeto por equipe

---

## Slide 14: Trabalho 2 — Limites Técnicos

### Pode usar

- Tipos primitivos e `String`
- Variáveis e constantes
- `Scanner`, `System.in` e `System.out`
- Operadores aritméticos, relacionais e lógicos
- `if`, `else if`, `else` e `switch`
- `for`, `while` e `do-while`
- Contadores, acumuladores e sentinelas

### Não utilizar como solução

- Arrays, matrizes ou coleções
- Classes próprias além de `Main`
- Herança, interfaces ou objetos de domínio
- Métodos criados pela equipe para dividir a solução
- Arquivos, banco de dados, interfaces gráficas ou acesso à rede
- Exceções, lambdas, streams ou recursão

---

## Slide 15: Estratégia para Desenvolver a Lista

1. Criar o projeto e os 60 pacotes
2. Dividir os exercícios entre os integrantes
3. Manter a mesma organização em todos os pacotes
4. Compilar cada exercício após implementá-lo
5. Testar entradas comuns e casos-limite
6. Revisar os exercícios desenvolvidos por outro integrante
7. Executar uma conferência final do projeto completo

- Dividir o trabalho não elimina a responsabilidade coletiva
- Todos devem compreender a estrutura geral da entrega

---

## Slide 16: Exercícios 1–5 — Cálculos do Cotidiano

1. **Café compartilhado:** leia o valor total da conta e a quantidade de pessoas; informe quanto cada pessoa pagará. Valide a quantidade maior que zero.
2. **Ingressos do cinema:** leia as quantidades de ingressos inteiros e de meias-entradas, seus preços e exiba o valor total.
3. **Consumo de combustível:** leia quilômetros percorridos e litros consumidos; calcule quilômetros por litro. Não permita litros iguais a zero.
4. **Conversor de minutos:** leia uma quantidade total de minutos e exiba quantas horas completas e quantos minutos restantes ela representa.
5. **Troco da cantina:** leia o valor da compra e o valor pago; informe o troco ou quanto ainda falta pagar.

---

## Slide 17: Exercícios 6–10 — Medidas e Conversões

6. **Temperatura do laboratório:** leia Celsius e converta para Fahrenheit usando `F = C * 9 / 5 + 32`.
7. **Distância da viagem:** leia quilômetros e exiba o valor equivalente em metros e centímetros.
8. **Retângulo para banner:** leia largura e altura; calcule área e perímetro.
9. **Volume da caixa:** leia comprimento, largura e altura de uma caixa retangular; calcule o volume.
10. **Segundos do vídeo:** leia uma duração em segundos e exiba horas completas, minutos restantes e segundos restantes.

---

## Slide 18: Exercícios 11–15 — Porcentagens e Planejamento

11. **Desconto da livraria:** leia preço e percentual de desconto; exiba desconto e preço final.
12. **Reajuste de mensalidade:** leia o valor atual e o percentual de reajuste; informe o novo valor.
13. **Meta de economia:** leia a meta e o valor já economizado; informe o percentual alcançado. Valide a meta maior que zero.
14. **Comissão de vendas:** leia total vendido e percentual de comissão; exiba o valor da comissão e o total recebido com um salário fixo informado.
15. **Divisão de tarefas:** leia o total de tarefas e a quantidade de integrantes; informe tarefas por integrante e tarefas restantes. Valide a quantidade de integrantes.

---

## Slide 19: Exercícios 16–20 — Decisões Simples

16. **Número par ou ímpar:** leia um inteiro e classifique-o usando `%`.
17. **Temperatura de alerta:** leia a temperatura; informe “Alerta de calor” quando for maior que 35 e “Temperatura normal” nos demais casos.
18. **Acesso ao evento:** leia a idade; permita entrada a partir de 18 anos e rejeite idade negativa.
19. **Maior pontuação:** leia as pontuações de dois jogadores; informe o vencedor ou empate.
20. **Saldo da carteira:** leia saldo e valor de uma compra; informe se a compra pode ser realizada e qual seria o saldo restante.

---

## Slide 20: Exercícios 21–25 — Classificações

21. **Faixa etária:** classifique uma idade válida como criança, adolescente, adulto ou idoso segundo faixas exibidas pelo próprio programa.
22. **Situação acadêmica:** leia a média; informe “Aprovado” para média a partir de 7, “Recuperação” de 5 até menos de 7 e “Reprovado” abaixo de 5. Valide de 0 a 10.
23. **Nível de bateria:** classifique o percentual como crítico, baixo, médio ou alto; rejeite valores fora de 0 a 100.
24. **Velocidade da via:** leia velocidade medida e limite; informe se está dentro do limite ou quantos quilômetros por hora o excedeu.
25. **Classificação de pedido:** leia o valor do pedido; classifique-o como pequeno, médio ou grande usando faixas informadas na saída.

---

## Slide 21: Exercícios 26–30 — Condições Compostas

26. **Aprovação completa:** leia média e frequência; aprove somente com média `>= 7` e frequência `>= 75`. Valide as faixas.
27. **Frete grátis:** leia valor da compra e indique frete grátis quando o valor for pelo menos R$ 200 ou o cliente for assinante.
28. **Entrada acompanhada:** leia idade e se possui autorização; permita quando for maior de idade ou possuir autorização.
29. **Empréstimo simplificado:** leia renda e valor da parcela; aprove se a parcela não ultrapassar 30% da renda e a renda for positiva.
30. **Horário comercial:** leia hora e dia da semana numerado de 1 a 7; informe se está aberto de segunda a sexta, das 8 às 18 horas.

---

## Slide 22: Exercícios 31–35 — Comparações e Validações

31. **Maior entre três:** leia três números e informe o maior; trate também valores iguais.
32. **Triângulo possível:** leia três lados positivos e informe se cada lado é menor que a soma dos outros dois.
33. **Ano bissexto simplificado:** leia o ano e informe se é divisível por 400 ou se é divisível por 4 e não por 100.
34. **Senha e confirmação:** leia dois números inteiros representando senha e confirmação; informe se coincidem.
35. **Faixa segura do sensor:** leia um valor e informe se está entre os limites mínimo e máximo também informados pelo usuário. Valide mínimo menor ou igual ao máximo.

---

## Slide 23: Exercícios 36–40 — Menus com `switch`

36. **Calculadora básica:** leia dois números e uma opção para somar, subtrair, multiplicar ou dividir; trate divisão por zero.
37. **Dia da semana:** leia um número de 1 a 7 e exiba o dia correspondente.
38. **Cardápio digital:** apresente quatro produtos com preços fixos; leia código e quantidade e calcule o total.
39. **Conversor de medidas:** leia um valor e escolha entre converter quilômetros para metros, metros para centímetros ou horas para minutos.
40. **Central de atendimento:** leia uma opção e exiba o setor correspondente: financeiro, suporte, vendas ou cancelamento.

---

## Slide 24: Exercícios 41–45 — Mais Decisões com `switch`

41. **Mês do ano:** leia um número de 1 a 12 e exiba o nome do mês.
42. **Estação por mês:** leia o número do mês e indique a estação correspondente no hemisfério sul usando grupos de `case`.
43. **Plano de streaming:** leia um código de plano e exiba nome e preço mensal para três opções; trate código inválido.
44. **Operação bancária:** crie um menu para consultar saldo, depositar ou sacar de um saldo inicial informado; valide o saque.
45. **Semáforo textual:** leia uma opção numérica para vermelho, amarelo ou verde e exiba a ação esperada do motorista.

---

## Slide 25: Exercícios 46–50 — Repetições com `for`

46. **Contagem personalizada:** leia início e fim; exiba todos os inteiros em ordem crescente quando início for menor ou igual ao fim.
47. **Tabuada escolhida:** leia um inteiro e exiba sua tabuada de 1 a 10.
48. **Somatório até N:** leia `N` positivo e calcule a soma de 1 até `N`.
49. **Pares no intervalo:** leia `N` positivo e exiba os números pares de 1 até `N`.
50. **Contagem regressiva:** leia um número positivo e exiba a contagem até zero, seguida da mensagem “Iniciar!”.

---

## Slide 26: Exercícios 51–55 — Contadores e Acumuladores

51. **Média de cinco notas:** leia cinco notas com `for`, calcule a média e informe a situação final. Valide cada nota de 0 a 10.
52. **Temperaturas da semana útil:** leia cinco temperaturas, informe a soma, a média e quantas ficaram acima de 30 graus.
53. **Caixa de loja:** leia o valor de seis vendas, calcule o total e conte quantas foram maiores que R$ 100.
54. **Votação rápida:** leia dez votos, em que `1` significa candidato A e `2` candidato B; conte os votos válidos e informe o vencedor ou empate.
55. **Múltiplos especiais:** leia `N` e conte quantos números de 1 até `N` são múltiplos de 3 e quantos são múltiplos de 5.

---

## Slide 27: Exercícios 56–60 — `while` e `do-while`

56. **PIN de acesso:** solicite um PIN até que o usuário informe `2026`; ao final, mostre a quantidade de tentativas.
57. **Somar até zero:** leia números com `while` até receber `0`; exiba soma e quantidade de valores diferentes de zero.
58. **Entrada positiva:** use `do-while` para solicitar um número até que seja maior que zero; depois, exiba seu dobro.
59. **Pesquisa de satisfação:** leia notas de 1 a 5 até receber `0`; informe quantidade de respostas e média. Rejeite notas inválidas.
60. **Menu de oficina:** use `do-while` para repetir um menu que calcula preço de lavagem, troca de óleo ou revisão básica conforme valores fixos; encerre apenas com a opção `0`.

---

## Slide 28: Distribuição dos Exercícios por Conteúdo

| Faixa | Conteúdo predominante | Quantidade |
|---|---|---:|
| 1–15 | Cálculos, conversões e porcentagens | 15 |
| 16–25 | Decisões e classificações | 10 |
| 26–35 | Condições compostas e validações | 10 |
| 36–45 | Seleção com `switch` | 10 |
| 46–55 | Repetição com `for` | 10 |
| 56–60 | Repetição com `while` e `do-while` | 5 |
| **Total** |  | **60** |

---

## Slide 29: Critérios de Avaliação do Trabalho 2

| Critério | Valor |
|---|---:|
| Funcionamento e correção dos 60 exercícios |  |
| Uso adequado dos conteúdos estudados |  |
| Clareza, organização e convenções Java |  |
| Validações solicitadas e qualidade das mensagens |  |
| Estrutura do projeto, completude e entrega |  |
| **Total** | **3,00** |

---

## Slide 30: Como Será Avaliado o Funcionamento

- O pacote existe e corresponde ao número do exercício
- A classe `Main` pode ser executada
- O programa recebe os dados necessários
- O processamento atende ao enunciado
- A saída apresenta o resultado correto
- Entradas relevantes foram testadas
- Um exercício que não compila não pode ser considerado funcional

---

## Slide 31: Como Será Avaliada a Qualidade

- Nomes de variáveis comunicam seu propósito
- Indentação e chaves são consistentes
- Não existe repetição desnecessária de mensagens ou cálculos
- A estrutura de controle combina com o problema
- Mensagens orientam corretamente o usuário
- Validações evitam operações inválidas
- O código permanece dentro dos conteúdos permitidos

---

## Slide 32: Checklist Antes da Entrega

- A equipe possui no máximo 4 integrantes?
- Existe somente um projeto da equipe?
- Existem os pacotes `exercicio01` até `exercicio60`?
- Cada pacote possui sua própria classe `Main`?
- Todos os exercícios compilam individualmente?
- As entradas e saídas são claras?
- Divisões por zero foram tratadas quando necessário?
- Notas, percentuais e opções foram validados quando solicitado?
- Todos os loops possuem condição de término?
- O projeto utiliza somente conteúdos já estudados?

---

## Slide 33: Conferência em Equipe

- Cada integrante deve revisar exercícios produzidos por outra pessoa
- Conferir:
  - Enunciado atendido integralmente
  - Teste com um valor comum
  - Teste com caso-limite ou entrada inválida
  - Pacote e classe corretos
  - Mensagens compreensíveis
- Corrigir o projeto antes da entrega final
- Não deixar a integração dos pacotes para os últimos minutos

---

## Slide 34: Glossário — Organização do Projeto

| Termo | Significado |
|---|---|
| **Projeto Java** | Estrutura que reúne código-fonte e configurações da aplicação |
| **Pacote** | Agrupamento nomeado usado para organizar classes |
| **Classe `Main`** | Classe que contém o ponto de entrada executável do exercício |
| **Método `main`** | Método iniciado pela JVM para executar o programa |
| **Compilação** | Verificação e transformação do código-fonte em bytecode |
| **Caso de teste** | Conjunto de entradas usado para verificar o comportamento do programa |

---

## Slide 35: Glossário — Solução dos Exercícios

| Termo | Significado |
|---|---|
| **Validação** | Verificação de uma entrada antes de utilizá-la em uma operação |
| **Condição** | Expressão booleana que controla uma decisão ou repetição |
| **Contador** | Variável que registra quantidade ou posição em uma repetição |
| **Acumulador** | Variável que reúne valores ao longo das repetições |
| **Sentinela** | Valor especial usado para encerrar a leitura ou repetição |
| **Loop infinito** | Repetição cuja condição de término não é alcançada |

---

## Slide 36: Referências Bibliográficas

### Bibliografia do plano de ensino

- DEITEL, P. J.; DEITEL, H. M. *Java: como programar*. 10. ed. São Paulo: Pearson, 2017.
- ASCENCIO, Ana Fernanda Gomes; CAMPOS, Edilene Aparecida Veneruchi de. *Fundamentos da programação de computadores*. 2. ed. São Paulo: Pearson, 2012.
- PUGA, Sandra Gavioli; RISSETTI, Gerson. *Lógica de programação e estruturas de dados, com aplicações em Java*. 3. ed. São Paulo: Pearson, 2016.
- HORSTMANN, C. S.; CORNELL, G. *Core Java*. 8. ed. São Paulo: Pearson, 2009.

### Relação com a aula

- Fundamentos da linguagem Java
- Entrada, processamento e saída
- Operadores e estruturas de controle
- Organização, legibilidade e testes básicos de programas

---

## Slide 37: Referências Oficiais e Versões

- ORACLE. *Java Language Specification*. Disponível em: https://docs.oracle.com/javase/specs/
- ORACLE. *Java API Documentation*. Disponível em: https://docs.oracle.com/en/java/javase/
- OPENJDK. *JDK 21*. Disponível em: https://openjdk.org/projects/jdk/21/
- OPENJDK. *JDK 25*. Disponível em: https://openjdk.org/projects/jdk/25/
- OPENJDK. *JDK 26*. Disponível em: https://openjdk.org/projects/jdk/26/

- Para esta lista, as diferenças entre essas versões não alteram as soluções exigidas
- Use a forma de `switch` adotada nas aulas e disponível no ambiente da equipe

---

## Slide 38: Encerramento

### O que realizamos hoje

- Apresentação e discussão do Trabalho 1
- Orientação do Trabalho 2
- Definição da estrutura com um pacote por exercício
- Entrega da lista com 60 exercícios
- Revisão dos critérios técnicos e de avaliação

### Próxima aula

- Entrega do Trabalho 2
- Conferência do projeto e dos 60 exercícios
- Continuidade conforme planejamento da disciplina

---

## Slide 39: Perguntas?

### Dúvidas, comentários e organização das equipes

- Como o projeto deve ser estruturado?
- Quais recursos podem ser usados?
- Como dividir os exercícios sem perder a padronização?
- Como testar os programas antes da entrega?
- Todos compreenderam o prazo e os critérios do Trabalho 2?
