# Aula 06 — Trabalho Prático: Docker, Kubernetes e Comparação de Provedores

**Cloud Computing e DevOps Avançado**  
CST em Sistemas para Internet | 6º Período

---

## Slide 1: Abertura

### Aula 06 — Desenvolvimento e Entrega do Trabalho 3

- **Professor:** Ranghetti
- **Atividade principal:** tutorial de implantação conteinerizada
- **Aplicação:** Biblioteca
- **Tecnologias:** Docker e Kubernetes
- **Valor:** até 1,0 ponto
- **Entrega:** ao final desta aula

---

## Slide 2: Ajuste Excepcional do Cronograma

### Agenda acadêmica de formatura

- Esta aula terá formato exclusivamente prático
- O conteúdo originalmente previsto para a Aula 06 sai do cronograma
- Não serão abordados nesta aula:
  - Serverless
  - CDN
  - Processamento assíncrono com filas e tópicos
- O encontro será dedicado ao desenvolvimento, validação, entrega e apresentação do trabalho

---

## Slide 3: Agenda da Aula

- Apresentação do desafio e dos critérios
- Análise técnica da aplicação Biblioteca
- Definição da estratégia de containerização
- Preparação dos manifestos Kubernetes
- Escolha dos três ambientes
- Desenvolvimento dos três tutoriais
- Levantamento e comparação de custos
- Validação, evidências e entrega por e-mail
- Sorteio e apresentação de uma equipe

---

## Slide 4: Objetivos da Atividade

### Ao final desta aula a equipe deverá ser capaz de

- Analisar os requisitos de execução de uma aplicação Spring Boot
- Construir e validar uma imagem Docker
- Preparar recursos básicos de implantação no Kubernetes
- Documentar a implantação em três ambientes diferentes
- Comparar custos, vantagens, limitações e esforço operacional
- Produzir um tutorial reproduzível por outra equipe
- Comunicar decisões técnicas de forma objetiva

---

## Slide 5: Trabalho 3 — Visão Geral

### Tutorial de implantação multicloud

- **Valor:** até 1,0 ponto
- **Desenvolvimento:** durante a Aula 06
- **Entrega:** obrigatoriamente ao final da Aula 06
- **Aplicação:** https://github.com/dpRanghetti/biblioteca
- **Resultado esperado:** tutorial completo para executar a aplicação com Docker e Kubernetes em três provedores
- Uma equipe será sorteada para apresentar ao final da aula

---

## Slide 6: Regra dos Três Ambientes

### Escolha obrigatória

- Escolher **dois** entre:
  - Amazon Web Services — AWS
  - Google Cloud Platform — GCP
  - Microsoft Azure
- Escolher um **terceiro ambiente diferente**:
  - VPS de outro provedor
  - Servidor dedicado
  - Outra plataforma que permita executar Kubernetes
- A equipe deve usar três provedores distintos
- O terceiro ambiente não pode ser outra conta do mesmo provedor

---

## Slide 7: Exemplos de Combinações Válidas

- AWS + Google Cloud + VPS
- AWS + Microsoft Azure + VPS
- Google Cloud + Microsoft Azure + VPS
- Para o terceiro ambiente, exemplos possíveis:
  - DigitalOcean
  - Akamai Cloud — Linode
  - Vultr
  - Hetzner Cloud
  - Oracle Cloud Infrastructure, caso não esteja entre os dois principais escolhidos
  - VPS de outro fornecedor justificável
- A equipe deve informar produto, região e configuração utilizados na comparação

---

## Slide 8: Aplicação de Referência

### Projeto Biblioteca

- Aplicação web desenvolvida com **Spring Boot 4.0.6**
- Requer **Java 21**
- Interface HTML renderizada com **Thymeleaf**
- API REST protegida por **JWT**
- Persistência com **Spring Data JPA**
- Banco de dados **H2 em memória**
- Porta padrão da aplicação: **8080**
- Build gerenciado por **Maven Wrapper**

