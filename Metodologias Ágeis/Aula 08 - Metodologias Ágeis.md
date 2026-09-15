# Aula 08 — Revisão do Primeiro Bimestre

Curso: CST em Sistemas para Internet (4º período)  
Disciplina: Metodologias Ágeis  

---

## Slide 1 — Abertura

- Metodologias Ágeis
- Aula 08: revisão do primeiro bimestre
- Manifesto Ágil, Scrum e Kanban
- Professor Ranghetti

---

## Slide 2 — Objetivos da aula

- Revisar os conceitos essenciais do primeiro bimestre
- Relacionar valores ágeis a decisões práticas
- Diferenciar responsabilidades, artefatos e eventos do Scrum
- Revisar histórias de usuário, critérios de aceitação e planejamento
- Consolidar fluxo, sistema puxado, WIP e políticas no Kanban
- Identificar alternativas incorretas por meio de análise conceitual
- Preparar-se para a avaliação bimestral

---

## Slide 3 — Agenda da Aula 08

- Escopo da avaliação
- Manifesto Ágil e planejamento adaptativo
- Scrum: empirismo, responsabilidades, artefatos e eventos
- Histórias de usuário, critérios de aceitação e refinamento
- Product Goal, Sprint Goal, DoR e DoD
- Kanban: princípios, fluxo, WIP e políticas explícitas
- Casos para discussão
- Simulado e correção comentada
- Glossário, referências e fechamento

---

## Slide 4 — Escopo da revisão

| Bloco | Conteúdos principais |
|---|---|
| Fundamentos ágeis | Manifesto Ágil e planejamento adaptativo |
| Scrum | Empirismo, responsabilidades, artefatos e eventos |
| Planejamento Scrum | Histórias, critérios, objetivos, refinamento, DoR e DoD |
| Kanban | Evolução do processo, visualização, sistema puxado, WIP e políticas |

- Extreme Programming (XP) não integra esta revisão
- XP, TDD, integração contínua, programação em pares e refatoração foram transferidos para o próximo bimestre

---

## Slide 5 — Como estudar conceitos ágeis

- Não memorize apenas nomes
- Para cada conceito, pergunte:
  - Que problema ele ajuda a resolver?
  - Quem participa ou assume responsabilidade?
  - Que informação precisa ficar transparente?
  - Que decisão pode ser adaptada?
- Ao analisar uma alternativa:
  - Desconfie de afirmações absolutas como “sempre”, “nunca” e “somente”
  - Verifique se o texto transforma colaboração em comando e controle
  - Observe se o conceito foi associado ao elemento correto

---

## Slide 6 — Por que o ágil surgiu?

- Projetos de software convivem com:
  - Mudanças de necessidade
  - Incerteza técnica
  - Aprendizado durante o desenvolvimento
  - Necessidade de feedback rápido
- Abordagens ágeis procuram:
  - Entregar valor em partes menores
  - Aprender com resultados reais
  - Adaptar planos sem perder direção
  - Aproximar equipe, cliente e demais stakeholders

---

## Slide 7 — Os quatro valores do Manifesto Ágil

| Valorizamos mais | Sem eliminar o valor de |
|---|---|
| Indivíduos e interações | Processos e ferramentas |
| Software em funcionamento | Documentação abrangente |
| Colaboração com o cliente | Negociação de contratos |
| Responder a mudanças | Seguir um plano |

- Os elementos da coluna direita continuam tendo valor
- A prioridade está no que melhora colaboração, aprendizado e entrega de valor

---

## Slide 8 — Interpretando corretamente os valores

- “Software em funcionamento” não significa ausência de documentação
- “Responder a mudanças” não significa ausência de planejamento
- “Indivíduos e interações” não significa trabalhar sem processo
- “Colaboração com o cliente” não elimina contratos
- A ideia central é equilibrar práticas e priorizar resultados úteis
- Uma alternativa que elimina completamente o lado direito distorce o Manifesto

---

## Slide 9 — Princípios ágeis em ação

- Entrega frequente de valor
- Aceitação responsável de mudanças
- Colaboração entre negócio e desenvolvimento
- Comunicação direta quando apropriada
- Ritmo sustentável
- Atenção à excelência técnica
- Simplicidade
- Times capazes de organizar o próprio trabalho
- Reflexão e melhoria contínua

