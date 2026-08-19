# Aula 05 — Containers e Orquestração: Docker e Kubernetes

**Cloud Computing e DevOps Avançado**  
CST em Sistemas para Internet | 6º Período

---

## Slide 1: Abertura

### Aula 05 — Containers e Orquestração

- **Professor:** Ranghetti
- **Tema:** Docker (conceitos) e Kubernetes (visão geral)
- **Atividade:** containerização de uma aplicação simples
- **Trabalho:** entrega e feedback do Trabalho 2 (T2)

---

## Slide 2: Objetivos da Aula

### Ao final desta aula você será capaz de

- Explicar a diferença entre **máquinas virtuais e containers**
- Diferenciar **imagem, container, Dockerfile e registro**
- Construir e executar uma imagem de aplicação com Docker
- Aplicar práticas básicas de segurança e eficiência em imagens
- Explicar por que aplicações com muitos containers precisam de orquestração
- Relacionar **Pods, Deployments e Services** no Kubernetes
- Identificar requisitos adicionais para executar containers em produção

---

## Slide 3: Agenda

- Revisão da Aula 03
- Entrega e feedback do **Trabalho 2 (T2)**
- Fundamentos de containers
- Imagens, Dockerfile e registros
- Redes, volumes e configuração
- Prática de containerização
- Visão geral do Kubernetes
- Pods, Deployments e Services
- Requisitos para produção

---

## Slide 4: Revisão da Aula 04

### Da arquitetura à implantação

- Microserviços permitem **implantação e escala independentes**
- Sistemas distribuídos convivem com latência e falhas parciais
- Serviços precisam de limites e contratos claros
- Aplicações stateless facilitam escala horizontal
- Automação e observabilidade são requisitos operacionais

### Pergunta de conexão

Como empacotar cada serviço para executá-lo de forma consistente em diferentes ambientes?

---

## Slide 5: Trabalho 2 (T2) — Entrega

### Arquitetura de Referência: Microserviços e Containers

- Entrega do diagrama e da descrição da arquitetura
- A proposta deve apresentar:
  - Serviços e responsabilidades
  - APIs, mensagens ou eventos
  - Estratégia de dados
  - Escalabilidade e tratamento de falhas
  - Estratégia prevista de deploy com containers

**Valor:** até 1,0 ponto de acordo com entrega e participação.

---

## Slide 6: T2 — Feedback Orientado

### Critérios para a análise

- Os limites dos serviços correspondem a capacidades de negócio?
- O diagrama torna dependências e integrações visíveis?
- Componentes críticos podem escalar separadamente?
- A arquitetura considera falhas parciais?
- A estratégia de dados evita acoplamento indevido?
- O uso de containers tem uma justificativa clara?

> O objetivo do feedback é melhorar as decisões, não apenas verificar componentes.

---

## Slide 7: O Problema do “Na Minha Máquina Funciona”

### Ambientes inconsistentes geram falhas

- Versões diferentes de runtime e bibliotecas
- Dependências instaladas manualmente
- Configurações não documentadas
- Sistemas operacionais com comportamentos distintos
- Ausência de uma forma reproduzível de inicialização

### Resultado

Uma aplicação funciona no desenvolvimento, mas falha em teste ou produção.

---

## Slide 8: O que é um Container?

### Processo isolado com aplicação e dependências

Um container empacota:

- Código da aplicação
- Runtime e bibliotecas
- Dependências do sistema
- Configuração necessária para iniciar o processo

Containers compartilham o **kernel do host**, mas executam com isolamento de processos, rede e sistema de arquivos.

---

## Slide 9: Containers Não São Máquinas Virtuais

| Aspecto | Máquina Virtual | Container |
|---|---|---|
| Unidade | Sistema operacional completo | Processo isolado |
| Kernel | Próprio para cada VM | Compartilhado com o host |
| Inicialização | Geralmente mais lenta | Geralmente mais rápida |
| Tamanho | Frequentemente em GB | Frequentemente em MB |
| Isolamento | Forte, via hipervisor | Via recursos do sistema operacional |
| Densidade | Menor | Maior |