---

## Slide 9: Funcionalidades que Devem ser Validadas

- Interface web:
  - Página de login
  - Cadastro e consulta de autores
  - Cadastro e consulta de livros
  - Administração de usuários conforme permissões
- API REST:
  - Autenticação em `/api/auth/login`
  - Acesso autenticado com Bearer Token
- Acessos locais esperados:
  - Aplicação: `http://localhost:8080/`
  - Login: `http://localhost:8080/login`
  - Console H2: `http://localhost:8080/h2-console`

---

## Slide 10: Credenciais Iniciais da Aplicação

### Apenas para o ambiente acadêmico

- Administrador:
  - Usuário: `admin`
  - Senha: `admin`
- Usuário comum:
  - Usuário: `user`
  - Senha: `user`
- O tutorial deve alertar:
  - Credenciais padrão não são adequadas para produção
  - Segredos não devem ser gravados diretamente em imagem ou repositório público

---

## Slide 11: Atenção ao Banco H2

### Limitação importante do projeto atual

- A URL configurada é `jdbc:h2:mem:banco`
- Os dados existem somente na memória do processo
- Quando o container ou Pod é reiniciado:
  - Os dados cadastrados são perdidos
- Por esse motivo, o trabalho deve:
  - Usar apenas uma réplica da aplicação
  - Informar que a implantação é demonstrativa
  - Registrar a limitação no tutorial e na comparação
- Não é obrigatório migrar para outro banco de dados

---

## Slide 12: Arquitetura Mínima Esperada

```text
Usuário
   |
IP ou DNS público
   |
Service / Ingress / proxy reverso
   |
Deployment Kubernetes
   |
Pod com container da Biblioteca
   |
H2 em memória dentro do processo
```

- A mesma imagem deve ser usada nos três ambientes
- Os manifestos devem mudar apenas quando o provedor exigir adaptação justificada

---

## Slide 13: Etapas do Tutorial

1. Preparar ferramentas e credenciais
2. Obter e analisar o código-fonte
3. Criar o `Dockerfile` e `.dockerignore`
4. Construir e testar a imagem localmente
5. Publicar a imagem em um registro
6. Criar os manifestos Kubernetes
7. Criar ou acessar o cluster de cada provedor
8. Implantar, expor e validar a aplicação
9. Registrar evidências e custos
10. Remover recursos para interromper cobranças

---

## Slide 14: Pré-requisitos do Ambiente Local

- Git
- Docker Engine ou Docker Desktop
- `kubectl`
- Uma ferramenta de edição de texto ou IDE
- Contas nos três provedores escolhidos
- Ferramentas de linha de comando, conforme escolha:
  - `aws` e `eksctl`
  - `gcloud`
  - `az`
  - SSH para a VPS
- Permissão para criar clusters, redes, registros e balanceadores

---

## Slide 15: Clonar e Verificar o Projeto

```bash
git clone https://github.com/dpRanghetti/biblioteca.git
cd biblioteca
```

### Antes de criar a imagem

- Confirmar a existência de:
  - `pom.xml`
  - `mvnw` e `mvnw.cmd`
  - `src/main/java`
  - `src/main/resources/application.properties`
- Registrar no tutorial o commit ou a data da versão utilizada

---

## Slide 16: Dockerfile — Build em Múltiplos Estágios

```dockerfile
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/biblioteca-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

- A imagem final contém o runtime, não o Maven completo
- A equipe pode melhorar o arquivo, desde que explique as decisões

---

## Slide 17: Arquivo `.dockerignore`

```text
.git
.idea
.vscode
target
docs
*.log
README.md
```

### Objetivos

- Reduzir o contexto enviado ao Docker
- Evitar copiar artefatos locais desnecessários
- Diminuir tempo de build e tamanho de camadas
- Não enviar arquivos de credenciais para a imagem

---

## Slide 18: Construir a Imagem

```bash
docker build -t biblioteca:1.0 .
```

### Verificações obrigatórias

```bash
docker image ls biblioteca
docker history biblioteca:1.0
```

- O build deve terminar sem erros
- O nome e a tag precisam ser usados de forma consistente
- O tutorial deve registrar versão da imagem e resultado do build

---

## Slide 19: Executar Localmente

```bash
docker run --name biblioteca-local -p 8080:8080 \
  -e API_SECURITY_TOKEN_SECRET="trocar-por-segredo-com-256-bits" \
  biblioteca:1.0