---

## Slide 10 — Planejamento tradicional e planejamento ágil

| Aspecto | Ênfase tradicional | Ênfase ágil |
|---|---|---|
| Planejamento | Detalhamento antecipado mais amplo | Detalhamento progressivo |
| Mudanças | Controladas em relação ao plano-base | Avaliadas conforme valor e evidências |
| Entrega | Fases ou grandes marcos | Incrementos frequentes |
| Feedback | Pode ocorrer mais tarde | Procurado ao longo do trabalho |
| Previsão | Apoiada no plano inicial | Atualizada com aprendizado e dados |

- Nenhuma abordagem elimina a necessidade de responsabilidade e planejamento

---

## Slide 11 — Plano adaptativo

- O plano orienta decisões atuais
- Não deve ser tratado como promessa imutável
- Conforme novas evidências surgem:
  - Prioridades podem mudar
  - Itens podem ser divididos ou removidos
  - Previsões podem ser atualizadas
  - Riscos podem alterar a ordem do trabalho
- Adaptar o plano não significa abandonar o objetivo
- Significa usar o aprendizado para aumentar a qualidade da decisão

---

## Slide 12 — Caso rápido: mudança de requisito

- Situação:
  - Uma equipe planejou um portal de agendamento
  - Usuários demonstraram dificuldade para confirmar horários
  - Uma melhoria de confirmação tornou-se mais valiosa que um relatório previsto
- Em uma postura ágil, a equipe deve:
  - Tornar a nova evidência transparente
  - Avaliar valor, risco e impacto
  - Reordenar o trabalho quando apropriado
  - Preservar qualidade e objetivos relevantes
- Discussão:
  - O que não deve ser feito automaticamente?

---

## Slide 13 — Scrum e empirismo

- Scrum ajuda pessoas e equipes a gerar valor por meio de soluções adaptativas
- Baseia-se em empirismo:
  - Conhecimento vem da experiência
  - Decisões são tomadas com base no que é observado
- Também emprega pensamento Lean:
  - Reduzir desperdício
  - Focar o essencial
- Ciclos curtos favorecem inspeção e adaptação frequentes

---

## Slide 14 — Os três pilares do Scrum

| Pilar | Significado prático |
|---|---|
| Transparência | Trabalho, objetivos e estado precisam ser compreensíveis |
| Inspeção | Resultados e progresso são examinados com frequência adequada |
| Adaptação | Processo ou plano é ajustado quando existem desvios ou aprendizado |

- Sem transparência, a inspeção pode produzir conclusões incorretas
- Inspeção sem adaptação não gera melhoria
- Adaptação tardia aumenta o risco e o desperdício

---

## Slide 15 — Valores do Scrum

- Compromisso
- Foco
- Abertura
- Respeito
- Coragem

- Os valores orientam comportamento e decisões
- Eles apoiam os pilares, mas não substituem transparência, inspeção e adaptação
- Questão frequente:
  - Valores do Scrum e pilares do empirismo são conjuntos diferentes

---

## Slide 16 — Scrum Team

- Unidade fundamental do Scrum
- Formado por:
  - Product Owner
  - Scrum Master
  - Developers
- Características:
  - Multidisciplinar
  - Autogerenciável
  - Focado em um Product Goal por vez
  - Responsável por criar um Increment valioso em cada Sprint
- Não existem subequipes ou hierarquias internas definidas pelo Scrum

---

## Slide 17 — Responsabilidades no Scrum Team

| Responsabilidade | Foco principal |
|---|---|
| Product Owner | Maximizar valor e gerir eficazmente o Product Backlog |
| Scrum Master | Estabelecer Scrum e apoiar a efetividade do Scrum Team |
| Developers | Criar o plano da Sprint e um Increment que atenda à DoD |

- O Product Owner é uma pessoa, não um comitê
- O Scrum Master não é chefe hierárquico nem distribuidor de tarefas
- Developers decidem como realizar o trabalho selecionado

---

## Slide 18 — Product Owner

