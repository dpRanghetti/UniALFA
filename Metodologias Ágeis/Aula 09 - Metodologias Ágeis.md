# Aula 09 — Adaptação de Metodologias Ágeis para Projetos Web

Curso: CST em Sistemas para Internet (4º período)  
Disciplina: Metodologias Ágeis  

---

## Slide 1 — Abertura

- Metodologias Ágeis
- Aula 09: adaptação de metodologias ágeis para projetos web
- Primeira aula do segundo bimestre
- Professor Ranghetti

---

## Slide 2 — Objetivos da aula

- Compreender por que uma prática ágil precisa ser adaptada ao contexto
- Analisar características de produto, equipe, tecnologia e organização
- Comparar Scrum, Kanban e XP como fontes de práticas
- Conhecer as práticas essenciais de XP transferidas do primeiro bimestre
- Selecionar práticas coerentes para diferentes projetos web
- Identificar riscos de uma adaptação mal fundamentada
- Elaborar e justificar uma proposta inicial de abordagem ágil

---

## Slide 3 — Agenda da Aula 09

- Ajuste do cronograma do segundo bimestre
- Retomada dos fundamentos estudados
- O que significa adaptar uma metodologia
- Diagnóstico do contexto de projetos web
- Critérios para escolher Scrum, Kanban e XP
- Práticas essenciais de Extreme Programming
- Combinações e adaptações responsáveis
- Estudo de caso em grupos
- Lançamento do Trabalho B2-T1
- Glossário, referências e fechamento

---

## Slide 4 — Ajuste do calendário

- Na próxima semana ocorrerá a Jornada Acadêmica
- Não haverá aula regular da disciplina nessa semana
- Consequência:
  - O segundo bimestre terá seis aulas regulares em vez de sete
- Estratégia:
  - Preservar os conteúdos do plano de ensino
  - Integrar temas relacionados em uma mesma aula
  - Manter atividades práticas e trabalhos previstos
  - Evitar transformar o cronograma em uma sequência apenas expositiva

---

## Slide 5 — Cronograma ajustado do segundo bimestre

| Aula | Conteúdo principal |
|---:|---|
| 09 | Adaptação para projetos web e introdução às práticas de XP |
| 10 | XP, customização e combinação responsável de práticas |
| 11 | Comunicação, colaboração, auto-organização e liderança distribuída |
| 12 | Ferramentas para gestão de projetos ágeis |
| 13 | Estimativas ágeis e planejamento adaptativo |
| 14 | Revisão bimestral e fechamento do mini-projeto integrador |

- A Jornada Acadêmica acontece entre as Aulas 09 e 10

---

## Slide 6 — Trabalhos do segundo bimestre

| Trabalho | Tema | Previsão de entrega |
|---|---|---|
| B2-T1 | Escolha e adaptação da abordagem para um cenário web | Aula 10 |
| B2-T2 | Plano de colaboração, comunicação e organização do time | Aula 12 |
| B2-T3 | Configuração de ferramenta e padronização do fluxo | Aula 13 |
| B2-T4 | Mini-projeto integrador: processo, backlog e planejamento | Aula 14 |

- Cada trabalho vale até 1,0 ponto
- Total de trabalhos do bimestre: até 4,0 pontos

---

## Slide 7 — Conexão com o primeiro bimestre

- Manifesto Ágil:
  - Valores e princípios orientam decisões
- Scrum:
  - Responsabilidades, eventos, artefatos e planejamento em Sprints
- Kanban:
  - Visualização, fluxo, sistema puxado, WIP e políticas explícitas
- Trabalhos anteriores:
  - Backlog
  - Planejamento
  - Quadro Kanban
  - Simulação de fluxo
- Agora:
  - Como escolher e adaptar práticas para um contexto real?

---

## Slide 8 — O conteúdo de XP no segundo bimestre