**Não existe substituição universal:** VMs e containers podem ser usados em conjunto.

---

## Slide 10: Containers no Linux

### Mecanismos principais

- **Namespaces:** isolam processos, rede, usuários e pontos de montagem
- **Control groups (cgroups):** controlam e contabilizam CPU, memória e outros recursos
- **Sistema de arquivos em camadas:** reutiliza conteúdo entre imagens
- **Capabilities:** permitem reduzir privilégios do processo

### Papel do runtime

Cria e executa containers a partir das especificações e imagens.

---

## Slide 11: Benefícios dos Containers

- Ambiente de execução reproduzível
- Empacotamento padronizado
- Inicialização rápida
- Maior densidade por host
- Facilidade de automação em CI/CD
- Implantação consistente entre ambientes
- Escala horizontal por replicação
- Isolamento de dependências entre aplicações

> Portabilidade reduz diferenças de ambiente, mas não elimina dependências de arquitetura, kernel ou serviços externos.

---

## Slide 12: Limitações e Cuidados

- Compartilhamento do kernel exige atenção à segurança
- Dados gravados na camada do container são efêmeros
- Logs e métricas precisam sair do container
- Redes distribuídas aumentam a complexidade
- Imagens vulneráveis propagam risco
- Muitos containers exigem automação operacional
- Aplicações com estado demandam estratégia de persistência

---

## Slide 13: Docker — Visão Geral

### Plataforma para construir, distribuir e executar containers

Componentes conceituais:

- **Dockerfile:** instruções para construir uma imagem
- **Image:** pacote imutável e versionado
- **Container:** instância em execução de uma imagem
- **Registry:** serviço de armazenamento e distribuição de imagens
- **Docker Engine:** constrói e executa containers
- **Docker CLI:** interface para enviar comandos ao Engine

---

## Slide 14: Imagem vs. Container

### Uma analogia útil

- **Imagem:** modelo somente leitura para criar ambientes de execução
- **Container:** instância criada a partir desse modelo

```text
Dockerfile → build → Imagem v1 → run → Container A
                              └→ run → Container B
```

- A mesma imagem pode iniciar vários containers
- Alterações internas de um container não modificam a imagem original

---

## Slide 15: Imagens em Camadas

### Reutilização e cache

```text
Camada 4 → código da aplicação
Camada 3 → dependências
Camada 2 → runtime
Camada 1 → imagem-base
```

- Cada instrução relevante pode criar uma camada
- Camadas idênticas podem ser compartilhadas
- A ordem do Dockerfile afeta o uso do cache
- Mudanças em uma camada invalidam o cache das seguintes

---

## Slide 16: Dockerfile

### Receita declarativa da imagem

```dockerfile
FROM node:22-alpine
WORKDIR /app
COPY package*.json ./
RUN npm ci --omit=dev
COPY . .
ENV PORT=3000
EXPOSE 3000
CMD ["node", "server.js"]
```

- `FROM`: define a imagem-base
- `WORKDIR`: configura o diretório de trabalho
- `COPY` e `RUN`: adicionam arquivos e executam etapas de build
- `CMD`: define o processo padrão do container

---

## Slide 17: Contexto de Build e .dockerignore

### Enviar somente o necessário

O contexto de build contém os arquivos acessíveis ao Dockerfile.

Exemplo de `.dockerignore`:

```text
node_modules
.git
.env
coverage
npm-debug.log
```

### Benefícios

- Build mais rápido
- Imagem menor
- Menor risco de copiar segredos ou arquivos locais

---

## Slide 18: Construir e Identificar uma Imagem

```bash
docker build -t agenda-api:1.0 .
docker image ls
```

### Nome de imagem

```text
registro/namespace/repositorio:tag
```

Exemplo:

```text
registry.example.com/equipe/agenda-api:1.0
```

- A tag identifica uma referência para a versão
- Em produção, prefira versões explícitas em vez de depender apenas de `latest`

---

## Slide 19: Executar um Container

```bash
docker run --name agenda-api \
  -p 8080:3000 \
  -e NODE_ENV=production \
  agenda-api:1.0
```