- Maximiza o valor resultante do trabalho do Scrum Team
- Responde pela gestão eficaz do Product Backlog
- Deve garantir que:
  - O Product Goal seja desenvolvido e comunicado
  - Os itens sejam compreendidos
  - O backlog seja ordenado
  - O Product Backlog seja transparente e visível
- Pode delegar atividades, mas continua responsável pelo resultado

---

## Slide 19 — Scrum Master

- Ajuda a estabelecer o Scrum conforme definido no Scrum Guide
- Apoia a efetividade do Scrum Team
- Atua por meio de:
  - Ensino e facilitação
  - Remoção de impedimentos
  - Apoio ao autogerenciamento
  - Ajuda à organização na adoção do Scrum
- Não atribui tarefas individuais
- Não transforma a Daily Scrum em prestação de contas para um chefe

---

## Slide 20 — Developers

- Comprometem-se a criar um Increment utilizável a cada Sprint
- São responsáveis por:
  - Criar o Sprint Backlog
  - Adaptar o plano diariamente em direção ao Sprint Goal
  - Incorporar qualidade conforme a Definition of Done
  - Responsabilizar-se mutuamente como profissionais
- A forma de dividir e executar o trabalho pertence aos Developers

---

## Slide 21 — Artefatos e compromissos

| Artefato | O que torna transparente | Compromisso associado |
|---|---|---|
| Product Backlog | Trabalho necessário para melhorar o produto | Product Goal |
| Sprint Backlog | Trabalho selecionado e plano da Sprint | Sprint Goal |
| Increment | Resultado utilizável produzido | Definition of Done |

- Cada compromisso reforça foco e transparência
- Associações trocadas entre artefatos e compromissos são um erro conceitual comum

---

## Slide 22 — Product Backlog e Product Goal

- Product Backlog:
  - Lista emergente e ordenada do que é necessário para melhorar o produto
  - Única fonte de trabalho realizado pelo Scrum Team
- Product Goal:
  - Objetivo de longo prazo do Scrum Team
  - Descreve um estado futuro desejado do produto
- Os itens do backlog surgem e evoluem para apoiar o Product Goal

---

## Slide 23 — Sprint Backlog e Sprint Goal

- Sprint Backlog contém:
  - Sprint Goal — por quê
  - Itens selecionados — o quê
  - Plano para entregar o Increment — como
- É criado e atualizado pelos Developers
- Sprint Goal:
  - Objetivo único da Sprint
  - Cria foco e coerência
  - Permite flexibilidade sobre o trabalho exato necessário
- Não é apenas “concluir todas as tarefas”

---

## Slide 24 — Increment e Definition of Done

- Increment:
  - Passo concreto em direção ao Product Goal
  - Deve ser utilizável
  - Soma-se aos Increments anteriores
- Definition of Done:
  - Descrição formal do estado de qualidade exigido
  - Cria entendimento compartilhado sobre trabalho concluído
- Item que não atende à DoD:
  - Não integra o Increment
  - Não deve ser apresentado como concluído

---

## Slide 25 — Eventos do Scrum

| Evento | Finalidade principal |
|---|---|
| Sprint | Contêiner dos demais eventos e ciclo de criação de valor |
| Sprint Planning | Definir objetivo, seleção e plano inicial da Sprint |
| Daily Scrum | Inspecionar progresso e adaptar o plano dos Developers |
| Sprint Review | Inspecionar resultado e adaptar o Product Backlog |
| Sprint Retrospective | Melhorar qualidade e efetividade do modo de trabalhar |

- Eventos criam regularidade para inspeção e adaptação

---

## Slide 26 — Sprint

- Duração fixa de até um mês
- Uma nova Sprint começa imediatamente após a anterior
- Durante a Sprint:
  - A qualidade não diminui
  - Mudanças não colocam o Sprint Goal em risco
  - O Product Backlog pode ser refinado
  - O escopo pode ser esclarecido e renegociado com o Product Owner
- Uma Sprint pode ser cancelada se o Sprint Goal se tornar obsoleto

---

## Slide 27 — Sprint Planning

- Responde a três tópicos:
  1. Por que esta Sprint é valiosa?
  2. O que pode ser realizado nesta Sprint?
  3. Como o trabalho será realizado?
