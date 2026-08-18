# Aula 01 — Introdução à Computação em Nuvem

**Cloud Computing e DevOps Avançado**  
CST em Sistemas para Internet | 6º Período

---

## Slide 1: Bem-vindos!

### Cloud Computing e DevOps Avançado

- **Professor:** Ranghetti
- **Carga horária:** 80 horas/relógio
- **Período:** 6º período


---

## Slide 2: Objetivos da Disciplina

### O que vamos aprender?

- **Projetar, implementar e escalar** aplicativos em ambientes de nuvem
- Utilizar serviços dos **principais provedores** (AWS, Azure, GCP)
- Aplicar **princípios e práticas DevOps**
- Criar aplicações **altamente disponíveis, resilientes e escaláveis**
- Automatizar processos de **integração e entrega contínua (CI/CD)**
- Implementar **monitoramento e observabilidade**

---

## Slide 3: Estrutura de Avaliação

### Como seremos avaliados?

**Nota Bimestral (NB) = Avaliação (6,0) + Trabalhos (4,0)**

- **Avaliação (6,0):**
  - Provas teóricas e/ou práticas
  - Participação em atividades
  - Projetos/hackathons

- **Trabalhos (4,0):**
  - 4 trabalhos em grupo por bimestre
  - 1,0 ponto cada trabalho

**Critério de Aprovação:** Frequência ≥ 75% + NF ≥ 7,0

---

## Slide 4: Cronograma — 1º Bimestre

### Aulas e Trabalhos

1. **Introdução à Cloud** (hoje) → Lançamento T1
2. **Modelos de serviço e provedores** → Entrega T1
3. **Arquiteturas em nuvem** → Lançamento T2
4. **Containers e Kubernetes** → Entrega T2
5. **Serviços de nuvem** → T3 (em sala)
6. **Serverless, CDN e filas** → T4 (em sala)
7. **Multicloud e Nuvem Híbrida**
8. **Fechamento bimestral** (revisão)

---

## Slide 5: Cronograma — 2º Bimestre

### Aulas e Trabalhos

1. **DevOps: cultura e pipelines** → Lançamento T5
2. **CI: ferramentas** → Entrega T5
3. **CD: estratégias de deploy** → Lançamento T6
4. **Observabilidade** → Entrega T6
5. **Alta disponibilidade e DR** → T7 (em sala)
6. **Segurança e FinOps** → T8 (em sala)
7. **Fechamento bimestral** (revisão)

---

## Slide 6: O que é Computação em Nuvem?

### Definição

> **Computação em Nuvem** é o fornecimento de recursos de TI (servidores, armazenamento, bancos de dados, redes, software) pela Internet, com **pagamento conforme o uso**.

### Características principais:

- **Acesso sob demanda** (self-service)
- **Amplo acesso à rede** (qualquer dispositivo)
- **Pool de recursos** compartilhados
- **Elasticidade rápida** (escala automática)
- **Serviço medido** (pay-as-you-go)

---

## Slide 7: Por que usar Cloud?

### Benefícios

- **Redução de custos:** sem investimento inicial em hardware
- **Escalabilidade:** cresce/diminui conforme demanda
- **Disponibilidade global:** data centers em várias regiões
- **Velocidade e agilidade:** provisionamento em minutos
- **Foco no negócio:** menos tempo com infraestrutura
- **Segurança:** provedores investem pesado em proteção

---

## Slide 8: Modelos de Serviço

### IaaS, PaaS, SaaS

| Modelo | O que é? | Você gerencia | Provedor gerencia | Exemplos |
|--------|----------|---------------|-------------------|----------|
| **IaaS** | Infraestrutura como Serviço | SO, runtime, apps | Hardware, rede, virtualização | AWS EC2, Azure VMs, GCE |
| **PaaS** | Plataforma como Serviço | Aplicações, dados | Runtime, SO, infraestrutura | Heroku, Google App Engine, Azure App Service |
| **SaaS** | Software como Serviço | Apenas uso | Tudo | Gmail, Office 365, Salesforce |

---

## Slide 9: Modelos de Serviço — Analogia

### Pizza como Serviço 🍕

- **On-Premises:** você faz tudo (massa, molho, forno, mesa)
- **IaaS:** você compra ingredientes e faz em casa
- **PaaS:** pizza pronta para assar, você só assa
- **SaaS:** delivery — você só come!

---

## Slide 10: Principais Provedores de Nuvem

### Os "Big Three"