```

### Validar

- Abrir `http://localhost:8080/login`
- Entrar com um usuário de teste
- Consultar os logs:

```bash
docker logs biblioteca-local
```

---

## Slide 20: Encerrar o Teste Local

```bash
docker stop biblioteca-local
docker rm biblioteca-local
```

### Antes de continuar

- Confirmar que a aplicação iniciou na porta 8080
- Verificar se o login funciona
- Registrar uma captura de tela ou trecho de log
- Corrigir o container local antes de implantar na nuvem
- Não usar o cluster como ambiente de depuração do Dockerfile

---

## Slide 21: Publicar a Imagem

### Registros possíveis

- Docker Hub
- Amazon Elastic Container Registry — ECR
- Google Artifact Registry
- Azure Container Registry — ACR
- Registro oferecido pelo terceiro provedor

### Fluxo geral

```bash
docker tag biblioteca:1.0 REGISTRO/USUARIO/biblioteca:1.0
docker push REGISTRO/USUARIO/biblioteca:1.0
```

- A imagem pode ser pública apenas para esta atividade ou privada com `imagePullSecret`

---

## Slide 22: Configuração e Segredos

- A aplicação possui um segredo JWT no arquivo de propriedades
- Para o trabalho, sobrescrever por variável de ambiente:
  - `API_SECURITY_TOKEN_SECRET`
- No Kubernetes, armazenar o valor em um `Secret`
- Não incluir o valor real:
  - No tutorial público
  - No repositório
  - Em capturas de tela
- O documento deve explicar como cada integrante fornece seu próprio valor

---

## Slide 23: Manifesto `Secret`

```yaml
apiVersion: v1
kind: Secret
metadata:
  name: biblioteca-secret
type: Opaque
stringData:
  jwt-secret: "SUBSTITUIR-ANTES-DE-APLICAR"
```

- O valor mostrado é apenas um marcador
- Uma alternativa é criar o recurso diretamente:

```bash
kubectl create secret generic biblioteca-secret \
  --from-literal=jwt-secret="VALOR_FORTE"
```

---

## Slide 24: Manifesto `Deployment`

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: biblioteca
spec:
  replicas: 1
  selector:
    matchLabels:
      app: biblioteca
  template:
    metadata:
      labels:
        app: biblioteca
    spec:
      containers:
        - name: biblioteca
          image: REGISTRO/USUARIO/biblioteca:1.0
          ports:
            - containerPort: 8080
```

---

## Slide 25: Deployment — Configuração e Recursos

```yaml
          env:
            - name: API_SECURITY_TOKEN_SECRET
              valueFrom:
                secretKeyRef:
                  name: biblioteca-secret
                  key: jwt-secret
          resources:
            requests:
              cpu: "250m"
              memory: "384Mi"
            limits:
              cpu: "1"
              memory: "768Mi"
```

- Os valores são ponto de partida para o laboratório
- A equipe deve registrar os valores efetivamente usados

---

## Slide 26: Deployment — Verificações de Saúde

```yaml
          readinessProbe:
            httpGet:
              path: /login
              port: 8080
            initialDelaySeconds: 20
            periodSeconds: 10
          livenessProbe:
            httpGet:
              path: /login
              port: 8080
            initialDelaySeconds: 40
            periodSeconds: 20