- `--name`: nome local do container
- `-p 8080:3000`: porta do host → porta do container
- `-e`: variável de ambiente
- A aplicação fica acessível pela porta `8080` do host

---

## Slide 20: Ciclo de Vida Básico

```bash
docker ps
docker logs agenda-api
docker stop agenda-api
docker start agenda-api
docker rm agenda-api
```

### Ideia central

- Container deve ser substituível
- Diagnóstico não deve depender de alterações manuais internas
- Correções devem gerar uma nova imagem versionada

---

## Slide 21: Configuração Externa

### A mesma imagem em vários ambientes

- Não incluir URLs, senhas ou tokens no código da imagem
- Usar variáveis de ambiente ou mecanismos de configuração
- Separar **configuração não sensível** de **segredos**
- Rotacionar credenciais sem reconstruir a aplicação quando possível

```text
Imagem única + configuração de desenvolvimento
             + configuração de homologação
             + configuração de produção
```

---

## Slide 22: Persistência e Volumes

### Containers são descartáveis; dados importantes não

- A camada gravável do container pode desaparecer com sua remoção
- **Volumes** armazenam dados fora do ciclo de vida do container
- **Bind mounts** ligam um caminho do host ao container
- Bancos de dados exigem persistência, backup e recuperação planejados

```bash
docker run -v dados-db:/var/lib/postgresql/data postgres:17
```

---

## Slide 23: Rede entre Containers

### Comunicação por nomes, não por endereços fixos

- Containers podem participar de uma rede virtual
- Portas publicadas expõem serviços ao host
- Serviços internos não precisam ser publicados externamente
- Endereços de containers podem mudar
- Descoberta por nome reduz dependência de IPs

```text
Front-end → API → Banco
          rede interna
```

---

## Slide 24: Registro de Imagens

### Distribuição entre ambientes

Fluxo típico:

```text
Código → Build → Testes → Tag → Push no Registry → Deploy
```

Exemplos:

- Docker Hub
- GitHub Container Registry
- Amazon Elastic Container Registry
- Azure Container Registry
- Google Artifact Registry

O registro deve possuir controle de acesso, versionamento e análise de vulnerabilidades.

---

## Slide 25: Boas Práticas de Imagem

- Usar imagens-base confiáveis e mantidas
- Fixar versões de dependências quando necessário
- Manter imagens pequenas, sem ferramentas desnecessárias
- Executar a aplicação como usuário não privilegiado
- Não copiar segredos para a imagem
- Usar build em múltiplos estágios quando aplicável
- Atualizar e reconstruir imagens para corrigir vulnerabilidades
- Registrar a origem dos componentes utilizados

---

## Slide 26: Multi-stage Build

### Separar compilação e execução

```dockerfile
FROM node:22-alpine AS build
WORKDIR /app
COPY package*.json ./
RUN npm ci
COPY . .
RUN npm run build

FROM nginx:alpine
COPY --from=build /app/dist /usr/share/nginx/html
```

### Benefício

A imagem final contém o resultado necessário para execução, sem todo o ambiente de build.

---

## Slide 27: Containers e Microserviços

### Relação comum, mas não obrigatória

- Um serviço pode ser empacotado como uma imagem independente
- Réplicas usam a mesma versão da imagem
- Cada serviço pode possuir ciclo de deploy próprio
- Limites de CPU e memória ajudam no isolamento
- A imagem facilita a automação de testes e publicação

**Atenção:** usar containers não transforma automaticamente um sistema em microserviços.

---

## Slide 28: Prática — Aplicação Simples

### Objetivo

Containerizar uma API ou aplicação web fornecida pelo professor.

Estrutura esperada:

```text
aplicacao/
├── Dockerfile
├── .dockerignore
├── package.json
└── server.js
```

A aplicação deve expor um endpoint de saúde e uma funcionalidade simples.

---

## Slide 29: Prática — Etapa 1

### Compreender a aplicação

Antes de criar a imagem, identifique:

1. Qual comando inicia a aplicação?
2. Qual runtime e versão são necessários?
3. Qual porta é utilizada?
4. Quais dependências precisam ser instaladas?
5. Quais configurações variam por ambiente?
6. A aplicação grava dados localmente?

**Tempo sugerido:** 10 minutos.

---

## Slide 30: Prática — Etapa 2

### Criar o empacotamento

- Escrever o `Dockerfile`
- Criar o `.dockerignore`
- Construir a imagem com nome e versão
- Verificar se o build termina sem erros
- Inspecionar o tamanho e as camadas da imagem

```bash
docker build -t aplicacao-aula:1.0 .
docker image ls aplicacao-aula
```

---

## Slide 31: Prática — Etapa 3

### Executar e validar

- Iniciar o container
- Mapear a porta corretamente
- Testar a aplicação pelo navegador ou cliente HTTP
- Consultar os logs
- Parar e remover o container
- Criar uma nova instância usando a mesma imagem

### Evidência esperada

Aplicação acessível e logs exibidos no fluxo padrão do container.

---

## Slide 32: Prática — Diagnóstico de Falhas

### Se o container não funcionar

- O processo principal encerrou?
- A porta interna está correta?
- A aplicação escuta em `0.0.0.0` ou apenas em `localhost`?
- Alguma variável de ambiente está ausente?
- A dependência foi copiada ou instalada?
- O log apresenta erro de permissão?
- A arquitetura da imagem é compatível com o host?

> O log é evidência para diagnóstico, não apenas uma mensagem de erro.

---

## Slide 33: De Um Container para Muitos

### Novos problemas operacionais

- Em qual máquina cada container deve executar?
- Como manter a quantidade desejada de réplicas?
- Como substituir uma instância que falhou?
- Como atualizar sem interromper todo o serviço?
- Como descobrir o endereço de instâncias dinâmicas?
- Como distribuir configuração e segredos?
- Como controlar recursos e permissões?

Esses problemas motivam o uso de um **orquestrador**.

---

## Slide 34: O que é Orquestração?

### Automação do ciclo de vida de aplicações containerizadas

Um orquestrador coordena:

- Agendamento de workloads em máquinas disponíveis
- Estado desejado e reconciliação
- Reinício e substituição de instâncias
- Escala de réplicas
- Atualizações graduais
- Rede e descoberta de serviços
- Configuração, segredos e armazenamento

---

## Slide 35: Kubernetes — Visão Geral

### Plataforma para gerenciar workloads containerizados

- O usuário declara o **estado desejado**
- Controladores observam o estado atual
- O cluster executa ações para reduzir a diferença

```text
Estado desejado → Controladores → Estado atual
       ↑                              │
       └──────── reconciliação ───────┘
```

Kubernetes gerencia workloads por meio de objetos de sua API.

---

## Slide 36: Arquitetura do Cluster

### Componentes em alto nível

- **Control plane:** mantém o estado e coordena o cluster
  - API server
  - Scheduler
  - Controllers
  - Armazenamento do estado do cluster
- **Nodes:** executam os workloads
  - Kubelet
  - Runtime de containers
  - Componentes de rede

Aplicações são distribuídas pelos nodes conforme recursos e políticas.

---

## Slide 37: Objetos Declarativos

### Descrever o resultado esperado

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: agenda-api
spec:
  replicas: 3
```

Campos comuns:

- `apiVersion`: versão da API
- `kind`: tipo de objeto
- `metadata`: identificação e rótulos
- `spec`: estado desejado
- `status`: estado observado pelo cluster

---

## Slide 38: Pod

### Menor unidade implantável no Kubernetes

- Contém um ou mais containers fortemente relacionados
- Containers do Pod compartilham rede e podem compartilhar volumes
- Normalmente, um Pod executa o container principal da aplicação
- Pods são recursos efêmeros e podem ser substituídos
- Não se deve depender do nome ou IP permanente de um Pod

```text
Pod
├── Container da aplicação
└── Container auxiliar (opcional)
```

---

## Slide 39: Deployment

### Gerenciamento de aplicações stateless

Um Deployment:

- Declara a quantidade desejada de Pods
- Cria e gerencia ReplicaSets
- Substitui Pods indisponíveis
- Permite atualização gradual da imagem
- Mantém histórico para rollback

```text
Deployment → ReplicaSet → Pod 1
                        → Pod 2
                        → Pod 3