- Extreme Programming estava previsto para o final do primeiro bimestre
- O conteúdo foi transferido para o segundo bimestre
- Nesta aula:
  - Visão geral de XP e suas práticas principais
  - Uso de XP como fonte de práticas técnicas e colaborativas
- Na Aula 10:
  - Aprofundamento em TDD, integração contínua, programação em pares e refatoração
  - Combinação responsável com Scrum e Kanban

---

## Slide 9 — Metodologia não é receita universal

- Projetos diferentes apresentam:
  - Produtos diferentes
  - Equipes diferentes
  - Tecnologias diferentes
  - Restrições diferentes
  - Níveis distintos de incerteza
- Copiar uma estrutura sem compreender o problema pode gerar:
  - Cerimônias sem propósito
  - Papéis apenas nominais
  - Quadros que não representam o fluxo
  - Métricas usadas fora de contexto
  - Mais burocracia sem melhoria de resultado

---

## Slide 10 — O que significa adaptar?

- Adaptar significa ajustar práticas ao contexto preservando sua finalidade
- Exemplos:
  - Ajustar duração de reuniões ao tamanho da equipe
  - Representar no quadro as etapas que realmente existem
  - Definir limites de WIP conforme capacidade observada
  - Escolher cadências compatíveis com a frequência de entrega
  - Aplicar práticas técnicas adequadas ao risco do produto
- Adaptar não significa remover qualquer elemento considerado desconfortável

---

## Slide 11 — Três perguntas antes de adaptar

1. Qual problema queremos resolver?
2. Que princípio ou objetivo a prática procura atender?
3. Como verificaremos se a adaptação melhorou o resultado?

- Sem um problema explícito:
  - A mudança vira preferência pessoal
- Sem compreender a finalidade:
  - A prática pode perder sua função
- Sem evidência:
  - A equipe não sabe se a adaptação funcionou

---

## Slide 12 — Contexto do produto

- Perguntas essenciais:
  - Quem utiliza ou recebe o serviço?
  - Que problema o produto resolve?
  - Com que frequência prioridades mudam?
  - Existe necessidade de lançamento rápido?
  - Falhas produzem impacto baixo, moderado ou crítico?
  - O produto está em descoberta, crescimento ou manutenção?
- A abordagem deve apoiar o fluxo de valor do produto

---

## Slide 13 — Contexto da demanda

- A demanda pode ser:
  - Planejada ou inesperada
  - Funcionalidade, defeito, suporte ou melhoria técnica
  - Frequente ou esporádica
  - Pequena ou muito variável
- Perguntas:
  - O trabalho chega continuamente?
  - Existem urgências legítimas?
  - Há datas fixas?
  - O volume supera a capacidade?
- Essas respostas influenciam cadência, priorização e gestão de fluxo

---

## Slide 14 — Contexto da equipe

- Tamanho e estabilidade da equipe
- Distribuição geográfica e horários
- Experiência técnica e de domínio
- Dependência de especialistas
- Autonomia para tomar decisões
- Capacidade de trabalhar de forma colaborativa
- Disponibilidade de Product Owner ou representantes do negócio
- Equipe nova pode precisar de acordos e facilitação mais explícitos

---

## Slide 15 — Contexto técnico

- Arquitetura e dependências do sistema
- Facilidade de executar testes automatizados
- Frequência possível de integração e implantação
- Existência de ambientes de teste
- Dívida técnica acumulada
- Requisitos de segurança e disponibilidade
- Sistemas legados podem exigir passos graduais
- Risco técnico elevado favorece ciclos curtos de feedback e validação

---

## Slide 16 — Contexto organizacional

- Estrutura de decisão
- Políticas internas
- Dependências entre equipes
- Contratos e fornecedores
- Exigências legais ou regulatórias
- Orçamento e prazos
- Cultura de transparência e feedback
- Uma equipe não controla todo o sistema organizacional
- A adaptação deve tornar dependências visíveis, não fingir que elas não existem

---

## Slide 17 — Restrições não são desculpas automáticas