- Resultado:
  - Sprint Goal
  - Itens selecionados
  - Plano inicial dos Developers
- Esses elementos formam o Sprint Backlog
- A seleção deve considerar capacidade, DoD, riscos e aprendizado anterior

---

## Slide 28 — Daily Scrum

- Evento de 15 minutos para os Developers
- Finalidade:
  - Inspecionar o progresso em direção ao Sprint Goal
  - Adaptar o Sprint Backlog conforme necessário
- Não é:
  - Reunião obrigatória de três perguntas
  - Prestação de contas para gerente
  - Espaço exclusivo para resolver todos os problemas técnicos
- Pode adotar qualquer estrutura que produza foco e plano acionável

---

## Slide 29 — Sprint Review e Sprint Retrospective

| Sprint Review | Sprint Retrospective |
|---|---|
| Inspeciona o resultado da Sprint | Inspeciona como a equipe trabalhou |
| Envolve stakeholders relevantes | Envolve o Scrum Team |
| Discute mudanças no contexto | Discute pessoas, interações, processos e ferramentas |
| Pode adaptar o Product Backlog | Planeja melhorias de qualidade e efetividade |

- Review não é apenas demonstração ou aceite formal
- Retrospective não procura culpados

---

## Slide 30 — Histórias de usuário

- Forma concisa de comunicar uma necessidade sob a perspectiva do usuário
- Estrutura comum:
  - Como [tipo de usuário]
  - Quero [necessidade]
  - Para [benefício ou valor]
- Exemplo:
  - Como paciente, quero cancelar uma consulta para liberar o horário quando não puder comparecer
- História é convite para conversa
- Não é especificação técnica completa e imutável

---

## Slide 31 — Critérios de aceitação

- Condições verificáveis que ajudam a esclarecer o comportamento esperado
- Exemplo para cancelamento:
  - Permitir cancelar consulta futura
  - Solicitar confirmação antes de cancelar
  - Tornar o horário novamente disponível
- Bons critérios:
  - São claros e específicos
  - Podem ser verificados
  - Apoiam conversa, implementação e testes
- Não substituem todas as conversas nem a Definition of Done

---

## Slide 32 — História, critérios e DoD

| Elemento | Pergunta respondida |
|---|---|
| História de usuário | Quem precisa de quê e para obter qual valor? |
| Critérios de aceitação | Que condições específicas devem ser atendidas? |
| Definition of Done | Que qualidade comum é exigida para o Increment? |

- Critérios variam conforme o item
- DoD estabelece uma referência de qualidade compartilhada
- Uma história pode atender aos critérios e ainda não estar pronta se não cumprir a DoD

---

## Slide 33 — Refinamento do Product Backlog

- Atividade contínua de adicionar detalhes aos itens
- Pode envolver:
  - Esclarecer necessidade e valor
  - Dividir itens grandes
  - Elaborar critérios de aceitação
  - Identificar riscos e dependências
  - Estimar tamanho ou esforço
- Não é evento formal do Scrum
- Itens próximos tendem a receber mais detalhe que itens distantes

---

## Slide 34 — Ordenação do Product Backlog

- Ordenar não significa considerar somente urgência
- Fatores possíveis:
  - Valor esperado
  - Risco
  - Dependências
  - Aprendizado necessário
  - Custo do atraso
  - Tamanho ou esforço
- Product Owner responde pela ordenação
- A decisão pode receber contribuições do Scrum Team e de stakeholders
- Novas evidências podem mudar a ordem

---

## Slide 35 — Definition of Ready e Definition of Done

| DoR | DoD |
|---|---|
| Acordo complementar sobre preparação de itens | Compromisso oficial associado ao Increment |
| Pode ajudar a conversa antes da seleção | Define o estado de qualidade exigido |
| Não é elemento obrigatório do Scrum | É parte do Scrum |
| Não deve virar barreira burocrática rígida | Deve ser respeitada para considerar trabalho pronto |

- DoR e DoD não são sinônimos
- Prazo curto não justifica ignorar qualidade

---

## Slide 36 — Caso integrado de Scrum

- Situação:
  - Product Goal: reduzir faltas em consultas
  - História: enviar lembrete ao paciente
  - Durante a Sprint, surge risco no serviço de mensagens
