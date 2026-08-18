# Aula 03 — Arquiteturas em Nuvem: Distribuídas, Escaláveis e Microserviços

**Cloud Computing e DevOps Avançado**  
CST em Sistemas para Internet | 6º Período

---

## Slide 1: Abertura

### Aula 03 — Arquiteturas em Nuvem

- **Professor:** Ranghetti
- **Tema:** arquiteturas distribuídas, escalabilidade e microserviços
- **Atividade:** decomposição guiada de um monólito
- **Trabalho:** lançamento do Trabalho 2 (T2)

---

## Slide 2: Objetivos da Aula

### Ao final desta aula você será capaz de

- Explicar o que caracteriza uma **arquitetura distribuída**
- Diferenciar **escalabilidade vertical, horizontal e elasticidade**
- Comparar **monólitos e microserviços** sem tratar um modelo como solução universal
- Identificar benefícios e custos operacionais dos microserviços
- Propor limites iniciais de serviços a partir de capacidades de negócio
- Representar uma arquitetura em nuvem por meio de um diagrama

---

## Slide 3: Agenda

- Revisão rápida da Aula 02
- Monólitos e sistemas distribuídos
- Escalabilidade e elasticidade
- Fundamentos de microserviços
- Comunicação, dados e resiliência
- Prática: decomposição de um monólito
- Lançamento do **Trabalho 2 (T2)**

---

## Slide 4: Revisão da Aula 02

### Decisões anteriores à arquitetura

- **IaaS:** mais controle e maior responsabilidade operacional
- **PaaS:** foco na aplicação com infraestrutura mais gerenciada
- **SaaS:** solução pronta, com menor possibilidade de customização
- Regiões e zonas influenciam **latência, disponibilidade e conformidade**
- A escolha do provedor deve considerar requisitos técnicos e de negócio

### Pergunta de conexão

Como projetar uma aplicação que cresça sem depender de um único componente?

---

## Slide 5: O que é Arquitetura de Software?

### Uma visão de alto nível do sistema

Arquitetura de software descreve:

- Os **componentes** do sistema
- As **responsabilidades** de cada componente
- Como os componentes **se comunicam**
- Onde os **dados** são armazenados
- Como o sistema atende atributos como disponibilidade, segurança e desempenho

> Arquitetura é um conjunto de decisões e trade-offs, não apenas um diagrama.

---

## Slide 6: Arquitetura Monolítica

### Uma aplicação implantada como uma unidade

```text
Usuários → Aplicação monolítica → Banco de dados
             ├─ Catálogo
             ├─ Pedidos
             ├─ Pagamentos
             └─ Usuários
```

- Módulos podem estar bem separados no código
- Build e implantação normalmente ocorrem em conjunto
- Uma única instância pode atender várias responsabilidades

---

## Slide 7: Monólito — Pontos Fortes

### Por que começar com um monólito pode fazer sentido?

- Desenvolvimento e testes iniciais mais simples
- Implantação e observabilidade centralizadas
- Chamadas internas rápidas, sem dependência da rede
- Transações no mesmo banco são mais fáceis
- Menor custo operacional para equipes pequenas
- Refatoração entre módulos tende a ser mais direta

> Monólito não é sinônimo de código desorganizado.

---

## Slide 8: Monólito — Limitações no Crescimento

### Quando surgem dificuldades?

- Toda a aplicação precisa ser implantada para alterar uma parte
- Um módulo muito utilizado pode exigir a escala do sistema inteiro
- Falhas podem afetar toda a aplicação
- Base de código e tempo de build crescem
- Equipes passam a disputar os mesmos componentes
- Mudanças de tecnologia tornam-se mais difíceis

**Atenção:** essas limitações dependem do tamanho, da organização e dos requisitos do sistema.

---

## Slide 9: Arquitetura Distribuída

### Componentes executam em processos ou máquinas diferentes

```text
Cliente → Balanceador/API → Serviço A → Banco A
                         ├→ Serviço B → Banco B
                         └→ Serviço C → Fila → Worker
```