- **Amazon Web Services (AWS)**
  - Líder de mercado (~32% share)
  - Maior variedade de serviços
  - Pioneiro (lançado em 2006)

- **Microsoft Azure**
  - ~23% de market share
  - Integração com ecossistema Microsoft
  - Forte em empresas/corporativo

- **Google Cloud Platform (GCP)**
  - ~10% de market share
  - Forte em ML/AI e analytics
  - Infraestrutura global do Google

---

## Slide 11: Outros Provedores

### Alternativas e Nichos

- **Oracle Cloud:** foco em bancos de dados corporativos
- **IBM Cloud:** soluções híbridas e mainframe
- **Alibaba Cloud:** líder na Ásia
- **DigitalOcean:** desenvolvedores e startups
- **Linode, Vultr:** VPS simplificados

---

## Slide 12: Responsabilidades — Modelo Compartilhado

### Quem cuida do quê?

**Provedor de Nuvem é responsável por:**
- Segurança **DA** nuvem (infraestrutura física, rede, hardware)
- Data centers, energia, refrigeração
- Virtualização, hipervisor

**Cliente é responsável por:**
- Segurança **NA** nuvem (dados, aplicações, identidades)
- Configuração de rede, firewalls, IAM
- Patches de SO (em IaaS), criptografia de dados
- Controle de acesso e compliance

---

## Slide 13: Modelo de Responsabilidade Compartilhada

### Varia por tipo de serviço

```
┌─────────────────────────────────────────────┐
│           IaaS      PaaS      SaaS          │
├─────────────────────────────────────────────┤
│ Dados/Conteúdo      VOCÊ     VOCÊ    VOCÊ   │
│ Aplicações          VOCÊ     VOCÊ  PROVEDOR │
│ Runtime/Middleware  VOCÊ   PROVEDOR PROVEDOR│
│ SO                  VOCÊ   PROVEDOR PROVEDOR│
│ Virtualização     PROVEDOR PROVEDOR PROVEDOR│
│ Servidores        PROVEDOR PROVEDOR PROVEDOR│
│ Armazenamento     PROVEDOR PROVEDOR PROVEDOR│
│ Rede              PROVEDOR PROVEDOR PROVEDOR│
└─────────────────────────────────────────────┘
```

**Quanto mais "gerenciado" o serviço, menos você controla (e menos se preocupa).**

---

## Slide 14: Regiões e Zonas de Disponibilidade

### Infraestrutura Global

- **Região:** área geográfica (ex.: us-east-1, sa-east-1)
  - Cada região tem múltiplos data centers
  - Dados não saem da região (compliance/latência)

- **Zona de Disponibilidade (AZ):** data center isolado dentro de uma região
  - Redundância: se uma AZ cai, outras continuam
  - Alta disponibilidade: distribua recursos entre AZs

**Exemplo AWS:** us-east-1a, us-east-1b, us-east-1c (3 AZs na região Norte da Virgínia)

---

## Slide 15: Casos de Uso — Cloud Computing

### Onde usar?

- **Hospedagem de sites e aplicações web**
- **Armazenamento e backup de dados**
- **Big Data e Analytics** (processar volumes massivos)
- **Machine Learning e AI** (treinamento de modelos)
- **Streaming de mídia** (Netflix, Spotify)
- **IoT** (coletar e processar dados de sensores)
- **Disaster Recovery** (recuperação rápida)
- **Ambientes de desenvolvimento/teste** (criar/destruir sob demanda)

---

## Slide 16: Desafios da Cloud

### O que precisamos considerar?

- **Segurança e privacidade:** dados sensíveis na nuvem
- **Compliance:** regulamentações (LGPD, GDPR, HIPAA)
- **Custos:** pode sair caro se mal gerenciado (FinOps!)
- **Vendor lock-in:** dependência de um provedor
- **Latência:** distância física dos data centers
- **Downtime:** provedores também têm falhas (raras, mas acontecem)

---

## Slide 17: Atividade Prática — Diagnóstico Rápido

### Vamos nos conhecer!

**Questionário rápido (5 minutos):**

1. Você já usou algum serviço de nuvem? Qual?
2. Já trabalhou com AWS, Azure ou GCP? Qual nível?
3. Conhece Docker ou Kubernetes?
4. Já ouviu falar de CI/CD? Usou alguma ferramenta?
5. Qual sua expectativa para esta disciplina?

**Objetivo:** entender o nível da turma e ajustar exemplos/ritmo.

---

## Slide 18: Formação de Grupos

### Trabalhos em Grupo