- Analise:
  1. Quem responde por ordenar o Product Backlog?
  2. Quem adapta o plano da Sprint?
  3. Que compromisso orienta o foco da Sprint?
  4. Que condições específicas esclarecem a história?
  5. O item pode integrar o Increment sem atender à DoD?

---

## Slide 37 — Respostas do caso de Scrum

1. Product Owner responde pela ordenação do Product Backlog
2. Developers adaptam o plano da Sprint
3. Sprint Goal orienta o foco da Sprint
4. Critérios de aceitação esclarecem condições específicas
5. Não; o item precisa atender à Definition of Done

- O risco deve ficar transparente
- O plano pode ser adaptado sem abandonar automaticamente o Sprint Goal

---

## Slide 38 — O que é Kanban?

- Estratégia para otimizar o fluxo de valor por meio de um sistema visual e puxado
- O Método Kanban:
  - Começa com o que existe hoje
  - Busca mudança evolutiva
  - Incentiva liderança em todos os níveis
  - Gerencia o trabalho, não a vigilância individual
- Um quadro pode apoiar Kanban
- Apenas criar colunas e cartões não garante que o método esteja sendo aplicado

---

## Slide 39 — As seis práticas gerais do Método Kanban

1. Visualizar
2. Limitar o trabalho em progresso
3. Gerenciar o fluxo
4. Tornar políticas explícitas
5. Estabelecer ciclos de feedback
6. Melhorar colaborativamente e evoluir experimentalmente

- As práticas funcionam em conjunto
- O objetivo é melhorar a entrega do serviço com base em evidências

---

## Slide 40 — Visualizar o fluxo

- Tornar visíveis:
  - Itens de trabalho
  - Estados e filas
  - Tipos de demanda
  - Bloqueios e dependências
  - Limites e políticas
- Colunas devem representar o fluxo real
- Trabalho ativo e trabalho em espera podem precisar de estados distintos
- Visualização apoia decisões; não serve para decorar o processo

---

## Slide 41 — Sistema empurrado e sistema puxado

| Sistema empurrado | Sistema puxado |
|---|---|
| Trabalho é iniciado mesmo sem capacidade | Trabalho é iniciado quando há capacidade |
| Muitos itens podem ficar parcialmente prontos | O foco se desloca para concluir |
| Filas e multitarefa tendem a crescer | Limites ajudam a controlar o WIP |
| Ocupação individual pode dominar a decisão | Fluxo e entrega orientam a decisão |

- Ideia prática: parar de começar e começar a terminar

---

## Slide 42 — WIP e limites de WIP

- WIP — Work in Progress:
  - Trabalho iniciado e ainda não concluído
- Limites de WIP:
  - Restringem quantos itens podem ocupar uma etapa
  - Tornam problemas de capacidade mais visíveis
  - Incentivam colaboração para concluir trabalho
- Quando uma coluna atinge o limite:
  - Não puxar novo item para essa coluna
  - Ajudar a concluir ou desbloquear itens existentes
  - Investigar a causa do acúmulo

---

## Slide 43 — Políticas explícitas

- Acordos visíveis que orientam decisões no fluxo
- Exemplos:
  - Critério para iniciar desenvolvimento
  - Condição para avançar a testes
  - Tratamento de bloqueios
  - Limite de itens por etapa
  - Regra para demandas urgentes
  - Condição para considerar um item entregue
- Devem ser simples, compreendidas e revisáveis
- Alterar uma política deve ser decisão consciente, não exceção silenciosa

---

## Slide 44 — Bloqueios e gargalos

- Bloqueio:
  - Impedimento temporário de um item específico
- Gargalo:
  - Parte cuja capacidade restringe o fluxo geral
- Boas respostas:
  - Tornar o problema visível
  - Registrar causa e próxima ação
  - Colaborar para remover ou reduzir o impedimento
  - Usar dados de várias observações antes de concluir que existe gargalo permanente
- Esconder ou excluir cartões mascara o problema

---

## Slide 45 — Lead time e cycle time