```

- `readinessProbe`: indica quando o Pod pode receber tráfego
- `livenessProbe`: auxilia a detectar processo sem resposta
- Ajustar tempos se o ambiente apresentar inicialização mais lenta

---

## Slide 27: Manifesto `Service`

### Nuvem gerenciada

```yaml
apiVersion: v1
kind: Service
metadata:
  name: biblioteca
spec:
  type: LoadBalancer
  selector:
    app: biblioteca
  ports:
    - port: 80
      targetPort: 8080
```

- Em serviços gerenciados, `LoadBalancer` costuma provisionar um recurso cobrado
- Na VPS, a exposição pode exigir `NodePort`, Ingress ou proxy reverso

---

## Slide 28: Aplicar e Acompanhar

```bash
kubectl apply -f secret.yaml
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml

kubectl get pods
kubectl get deployment
kubectl get service
kubectl rollout status deployment/biblioteca
```

### Diagnóstico

```bash
kubectl describe pod NOME_DO_POD
kubectl logs deployment/biblioteca
```

---

## Slide 29: Roteiro AWS — Amazon EKS

### O tutorial da equipe deve mostrar

1. Configuração da conta, região e identidade
2. Criação ou escolha de um registro ECR
3. Envio da imagem ao ECR
4. Criação do cluster EKS e dos nós
5. Configuração do contexto do `kubectl`
6. Aplicação dos manifestos
7. Obtenção do endereço público
8. Validação da aplicação e dos logs
9. Exclusão do Service, nós, cluster e imagens não necessárias

---

## Slide 30: AWS — Comandos de Referência

```bash
aws sts get-caller-identity
aws ecr create-repository --repository-name biblioteca
aws ecr get-login-password --region REGIAO | \
  docker login --username AWS --password-stdin REGISTRO_ECR

eksctl create cluster --name biblioteca --region REGIAO
kubectl get nodes
kubectl apply -f k8s/
kubectl get service biblioteca
```

- Os comandos precisam ser adaptados à conta e região
- O tutorial deve usar documentação oficial e registrar recursos cobrados

---

## Slide 31: Roteiro Google Cloud — GKE

### O tutorial da equipe deve mostrar

1. Projeto e faturamento habilitados
2. APIs necessárias ativadas
3. Repositório no Artifact Registry
4. Autenticação e envio da imagem
5. Criação de cluster GKE Standard ou Autopilot
6. Obtenção das credenciais do cluster
7. Aplicação dos manifestos
8. Validação do IP externo e dos logs
9. Exclusão do cluster, balanceador e imagens não necessárias

---

## Slide 32: Google Cloud — Comandos de Referência

```bash
gcloud auth login
gcloud config set project ID_DO_PROJETO
gcloud services enable container.googleapis.com artifactregistry.googleapis.com
gcloud artifacts repositories create biblioteca \
  --repository-format=docker --location=REGIAO

gcloud container clusters create-auto biblioteca --region REGIAO
gcloud container clusters get-credentials biblioteca --region REGIAO
kubectl apply -f k8s/
kubectl get service biblioteca
```

- A equipe pode escolher GKE Standard, desde que justifique e documente o custo

---

## Slide 33: Roteiro Microsoft Azure — AKS

### O tutorial da equipe deve mostrar

1. Assinatura e grupo de recursos
2. Criação do Azure Container Registry — ACR
3. Envio da imagem ao ACR
4. Criação do cluster AKS
5. Integração do cluster com o registro
6. Obtenção das credenciais do cluster
7. Aplicação dos manifestos
8. Validação do IP externo e dos logs
9. Exclusão do grupo de recursos ou de todos os itens criados

---

## Slide 34: Microsoft Azure — Comandos de Referência

```bash
az login
az group create --name rg-biblioteca --location REGIAO
az acr create --resource-group rg-biblioteca \
  --name NOME_UNICO --sku Basic
az acr login --name NOME_UNICO

az aks create --resource-group rg-biblioteca \
  --name biblioteca --tier free --node-count 1 \
  --attach-acr NOME_UNICO --generate-ssh-keys
