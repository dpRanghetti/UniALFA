# Cronograma de Aulas — Cloud Computing e DevOps Avançado (v2)

- **Curso:** CST em Sistemas para Internet
- **Carga horária da disciplina:** 80h
- **Avaliação por bimestre:** **Avaliação (6,0)** + **Trabalhos (4,0)**
- **Trabalhos em grupo:** **4 por bimestre** (sugestão: **1,0 ponto cada**)

## Estrutura de avaliação (por bimestre)

Nota Bimestral (NB) = Avaliação (6,0) + Trabalhos (4,0)

- Trabalhos em grupo por bimestre: 4
- Sugestão de pontuação: 1,0 ponto por trabalho (total 4,0)

Observação: a avaliação bimestral (6,0) pode ser aplicada como prova teórica e/ou avaliação prática, conforme condução da turma. O cronograma abaixo reserva a última aula de cada bimestre para revisão; a aplicação da avaliação pode ocorrer após essa aula (na mesma data, se houver tempo/turno, ou em data definida pela coordenação).

---

## 1º Bimestre (8 aulas)

### Aula 1 — Introdução à Computação em Nuvem (fundamentos)
- **Conteúdo:** apresentação do plano de ensino; apresentação do cronograma de aulas; conceitos básicos; visão geral de cloud; responsabilidades do provedor vs. cliente.
- **Prática/atividade:** diagnóstico rápido (questionário) + criação/organização de grupos.
- **Trabalho do bimestre:** lançamento do **Trabalho 1 (T1)**.

### Aula 2 — Modelos de serviço e provedores (IaaS, PaaS, SaaS; AWS/Azure/GCP)
- **Conteúdo:** IaaS/PaaS/SaaS; critérios de escolha de provedor; noções de regiões/zonas.
- **Prática/atividade:** estudo de caso comparativo (mesmo requisito em IaaS vs PaaS).
- **Trabalho:** entrega do **T1**.
- **Trabalho:** sem trabalhos.

### Aula 3 — Arquiteturas em nuvem: distribuídas, escaláveis e microserviços
- **Conteúdo:** arquitetura distribuída; escalabilidade; microserviços (trade-offs).
- **Prática/atividade:** decomposição de um monólito em serviços (exercício guiado).
- **Trabalho do bimestre:** lançamento do **Trabalho 2 (T2)**.

### Aula 4 — Containers e orquestração: Docker (conceitos) e Kubernetes (visão geral)
- **Conteúdo:** containers; imagens; registro; introdução ao Kubernetes (pods, deployments, services).
- **Prática/atividade:** containerizar uma aplicação simples e discutir requisitos para produção.
- **Trabalho:** entrega do **T2**.
- **Trabalho:** sem trabalhos.

### Aula 5 — Serviços de nuvem (armazenamento, bancos e computação)
- **Conteúdo:** storage (S3/Blob/GCS); bancos SQL/NoSQL gerenciados; compute (EC2/VMs/GCE).
- **Prática/atividade:** desenho de arquitetura de referência (web + banco + storage).
- **Trabalho do bimestre (em sala):** **Trabalho 3 (T3)** (lançamento e entrega na aula).

### Aula 6 — Serverless, CDN e processamento assíncrono
- **Conteúdo:** Lambda/Functions; CDN (CloudFront/CDN equivalents); filas/pub-sub (SQS/PubSub/Queues).
- **Prática/atividade:** modelagem de um fluxo assíncrono (fila + consumidor) para desacoplamento.
- **Trabalho do bimestre (em sala):** **Trabalho 4 (T4)** (lançamento e entrega na aula).

### Aula 7 — Estratégias Multicloud e Nuvem Híbrida
- **Conteúdo:** estratégias multicloud; nuvem híbrida; cenários de uso; riscos e trade-offs (latência, custo, governança).
- **Prática/atividade:** estudo de caso com proposta de arquitetura (single cloud vs. multicloud vs. híbrida) e justificativas.
- **Trabalhos:** sem trabalhos.

### Aula 8 — Fechamento bimestral (revisão + consolidação)
- **Atividades:** revisão guiada dos tópicos; consolidação do conteúdo; retomada de dúvidas recorrentes; fechamento do bimestre.
- **Trabalhos:** sem trabalhos.

#### Trabalhos em grupo — 1º Bimestre (4,0 pontos)
- **T1 (1,0): Mapa de serviços e escolha de provedor**
  - **Lançamento/entrega:** Aula 1 → Aula 2
  - **Entregável:** documento curto com requisitos + escolha de provedor/modelo (IaaS/PaaS/SaaS) + justificativas.
- **T2 (1,0): Arquitetura de referência (microserviços/containers)**
  - **Lançamento/entrega:** Aula 3 → Aula 4
  - **Entregável:** diagrama (C4/arquitetura) + descrição de serviços + estratégia de deploy.
- **T3 (1,0): Desenho de dados e armazenamento em nuvem**
  - **Lançamento/entrega:** Aula 5 → Aula 5
  - **Entregável:** proposta de banco (SQL/NoSQL) + storage de objetos + considerações de escalabilidade.
- **T4 (1,0): Solução assíncrona + CDN + serverless (quando aplicável)**
  - **Lançamento/entrega:** Aula 6 → Aula 6
  - **Entregável:** diagrama de fluxo assíncrono + pontos de observabilidade (o que medir) + uso/justificativa de CDN.

---

## 2º Bimestre (7 aulas)

### Aula 1 — DevOps: cultura, automação e pipelines (visão geral)
- **Conteúdo:** princípios DevOps; automação; visão de CI/CD.
- **Prática/atividade:** modelagem de pipeline (build, testes, segurança básica, deploy).
- **Trabalho do bimestre:** lançamento do **Trabalho 5 (T5)**.