| Métrica | Intervalo observado |
|---|---|
| Lead time | Da entrada definida da demanda até a entrega |
| Cycle time | Do início do trabalho até sua conclusão, conforme os pontos adotados |

- As definições dos pontos devem ser explícitas
- Filas, bloqueios e excesso de WIP aumentam o tempo de entrega
- Métricas apoiam conversa e previsão
- Não devem ser usadas isoladamente para vigiar produtividade individual

---

## Slide 46 — Caso integrado de Kanban

- Situação:
  - Testes possui limite de WIP igual a 2
  - A coluna já contém dois itens
  - Revisão possui outro item pronto para avançar
  - Um dos itens em testes está bloqueado
- Analise:
  1. O item de revisão pode ser movido imediatamente?
  2. A equipe deve iniciar mais desenvolvimento?
  3. Qual ação favorece o fluxo?
  4. O limite deve ser aumentado silenciosamente?

---

## Slide 47 — Respostas do caso de Kanban

1. Não, enquanto Testes estiver no limite
2. Não apenas para manter pessoas ocupadas
3. Colaborar para concluir ou desbloquear os itens existentes
4. Não; limites e políticas devem ser explícitos e revistos com evidências

- O limite torna a restrição visível
- A resposta correta prioriza fluxo e conclusão, não quantidade de trabalho iniciado

---

## Slide 48 — Scrum e Kanban: comparação

| Aspecto | Scrum | Kanban |
|---|---|---|
| Organização | Sprints de duração fixa | Fluxo contínuo |
| Foco | Sprint Goal | Fluxo de valor e serviço |
| Responsabilidades | Definidas no Scrum Team | Começa respeitando a estrutura atual |
| Trabalho em andamento | Seleção e foco da Sprint | Limites explícitos de WIP |
| Melhoria | Inspeção e adaptação nos eventos | Evolução colaborativa e experimental |

- Podem coexistir quando as práticas são usadas de forma coerente

---

## Slide 49 — Erros conceituais frequentes

- Interpretar ágil como ausência de plano ou documentação
- Tratar Scrum Master como gerente da equipe
- Confundir Review com Retrospective
- Trocar compromissos entre os artefatos
- Considerar história de usuário uma especificação imutável
- Confundir critérios de aceitação com DoD
- Tratar DoR como elemento obrigatório do Scrum
- Usar Kanban apenas como quadro de tarefas
- Ignorar limites de WIP quando há pressão
- Tratar toda demanda como urgente

---

## Slide 50 — Mapa mental da revisão

- Manifesto Ágil:
  - Valores → princípios → decisões adaptativas
- Scrum:
  - Empirismo → pilares → eventos de inspeção e adaptação
  - Responsabilidades → Product Owner, Scrum Master e Developers
  - Artefatos → compromissos → transparência e foco
- Planejamento:
  - Objetivos → backlog → histórias → critérios → refinamento
- Kanban:
  - Visualização → sistema puxado → WIP → fluxo → melhoria

---

## Slide 51 — Simulado: questões 1–4

1. Um plano ágil deve ser:
   - A) Abandonado quando surgir qualquer mudança
   - B) Seguido sem revisão até o final
   - C) Atualizado quando evidências relevantes surgirem
   - D) Substituído por decisões sem registro
2. Qual conjunto representa os pilares do Scrum?
   - A) Transparência, inspeção e adaptação
   - B) Prazo, escopo e custo
   - C) Pessoas, produto e processo
   - D) Planejamento, execução e controle
3. Quem responde pela gestão eficaz do Product Backlog?
   - A) Developers
   - B) Product Owner
   - C) Scrum Master
   - D) Stakeholders
4. Qual compromisso está associado ao Sprint Backlog?
   - A) Product Goal
   - B) Definition of Done
   - C) Sprint Goal
   - D) Critérios de aceitação

---

## Slide 52 — Simulado: questões 5–8

5. Qual evento inspeciona o resultado com stakeholders e pode adaptar o Product Backlog?
   - A) Daily Scrum
   - B) Sprint Review
   - C) Sprint Retrospective
   - D) Sprint Planning
6. Uma história de usuário deve comunicar principalmente:
   - A) Necessidade e valor para um usuário
   - B) Toda a arquitetura técnica
   - C) Um contrato imutável
   - D) Apenas horas de desenvolvimento