az aks get-credentials --resource-group rg-biblioteca --name biblioteca
kubectl apply -f k8s/
```

---

## Slide 35: Roteiro do Terceiro Ambiente — VPS com K3s

### Requisitos sugeridos

- VPS Linux com endereço IPv4 público
- Acesso administrativo por SSH
- Portas necessárias liberadas no firewall
- Capacidade compatível com aplicação e componentes do cluster
- Distribuição Linux suportada pelo K3s

### Estratégia acadêmica

- Criar cluster Kubernetes leve de nó único com K3s
- Usar a mesma imagem e os mesmos objetos Kubernetes
- Expor a aplicação por `NodePort`, Ingress ou proxy reverso

---

## Slide 36: VPS — Comandos de Referência

```bash
ssh usuario@IP_DA_VPS
curl -sfL https://get.k3s.io | sh -
sudo kubectl get nodes
sudo kubectl apply -f k8s/
sudo kubectl get pods
sudo kubectl get services
```

### O tutorial deve explicar

- Como os arquivos chegaram à VPS
- Como o acesso externo foi configurado
- Quais portas foram liberadas
- Como o certificado HTTPS seria tratado
- Como desinstalar o K3s e excluir a VPS ao final

---

## Slide 37: Adaptação do Service na VPS

### Exemplo com `NodePort`

```yaml
apiVersion: v1
kind: Service
metadata:
  name: biblioteca
spec:
  type: NodePort
  selector:
    app: biblioteca
  ports:
    - port: 8080
      targetPort: 8080
      nodePort: 30080
```

- Acesso de teste: `http://IP_DA_VPS:30080/login`
- Para produção, preferir HTTPS com Ingress ou proxy reverso bem configurado

---

## Slide 38: Evidências Obrigatórias por Ambiente

- Identificação do provedor, produto e região
- Cluster e nós disponíveis
- Imagem publicada no registro escolhido
- `Deployment` disponível
- Pod em estado `Running` e pronto
- Service ou mecanismo de exposição
- Aplicação acessível externamente
- Login realizado com sucesso
- Logs sem erro impeditivo
- Procedimento de remoção dos recursos
- Capturas devem ocultar tokens, chaves, IDs sensíveis e dados de cobrança pessoais

---

## Slide 39: Tutorial Reproduzível

### Outra equipe deve conseguir repetir

- Informar pré-requisitos e versões
- Apresentar comandos completos e na ordem correta
- Explicar quais valores devem ser substituídos
- Separar comandos comuns dos específicos de cada provedor
- Mostrar saídas esperadas e verificações
- Registrar erros encontrados e respectivas soluções
- Incluir limpeza dos recursos
- Citar documentação oficial utilizada

---

## Slide 40: Comparação de Valores — Regras

- Usar preços consultados no dia da aula ou da entrega
- Informar:
  - Data da consulta
  - Moeda
  - Região
  - Sistema operacional e arquitetura
  - Quantidade e tamanho dos nós
  - Horas estimadas no mês
- Comparar configurações equivalentes sempre que possível
- Separar créditos gratuitos do preço normal
- Valores estimados não substituem a fatura real

---

## Slide 41: Componentes de Custo

- Gerenciamento do cluster Kubernetes
- Máquinas ou capacidade de computação
- Disco dos nós
- Registro e armazenamento da imagem
- Balanceador de carga ou IP público
- Tráfego de saída de dados
- DNS, se utilizado
- Backup e observabilidade, se incluídos
- Suporte e impostos, quando aplicáveis
- Tempo operacional da equipe também deve aparecer como critério qualitativo

---

## Slide 42: Modelo de Tabela Comparativa

### Usar esta tabela ou uma visualização equivalente, como a do próximo slide

