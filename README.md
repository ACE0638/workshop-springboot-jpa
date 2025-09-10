# Workshop: REST API with Spring Boot and JPA/Hibernate

This is a REST API project developed as part of a workshop, using Java with the Spring Boot framework. The objective is to build a simple system for managing orders, users, products, and categories, applying the concepts of layered architecture and best practices for API development.

🚀 **Technologies Used**
* **Java 17+:** Main programming language.
* **Spring Boot:** Framework for creating fast and configurable Java applications.
* **Spring Data JPA:** Facilitates the implementation of repositories and data access.
* **Hibernate:** JPA implementation for object-relational mapping (ORM).
* **H2 Database:** In-memory database, used for the development and testing environment.
* **Maven:** Tool for dependency management and project build.

🏛️ **Project Architecture**
The project follows a layered architecture to separate responsibilities:

* `com.pedro.workshop_springboot_jpa.entities`: Domain layer, where the JPA entities that represent the database tables are located (e.g., User, Order, Product).
* `com.pedro.workshop_springboot_jpa.repositories`: Data access layer, containing the interfaces that extend `JpaRepository` to perform CRUD operations.
* `com.pedro.workshop_springboot_jpa.services`: Service layer, where the application's business logic resides.
* `com.pedro.workshop_springboot_jpa.resources`: Controller (or resource) layer, responsible for exposing the REST API endpoints.
* `com.pedro.workshop_springboot_jpa.config`: Configuration classes, such as `TestConfig` to populate the database with test data (seeding).

**API Endpoints**
Below is a list of the available endpoints in the API.

**Users (`/users`)**
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/` | Lists all users. |
| `GET` | `/{id}` | Finds a user by their ID. |
| `POST` | `/` | Creates a new user. |
| `PUT` | `/{id}` | Updates a user's data. |
| `DELETE`| `/{id}` | Deletes a user. |

**Orders (`/orders`)**
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/` | Lists all orders. |
| `GET` | `/{id}` | Finds an order by its ID. |

**Products (`/products`)**
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/` | Lists all products. |
| `GET` | `/{id}` | Finds a product by its ID. |

**Categories (`/categories`)**
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/` | Lists all categories. |
| `GET` | `/{id}` | Finds a category by its ID. |

⚙️ **How to Run**
**Prerequisites:**

* JDK 17 or higher installed.
* Maven installed.

1.  **Clone the repository:**
    ```bash
    git clone <your-repository-url>
    cd <repository-name>
    ```

2.  **Run the application:**
    Use Maven to start the Spring Boot server.
    ```bash
    mvn spring-boot:run
    ```

3.  **Access:**
    The API will be available at `http://localhost:8080`.
    To access the H2 database console, navigate to `http://localhost:8080/h2-console` and use the default settings.

---
Project developed for educational purposes.