- Componentes independentes cooperam pela rede
- Processamento e dados podem estar distribuídos
- Cada componente pode ter ciclo de vida próprio
- Falhas parciais passam a fazer parte do funcionamento normal

---

## Slide 10: O Desafio dos Sistemas Distribuídos

### A rede não é uma chamada local

- A comunicação pode apresentar **latência**
- Mensagens podem atrasar, duplicar ou não chegar
- Um serviço pode falhar enquanto os demais continuam
- Relógios e estados podem ficar inconsistentes
- Diagnosticar uma requisição exige rastrear vários componentes
- Segurança deve ser aplicada entre serviços

> Distribuir componentes aumenta a capacidade de escala, mas também a complexidade.

---

## Slide 11: Coesão e Acoplamento

### Dois critérios para bons limites

- **Alta coesão:** responsabilidades relacionadas permanecem juntas
- **Baixo acoplamento:** mudanças em um componente afetam poucos outros

### Exemplo

- **Alta coesão:** serviço de Pedidos concentra o ciclo de vida do pedido
- **Acoplamento excessivo:** serviço de Catálogo conhece tabelas internas de Pagamentos

**Objetivo:** permitir evolução independente sem duplicar responsabilidades.

---

## Slide 12: Escalabilidade

### Capacidade de atender ao crescimento da demanda

Um sistema escalável mantém níveis aceitáveis de:

- Tempo de resposta
- Vazão de requisições
- Disponibilidade
- Custo por operação

### O que pode aumentar?

- Usuários simultâneos
- Volume de dados
- Requisições por segundo
- Processamento em segundo plano

---

## Slide 13: Escalabilidade Vertical

### Scale up — aumentar a capacidade de uma máquina

- Mais CPU
- Mais memória
- Disco mais rápido
- Instância maior no provedor

### Vantagens e limites

- **Vantagem:** simples, com poucas mudanças na aplicação
- **Limite:** existe uma capacidade máxima
- **Risco:** mantém maior dependência de uma única instância
- **Custo:** máquinas maiores podem ficar progressivamente mais caras

---

## Slide 14: Escalabilidade Horizontal

### Scale out — adicionar mais instâncias

```text
                 ┌→ Aplicação 1
Cliente → LB ────┼→ Aplicação 2
                 └→ Aplicação 3
```

- Distribui a carga entre várias instâncias
- Facilita redundância e tolerância a falhas
- Permite ampliar e reduzir capacidade gradualmente
- Exige cuidado com sessão, concorrência e consistência dos dados

---

## Slide 15: Escalabilidade vs. Elasticidade

| Conceito | Pergunta principal | Exemplo |
|---|---|---|
| **Escalabilidade** | O sistema suporta crescer? | Adicionar três instâncias |
| **Elasticidade** | A capacidade acompanha automaticamente a demanda? | Autoscaling durante uma promoção |

### Em nuvem

- Métricas podem acionar aumento ou redução de instâncias
- A elasticidade reduz desperdício em períodos de baixa demanda
- Limites, tempo de inicialização e custo precisam ser planejados

---

## Slide 16: Aplicações Stateless

### Evitar estado local facilita a escala horizontal

- Qualquer instância pode atender qualquer requisição
- Sessões ficam em armazenamento compartilhado ou no cliente
- Arquivos persistentes não dependem do disco local
- Instâncias podem ser substituídas sem perda de estado

### Exemplo

- **Evitar:** carrinho salvo apenas na memória da instância
- **Preferir:** carrinho salvo em banco ou cache compartilhado

---

## Slide 17: Balanceamento de Carga

### Distribuição de requisições

O balanceador pode:

- Encaminhar tráfego para instâncias saudáveis
- Distribuir carga por diferentes algoritmos
- Encerrar conexões HTTPS
- Executar verificações de saúde
- Remover temporariamente instâncias com falha

**Resultado esperado:** melhor uso dos recursos e menor ponto único de falha.

---

## Slide 18: Resiliência em Arquiteturas Distribuídas

### Projetar para falhas parciais