| Critério | Provedor 1 | Provedor 2 | Provedor 3 |
|---|---:|---:|---:|
| Serviço Kubernetes utilizado | Preencher | Preencher | Preencher |
| Região e configuração | Preencher | Preencher | Preencher |
| Gestão do cluster por mês | Valor | Valor | Valor |
| Computação por mês | Valor | Valor | Valor |
| Disco e armazenamento | Valor | Valor | Valor |
| Load balancer/IP/rede | Valor | Valor | Valor |
| **Total mensal estimado** | **Valor** | **Valor** | **Valor** |
| Tempo aproximado de implantação | Medir | Medir | Medir |

---

## Slide 43: Comparação Qualitativa Obrigatória

| Critério | Provedor 1 | Provedor 2 | Provedor 3 |
|---|---|---|---|
| Facilidade de configuração | Avaliar | Avaliar | Avaliar |
| Kubernetes gerenciado | Sim/Não | Sim/Não | Sim/Não |
| Escalabilidade | Avaliar | Avaliar | Avaliar |
| Integração com registro | Avaliar | Avaliar | Avaliar |
| Observabilidade disponível | Avaliar | Avaliar | Avaliar |
| Responsabilidade operacional | Avaliar | Avaliar | Avaliar |
| Vantagens principais | Descrever | Descrever | Descrever |
| Desvantagens principais | Descrever | Descrever | Descrever |
| Cenário recomendado | Descrever | Descrever | Descrever |

---

## Slide 44: Gráfico Comparativo — Alternativa à Tabela

### A equipe pode substituir a tabela por um gráfico bem documentado

- Opção A — gráfico de barras:
  - Custo mensal estimado dos três ambientes
- Opção B — gráfico radar:
  - Facilidade
  - Escalabilidade
  - Serviços gerenciados
  - Controle
  - Esforço operacional
- Opção C — matriz custo x complexidade
- Caso a equipe escolha o gráfico, ele deve conter:
  - Título, unidade, legenda, fonte e data da coleta

---

## Slide 45: Vantagens e Desvantagens Esperadas

### Serviços Kubernetes gerenciados

- Possíveis vantagens:
  - Menor esforço no control plane
  - Integração com identidade, registro, rede e observabilidade
  - Recursos de escalabilidade e alta disponibilidade
- Possíveis desvantagens:
  - Mais componentes cobrados
  - Curva de aprendizagem do provedor
  - Dependência de serviços específicos

### VPS com K3s

- Maior controle e possível custo inicial menor
- Maior responsabilidade por segurança, atualização, backup e disponibilidade

---

## Slide 46: Entregáveis do Trabalho

- Documento principal em PDF
- Arquivos editáveis ou link para repositório da equipe
- `Dockerfile` e `.dockerignore`
- Manifestos Kubernetes utilizados
- Tutorial dos três provedores
- Evidências de execução
- Tabela ou gráfico comparativo de custos
- Comparação de vantagens e desvantagens
- Conclusão indicando o provedor recomendado e justificativa
- Identificação de todos os integrantes

---

## Slide 47: Estrutura Sugerida do Documento

1. Capa e integrantes
2. Objetivo e escopo
3. Análise da aplicação Biblioteca
4. Containerização com Docker
5. Manifestos Kubernetes
6. Tutorial do Provedor 1
7. Tutorial do Provedor 2
8. Tutorial do Provedor 3
9. Evidências e testes
10. Comparação de custos
11. Vantagens e desvantagens
12. Recomendação final
13. Limpeza dos recursos
14. Referências

---

## Slide 48: Critérios de Avaliação

| Critério | Valor |
|---|---:|
| Dockerfile, build e execução local |  |
| Manifestos e implantação Kubernetes |  |
| Tutorial dos três provedores |  |
| Evidências, testes e reprodutibilidade |  |
| Comparação de valores, vantagens e desvantagens em tabela ou gráfico |  |
| Organização, referências e qualidade técnica |  |
| **Total** | **1,00** |

---

## Slide 49: Regras de Entrega

### Prazo

- Entrega até o final da Aula 06
- Envios posteriores estarão sujeitos às regras definidas pelo professor

### Canal obrigatório