- **4 trabalhos por bimestre** (1,0 ponto cada)
- Grupos de **3 a 5 pessoas**


**Atividade (10 minutos):**
- Formem os grupos
- Escolham um nome para o grupo (opcional, mas divertido!)
- Anotem os nomes dos integrantes

---

## Slide 19: Trabalho 1 (T1) — Lançamento

### Mapa de Serviços e Escolha de Provedor

**Objetivo:** pesquisar e comparar provedores de nuvem para um cenário real.

**Entregável (Aula 2):**
- Documento curto (2-3 páginas)
- Requisitos de um sistema (será fornecido)
- Escolha de provedor/modelo (IaaS/PaaS/SaaS)
- Justificativas técnicas e de custo

**Critérios:** clareza, justificativa técnica, comparação de alternativas.

---

## Slide 20: Cenário 1 — E-commerce Regional

### Sistema de Loja Virtual

**Contexto:** Startup de e-commerce focada em produtos regionais do Paraná.

**Requisitos:**
- **Tráfego esperado:** 5.000 acessos/dia (picos de 15.000 em promoções)
- **Catálogo:** 2.000 produtos com imagens (aprox. 50GB de mídia)
- **Funcionalidades:** carrinho, pagamento, gestão de pedidos, painel admin
- **Integrações:** gateway de pagamento, correios (frete), email marketing
- **Crescimento:** expectativa de 3x em 12 meses
- **Orçamento:** R$ 2.000/mês inicialmente

**Desafio:** escolher arquitetura (monolito vs microserviços), provedor e modelo de serviço.

---

## Slide 21: Cenário 2 — Plataforma de Streaming de Vídeo

### Sistema de Vídeo sob Demanda (VoD)

**Contexto:** Plataforma educacional com cursos em vídeo (tipo Udemy/Coursera).

**Requisitos:**
- **Usuários:** 10.000 alunos ativos, 500 instrutores
- **Conteúdo:** 5.000 horas de vídeo (aprox. 2TB)
- **Funcionalidades:** upload de vídeos, transcodificação, streaming adaptativo, legendas
- **Distribuição:** usuários em todo Brasil (latência < 200ms)
- **Segurança:** DRM, controle de acesso por assinatura
- **Disponibilidade:** 99.9% uptime

**Desafio:** escolher serviços de storage, CDN, transcodificação e banco de dados.

---

## Slide 22: Cenário 3 — Sistema IoT para Agricultura

### Monitoramento de Fazendas Inteligentes

**Contexto:** Solução IoT para monitorar temperatura, umidade e irrigação em fazendas.