- **Timeout:** limitar o tempo de espera
- **Retry com backoff:** repetir com intervalos crescentes
- **Circuit breaker:** interromper chamadas para um serviço indisponível
- **Bulkhead:** isolar recursos para conter falhas
- **Fallback:** oferecer resposta alternativa ou degradada
- **Idempotência:** repetir uma operação sem duplicar seu efeito

> Retry sem limite pode aumentar uma falha e sobrecarregar o sistema.

---

## Slide 19: Comunicação Síncrona e Assíncrona

| Modelo | Característica | Uso comum |
|---|---|---|
| **Síncrono** | O solicitante aguarda a resposta | Consultas e validações imediatas |
| **Assíncrono** | O trabalho continua por mensagem/evento | E-mails, relatórios e processamento demorado |

### Trade-offs

- Síncrono: fluxo mais direto, porém maior acoplamento temporal
- Assíncrono: melhor desacoplamento, porém exige tratar duplicidade e consistência eventual

---

## Slide 20: O que são Microserviços?

### Serviços pequenos em torno de capacidades de negócio

Uma arquitetura de microserviços organiza o sistema como serviços que:

- Possuem responsabilidade de negócio bem definida
- Executam e são implantados de forma independente
- Comunicam-se por APIs, mensagens ou eventos
- Controlam seus dados e regras internas
- Podem evoluir e escalar separadamente

> “Micro” se refere ao escopo focado, não a uma quantidade fixa de linhas de código.

---

## Slide 21: Características dos Microserviços

- **Autonomia:** decisões internas pertencem ao serviço
- **Implantação independente:** uma alteração não exige publicar tudo
- **Limites claros:** contratos substituem acesso direto ao código ou banco
- **Dados sob responsabilidade do serviço**
- **Automação:** testes, deploy e infraestrutura reproduzível
- **Observabilidade:** logs, métricas e rastreamento distribuído
- **Resiliência:** falhas são isoladas e tratadas

---

## Slide 22: Benefícios Potenciais

### Quando os limites estão bem definidos

- Escala independente dos componentes mais demandados
- Isolamento de falhas
- Entregas menores e mais frequentes
- Autonomia entre equipes
- Evolução tecnológica por serviço, quando justificada
- Melhor alinhamento entre software e capacidades de negócio

**Importante:** benefícios dependem de maturidade técnica e operacional.

---

## Slide 23: Custos e Trade-offs

### O que fica mais difícil?

- Comunicação pela rede e falhas parciais
- Consistência de dados entre serviços
- Testes de integração e ponta a ponta
- Observabilidade distribuída
- Segurança entre serviços
- Versionamento de contratos e APIs
- Automação de deploy e infraestrutura
- Maior quantidade de componentes para operar

---

## Slide 24: Monólito vs. Microserviços

| Critério | Monólito | Microserviços |
|---|---|---|
| Implantação | Unidade única | Independente por serviço |
| Comunicação | Chamadas internas | Rede, APIs e mensagens |
| Dados | Frequentemente compartilhados | Preferencialmente por serviço |
| Escala | Aplicação inteira | Por componente |
| Operação | Mais simples no início | Mais distribuída e complexa |
| Equipes | Coordenação central | Maior autonomia por domínio |

**Não existe vencedor universal:** a escolha depende do contexto.

---

## Slide 25: Quando Não Usar Microserviços

### Sinais de que a complexidade pode não compensar

- Produto ainda validando requisitos básicos
- Equipe pequena sem automação e observabilidade
- Pouca necessidade de escala independente
- Domínio simples ou ainda pouco compreendido
- Deploy monolítico já é rápido e confiável
- Custo operacional supera o benefício esperado

### Alternativa

Começar com um **monólito modular** e extrair serviços quando houver evidências.

---

## Slide 26: Como Encontrar Limites de Serviços

### Decomposição por capacidade de negócio

Pergunte:

- Qual resultado de negócio este módulo entrega?
- Quais regras e dados mudam juntos?
- Quem é responsável por essa capacidade?
- Qual parte precisa escalar ou evoluir separadamente?
- Existe dependência excessiva de outro módulo?

### Exemplos em um e-commerce

**Catálogo, Clientes, Carrinho, Pedidos, Pagamentos e Entregas**.

---