- Todas as equipes devem enviar para:
  - **diogo.p.ranghetti@gmail.com**
- Assunto sugerido:
  - `[Cloud DevOps] T3 — Equipe N — Biblioteca em Kubernetes`
- Um integrante envia o e-mail e inclui os demais integrantes identificados

---

## Slide 50: Checklist do E-mail

- Assunto identifica disciplina, trabalho e equipe
- Corpo do e-mail lista todos os integrantes
- PDF anexado e legível
- Arquivos ou link do repositório incluídos
- Link permite acesso ao professor
- Credenciais secretas não foram enviadas
- A tabela ou o gráfico comparativo está no documento
- Os três provedores estão claramente identificados
- O envio ocorreu antes do encerramento da aula

---

## Slide 51: Apresentação por Sorteio

- Uma equipe será sorteada ao final da Aula 06
- Tempo sugerido: 8–10 minutos
- A equipe deverá apresentar:
  - Arquitetura e estratégia de containerização
  - Funcionamento em um dos ambientes
  - Diferenças relevantes entre os três tutoriais
- Tabela ou gráfico de custos
  - Vantagens, desvantagens e recomendação final
- Todos os integrantes devem estar preparados para responder perguntas

---

## Slide 52: Plano de Trabalho em Sala

### Etapa 1 — 10 minutos

- Ler o desafio, escolher provedores e dividir responsabilidadess

### Etapa 2 — 30 minutos

- Criar Dockerfile, construir e testar localmente

### Etapa 3 — 50 minutos

- Preparar manifestos e os três roteiros de implantação

### Etapa 4 — 25 minutos

- Comparar custos, vantagens e desvantagens

### Etapa 5 — 15 minutos

- Revisar, enviar, sortear e apresentar

---

## Slide 53: Divisão de Responsabilidades

- Sugestão de papéis:
  - Responsável por Docker e validação local
  - Responsável pelo Provedor 1
  - Responsável pelo Provedor 2
  - Responsável pela VPS e comparação
- A divisão não elimina responsabilidade coletiva
- Todos devem compreender:
  - Imagem criada
  - Manifestos
  - Fluxo de implantação
  - Comparação final
- Integrar o documento continuamente, não apenas nos minutos finais

---

## Slide 54: Segurança e Controle de Custos

- Usar autenticação multifator quando disponível
- Conceder apenas permissões necessárias
- Nunca inserir chaves nos arquivos entregues
- Ocultar identificadores sensíveis em capturas
- Definir orçamento e alertas quando possível
- Excluir recursos após coletar evidências:
  - Clusters e nós
  - Load balancers e IPs
  - Discos
  - Registros e imagens desnecessárias
  - VPS
- Confirmar no painel que não restaram recursos cobrados

---

## Slide 55: Erros Comuns

- Imagem compilada com versão de Java incompatível
- Nome da imagem incorreto no `Deployment`
- Registro privado sem autorização de leitura
- Pod reiniciando por falta de memória
- `Service` apontando para labels diferentes do Pod
- Porta 8080 não configurada corretamente
- Probe executada cedo demais
- Secret ausente ou com chave diferente
- Load balancer ainda sem endereço externo
- Recursos mantidos após a atividade, gerando cobrança

---

## Slide 56: Comandos de Diagnóstico

```bash
kubectl get all
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl describe deployment biblioteca
kubectl describe pod NOME_DO_POD
kubectl logs deployment/biblioteca
kubectl logs deployment/biblioteca --previous
kubectl rollout status deployment/biblioteca
kubectl get endpoints biblioteca
```

- O tutorial deve explicar ao menos dois problemas encontrados e como foram investigados

---

## Slide 57: Checklist Técnico Final

- A imagem usa Java 21?
- O build Maven foi concluído?
- A aplicação funciona localmente em container?
- O segredo JWT é fornecido externamente?
- O `Deployment` usa somente uma réplica por causa do H2 em memória?
- O Pod fica pronto?
- O Service encaminha a porta para 8080?
- A aplicação pode ser acessada externamente?
- O login e ao menos uma operação foram validados?
- Existe procedimento de limpeza para cada provedor?

