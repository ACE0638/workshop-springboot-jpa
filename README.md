# Workshop: API REST com Spring Boot e JPA/Hibernate

Este é um projeto de API REST desenvolvido como parte de um workshop, utilizando Java com o framework Spring Boot. O objetivo é construir um sistema simples de gerenciamento de pedidos, usuários, produtos e categorias, aplicando os conceitos de arquitetura em camadas e boas práticas de desenvolvimento de APIs.

## 🚀 Tecnologias Utilizadas

* **Java 17+**: Linguagem de programação principal.
* **Spring Boot**: Framework para criação de aplicações Java de forma rápida e configurável.
* **Spring Data JPA**: Facilita a implementação de repositórios e o acesso a dados.
* **Hibernate**: Implementação do JPA para mapeamento objeto-relacional (ORM).
* **H2 Database**: Banco de dados em memória, utilizado para o ambiente de desenvolvimento e testes.
* **Maven**: Ferramenta para gerenciamento de dependências e build do projeto.

## 🏛️ Arquitetura do Projeto

O projeto segue uma arquitetura em camadas para separar as responsabilidades:

* `com.pedro.workshop_springboot_jpa.entities`: Camada de domínio, onde ficam as entidades JPA que representam as tabelas do banco de dados (ex: User, Order, Product).
* `com.pedro.workshop_springboot_jpa.repositories`: Camada de acesso a dados, contendo as interfaces que estendem `JpaRepository` для realizar operações de CRUD.
* `com.pedro.workshop_springboot_jpa.services`: Camada de serviço, onde reside a lógica de negócio da aplicação.
* `com.pedro.workshop_springboot_jpa.resources`: Camada de controladores (ou recursos), responsável por expor os endpoints da API REST.
* `com.pedro.workshop_springboot_jpa.config`: Classes de configuração, como o `TestConfig` para popular o banco de dados com dados de teste (seeding).

## Endpoints da API

Abaixo estão listados os endpoints disponíveis na API.

### Usuários (`/users`)

| Método | Endpoint | Descrição                  |
| :----- | :------- | :------------------------- |
| `GET`  | `/`      | Lista todos os usuários.   |
| `GET`  | `/{id}`  | Busca um usuário pelo seu ID. |
| `POST` | `/`      | Cria um novo usuário.      |
| `PUT`  | `/{id}`  | Atualiza os dados de um usuário. |
| `DELETE`| `/{id}`  | Deleta um usuário.         |

### Pedidos (`/orders`)

| Método | Endpoint | Descrição                 |
| :----- | :------- | :------------------------ |
| `GET`  | `/`      | Lista todos os pedidos.   |
| `GET`  | `/{id}`  | Busca um pedido pelo seu ID. |

### Produtos (`/products`)

| Método | Endpoint | Descrição                   |
| :----- | :------- | :-------------------------- |
| `GET`  | `/`      | Lista todos os produtos.    |
| `GET`  | `/{id}`  | Busca um produto pelo seu ID. |

### Categorias (`/categories`)

| Método | Endpoint | Descrição                      |
| :----- | :------- | :----------------------------- |
| `GET`  | `/`      | Lista todas as categorias.     |
| `GET`  | `/{id}`  | Busca uma categoria pelo seu ID. |

## ⚙️ Como Executar

**Pré-requisitos:**
* JDK 17 ou superior instalado.
* Maven instalado.

1.  **Clone o repositório:**
    ```bash
    git clone <url-do-seu-repositorio>
    cd <nome-do-repositorio>
    ```

2.  **Execute a aplicação:**
    Utilize o Maven para iniciar o servidor Spring Boot.
    ```bash
    mvn spring-boot:run
    ```

3.  **Acesso:**
    * A API estará disponível em `http://localhost:8080`.
    * Para acessar o console do banco de dados H2, navegue até `http://localhost:8080/h2-console` e utilize as configurações padrão.

---
*Projeto desenvolvido para fins educacionais.*
