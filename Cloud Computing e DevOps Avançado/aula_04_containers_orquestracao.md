# Aula 04 — Continuação da Prática e Desenvolvimento do T2

**Cloud Computing e DevOps Avançado**  
CST em Sistemas para Internet | 6º Período

---

## Slide 1: Abertura

### Aula 04 — Continuação da Aula 03

- **Professor:** Ranghetti
- **Retomada:** Prática — Socialização
- **Atividade principal:** desenvolvimento orientado do Trabalho 2 (T2)
- **Conteúdo de containers e Kubernetes:** transferido para a Aula 05

---

## Slide 2: Por que Ajustamos a Aula?

### Continuidade do percurso de aprendizagem

- A Aula 03 foi concluída antes da etapa de socialização
- Os grupos ainda precisam apresentar e discutir suas propostas
- O T2 exige decisões arquiteturais que se beneficiam de feedback em sala
- A Aula 04 será usada para:
  - Concluir a prática da Aula 03
  - Desenvolver e revisar o T2
  - Tirar dúvidas com acompanhamento do professor

---

## Slide 3: Agenda Atualizada

- Retomada rápida do cenário da Aula 03
- Socialização das arquiteturas propostas
- Discussão e feedback coletivo
- Reapresentação do objetivo e dos critérios do T2
- Desenvolvimento do trabalho em etapas
- Revisão cruzada entre grupos
- Checkpoint com o professor
- Fechamento e preparação para a Aula 05

---

## Slide 4: Onde Paramos na Aula 03?

### Decomposição de um monólito de e-commerce

Os grupos trabalharam em uma arquitetura com:

- Capacidades de negócio e limites de serviços
- Dados sob responsabilidade de cada serviço
- Comunicação síncrona ou assíncrona
- Dependências e integrações externas
- Estratégia de escala para períodos de promoção
- Tratamento inicial de falhas parciais

---

## Slide 5: Retomada do Cenário

### E-commerce regional

- Cadastro e autenticação de clientes
- Catálogo e busca de produtos
- Carrinho de compras
- Pedidos e controle de estoque
- Pagamento por gateway externo
- Frete e acompanhamento de entrega
- Envio de e-mail e mensagens

**Problema central:** promoções geram picos no catálogo e tornam a aplicação instável.

---

## Slide 6: Prática — Socialização

### Apresentação rápida dos grupos

Cada grupo terá até **10 minutos** para explicar:

- Limites escolhidos para os serviços
- Decisão de comunicação síncrona ou assíncrona
- Estratégia de escala para o período de promoção
- Principal trade-off da proposta

### Critério da discussão

Não buscamos uma única resposta correta, mas decisões coerentes e justificadas.

---

## Slide 7: Socialização — Roteiro de Escuta

### Enquanto outro grupo apresenta

Registre:

- Uma decisão arquitetural que ficou clara
- Um risco que deveria ser mais discutido
- Uma dependência que pode gerar acoplamento
- Uma alternativa diferente da proposta do seu grupo
- Uma pergunta para os autores da arquitetura

**Objetivo:** comparar decisões, não escolher um “vencedor”.

---

## Slide 8: Socialização — Feedback Coletivo

### Perguntas para cada proposta

- Os limites dos serviços correspondem a capacidades de negócio?
- O Catálogo pode escalar sem escalar todo o sistema?
- O que ocorre se Notificações ficar indisponível?
- Algum serviço acessa diretamente o banco de outro?
- Há dependência síncrona no caminho crítico da compra?
- O principal trade-off foi reconhecido pelo grupo?

---

## Slide 9: Trabalho 2 (T2) — Desenvolvimento em Sala

### Arquitetura de Referência: Microserviços e Containers

**Objetivo:** desenvolver uma proposta de arquitetura em nuvem distribuída e escalável para um cenário de negócio.

- **Valor:** até 1,0 ponto de acordo com entrega e participação
- **Modalidade:** trabalho em grupo
- **Situação nesta aula:** desenvolvimento orientado
- **Entrega:** não será realizada nesta aula; o prazo será definido ou confirmado pelo professor

---

## Slide 10: T2 — Entregável Esperado

### O documento deve conter

