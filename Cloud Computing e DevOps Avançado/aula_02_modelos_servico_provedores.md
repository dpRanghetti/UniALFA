# Aula 02 — Modelos de Serviço e Provedores (IaaS, PaaS, SaaS; AWS/Azure/GCP)

**Cloud Computing e DevOps Avançado**  
CST em Sistemas para Internet | 6º Período

---

## Slide 1: Abertura

### Aula 02 — Modelos de Serviço e Provedores

- **Professor:** Ranghetti
- **Contato:** diogo.p.ranghetti@gmail.com

---

## Slide 2: Objetivos da Aula

### Ao final desta aula você será capaz de

- Explicar e diferenciar **IaaS**, **PaaS** e **SaaS**
- Relacionar **responsabilidades** do cliente vs. provedor em cada modelo
- Entender o básico de **regiões** e **zonas de disponibilidade**
- Comparar **AWS**, **Azure** e **GCP** em critérios práticos
- Justificar a escolha de provedor/modelo para um requisito real

---

## Slide 3: Agenda

- **Entrega do T1**
- Revisão rápida da Aula 01
- Modelos de serviço: **IaaS / PaaS / SaaS**
- Critérios de escolha de provedor
- **Regiões / Zonas / Latência / Resiliência**
- Prática: estudo de caso comparativo (**mesmo requisito em IaaS vs PaaS**)

---

## Slide 4: Trabalho 1 (T1) — Entrega

### O que você deve entregar hoje

- Documento curto (2–3 páginas) contendo:
  - Requisitos do sistema escolhido
  - Escolha de **provedor** e **modelo** (IaaS/PaaS/SaaS)
  - Justificativas técnicas e de custo

---

## Slide 5: T1 — Checklist rápido

- O requisito está claro e completo?
- Você mapeou serviços equivalentes?
- Justificou por que IaaS/PaaS/SaaS?
- Considerou regiões/AZ e disponibilidade?
- Considerou segurança básica (IAM/acesso)?
- Apresentou uma ideia de custo/limite?

---

## Slide 6: Revisão (Aula 01)

### Conceitos essenciais

- Computação em nuvem: recursos de TI sob demanda + pagamento por uso
- Benefícios: elasticidade, agilidade, disponibilidade global
- Modelo de responsabilidade compartilhada

---

## Slide 7: Onde os Modelos de Serviço entram?

### Pergunta orientadora

Quando você diz “vou usar cloud”, na prática você está escolhendo:

- **Quanto controle você quer ter**
- **Quanto trabalho operacional você quer assumir**
- **Quanto você quer delegar para o provedor**

---

## Slide 8: IaaS — Infrastructure as a Service

### O que é?

- Você “aluga” infraestrutura (VM, rede, disco)
- Você escolhe e configura SO, runtime, dependências e deploy

### Quando faz sentido

- Requisitos específicos de SO/rede
- Migração “lift-and-shift” de legado
- Necessidade de alto controle e customização

---

## Slide 9: IaaS — Exemplos e Serviços

### Exemplos comuns

- **AWS:** EC2, EBS, VPC
- **Azure:** Virtual Machines, Disks, Virtual Network
- **GCP:** Compute Engine, Persistent Disk, VPC

### Vantagens

- Flexibilidade
- Grande compatibilidade com arquiteturas tradicionais

### Desvantagens

- Mais operação (patching, hardening, backup, observabilidade)

---

## Slide 10: PaaS — Platform as a Service

### O que é?

- Plataforma gerenciada para rodar aplicações
- Você foca em **código + configuração**, não em servidor

### Quando faz sentido

- Time pequeno e necessidade de velocidade
- Deploy frequente
- Padronização e redução de esforço operacional

---

## Slide 11: PaaS — Exemplos e Serviços

### Exemplos comuns

- **AWS:** Elastic Beanstalk, RDS (banco gerenciado)
- **Azure:** App Service, Azure SQL Database
- **GCP:** App Engine, Cloud SQL

### Pontos de atenção

- Limitações de runtime/configuração
- Possível aumento de lock-in (serviços específicos)

---

## Slide 12: SaaS — Software as a Service

### O que é?

- Software pronto via Internet
- Você gerencia apenas **uso, usuários e dados** (dependendo do contrato)

### Exemplos

- E-mail corporativo, CRM, ferramenta de gestão acadêmica, suites office

---

## Slide 13: Comparativo — IaaS vs PaaS vs SaaS

| Modelo | Você gerencia | Provedor gerencia | Exemplos |
|---|---|---|---|
| **IaaS** | Apps, dados, runtime, SO | virtualização, servidores, storage, rede | EC2/VMs/GCE |
| **PaaS** | Apps, dados | runtime, middleware, SO + infra | App Service/App Engine |
| **SaaS** | uso e configurações | aplicação completa + infra | Gmail, Salesforce |

---

## Slide 14: Responsabilidade Compartilhada (na prática)

### Regra simples

- **Quanto mais gerenciado**, menos você opera
- **Quanto mais controle**, mais você é responsável

