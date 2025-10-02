# 🚀 Spring Boot 3 & JPA: Projeto de Estudo

## 📍 Sobre o Projeto

Este projeto é uma aplicação **backend** desenvolvida em **Java** com o *framework* **Spring Boot 3**, focada na aplicação prática dos conceitos de persistência de dados utilizando **JPA (Java Persistence API)** e **Spring Data JPA**.

O objetivo foi simular a criação de uma **API RESTful** completa para gerenciar entidades, seguindo a arquitetura em camadas (Controller, Service, Repository). O código foi desenvolvido como parte do módulo avançado de backend do **Curso de Java Completo do Professor Nelio Alves**.

---

## ✨ Tecnologias Utilizadas (Stack)

| Categoria | Tecnologia | Versão Principal | Descrição |
| :--- | :--- | :--- | :--- |
| **Linguagem** | **Java** | 17+ | Linguagem principal de desenvolvimento. |
| **Framework** | **Spring Boot** | 3.x | Facilita a criação de microsserviços e aplicações Spring com configuração mínima. |
| **Persistência** | **Spring Data JPA** | - | Simplifica e padroniza o acesso a dados no repositório. |
| **ORM** | **Hibernate** | - | Implementação padrão de JPA. |
| **Banco de Dados** | **H2 Database** | - | Banco de dados em memória, ideal para desenvolvimento e testes. |
| **Construção** | **Maven** | - | Ferramenta de gerenciamento de dependências e automação de *build*. |
| **Arquitetura** | **RESTful** | - | Criação de serviços web com comunicação via HTTP. |

---

## 🛠️ Funcionalidades e Endpoints da API

A API expõe *endpoints* de **CRUD** para as principais entidades do domínio (tipicamente **`User`** e **`Order`** em projetos de e-commerce/sistema).

**Base URL:** `http://localhost:8080`

### 1. Gestão de Usuários (`/users`)

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/users` | Lista todos os usuários. |
| `GET` | `/users/{id}` | Busca um usuário específico pelo ID. |
| `POST` | `/users` | Cria um novo usuário. |
| `PUT` | `/users/{id}` | Atualiza completamente um usuário existente. |
| `DELETE` | `/users/{id}` | Remove um usuário. |

### 2. Gestão de Pedidos/Ordens de Serviço (`/orders`)

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| `GET` | `/orders` | Lista todos os pedidos/ordens de serviço. |
| `GET` | `/orders/{id}` | Busca um pedido específico pelo ID. |
| `POST` | `/orders` | Cria um novo pedido/ordem. |
| `PUT` | `/orders/{id}` | **(Opcional)** Atualiza o status/detalhes de um pedido. |

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos

* **Java Development Kit (JDK) 17 ou superior.**
* **Git** para clonar o repositório.

### 1. Clonar e Navegar

```bash
git clone [https://github.com/matquirin0/springboot3-jpa.git](https://github.com/matquirin0/springboot3-jpa.git)
cd springboot3-jpa

# Execute no terminal ou utilize sua IDE
./mvnw spring-boot:run