- Descrição resumida do cenário e dos requisitos
- Diagrama de arquitetura, preferencialmente no modelo C4 ou equivalente
- Descrição das responsabilidades de cada serviço
- Comunicação entre componentes: APIs, mensagens ou eventos
- Estratégia de dados por serviço
- Estratégia de escalabilidade e tratamento de falhas
- Estratégia de deploy, incluindo o uso previsto de containers

**Não é necessário implementar a solução nesta etapa.**

---

## Slide 11: T2 — Critérios de Avaliação

| Critério | Peso |
|---|---:|
| Clareza e legibilidade do diagrama |
| Coerência dos limites e responsabilidades |
| Escalabilidade e resiliência da solução |
| Comunicação e estratégia de dados |
| Justificativas e estratégia de deploy |
| Participação das equipes |
| **Total** | **1,00** |

---

## Slide 12: Organização da Oficina

### Papéis sugeridos no grupo

- **Facilitador:** organiza tempo e decisões
- **Arquiteto/diagramador:** atualiza o diagrama
- **Relator:** registra justificativas e riscos
- **Revisor:** confronta a proposta com os critérios
- **Porta-voz:** apresenta dúvidas e decisões nos checkpoints

Os papéis organizam a atividade, mas as decisões pertencem ao grupo.

---

## Slide 13: Etapa 1 — Cenário e Requisitos

### Tornar o problema explícito

Definam:

- Usuários e objetivos principais
- Funcionalidades essenciais
- Volume e variação de acesso
- Dados críticos
- Integrações externas
- Requisitos de disponibilidade, desempenho e segurança
- Restrições técnicas ou de custo

**Tempo sugerido:** 15 minutos.

---

## Slide 14: Etapa 2 — Limites dos Serviços

### Decompor por capacidade de negócio

Para cada serviço, registrem:

- Nome
- Responsabilidade principal
- Regras que controla
- Dados sob sua responsabilidade
- Operações oferecidas
- Dependências
- Razão para existir como serviço independente

**Evitem:** criar um serviço para cada tabela ou entidade.

---

## Slide 15: Etapa 3 — Comunicação

### APIs, mensagens e eventos

Para cada interação, indiquem:

- Origem e destino
- Informação transmitida
- Comunicação síncrona ou assíncrona
- Necessidade de resposta imediata
- Comportamento em caso de indisponibilidade
- Possibilidade de duplicação ou repetição

**Pergunta-chave:** esta dependência precisa bloquear o fluxo principal?

---

## Slide 16: Etapa 4 — Estratégia de Dados

### Responsabilidade e consistência

- Qual serviço controla cada conjunto de dados?
- Algum banco está sendo compartilhado sem justificativa?
- Como outro serviço consulta uma informação necessária?
- Quais atualizações exigem consistência imediata?
- Onde a consistência eventual é aceitável?
- Como falhas e repetições evitam registros duplicados?

O diagrama deve tornar bancos e fluxos de dados visíveis.

---

## Slide 17: Etapa 5 — Escalabilidade e Resiliência

### Preparar a arquitetura para variações e falhas

Definam:

- Componentes que precisam escalar horizontalmente
- Serviços que devem permanecer stateless
- Uso de balanceamento de carga
- Pontos de cache
- Timeouts e novas tentativas com backoff
- Isolamento de falhas
- Comportamento degradado quando uma dependência falha

---

## Slide 18: Etapa 6 — Estratégia de Deploy

### Planejamento conceitual para containers

Sem implementar, indiquem:

- Quais componentes serão empacotados separadamente
- Uma imagem prevista para cada serviço implantável
- Configurações que variam por ambiente
- Portas e dependências externas
- Necessidade de persistência
- Serviços que precisam de múltiplas réplicas
- Estratégia inicial de atualização e reversão

Os conceitos técnicos de Docker e Kubernetes serão aprofundados na Aula 05.

---

## Slide 19: Etapa 7 — Construção do Diagrama

### O diagrama deve comunicar a arquitetura

Incluam:

- Usuários ou sistemas externos
- Ponto de entrada
- Serviços e responsabilidades
- Bancos, cache e armazenamento
- APIs, filas ou eventos
- Integrações externas
- Limites de confiança ou rede, quando relevantes