### Aula 2 — CI: ferramentas e implementação (Jenkins/GitLab CI/GitHub Actions)
- **Conteúdo:** conceitos de CI; triggers; artefatos; versionamento; qualidade.
- **Prática/atividade:** pipeline mínimo (lint/test/build) em ferramenta escolhida.
- **Trabalho:** entrega do **T5**.
- **Trabalho:** sem trabalhos.

### Aula 3 — CD: entrega contínua e estratégias de deploy
- **Conteúdo:** entrega contínua; blue/green; canary; rollback; versionamento de releases.
- **Prática/atividade:** plano de deploy e rollback para um serviço.
- **Trabalho do bimestre:** lançamento do **Trabalho 6 (T6)**.

### Aula 4 — Observabilidade/monitoramento em nuvem
- **Conteúdo:** métricas, logs, traces; alertas; Sentry/DataDog/CloudWatch/Grafana.
- **Prática/atividade:** definir SLIs/SLOs e um painel mínimo (o que medir e por quê).
- **Trabalho:** entrega do **T6**.
- **Trabalho:** sem trabalhos.

### Aula 5 — Alta disponibilidade, resiliência e recuperação de desastres
- **Conteúdo:** escalabilidade horizontal/vertical; balanceamento; autoscaling; redundância/failover; DR.
- **Prática/atividade:** arquitetura HA + plano de DR (RPO/RTO) para um caso proposto.
- **Trabalho do bimestre (em sala):** **Trabalho 7 (T7)** (lançamento e entrega na aula).

### Aula 6 — Segurança em nuvem e DevSecOps (IAM, auditoria, compliance, Zero Trust) + FinOps
- **Conteúdo:** IAM; controle de acesso; auditoria; compliance; DevSecOps/Zero Trust; gestão de custos (FinOps).
- **Prática/atividade:** modelagem de permissões (least privilege) + checklist de segurança + plano de custos.
- **Trabalho do bimestre (em sala):** **Trabalho 8 (T8)** (lançamento e entrega na aula).

### Aula 7 — Fechamento bimestral (revisão + consolidação)

- **Atividades:** revisão guiada; consolidação do conteúdo; resolução de questões; fechamento do bimestre.
- **Trabalhos:** sem trabalhos.

#### Trabalhos em grupo — 2º Bimestre (4,0 pontos)
- **T5 (1,0): Pipeline CI mínimo e reprodutível**
  - **Lançamento/entrega:** Aula 1 → Aula 2
  - **Entregável:** repositório com pipeline funcionando (build + testes) + evidências (prints/logs).
- **T6 (1,0): Estratégia de CD (deploy + rollback)**
  - **Lançamento/entrega:** Aula 3 → Aula 4
  - **Entregável:** proposta de estratégia (blue/green/canary) + plano de rollback + critérios de sucesso.
- **T7 (1,0): Observabilidade (SLIs/SLOs + alertas)**
  - **Lançamento/entrega:** Aula 5 → Aula 5
  - **Entregável:** conjunto de métricas/alertas + painel mínimo + justificativa.
- **T8 (1,0): Segurança + custos (DevSecOps + FinOps) aplicados ao caso**
  - **Lançamento/entrega:** Aula 6 → Aula 6
  - **Entregável:** matriz IAM (least privilege), checklist de controles, plano de auditoria, e estimativa/otimização de custos.

---

## Mapa rápido de alinhamento com o conteúdo programático

- **Introdução à nuvem (1):** 1º bimestre (aulas 1–2)
- **Arquitetura em nuvem (2):** 1º bimestre (aulas 3–4 e 7)
- **Serviços em nuvem (3):** 1º bimestre (aulas 5–6)
- **DevOps (4):** 2º bimestre (aulas 1–4)
- **Alta disponibilidade e escalabilidade (5):** 2º bimestre (aula 5)
- **Segurança em nuvem e DevOps (6):** 2º bimestre (aula 6)

---

## Observações

### Flexibilidade do Cronograma

Este cronograma foi elaborado seguindo o **calendário acadêmico oficial** da instituição. No entanto, **ajustes podem ser necessários** nas seguintes situações:

- **Progresso da turma:** O ritmo de avanço dos conteúdos pode variar conforme o nível de compreensão e participação dos alunos. Tópicos que demandarem maior aprofundamento poderão ter carga horária ampliada, com ajustes nas aulas subsequentes.

- **Eventos não programados:** Atividades institucionais, feriados não previstos, semanas acadêmicas, palestras ou outros eventos que não constem no calendário oficial podem impactar a sequência das aulas.

- **Necessidades pedagógicas:** Caso seja identificada a necessidade de revisão adicional, atividades práticas extras ou ajustes metodológicos, o cronograma poderá ser adaptado para melhor atender aos objetivos de aprendizagem.

### Trabalhos e Avaliações

Os **trabalhos em grupo** e suas respectivas datas de lançamento e entrega também estão sujeitos a alterações, considerando:

- **Ritmo de aprendizagem:** Trabalhos podem ter prazos ajustados caso a turma necessite de mais tempo para assimilar os conceitos necessários à sua execução.

- **Complexidade dos temas:** Dependendo da profundidade alcançada em determinados conteúdos, os requisitos dos trabalhos podem ser adaptados para melhor alinhamento com o nível da turma.

- **Feedback contínuo:** Ajustes podem ser realizados com base no desempenho e feedback dos alunos nas atividades anteriores.

> **Importante:** Quaisquer alterações no cronograma ou nos trabalhos serão **comunicadas com antecedência** em sala de aula, garantindo que todos os alunos tenham ciência das mudanças e possam se organizar adequadamente.