- Uma restrição pode ser real:
  - Equipe compartilhada
  - Janela limitada de implantação
  - Aprovação externa
  - Tecnologia legada
- A equipe deve:
  - Tornar a restrição transparente
  - Medir seu impacto
  - Reduzir riscos quando possível
  - Evitar transformar uma limitação temporária em regra permanente
- Adaptar exige pensamento crítico e responsabilidade

---

## Slide 18 — Critérios para avaliar uma prática

| Critério | Pergunta de análise |
|---|---|
| Valor | A prática aproxima a equipe de um resultado relevante? |
| Feedback | Produz aprendizado em tempo útil? |
| Fluxo | Ajuda o trabalho a avançar até a entrega? |
| Qualidade | Reduz defeitos e facilita mudança segura? |
| Transparência | Torna decisões e problemas compreensíveis? |
| Viabilidade | A equipe consegue aplicar e sustentar a prática? |

---

## Slide 19 — Quando Scrum pode ajudar

- Produto complexo com necessidade de aprendizado frequente
- Equipe capaz de trabalhar por objetivos de curto prazo
- Product Owner disponível para decisões sobre valor
- Benefício de uma cadência regular de inspeção e adaptação
- Necessidade de foco por meio de Sprint Goal
- Interesse em construir Increments utilizáveis
- Scrum fornece uma estrutura mínima; não define todas as práticas técnicas

---

## Slide 20 — Cuidados ao escolher Scrum

- Não usar Sprint apenas como divisão administrativa do calendário
- Não transformar Daily Scrum em relatório ao gerente
- Não atribuir ao Scrum Master o papel de chefe
- Não tratar Sprint Review como aceite burocrático
- Não preencher a Sprint acima da capacidade apenas para ocupar pessoas
- Não reduzir o Sprint Goal a uma lista de tarefas
- Scrum exige responsabilidades reais, não apenas novos títulos

---

## Slide 21 — Quando Kanban pode ajudar

- Demandas chegam continuamente
- Trabalho possui tamanhos e tipos variados
- Interrupções e suporte fazem parte do serviço
- Existe necessidade de visualizar filas e bloqueios
- A equipe quer melhorar um processo existente gradualmente
- Limites de WIP podem ajudar a equilibrar demanda e capacidade
- Cadências podem ser definidas conforme as necessidades do serviço

---

## Slide 22 — Cuidados ao escolher Kanban

- Quadro sem políticas não orienta decisões
- Mover cartões não significa gerenciar fluxo
- Limite de WIP ignorado não produz o efeito esperado
- Toda demanda marcada como urgente destrói a priorização
- Métricas não devem ser usadas para vigiar pessoas
- Começar com o processo atual não significa aceitar problemas para sempre
- A evolução precisa ser colaborativa e baseada em evidências

---

## Slide 23 — O que é Extreme Programming?

- Abordagem ágil voltada ao desenvolvimento de software
- Ênfase em:
  - Qualidade técnica
  - Feedback rápido
  - Colaboração próxima
  - Mudanças frequentes e seguras
  - Entregas pequenas
- XP reúne valores, princípios e práticas
- Suas práticas podem complementar estruturas de gestão como Scrum ou Kanban

---

## Slide 24 — Valores associados ao XP

- Comunicação
- Simplicidade
- Feedback
- Coragem
- Respeito

- Os valores ajudam a compreender a intenção das práticas
- Exemplo:
  - Programação em pares reforça comunicação e feedback
  - Refatoração exige coragem para melhorar o código com segurança
  - Design simples evita complexidade sem necessidade atual

---

## Slide 25 — Práticas de XP previstas no plano

- Desenvolvimento orientado a testes — TDD
- Integração contínua
- Programação em pares
- Refatoração
- Melhoria contínua
- Outras práticas relacionadas:
  - Entregas pequenas
  - Propriedade coletiva do código
  - Padrões de codificação
  - Design simples