**Regra:** toda seta deve representar uma comunicação compreensível.

---

## Slide 20: Revisão Cruzada entre Grupos

### Um grupo revisa a proposta de outro

Verifiquem:

- O cenário pode ser compreendido sem explicação oral?
- Os limites dos serviços são coerentes?
- Dados e comunicações estão visíveis?
- A estratégia de escala responde ao problema?
- Há tratamento para falhas críticas?
- O uso previsto de containers faz sentido?
- As justificativas apresentam trade-offs?

**Tempo sugerido:** 10 minutos.

---

## Slide 21: Checkpoint com o Professor

### Cada grupo deve apresentar

- Estado atual do diagrama
- Duas decisões arquiteturais já justificadas
- Maior dúvida em aberto
- Principal risco identificado
- Próximo passo para concluir o trabalho

### Objetivo

Receber orientação antes de consolidar uma decisão frágil ou incoerente.

---

## Slide 22: T2 — Checklist de Qualidade

Antes de encerrar a aula, verifiquem:

- Cada serviço possui responsabilidade clara?
- A arquitetura evita banco compartilhado sem justificativa?
- Componentes críticos podem escalar horizontalmente?
- Falhas parciais foram consideradas?
- APIs, filas e integrações estão identificadas?
- A estratégia de deploy é compatível com os componentes?
- O diagrama está legível?
- As decisões possuem justificativas técnicas e de negócio?

---

## Slide 23: Resultado Esperado da Aula

### Ao final da oficina, cada grupo deve possuir

- Cenário e requisitos revisados
- Diagrama em versão avançada
- Serviços e responsabilidades descritos
- Comunicação e estratégia de dados definidas
- Escalabilidade e falhas discutidas
- Estratégia conceitual de deploy registrada
- Pendências e dúvidas identificadas
- Plano para finalizar o T2

---

## Slide 24: Glossário Rápido

| Termo | Significado |
|---|---|
| **API** | Interface usada para comunicação entre sistemas |
| **Backoff** | Aumento gradual do intervalo entre novas tentativas |
| **C4** | Modelo de diagramas de contexto, containers, componentes e código |
| **Coesão** | Grau de relação entre responsabilidades de um componente |
| **Container** | Unidade prevista para empacotar uma aplicação e suas dependências |
| **Idempotência** | Propriedade de repetir uma operação sem duplicar seu efeito |
| **Stateless** | Componente que não depende de estado persistente local |
| **Trade-off** | Escolha que oferece benefícios em troca de custos ou limitações |

---

## Slide 25: Recursos e Referências

### Bibliografia da disciplina

- KOLBE JÚNIOR, Armando. *Computação em Nuvem*. Contentus, 2020.
- SOUSA NETO, Manoel Veras de. *Computação em Nuvem*. Brasport, 2015.
- MUNIZ, Antonio; IRIGOYEN, Analia. *Jornada DevOps*. Brasport, 2020.

### Leituras complementares

- NEWMAN, Sam. *Building Microservices*. 2. ed. O'Reilly Media, 2021.
- RICHARDSON, Chris. *Microservices Patterns*. Manning, 2018.
- FOWLER, Martin; LEWIS, James. *Microservices: a definition of this new architectural term*. 2014.
- C4 Model — documentação para visualização de arquitetura de software

---

## Slide 26: Encerramento e Próxima Aula

### O que realizamos hoje

- Concluímos a socialização pendente da Aula 03
- Comparamos diferentes decisões arquiteturais
- Desenvolvemos o T2 com orientação e revisão entre grupos
- Registramos riscos, trade-offs e pendências

### Aula 05 — Containers e Orquestração

- Conceitos de containers, imagens e registros
- Docker aplicado a uma aplicação simples
- Visão geral do Kubernetes
- Pods, Deployments e Services
- Requisitos para produção

---

## Slide 27: Perguntas?

### Dúvidas, comentários e próximos passos

- Qual decisão do T2 ainda precisa de validação?
- O diagrama comunica a proposta sem explicação adicional?
- Qual falha representa maior risco para a arquitetura?
- O grupo possui um plano claro para concluir o trabalho?