## Slide 27: Dados em Microserviços

### Cada serviço controla seus dados

```text
Catálogo → Banco do Catálogo
Pedidos  → Banco de Pedidos
Pagamento → Banco de Pagamentos
```

- Outro serviço acessa dados por contrato, não diretamente por tabelas
- Cada serviço pode escolher a tecnologia adequada, com justificativa
- Transações distribuídas devem ser evitadas ou coordenadas
- Atualizações entre serviços podem resultar em consistência eventual

---

## Slide 28: API Gateway

### Uma entrada controlada para os clientes

```text
Web/Mobile → API Gateway → Catálogo
                         → Pedidos
                         → Clientes
```

O gateway pode centralizar:

- Roteamento
- Autenticação e autorização
- Limitação de requisições
- TLS/HTTPS
- Agregação de respostas
- Logs e métricas de entrada

**Cuidado:** o gateway não deve concentrar toda a regra de negócio.

---

## Slide 29: Arquitetura de Referência — E-commerce

```text
Usuários
   ↓
CDN / Front-end
   ↓
API Gateway
   ├─→ Serviço de Catálogo → Banco/Cache
   ├─→ Serviço de Clientes → Banco
   ├─→ Serviço de Pedidos  → Banco
   └─→ Serviço de Pagamentos → Gateway externo
                  ↓
             Fila de eventos
              ├─→ Estoque
              ├─→ Entregas
              └─→ Notificações
```

### Decisões visíveis

- Entrada única, serviços por capacidade e dados separados
- Processamento assíncrono para reduzir acoplamento

---

## Slide 30: Prática — Decomposição de um Monólito

### Cenário: e-commerce regional

O monólito atual contém:

- Cadastro e autenticação de clientes
- Catálogo e busca de produtos
- Carrinho de compras
- Pedidos e controle de estoque
- Pagamento por gateway externo
- Cálculo de frete e acompanhamento de entrega
- Envio de e-mail e mensagens

**Problema:** promoções geram picos no catálogo e tornam toda a aplicação instável.

---

## Slide 31: Prática — Etapa 1

### Identificar capacidades e dependências

Em grupo, respondam:

1. Quais são as capacidades de negócio?
2. Quais regras e dados pertencem a cada capacidade?
3. Quais módulos mudam juntos?
4. Qual componente sofre maior variação de carga?
5. Quais integrações externas existem?

**Tempo sugerido:** 15 minutos.

---

## Slide 32: Prática — Etapa 2

### Propor os serviços

Para cada serviço, definam:

- Nome e responsabilidade
- Dados sob seu controle
- Operações principais
- Comunicação síncrona ou assíncrona
- Dependências de outros serviços
- Necessidade de escala independente

**Regra:** evitem criar um serviço para cada tabela ou entidade.

---

## Slide 33: Prática — Etapa 3

### Desenhar e validar a arquitetura

O diagrama deve mostrar:

- Clientes e ponto de entrada
- Serviços e responsabilidades
- Bancos, cache e armazenamento
- APIs, filas ou eventos
- Integrações externas
- Caminho de uma compra completa

### Teste da proposta

- O que acontece se Notificações ficar indisponível?
- O Catálogo pode escalar sem escalar Pagamentos?
- Algum serviço acessa diretamente o banco de outro?

---

## Slide 34: Prática — Socialização

### Apresentação rápida dos grupos

Cada grupo terá até **3 minutos** para explicar:

- Limites escolhidos para os serviços
- Decisão de comunicação síncrona ou assíncrona
- Estratégia de escala para o período de promoção
- Principal trade-off da proposta

### Critério da discussão

Não buscamos uma única resposta correta, mas decisões coerentes e justificadas.

---

## Slide 35: Trabalho 2 (T2) — Lançamento

### Arquitetura de Referência: Microserviços e Containers

**Objetivo:** propor uma arquitetura em nuvem distribuída e escalável para um cenário de negócio.

- **Valor:** até 1,0 ponto de acordo com entrega e participação.
- **Modalidade:** trabalho em grupo
- **Lançamento:** Aula 03
- **Entrega:** Aula 04