```

---

## Slide 40: Service

### Endpoint estável para um conjunto de Pods

- Pods podem ser criados e removidos dinamicamente
- O Service seleciona Pods por rótulos
- Oferece endereço e nome estáveis
- Distribui conexões entre endpoints disponíveis
- Pode expor a aplicação apenas no cluster ou externamente

```text
Cliente → Service → Pod A
                  → Pod B
                  → Pod C
```

---

## Slide 41: Pods, Deployments e Services

| Objeto | Responsabilidade | Pergunta que responde |
|---|---|---|
| **Pod** | Executar containers relacionados | Onde o processo está rodando? |
| **Deployment** | Manter e atualizar réplicas | Quantas instâncias devem existir? |
| **Service** | Fornecer acesso estável | Como outros componentes encontram a aplicação? |

### Fluxo

`Deployment` mantém os `Pods`; o `Service` fornece acesso ao conjunto saudável.

---

## Slide 42: Exemplo de Deployment

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: agenda-api
spec:
  replicas: 3
  selector:
    matchLabels:
      app: agenda-api
  template:
    metadata:
      labels:
        app: agenda-api
    spec:
      containers:
        - name: api
          image: registry.example.com/agenda-api:1.0
          ports:
            - containerPort: 3000
```

---

## Slide 43: Exemplo de Service

```yaml
apiVersion: v1
kind: Service
metadata:
  name: agenda-api
spec:
  selector:
    app: agenda-api
  ports:
    - port: 80
      targetPort: 3000
  type: ClusterIP
```

- O seletor conecta o Service aos Pods com o rótulo correspondente
- `ClusterIP` oferece acesso interno ao cluster

---

## Slide 44: Estado Desejado e Autorrecuperação

### Exemplo: três réplicas declaradas

1. Deployment mantém três Pods
2. Um Pod falha ou seu node fica indisponível
3. O controlador detecta diferença no estado
4. Um novo Pod é criado
5. O Service passa a encaminhar tráfego aos endpoints disponíveis

**Atenção:** recriar processos não substitui persistência, backup ou tratamento correto de falhas na aplicação.

---

## Slide 45: Atualizações e Rollback

### Evoluir sem substituir tudo ao mesmo tempo

- Deployment pode realizar **rolling update**
- Novos Pods entram gradualmente
- Pods antigos são removidos de forma controlada
- Readiness probes evitam tráfego antes de a aplicação estar pronta
- Histórico do Deployment apoia rollback

### Requisito

A nova versão deve manter contratos e compatibilidade durante a transição.

---

## Slide 46: Health Checks

### Processos ativos nem sempre estão saudáveis

- **Liveness probe:** indica se o container deve ser reiniciado
- **Readiness probe:** indica se pode receber tráfego
- **Startup probe:** protege aplicações com inicialização lenta

### Exemplo de endpoints

- `/health/live`
- `/health/ready`

Checks mal configurados podem provocar reinícios ou indisponibilidade desnecessários.

---

## Slide 47: Recursos e Limites

### Evitar disputa descontrolada no cluster

- **Requests:** recursos usados pelo agendador como referência
- **Limits:** teto de consumo definido para o container
- CPU insuficiente pode causar lentidão
- Excesso de memória pode levar ao encerramento do processo
- Valores devem ser ajustados com métricas e testes

```text
Container sem limites ≠ recursos infinitos
```

---

## Slide 48: Requisitos para Produção

### Containerizar é apenas o início

- Imagens versionadas, assinadas e verificadas
- Registro privado e controle de acesso
- Configuração e segredos protegidos
- Requests, limits e probes
- Logs, métricas e rastreamento
- Persistência, backup e recuperação
- Políticas de rede e menor privilégio
- Estratégia de rollout e rollback
- Alta disponibilidade do cluster e da aplicação

---

## Slide 49: Anti-padrões Comuns