- O aprofundamento ocorrerá na Aula 10

---

## Slide 26 — TDD: visão inicial

- TDD — Test-Driven Development
- Ciclo básico:
  1. Escrever um teste que falha
  2. Implementar o mínimo para o teste passar
  3. Refatorar mantendo os testes verdes
- Conhecido como:
  - Red → Green → Refactor
- Objetivo:
  - Guiar o desenvolvimento por exemplos verificáveis
  - Criar feedback rápido sobre o comportamento do código

---

## Slide 27 — Integração contínua: visão inicial

- Integrar alterações pequenas com frequência
- Verificar automaticamente, quando possível:
  - Compilação
  - Testes
  - Regras de qualidade
- Benefícios esperados:
  - Descobrir conflitos cedo
  - Reduzir grandes integrações tardias
  - Manter o produto em estado conhecido
- Não é apenas instalar uma ferramenta de pipeline

---

## Slide 28 — Programação em pares: visão inicial

- Duas pessoas colaboram sobre a mesma tarefa
- Papéis que se alternam:
  - Driver: manipula o código
  - Navigator: revisa, pensa adiante e questiona
- Pode ser útil em:
  - Problemas complexos
  - Transferência de conhecimento
  - Partes críticas do sistema
  - Integração de novos integrantes
- Não precisa ser aplicada da mesma forma em todas as tarefas

---

## Slide 29 — Refatoração: visão inicial

- Melhorar a estrutura interna do código sem alterar seu comportamento observável
- Possíveis objetivos:
  - Remover duplicação
  - Melhorar nomes
  - Simplificar estruturas
  - Facilitar manutenção
- Refatoração não é:
  - Adicionar nova funcionalidade
  - Reescrever tudo sem testes
  - Alterar comportamento sem controle
- Testes reduzem o risco da mudança

---

## Slide 30 — Quando práticas de XP podem ajudar

- Mudanças de requisito são frequentes
- Defeitos geram alto custo
- Código precisa evoluir por longo período
- Equipe integra alterações continuamente
- Conhecimento está concentrado em poucas pessoas
- Feedback técnico demora demais
- A escolha deve considerar:
  - Maturidade da equipe
  - Automação disponível
  - Risco e criticidade do produto

---

## Slide 31 — Scrum, Kanban e XP: ênfases

| Abordagem | Ênfase principal nesta disciplina |
|---|---|
| Scrum | Estrutura para criar valor em Sprints com responsabilidades e eventos definidos |
| Kanban | Gestão e melhoria do fluxo de trabalho por sistema visual e puxado |
| XP | Práticas técnicas e colaborativas para qualidade e feedback rápido |

- As abordagens não são peças idênticas
- Combinar exige compreender a finalidade de cada prática

---

## Slide 32 — Exemplo de combinação coerente

- Contexto:
  - Equipe de produto web trabalhando em Sprints
- Possível combinação:
  - Scrum para objetivos, eventos e responsabilidades
  - Quadro com limites de WIP para visualizar o fluxo dentro da Sprint
  - TDD e integração contínua para feedback técnico
  - Programação em pares em itens críticos
- Condição:
  - A combinação não deve contradizer o Sprint Goal nem tornar responsabilidades confusas

---

## Slide 33 — Exemplo de adaptação incoerente

- Situação:
  - Equipe afirma usar Scrum
- Decisões:
  - Não existe Product Owner disponível
  - Gerente distribui tarefas na Daily
  - Sprint Goal não é definido
  - Review ocorre apenas para cobrar atrasos
  - Trabalho urgente entra sem transparência
- Problema:
  - Os nomes foram mantidos, mas as finalidades foram removidas
- Resultado provável:
  - “Ágil de fachada”

---

## Slide 34 — Ágil de fachada

