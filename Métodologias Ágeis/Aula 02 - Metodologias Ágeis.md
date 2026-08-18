# Aula 02 — Manifesto Ágil e comparação com abordagens tradicionais

Curso: CST em Sistemas para Internet (4º período)  
Disciplina: Metodologias Ágeis  

---

## Slide 1 — Abertura

- Metodologias Ágeis
- Aula 02: Manifesto Ágil e comparação com abordagens tradicionais
- Professor Ranghetti

---

## Slide 2 — Agenda da Aula 02

- Entrega e feedback do Trabalho (B1-T1)
- Manifesto Ágil em profundidade:
  - Valores
  - Princípios (por que existem e o que mudam na prática)
- Comparação: Ágil vs tradicional
  - Planejamento
  - Mudanças
  - Documentação
  - Feedback
- Atividade prática (case): replanejamento frente a mudança de requisito
- Fechamento

---

## Slide 3 — Conexão com a Aula 01

- Aula 01:
  - Panorama: Scrum, Kanban, XP
  - Contexto Waterfall vs Ágil
  - Introdução ao Manifesto Ágil
- Aula 02:
  - Aprofundar valores e princípios
  - Entender consequências práticas no desenvolvimento web

---

## Slide 4 — Trabalho (B1-T1): entrega e feedback

- Entrega:
  - 1 página conforme enunciado (valores/princípios + exemplos + riscos)
- Feedback (critérios sugeridos):
  - Clareza do contexto do produto web
  - Coerência dos exemplos com os valores/princípios
  - Riscos bem explicados (impacto real)
  - Objetividade (1 página)

---

## Slide 5 — Manifesto Ágil: o que é (e o que NÃO é)

- O que é:
  - Um conjunto de valores e princípios para orientar decisões
  - Foco em entregar valor com aprendizado contínuo
- O que NÃO é:
  - “Sem planejamento”
  - “Sem documentação”
  - “Sem processo”
  - “Cada um faz do seu jeito”

---

## Slide 6 — Os 4 valores do Manifesto Ágil

- Indivíduos e interações MAIS que processos e ferramentas
- Software em funcionamento MAIS que documentação abrangente
- Colaboração com o cliente MAIS que negociação de contratos
- Responder a mudanças MAIS que seguir um plano

---

## Slide 7 — Valor 1: Indivíduos e interações

- Por que existe:
  - Em trabalho complexo, comunicação e alinhamento geram resultado
- Na prática:
  - Ritmo de conversa (dailies, reviews, refinamentos)
  - Acordos claros de trabalho e definição de pronto
  - Transparência sobre impedimentos
- Risco quando ignorado:
  - Retrabalho por desalinhamento

---

## Slide 8 — Valor 2: Software em funcionamento

- Por que existe:
  - O cliente só valida valor quando vê e usa
- Na prática em web:
  - Entregar incrementos pequenos, mas “utilizáveis”
  - Testes e automação para reduzir risco
  - Deploy mais frequente (quando possível)
- Risco quando ignorado:
  - “100% documentado” e 0% entregue

---

## Slide 9 — Valor 3: Colaboração com o cliente

- Por que existe:
  - Requisitos mudam; entendimento melhora com exemplos e uso
- Na prática:
  - Reviews/demos frequentes
  - Feedback estruturado (o que manter, o que mudar, novas necessidades)
  - Priorizar por valor
- Risco quando ignorado:
  - Entregar algo “conforme contrato”, mas inútil para o usuário

---

## Slide 10 — Valor 4: Responder a mudanças

- Por que existe:
  - Mudança é inevitável em produtos digitais
- Na prática:
  - Replanejar com base em evidências (dados/feedback)
  - Ajustar backlog e escopo do sprint/release
  - Manter arquitetura e código evolutivos (qualidade técnica)
- Risco quando ignorado:
  - Plano vira “prisão” e impede evolução

---

## Slide 11 — Os 12 princípios (visão geral)