- Usar `latest` como única referência em produção
- Executar aplicação como `root` sem necessidade
- Incluir chaves e senhas na imagem
- Tratar container como servidor permanente
- Gravar dados importantes apenas no sistema de arquivos local
- Criar Pods diretamente para aplicações que precisam permanecer ativas
- Confundir reinício automático com resiliência completa
- Adotar Kubernetes sem necessidade ou capacidade operacional

---

## Slide 50: Discussão — Arquitetura do T2 em Produção

### Revisite a proposta do grupo

Para dois serviços do T2, definam:

- Uma imagem por serviço e sua estratégia de versionamento
- Configurações e segredos necessários
- Portas e comunicação interna
- Quantidade inicial de réplicas
- Necessidade de volume persistente
- Health checks
- Recursos e limites iniciais
- Forma de exposição pelo Service

**Tempo sugerido:** 15 minutos.

---

## Slide 51: Checklist da Prática

Antes de concluir, verifique:

- A imagem foi construída de forma reproduzível?
- O `.dockerignore` exclui arquivos desnecessários e sensíveis?
- A aplicação inicia com um comando definido?
- A porta foi mapeada corretamente?
- Configurações estão fora da imagem?
- Logs podem ser consultados externamente?
- O container pode ser removido e recriado?
- Os requisitos de produção foram registrados?

---

## Slide 52: Encerramento

### O que consolidamos hoje

- Containers empacotam aplicações e dependências com execução isolada
- Imagens são modelos versionados; containers são suas instâncias
- Dockerfile torna o build reproduzível
- Registros distribuem imagens entre ambientes
- Volumes, configuração, segurança e observabilidade precisam ser planejados
- Kubernetes reconcilia o estado atual com o estado desejado
- Pods executam containers, Deployments mantêm réplicas e Services fornecem acesso estável

---

## Slide 53: Próxima Aula

### Aula 06 — Serviços de Nuvem

- Armazenamento de objetos
  - Amazon S3
  - Azure Blob Storage
  - Google Cloud Storage
- Bancos SQL e NoSQL gerenciados
- Serviços de computação em máquinas virtuais
- Arquitetura de referência: aplicação web + banco + storage
- **Trabalho 3 (T3):** lançamento e entrega em sala

---

## Slide 54: Glossário Rápido

| Termo | Significado |
|---|---|
| **Container** | Processo isolado criado a partir de uma imagem |
| **Dockerfile** | Arquivo declarativo usado para construir uma imagem |
| **Image** | Pacote imutável com aplicação e dependências |
| **Registry** | Serviço para armazenar e distribuir imagens |
| **Pod** | Menor unidade implantável do Kubernetes |
| **Deployment** | Objeto que gerencia réplicas e atualizações de Pods |
| **Service** | Endpoint estável para acessar um conjunto de Pods |
| **Desired state** | Estado que os controladores tentam manter |
| **Probe** | Verificação de inicialização, prontidão ou atividade |

---

## Slide 55: Recursos e Referências

### Bibliografia da disciplina

- KOLBE JÚNIOR, Armando. *Computação em Nuvem*. Contentus, 2020.
- SOUSA NETO, Manoel Veras de. *Computação em Nuvem*. Brasport, 2015.
- MUNIZ, Antonio; IRIGOYEN, Analia. *Jornada DevOps*. Brasport, 2020.

### Documentação e leituras complementares

- Docker Docs — conceitos, construção e execução de containers
- Kubernetes Documentation — Pods, Deployments e Services
- Kubernetes Documentation — configuração e boas práticas
- OCI — especificações abertas para imagens e runtimes de containers
- BURNS, Brendan et al. *Kubernetes: Up and Running*. O'Reilly Media.

---

## Slide 56: Perguntas?

### Dúvidas, comentários e feedback da aula

- Qual problema os containers resolvem melhor?
- Quando uma máquina virtual ainda é a escolha adequada?
- Por que não devemos depender do IP de um Pod?
- Qual é a relação entre Deployment e Service?
- Quais requisitos faltariam para levar a prática de hoje à produção?