**Requisitos:**
- **Dispositivos:** 1.000 sensores enviando dados a cada 5 minutos
- **Volume de dados:** ~8.6 milhões de leituras/mês
- **Processamento:** alertas em tempo real (temperatura crítica, falta d'água)
- **Dashboard:** visualização de métricas históricas e em tempo real
- **Escalabilidade:** suportar até 10.000 sensores em 2 anos
- **Custo:** modelo pay-per-use (volume de dados variável)

**Desafio:** escolher arquitetura para ingestão, processamento e armazenamento de dados IoT.

---

## Slide 23: Cenário 4 — SaaS Corporativo (CRM)

### Sistema de Gestão de Relacionamento com Clientes

**Contexto:** SaaS multi-tenant para pequenas e médias empresas.

**Requisitos:**
- **Clientes:** 100 empresas (multi-tenancy), ~5.000 usuários finais
- **Funcionalidades:** gestão de leads, pipeline de vendas, relatórios, integrações (email, WhatsApp)
- **Dados:** isolamento por tenant, backup diário, retenção de 7 anos
- **Compliance:** LGPD (dados no Brasil), auditoria de acessos
- **SLA:** 99.95% uptime, suporte 24/7
- **Escalabilidade:** onboarding de 20 novos clientes/mês

**Desafio:** escolher modelo de banco de dados (shared vs isolated), região e estratégias de backup/DR.

---

## Slide 24: Cenário 5 — Plataforma de Ensino Online (LMS)

### Learning Management System para Universidade

**Contexto:** Plataforma para gestão de cursos, aulas e avaliações de uma universidade com 5.000 alunos.

**Requisitos:**
- **Usuários:** 5.000 alunos, 200 professores, 50 administrativos
- **Funcionalidades:** matrícula, aulas ao vivo (videoconferência), fóruns, provas online, notas
- **Picos de acesso:** início de semestre (3.000 acessos simultâneos), provas (1.500 simultâneos)
- **Armazenamento:** materiais didáticos (PDFs, vídeos) ~500GB, crescimento 100GB/semestre
- **Integrações:** sistema acadêmico legado (API REST), email institucional
- **Disponibilidade:** crítica durante período letivo (99.9%)

**Desafio:** escolher serviços para videoconferência, storage, banco de dados e estratégia de escalabilidade.

---

## Slide 25: Escolha do Cenário para T1

### Instruções para o Trabalho

**Cada grupo deve:**
1. **Escolher 1 dos 5 cenários** apresentados (slides 20-24)
2. Analisar os requisitos técnicos e de negócio
3. Propor uma arquitetura de solução em nuvem

**Entregável deve incluir:**
- Cenário escolhido e justificativa
- Provedor(es) de nuvem selecionado(s)
- Serviços específicos (compute, storage, database, etc.)
- Diagrama de arquitetura (pode ser simples)
- Estimativa de custos mensal
- Justificativa técnica das escolhas

**Dica:** use as calculadoras de custo dos provedores (AWS Calculator, Azure Pricing Calculator, GCP Pricing Calculator).

---

## Slide 26: Próxima Aula

### Modelos de Serviço e Provedores

**Tópicos:**
- Aprofundamento em IaaS, PaaS, SaaS
- Critérios de escolha de provedor
- Regiões, zonas e latência
- Estudo de caso comparativo (mesmo requisito em IaaS vs PaaS)

**Lembrete:**
- **Entrega do T1** na próxima aula
- Tragam dúvidas sobre o trabalho!

---

## Slide 27: Recursos e Referências

### Materiais de Apoio

**Bibliografias:**
- KOLBE JÚNIOR, Armando. *Computação em Nuvem*. Contentus, 2020.
- SOUSA NETO, Manoel Veras de. *Computação em Nuvem*. Brasport, 2015.
- MUNIZ, Antonio; IRIGOYEN, Analia. *Jornada DevOps*. Brasport, 2020.

**Documentação oficial:**
- [AWS Documentation](https://docs.aws.amazon.com/)
- [Azure Docs](https://docs.microsoft.com/azure/)
- [Google Cloud Docs](https://cloud.google.com/docs)

**Free Tier:** todos os provedores oferecem camada gratuita para aprendizado!

---

## Slide 28: Perguntas?

### Dúvidas, Comentários, Sugestões?

**Contato:**
- Email: diogo.p.ranghetti@gmail.com

---

## Slide 29: Glossário de Abreviações

### Termos Técnicos Utilizados

| Sigla | Significado | Descrição |
|-------|-------------|----------|
| **CI** | Continuous Integration | Integração Contínua - prática de integrar código frequentemente |
| **CD** | Continuous Delivery/Deployment | Entrega/Implantação Contínua - automação de releases |
| **DR** | Disaster Recovery | Recuperação de Desastres - estratégias de backup e restauração |
| **IoT** | Internet of Things | Internet das Coisas - dispositivos conectados |
| **IAM** | Identity and Access Management | Gerenciamento de Identidade e Acesso |
| **SLA** | Service Level Agreement | Acordo de Nível de Serviço - garantias de disponibilidade |
| **CDN** | Content Delivery Network | Rede de Distribuição de Conteúdo |
| **API** | Application Programming Interface | Interface de Programação de Aplicações |
| **VoD** | Video on Demand | Vídeo sob Demanda |
| **DRM** | Digital Rights Management | Gerenciamento de Direitos Digitais |
| **CRM** | Customer Relationship Management | Gestão de Relacionamento com Clientes |
| **LMS** | Learning Management System | Sistema de Gerenciamento de Aprendizagem |
| **IaaS** | Infrastructure as a Service | Infraestrutura como Serviço |
| **PaaS** | Platform as a Service | Plataforma como Serviço |
| **SaaS** | Software as a Service | Software como Serviço |
| **AZ** | Availability Zone | Zona de Disponibilidade |
| **VPS** | Virtual Private Server | Servidor Virtual Privado |
| **LGPD** | Lei Geral de Proteção de Dados | Legislação brasileira de privacidade |
| **GDPR** | General Data Protection Regulation | Regulamento europeu de proteção de dados |
| **FinOps** | Financial Operations | Gestão financeira de operações em nuvem |

---

## Slide 30: Obrigado!

### Nos vemos na próxima aula!

**Lembrete:**
- Formar grupos
- Iniciar T1 (entrega na Aula 2)
- Explorar free tier dos provedores (opcional, mas recomendado)

**Bons estudos! ☁️**