---

## Slide 36: T2 — Entregável

### O documento deve conter

- Descrição resumida do cenário e dos requisitos
- Diagrama de arquitetura, preferencialmente no modelo C4 ou equivalente
- Descrição das responsabilidades de cada serviço
- Comunicação entre componentes: APIs, mensagens ou eventos
- Estratégia de dados por serviço
- Estratégia de escalabilidade e tratamento de falhas
- Estratégia de deploy, incluindo o uso previsto de containers

---

## Slide 37: T2 — Critérios de Avaliação

| Critério | Peso |
|---|---:|
| Clareza e legibilidade do diagrama | 0,20 |
| Coerência dos limites e responsabilidades | 0,25 |
| Escalabilidade e resiliência da solução | 0,20 |
| Comunicação e estratégia de dados | 0,20 |
| Justificativas e estratégia de deploy | 0,15 |
| **Total** | **1,00** |

**Não é necessário implementar a solução nesta etapa.**

---

## Slide 38: T2 — Checklist

Antes da entrega, verifiquem:

- Cada serviço possui responsabilidade clara?
- A arquitetura evita banco compartilhado sem justificativa?
- Os componentes críticos podem escalar horizontalmente?
- Falhas parciais foram consideradas?
- APIs, filas e integrações estão identificadas?
- A estratégia de deploy é compatível com os componentes?
- As decisões possuem justificativas técnicas e de negócio?

---

## Slide 39: Encerramento

### O que consolidamos hoje

- Arquiteturas distribuídas dependem da rede e convivem com falhas parciais
- Escala vertical aumenta uma máquina; escala horizontal adiciona instâncias
- Elasticidade ajusta capacidade conforme a demanda
- Microserviços oferecem autonomia e escala independente
- Essa autonomia exige automação, observabilidade e novos controles
- Bons limites surgem das capacidades de negócio, não das tabelas

---

## Slide 40: Próxima Aula

### Aula 04 — Containers e Orquestração

- Conceitos de containers e imagens
- Registro de imagens
- Docker aplicado a uma aplicação simples
- Visão geral do Kubernetes
- Pods, Deployments e Services
- Discussão de requisitos para produção
- **Entrega do T2**

---

## Slide 41: Glossário Rápido

| Termo | Significado |
|---|---|
| **API** | Interface usada para comunicação entre sistemas |
| **API Gateway** | Ponto de entrada e roteamento para APIs |
| **Backoff** | Aumento gradual do intervalo entre novas tentativas |
| **Circuit Breaker** | Padrão que interrompe chamadas para um componente em falha |
| **Coesão** | Grau de relação entre responsabilidades de um componente |
| **Idempotência** | Propriedade de repetir uma operação sem duplicar seu efeito |
| **Load Balancer (LB)** | Componente que distribui carga entre instâncias |
| **Stateless** | Componente que não depende de estado persistente local |

---

## Slide 42: Recursos e Referências

### Bibliografia da disciplina

- KOLBE JÚNIOR, Armando. *Computação em Nuvem*. Contentus, 2020.
- SOUSA NETO, Manoel Veras de. *Computação em Nuvem*. Brasport, 2015.
- MUNIZ, Antonio; IRIGOYEN, Analia. *Jornada DevOps*. Brasport, 2020.

### Leituras complementares

- NEWMAN, Sam. *Building Microservices*. 2. ed. O'Reilly Media, 2021.
- RICHARDSON, Chris. *Microservices Patterns*. Manning, 2018.
- FOWLER, Martin; LEWIS, James. *Microservices: a definition of this new architectural term*. 2014.
- Microsoft Azure Architecture Center — padrões para aplicações em nuvem
- AWS Well-Architected Framework — princípios de arquitetura em nuvem
- Google Cloud Architecture Framework — recomendações de arquitetura

---

## Slide 43: Perguntas?

### Dúvidas, comentários e feedback da aula

- Em qual cenário um monólito modular seria suficiente?
- Qual é o maior custo introduzido por microserviços?
- Que serviço do exercício deveria escalar primeiro?
- Quais decisões ainda precisam ser validadas no T2?
