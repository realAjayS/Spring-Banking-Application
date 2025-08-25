**🏦 Simple Banking Application - Spring Boot**

This is a simple Banking Application built using Spring Boot, Spring Data JPA, and H2 Database/MySQL (configurable).
It demonstrates the basic CRUD operations for managing bank accounts, along with deposit and withdrawal functionalities.

**🚀 Features**
* Create a new bank account
* Fetch account details by ID
* Fetch all accounts
* Deposit money into an account
* Withdraw money from an account (with validation for insufficient balance)
* Delete an account

**🛠️ Tech Stack**
* Java 17+
* Spring Boot 3+
* Spring Data JPA
* Hibernate
* H2 / MySQL Database
* Lombok

**⚙️ Setup & Run**

1️⃣ **Clone the repository**
```
git clone https://github.com/your-username/simple-banking-app.git
cd simple-banking-app
```

2️⃣** Configure Database** (application.properties)
**H2 (Default)**
```
spring.datasource.url=jdbc:h2:mem:bankdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```
**MySQL (Optional)**
```
spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
**REST API Endpoints**
| Method | Endpoint                      | Description                  | Request Body (JSON)                                |
| ------ | ----------------------------- | ---------------------------- | -------------------------------------------------- |
| POST   | `/api/accounts`               | Create new account           | `{ "accountHolderName": "Ajay", "balance": 1000 }` |
| GET    | `/api/accounts/{id}`          | Get account by ID            | -                                                  |
| GET    | `/api/accounts`               | Get all accounts             | -                                                  |
| PUT    | `/api/accounts/{id}/deposit`  | Deposit amount into account  | `{ "amount": 500 }`                                |
| PUT    | `/api/accounts/{id}/withdraw` | Withdraw amount from account | `{ "amount": 200 }`                                |
| DELETE | `/api/accounts/{id}`          | Delete account by ID         | -                                                  |

**✅ Future Enhancements**
1. Authentication & Authorization (Spring Security, JWT)
2. Transaction history tracking
3. Role-based access (Admin/User)
4. API documentation with Swagger