- Uso de termos ágeis sem mudança real no modo de decidir e colaborar
- Sinais:
  - Cerimônias sem inspeção ou adaptação
  - Backlog usado apenas como lista de ordens
  - Equipe sem autonomia mínima
  - Mudanças impostas sem discussão de valor
  - Métricas usadas para pressão individual
  - Qualidade sacrificada continuamente
- Trocar vocabulário não transforma o sistema de trabalho

---

## Slide 35 — Adaptação responsável

- Parte de um problema observado
- Respeita valores e princípios
- Mantém clara a finalidade da prática
- Define responsabilidades e políticas
- Torna a mudança transparente
- Estabelece evidências para avaliar o resultado
- Revisa a decisão após um período
- Documenta apenas o necessário para criar entendimento comum

---

## Slide 36 — Processo de diagnóstico

1. Descrever o produto e o serviço
2. Identificar usuários e stakeholders
3. Mapear tipos de demanda
4. Analisar equipe, tecnologia e organização
5. Identificar dores e riscos principais
6. Selecionar princípios e práticas relevantes
7. Definir como o trabalho fluirá
8. Estabelecer feedback e evidências
9. Revisar a proposta após experimentar

---

## Slide 37 — Matriz para escolher práticas

| Necessidade observada | Práticas candidatas |
|---|---|
| Prioridades mudam com frequência | Backlog ordenado, ciclos curtos e revisões frequentes |
| Trabalho acumula em etapas | Visualização, limites de WIP e gestão de fluxo |
| Objetivo de curto prazo pouco claro | Sprint Goal e Sprint Planning |
| Defeitos aparecem tarde | TDD, integração contínua e entregas pequenas |
| Conhecimento concentrado | Programação em pares e propriedade coletiva |
| Código difícil de alterar | Testes, refatoração e padrões de codificação |

- A matriz sugere hipóteses; não substitui análise do contexto

---

## Slide 38 — Perguntas para justificar uma escolha

- Qual problema será atacado primeiro?
- Por que esta prática é adequada?
- Que comportamento precisa mudar?
- Quem participa da prática?
- Que política ou acordo é necessário?
- Que risco a adoção introduz?
- Como reduzir esse risco?
- Que evidência indicará melhoria?
- Quando a decisão será revisada?

---

## Slide 39 — Caso A: startup em descoberta

- Produto:
  - Plataforma web ainda validando público e proposta de valor
- Contexto:
  - Equipe pequena e dedicada
  - Prioridades mudam após entrevistas
  - Necessidade de experimentos rápidos
  - Código cresce rapidamente
- Pergunta:
  - Que combinação de práticas pode equilibrar aprendizado e qualidade?

---

## Slide 40 — Análise possível do Caso A

- Backlog ordenado por hipóteses e valor
- Ciclos curtos com objetivo claro
- Reviews frequentes com usuários ou stakeholders
- Entregas pequenas
- Integração contínua
- Testes automatizados para comportamentos críticos
- Refatoração para conter complexidade crescente
- Risco:
  - Mudar direção sem preservar qualidade básica

---

## Slide 41 — Caso B: equipe de suporte web

- Serviço:
  - Correções, pequenas melhorias e atendimento de incidentes
- Contexto:
  - Demanda contínua
  - Tamanhos variados
  - Interrupções frequentes
  - Alguns itens possuem prazo fixo
- Pergunta:
  - Uma Sprint com escopo fechado é a melhor forma de organizar toda a demanda?

---

## Slide 42 — Análise possível do Caso B

- Kanban como base para gestão do fluxo
- Classes de serviço com políticas claras
- Limites de WIP
- Bloqueios visíveis
- Cadência de reposição e revisão do serviço
- Programação em pares para incidentes complexos
- Integração contínua para reduzir risco de correções
- Risco:
  - Marcar toda solicitação como urgente e destruir o fluxo

---

## Slide 43 — Caso C: produto regulamentado

- Produto:
  - Sistema web com dados sensíveis e auditoria obrigatória