---

## Slide 58: Glossário — Containers e Kubernetes

| Termo | Significado |
|---|---|
| **Imagem** | Pacote imutável com aplicação, runtime e dependências |
| **Container** | Instância em execução de uma imagem |
| **Registro** | Serviço que armazena e distribui imagens |
| **Cluster** | Conjunto de recursos que executa workloads Kubernetes |
| **Node** | Máquina responsável por executar Pods |
| **Pod** | Menor unidade implantável do Kubernetes |
| **Deployment** | Recurso que mantém e atualiza um conjunto desejado de Pods |
| **Service** | Endpoint estável que encaminha tráfego para Pods selecionados |

---

## Slide 59: Glossário — Nuvem e Operação

| Termo | Significado |
|---|---|
| **EKS** | Serviço Kubernetes gerenciado da AWS |
| **GKE** | Serviço Kubernetes gerenciado do Google Cloud |
| **AKS** | Serviço Kubernetes gerenciado do Microsoft Azure |
| **K3s** | Distribuição Kubernetes leve, adequada a ambientes com menos recursos |
| **VPS** | Servidor virtual privado administrado pelo cliente |
| **Control plane** | Componentes que mantêm e coordenam o estado do cluster |
| **Worker node** | Nó no qual os workloads são executados |
| **Load balancer** | Recurso que distribui tráfego e pode fornecer acesso externo |
| **Egress** | Tráfego de dados que sai do provedor ou da região |

---

## Slide 60: Referências — Aplicação e Tecnologias

- RANGHETTI, Diogo P. *Biblioteca*. GitHub. Disponível em: https://github.com/dpRanghetti/biblioteca
- DOCKER. *Multi-stage builds*. Disponível em: https://docs.docker.com/build/building/multi-stage/
- DOCKER. *Build best practices*. Disponível em: https://docs.docker.com/build/building/best-practices/
- KUBERNETES. *Deployments*. Disponível em: https://kubernetes.io/docs/concepts/workloads/controllers/deployment/
- KUBERNETES. *Services, Load Balancing, and Networking*. Disponível em: https://kubernetes.io/docs/concepts/services-networking/
- K3S. *Quick-Start Guide*. Disponível em: https://docs.k3s.io/quick-start

---

## Slide 61: Referências — Provedores e Custos

- AWS. *Getting started with Amazon EKS — eksctl*. Disponível em: https://docs.aws.amazon.com/eks/latest/userguide/getting-started-eksctl.html
- AWS. *Amazon EKS Pricing*. Disponível em: https://aws.amazon.com/eks/pricing/
- GOOGLE CLOUD. *Deploy an app to a GKE cluster*. Disponível em: https://cloud.google.com/kubernetes-engine/docs/deploy-app-cluster
- GOOGLE CLOUD. *Google Kubernetes Engine Pricing*. Disponível em: https://cloud.google.com/kubernetes-engine/pricing
- MICROSOFT. *Quickstart: Deploy an AKS cluster*. Disponível em: https://learn.microsoft.com/azure/aks/learn/quick-kubernetes-deploy-cli
- MICROSOFT. *Azure Kubernetes Service Pricing*. Disponível em: https://azure.microsoft.com/pricing/details/kubernetes-service/
- Para a VPS, citar a página oficial de produto e preços do provedor escolhido

---

## Slide 62: Fechamento

### Entrega obrigatória hoje

- Tutorial de três provedores
- Dockerfile e manifestos Kubernetes
- Evidências de funcionamento
- Comparação de valores, vantagens e desvantagens
- Tabela ou gráfico comparativo
- Recomendação final justificada
- Envio para **diogo.p.ranghetti@gmail.com**

### Encerramento

- Conferência dos e-mails recebidos
- Sorteio de uma equipe
- Apresentação e perguntas da turma