### Exemplos

- IaaS: patch de SO costuma ser do cliente
- PaaS: patch de runtime/OS é do provedor
- SaaS: quase tudo é do provedor, mas **acesso e dados** seguem críticos

---

## Slide 15: Critérios para escolher Provedor

### Critérios técnicos

- **Serviços disponíveis** (compute, storage, DB, IAM, observabilidade)
- **Maturidade/estabilidade** dos serviços
- **Regiões/AZs** disponíveis e proximidade
- **Ferramentas de rede e segurança** (IAM, firewall, auditoria)

---

## Slide 16: Critérios para escolher Provedor

### Critérios de negócio

- **Custo total** (infra + operação + transferência)
- **Suporte** e SLA
- **Compliance** e requisitos regulatórios (ex.: LGPD)
- **Lock-in** vs portabilidade
- **Ecossistema** (ferramentas, comunidade, mão de obra)

---

## Slide 17: Regiões e Zonas (conceito)

- **Região:** localização geográfica (ex.: Brasil, EUA, Europa)
- **Zona de Disponibilidade (AZ):** data centers separados dentro da região

### Por que isso importa?

- Latência (usuário mais perto = melhor)
- Resiliência (distribuir em múltiplas AZs)
- Conformidade (dados no país/região)

---

## Slide 18: Alta Disponibilidade com Regiões/AZ

### Estratégia mínima recomendada

- Produção: **mínimo 2 AZs**
- Camadas críticas com redundância:
  - balanceador
  - aplicação
  - banco (replicação/failover)

### Pergunta para arquitetura

“Se uma AZ cair, o sistema continua?”

---

## Slide 19: AWS, Azure e GCP — Como comparar

### O que comparar primeiro

- Serviços “equivalentes” (VM, storage, DB, IAM)
- Facilidade de uso e documentação
- Oferta de regiões e AZs
- Ferramentas de observabilidade

---

## Slide 20: Mapeamento rápido de serviços equivalentes

| Necessidade | AWS | Azure | GCP |
|---|---|---|---|
| VM | EC2 | Virtual Machines | Compute Engine |
| Storage de objetos | S3 | Blob Storage | Cloud Storage |
| Banco SQL gerenciado | RDS | Azure SQL | Cloud SQL |
| IAM | IAM | Entra ID/IAM | Cloud IAM |

---

## Slide 21: Atenção a custos

### Onde o custo “explode”

- Recursos ligados 24/7 sem necessidade
- Dimensionamento acima do necessário
- Transferência de dados (egress)
- Falta de governança (tags, budgets, alertas)

### Boas práticas

- Orçamentos e alertas
- Ambientes dev/test com desligamento programado
- Revisão periódica (FinOps básico)

---

## Slide 22: Prática — Estudo de caso (IaaS vs PaaS)

### Mesmo requisito, duas abordagens

Você vai comparar o mesmo sistema em:

- **Abordagem A (IaaS):** VMs + configuração manual/automação
- **Abordagem B (PaaS):** serviço gerenciado de aplicação + banco gerenciado

---

## Slide 23: Prática — Requisito base (fornecido pelo professor)

### Cenário proposto

- Aplicação web simples (API + front)
- Banco de dados relacional
- Necessidade de HTTPS
- Picos de acesso em determinados horários
- Backup diário

### Entrega da prática (em sala)

- Lista de serviços sugeridos (por provedor)
- Justificativa de IaaS vs PaaS

---

## Slide 24: Prática — Perguntas-guia

- Qual abordagem é mais rápida para colocar no ar?
- Qual abordagem exige mais operação contínua?
- Como garantir alta disponibilidade?
- Como evoluir para escalabilidade?
- Onde estão os riscos de segurança?
- Como estimar custos iniciais?

---

## Slide 25: Encerramento

### O que consolidamos hoje

- Diferenças práticas entre **IaaS, PaaS e SaaS**
- Critérios objetivos de escolha de provedor
- Importância de regiões/AZ para resiliência

---

## Slide 26: Próxima Aula

### Aula 03 — Arquiteturas em nuvem: distribuídas, escaláveis e microserviços

- Arquitetura distribuída e escalabilidade
- Microserviços e trade-offs
- Atividade: decomposição de monólito em serviços
- **Lançamento do T2**

---

## Slide 27: Glossário rápido

| Sigla | Significado |
|---|---|
| **IaaS** | Infrastructure as a Service |
| **PaaS** | Platform as a Service |
| **SaaS** | Software as a Service |
| **AZ** | Availability Zone |
| **IAM** | Identity and Access Management |
| **SLA** | Service Level Agreement |
| **LGPD** | Lei Geral de Proteção de Dados |
| **FinOps** | Financial Operations |

---

## Slide 28: Perguntas?

### Dúvidas, comentários e feedback da aula

- O que ficou mais confuso: IaaS, PaaS ou SaaS?
- Em qual caso você escolheria PaaS e por quê?
- Quais critérios de provedor você considera mais importantes?