- Entrega contínua de valor
- Mudanças bem-vindas
- Entregas frequentes
- Trabalho conjunto (negócio + dev)
- Pessoas motivadas e ambiente adequado
- Comunicação face a face (ou equivalente)
- Software funcionando como medida de progresso
- Ritmo sustentável
- Excelência técnica
- Simplicidade
- Times auto-organizados
- Reflexão e ajuste frequentes

---

## Slide 12 — Princípios em foco (1): Entregas frequentes + feedback

- O que muda:
  - Trabalho em partes menores
  - Reduzir lote (batch) de entrega
- Benefícios:
  - Aprender mais rápido
  - Detectar erro cedo
  - Ajustar rota antes do custo explodir
- Exemplo web:
  - Feature liberada para um grupo pequeno (beta) e ajustada

---

## Slide 13 — Princípios em foco (2): Mudanças bem-vindas (com controle)

- Não é “mudança sem critério”
- É:
  - Repriorizar com base em valor, custo e risco
  - Usar backlog para negociar escopo
  - Proteger o time de interrupções dentro do sprint (quando aplicável)

---

## Slide 14 — Princípios em foco (3): Excelência técnica

- Sem qualidade técnica, o ágil “quebra”
- Excelência técnica ajuda a:
  - Manter velocidade ao longo do tempo
  - Reduzir bugs e retrabalho
  - Fazer mudanças com menor risco
- Conexão com XP:
  - testes, CI, refatoração, padrões

---

## Slide 15 — Comparação: Ágil vs tradicional (visão rápida)

- Tradicional (em geral):
  - Grande planejamento inicial
  - Fases sequenciais
  - Mudança é exceção
  - Validação chega tarde
- Ágil:
  - Planejamento iterativo e adaptativo
  - Entregas frequentes
  - Mudança é esperada
  - Validação contínua (feedback)

---

## Slide 16 — Comparação (1): Planejamento

- Tradicional:
  - Planejar “o todo” antes de executar
  - Revisões mais raras
- Ágil:
  - Planejar o suficiente para começar
  - Replanejar frequentemente
  - Planejamento baseado em evidências (entregas, feedback, métricas)

---

## Slide 17 — Comparação (2): Mudanças

- Tradicional:
  - Mudança vira custo alto e burocracia
- Ágil:
  - Mudança entra no backlog e é repriorizada
  - Escopo é negociável; objetivo/valor é prioritário

---

## Slide 18 — Comparação (3): Documentação

- Não é “sem documentação”
- É:
  - Documentar o que gera valor e reduz risco
  - Preferir documentação leve, viva e próxima do código
- Exemplos em web:
  - README, ADRs simples, OpenAPI/Swagger, diagramas mínimos

---

## Slide 19 — Comparação (4): Feedback

- Tradicional:
  - Feedback normalmente no fim (aceitação/homologação)
- Ágil:
  - Feedback contínuo (review, demo, testes com usuário, métricas)
- Pergunta norteadora:
  - “O que aprendemos desde a última entrega?”

---

## Slide 20 — Atividade prática (case): mudança de requisito

- Cenário (exemplo):
  - Time está construindo um sistema web de agendamento
  - Metade do sprint já foi executada
  - Cliente pede: “agora precisa de login social e perfis de usuário”
- Desafio:
  - O que fazer num processo tradicional?
  - O que fazer num processo ágil?

---

## Slide 21 — Atividade prática: instruções

- Organização:
  - Grupos pequenos (3–5)
  - Tempo: 20–25 min
- Entrega do grupo:
  - 1 slide (ou 1 página) com:
    - Impactos da mudança
    - Opção tradicional (como trataria)
    - Opção ágil (como trataria)
    - Decisão final e justificativa (valor, risco, prazo)

---

## Slide 22 — Fechamento e próxima aula

- Hoje:
  - Manifesto Ágil (valores e princípios)
  - Comparação com abordagens tradicionais
  - Case de replanejamento por mudança
- Próxima aula:
  - Scrum: papéis, artefatos e cerimônias
  - Atividade: montar Product Backlog inicial