7. No refinamento, é coerente:
   - A) Detalhar igualmente todo o backlog
   - B) Evitar dividir itens grandes
   - C) Esconder dependências
   - D) Detalhar mais os itens próximos e relevantes
8. A Definition of Done define:
   - A) O preço do produto
   - B) A qualidade exigida do Increment
   - C) Quem pode entrar na equipe
   - D) A ordem do Product Backlog

---

## Slide 53 — Simulado: questões 9–12

9. O Método Kanban recomenda inicialmente:
   - A) Eliminar todos os papéis existentes
   - B) Começar com o processo atual e evoluir
   - C) Iniciar todos os itens disponíveis
   - D) Ocultar bloqueios
10. Em um sistema puxado, novo trabalho começa quando:
   - A) Existe capacidade segundo as políticas
   - B) Um gerente deseja manter todos ocupados
   - C) Qualquer demanda é marcada como urgente
   - D) O limite de WIP é ignorado
11. Uma coluna atingiu o limite de WIP. A equipe deve primeiro:
   - A) Aumentar o limite sem discussão
   - B) Excluir cartões bloqueados
   - C) Concluir ou desbloquear trabalho existente
   - D) Puxar mais itens
12. Uma política explícita deve ser:
   - A) Secreta e conhecida apenas pelo gestor
   - B) Fixa e impossível de revisar
   - C) Aplicada somente em auditorias
   - D) Visível, compreendida e revisável

---

## Slide 54 — Gabarito do simulado

| Questão | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 |
|---|---|---|---|---|---|---|---|---|---|---|---|---|
| Resposta | C | A | B | C | B | A | D | B | B | A | C | D |

- Explique cada resposta usando o conceito, não apenas a letra
- Para cada alternativa incorreta, identifique a distorção principal

---

## Slide 55 — Correção comentada: questões 1–4

1. O plano é adaptado quando novas evidências melhoram a decisão
2. Transparência, inspeção e adaptação sustentam o empirismo
3. Product Owner responde pela gestão eficaz do Product Backlog
4. Sprint Goal é o compromisso associado ao Sprint Backlog

- Estratégia:
  - Localize o substantivo central da pergunta
  - Recupere sua definição e suas associações oficiais

---

## Slide 56 — Correção comentada: questões 5–8

5. Sprint Review inspeciona resultado e contexto com stakeholders
6. História de usuário comunica necessidade e valor
7. Refinamento progressivo detalha mais o trabalho próximo
8. DoD estabelece o estado de qualidade exigido para o Increment

- Atenção:
  - Review não é Retrospective
  - Critérios de aceitação não são a mesma coisa que DoD

---

## Slide 57 — Correção comentada: questões 9–12

9. Kanban começa com o processo atual e promove evolução
10. Trabalho é puxado quando existe capacidade
11. Ao atingir o limite, a prioridade é concluir ou desbloquear
12. Políticas precisam ser visíveis, compreendidas e revisáveis

- Atenção:
  - Kanban não busca manter todos individualmente ocupados
  - O foco está no fluxo e na entrega de valor

---

## Slide 58 — Atividade final em grupos

- Cada grupo recebe um dos quatro blocos:
  - Manifesto e planejamento
  - Scrum Team, artefatos e eventos
  - Histórias, objetivos, refinamento, DoR e DoD
  - Kanban, sistema puxado, WIP e políticas
- Produzir em 10 minutos:
  - Cinco conceitos essenciais
  - Dois erros comuns
  - Um exemplo prático
  - Uma pergunta para outra equipe
- Socialização:
  - Até 3 minutos por grupo

---

## Slide 59 — Checklist de preparação

- Consigo explicar os quatro valores sem eliminar o lado direito?
- Sei diferenciar os três pilares dos cinco valores do Scrum?
- Sei atribuir responsabilidades ao Product Owner, Scrum Master e Developers?
- Associo corretamente cada artefato ao seu compromisso?
- Diferencio Planning, Daily, Review e Retrospective?
- Distingo história, critérios de aceitação, DoR e DoD?
- Sei explicar refinamento e ordenação do Product Backlog?
- Sei decidir o que fazer quando um limite de WIP é atingido?

