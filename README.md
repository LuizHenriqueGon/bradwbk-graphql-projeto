# 🌌 Star Wars API - GraphQL & Spring Boot

<p align="center">
<strong>Uma API robusta e tipada explorando o universo de Star Wars, desenvolvida para demonstrar o poder das consultas flexíveis com GraphQL e a integração com o ecossistema Spring Boot.</strong>
</p>

<p align="center">
<img src="https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
<img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot">
<img src="https://img.shields.io/badge/GraphQL-E10098?style=for-the-badge&logo=graphql&logoColor=white" alt="GraphQL">
<img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven">
<img src="https://img.shields.io/badge/Status-Finalizado-success?style=for-the-badge" alt="Status: Finalizado">
</p>

## 📖 Sobre o Projeto

Este projeto foi desenvolvido como parte da disciplina de **Desenvolvimento Web Backend (BRADWBK)** do **Instituto Federal de São Paulo (IFSP)**. O objetivo principal é implementar uma API que gerencia personagens, naves e avaliações utilizando a linguagem de consulta **GraphQL**.

Diferente de uma arquitetura REST clássica, esta API permite que o cliente defina exatamente a estrutura dos dados que necessita, garantindo resultados previsíveis e cargas úteis menores.

## ✨ Funcionalidades Implementadas

O sistema foi desenhado para suportar operações complexas de leitura e escrita, conforme os requisitos da atividade:

### Consultas (Queries):
* 👥 **Busca de Humanos:** Listagem completa de todos os humanos cadastrados.
* 🚀 **Frota de Naves:** Consulta de todas as naves espaciais (`Starships`) disponíveis.
* 🔍 **Busca Genérica por ID:** Recuperação de qualquer personagem (`Character`) através de um ID único.
* 🤖 **Busca por Droid:** Filtro específico para obter detalhes técnicos de astromechs.

### Operações de Escrita (Mutations):
* ➕ **Cadastro de Humanos:** Criação de novos registros com nome e altura.
* ⚙️ **Cadastro de Droids:** Inclusão de novos robôs especificando sua função primária.
* 🛰️ **Expansão da Frota:** Cadastro de naves definindo nome e comprimento.
* 🤝 **Gestão de Amizades:** Funcionalidade para conectar personagens, criando vínculos de amizade entre IDs existentes.

## 🚀 Tecnologias e Conceitos Utilizados

Este projeto adota as melhores práticas de integração entre Spring e GraphQL:

* **Arquitetura Baseada em Anotações:** Uso de `@QueryMapping`, `@MutationMapping` e `@Argument` para simplificar o mapeamento do esquema.
* **Esquemas Tipados (SDL):** Definição rigorosa de tipos, interfaces e enums no diretório `src/main/resources/graphql/`.
* **Polimorfismo:** Implementação de interfaces (`Character`) para consultas que podem retornar múltiplos tipos de objetos (Human ou Droid).
* **Persistência em Memória:** Uso de coleções Java (`ArrayList`) para simular o armazenamento de dados.

## ⚙️ Começando

Siga os passos abaixo para rodar o projeto localmente:

### 1. Clonar e Instalar Dependências
```bash
# Clone o repositório
git clone https://github.com/LuizHenriqueGon/bradwbk-graphql-projeto.git

# Entre no diretório
cd seu-repositorio

# Instale as dependências com Maven
mvn clean install
2. Executar o Servidor
Bash
mvn spring-boot:run
A aplicação estará disponível em: http://localhost:8080/graphql.
```
👨‍💻 Autor
Desenvolvido por Seu Nome
Estudante de Análise e Desenvolvimento de Sistemas


IFSP - Campus Bragança Paulista 

© 2026 Star Wars GraphQL API. Desenvolvido para fins acadêmicos.