- Contexto:
  - Evidências documentais são necessárias
  - Mudanças exigem validação
  - Falhas possuem alto impacto
- Pergunta:
  - Ser ágil significa eliminar documentação e controles?

---

## Slide 44 — Análise possível do Caso C

- Documentação necessária integrada ao fluxo e à DoD
- Critérios de aceitação incluindo requisitos regulatórios
- Revisões com especialistas
- Automação de testes e integração quando possível
- Rastreabilidade suficiente para auditoria
- Entregas menores para reduzir risco
- Políticas explícitas para aprovação
- Agilidade busca feedback e adaptação, não ausência de responsabilidade

---

## Slide 45 — Atividade prática: diagnóstico do cenário

- Organização:
  - Grupos de 3–5 alunos
  - Tempo sugerido: 35–45 minutos
- Cada grupo recebe ou escolhe um cenário de projeto web
- Deve analisar:
  - Produto e usuários
  - Tipos de demanda
  - Equipe
  - Tecnologia
  - Organização e restrições
  - Principais dores e riscos

---

## Slide 46 — Atividade prática: proposta

- Selecionar uma abordagem principal:
  - Scrum
  - Kanban
  - XP
  - Combinação justificada
- Definir:
  - Objetivo da escolha
  - Práticas que serão adotadas
  - Práticas que não são prioridade agora
  - Fluxo ou cadência de trabalho
  - Responsabilidades e políticas
  - Feedback esperado
- Evitar listar práticas sem relacioná-las ao problema

---

## Slide 47 — Atividade prática: riscos e evidências

- Identificar pelo menos três riscos da proposta
- Para cada risco:
  - Explicar impacto possível
  - Definir uma ação de mitigação
- Definir três evidências para acompanhar a adaptação
- Exemplos:
  - Tempo de entrega
  - Quantidade de itens bloqueados
  - Frequência de defeitos
  - Cumprimento de objetivos
  - Feedback de usuários
  - Clareza percebida pela equipe

---

## Slide 48 — Atividade prática: apresentação

- Cada grupo apresenta em até 4 minutos:
  - Contexto resumido
  - Problema prioritário
  - Abordagem e práticas escolhidas
  - Principal justificativa
  - Um risco e sua mitigação
  - Uma evidência de melhoria
- A turma deve questionar:
  - A escolha resolve o problema descrito?
  - Alguma prática perdeu sua finalidade?

---

## Slide 49 — Trabalho B2-T1: lançamento

- Tema:
  - Escolha e adaptação de metodologia para um projeto web
- Valor:
  - Até 1,0 ponto
- Equipes:
  - Conforme organização definida pelo professor
- Entrega:
  - Aula 10, após a semana da Jornada Acadêmica
- Objetivo:
  - Demonstrar capacidade de diagnosticar um contexto e justificar práticas adequadas

---

## Slide 50 — B2-T1: entregáveis

- Descrição do produto ou serviço web
- Usuários e stakeholders principais
- Diagnóstico contendo:
  - Demanda
  - Equipe
  - Tecnologia
  - Organização e restrições
- Problemas e riscos prioritários
- Abordagem escolhida ou combinação proposta
- Práticas selecionadas e justificativas
- Fluxo ou cadência resumida
- Riscos da adoção e ações de mitigação
- Evidências para avaliar a proposta

---

## Slide 51 — B2-T1: critérios de avaliação

| Critério | Pontuação |
|---|---:|
| Clareza e profundidade do diagnóstico |  |
| Coerência da abordagem e das práticas escolhidas |  |
| Qualidade das justificativas |  |
| Riscos, mitigações e evidências propostas |  |
| Organização e apresentação do material |  |
| **Total** | **1,00** |

---

## Slide 52 — Checklist do B2-T1