---

## Slide 60 — Glossário: fundamentos ágeis e Scrum

| Termo | Significado |
|---|---|
| **Agilidade** | Capacidade de gerar valor e adaptar decisões com base em aprendizado |
| **Empirismo** | Decisão apoiada na experiência e no que é observado |
| **Transparência** | Condição em que trabalho e estado são compreensíveis |
| **Inspeção** | Exame frequente de progresso, resultado ou modo de trabalhar |
| **Adaptação** | Ajuste realizado quando evidências indicam necessidade |
| **Scrum Team** | Product Owner, Scrum Master e Developers trabalhando por um objetivo |
| **Sprint** | Evento de duração fixa em que ideias são transformadas em valor |

---

## Slide 61 — Glossário: planejamento Scrum

| Termo | Significado |
|---|---|
| **Product Goal** | Objetivo de longo prazo associado ao Product Backlog |
| **Sprint Goal** | Objetivo único que orienta a Sprint |
| **Increment** | Resultado utilizável que avança o produto |
| **História de usuário** | Forma concisa de comunicar necessidade e valor |
| **Critério de aceitação** | Condição específica e verificável de um item |
| **Refinamento** | Atividade contínua de detalhar e decompor itens do backlog |
| **Definition of Done** | Estado de qualidade exigido para o Increment |
| **Definition of Ready** | Acordo complementar sobre preparação de itens |

---

## Slide 62 — Glossário: Kanban

| Termo | Significado |
|---|---|
| **Fluxo** | Movimento do trabalho desde a entrada até a entrega |
| **Sistema puxado** | Trabalho iniciado conforme capacidade disponível |
| **WIP** | Trabalho iniciado e ainda não concluído |
| **Limite de WIP** | Restrição explícita da quantidade de trabalho em progresso |
| **Política explícita** | Regra visível para orientar decisões no fluxo |
| **Bloqueio** | Impedimento temporário ao avanço de um item |
| **Gargalo** | Parte cuja capacidade restringe o fluxo geral |
| **Lead time** | Tempo entre a entrada definida da demanda e sua entrega |

---

## Slide 63 — Referências bibliográficas

### Bibliografia prevista no plano de ensino

- DINSMORE, Paul C.; BREWIN, Jeannette C. *AMA — Manual de Gerenciamento de Projetos*. Brasport, 2009.
- VARGAS, Ricardo. *Manual Prático do Plano de Projeto: Utilizando o PMBOK Guide*. 3. ed. Brasport, 2007.
- PRESSMAN, Roger S. *Engenharia de Software*. 6. ed. Porto Alegre: AMGH, 2010.
- SCHWABER, Ken. *Agile Project Management with Scrum*. 1. ed. Microsoft Press, 2004.

---

## Slide 64 — Referências e leituras complementares

- BECK, Kent et al. *Manifesto for Agile Software Development*. Disponível em: https://agilemanifesto.org/
- SCHWABER, Ken; SUTHERLAND, Jeff. *The Scrum Guide*. Novembro de 2020. Disponível em: https://scrumguides.org/
- COLEMAN, John et al. *The Kanban Guide*. Maio de 2025. Disponível em: https://kanbanguides.org/the-kanban-guide/
- KANBAN UNIVERSITY. *The Official Guide to The Kanban Method*. Disponível em: https://kanban.university/kanban-guide/

---

## Slide 65 — Fechamento

- Revisamos:
  - Valores ágeis e planejamento adaptativo
  - Empirismo e responsabilidades do Scrum Team
  - Artefatos, compromissos e eventos do Scrum
  - Histórias, critérios, objetivos, refinamento, DoR e DoD
  - Princípios do Kanban, sistema puxado, WIP e políticas
- Próximo passo:
  - Revisar os conceitos pelo significado e por exemplos
  - Refazer o simulado justificando cada alternativa
  - Preparar-se para a avaliação do primeiro bimestre

---

## Slide 66 — Perguntas?

- Qual conceito ainda parece semelhante a outro?
- Que associação precisa ser memorizada com compreensão?
- Em qual caso prático ainda há dúvida?
- Que alternativa do simulado exigiu mais análise?