- O contexto está compreensível?
- O problema prioritário foi explicitado?
- A equipe analisou produto, demanda, pessoas e tecnologia?
- Cada prática responde a uma necessidade?
- A finalidade das práticas foi preservada?
- Responsabilidades e políticas estão claras?
- A proposta evita “ágil de fachada”?
- Riscos e mitigações são realistas?
- Existem evidências para revisar a adaptação?
- Outro grupo conseguiria compreender e questionar a decisão?

---

## Slide 53 — Glossário: adaptação

| Termo | Significado |
|---|---|
| **Contexto** | Conjunto de características do produto, equipe, tecnologia e organização |
| **Adaptação** | Ajuste de práticas ao contexto, preservando sua finalidade |
| **Customização** | Configuração deliberada do modo de trabalho para necessidades específicas |
| **Restrição** | Condição que limita opções ou capacidade do sistema |
| **Hipótese** | Explicação ou proposta que precisa ser verificada por evidências |
| **Evidência** | Informação observável usada para avaliar uma decisão |
| **Mitigação** | Ação para reduzir probabilidade ou impacto de um risco |

---

## Slide 54 — Glossário: abordagens e práticas

| Termo | Significado |
|---|---|
| **Scrum** | Framework para gerar valor em problemas complexos por meio de soluções adaptativas |
| **Kanban** | Estratégia para otimizar fluxo de valor em um sistema visual e puxado |
| **XP** | Abordagem ágil com forte ênfase em práticas técnicas, feedback e qualidade |
| **TDD** | Desenvolvimento orientado por testes no ciclo Red, Green e Refactor |
| **Integração contínua** | Integração e verificação frequente de pequenas alterações |
| **Programação em pares** | Colaboração de duas pessoas sobre a mesma tarefa, alternando papéis |
| **Refatoração** | Melhoria da estrutura interna sem alterar o comportamento observável |

---

## Slide 55 — Referências bibliográficas

### Bibliografia prevista no plano de ensino

- DINSMORE, Paul C.; BREWIN, Jeannette C. *AMA — Manual de Gerenciamento de Projetos*. Brasport, 2009.
- VARGAS, Ricardo. *Manual Prático do Plano de Projeto: Utilizando o PMBOK Guide*. 3. ed. Brasport, 2007.
- PRESSMAN, Roger S. *Engenharia de Software*. 6. ed. Porto Alegre: AMGH, 2010.
- SCHWABER, Ken. *Agile Project Management with Scrum*. 1. ed. Microsoft Press, 2004.

---

## Slide 56 — Referências e leituras complementares

- BECK, Kent et al. *Manifesto for Agile Software Development*. Disponível em: https://agilemanifesto.org/
- BECK, Kent; ANDRES, Cynthia. *Extreme Programming Explained: Embrace Change*. 2. ed. Addison-Wesley, 2004.
- SCHWABER, Ken; SUTHERLAND, Jeff. *The Scrum Guide*. Novembro de 2020. Disponível em: https://scrumguides.org/
- COLEMAN, John et al. *The Kanban Guide*. Maio de 2025. Disponível em: https://kanbanguides.org/the-kanban-guide/
- KANBAN UNIVERSITY. *The Official Guide to The Kanban Method*. Disponível em: https://kanban.university/kanban-guide/

---

## Slide 57 — Fechamento e próxima aula

- Hoje:
  - Diagnóstico de contexto para projetos web
  - Critérios para selecionar Scrum, Kanban e XP
  - Visão inicial das práticas de XP
  - Adaptação responsável e riscos de “ágil de fachada”
  - Lançamento do B2-T1
- Próxima semana:
  - Jornada Acadêmica — sem aula regular da disciplina
- Aula 10:
  - XP, customização e combinação responsável de práticas
  - Entrega e feedback do B2-T1

---

## Slide 58 — Perguntas?

- Qual aspecto do contexto mais influencia a escolha?
- Quando uma combinação deixa de ser coerente?
- Como saber se uma adaptação melhorou o trabalho?
- Que prática de XP parece mais útil para o cenário do grupo?
- Todos compreenderam os entregáveis do B2-T1?

