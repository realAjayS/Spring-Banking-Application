🏦 Simple Banking Application - Spring Boot

This is a simple Banking Application built using Spring Boot, Spring Data JPA, and H2 Database/MySQL (configurable).
It demonstrates the basic CRUD operations for managing bank accounts, along with deposit and withdrawal functionalities.

🚀 Features
* Create a new bank account
* Fetch account details by ID
* Fetch all accounts
* Deposit money into an account
* Withdraw money from an account (with validation for insufficient balance)
* Delete an account

🛠️ Tech Stack
* Java 17+
* Spring Boot 3+
* Spring Data JPA
* Hibernate
* H2 / MySQL Database
* Lombok

📦 Project Structure
com.ajay.banking
│
├── controller       # REST Controllers
│   └── AccountController.java
│
├── dto             # Data Transfer Objects
│   └── AccountDto.java
│
├── entity          # JPA Entities
│   └── Account.java
│
├── mapper          # Mapper (Entity <-> DTO)
│   └── AccountMapper.java
│
├── repository      # Spring Data JPA Repositories
│   └── AccountRepository.java
│
├── service         # Service Layer (Interface + Implementation)
│   ├── AccountService.java
│   └── impl/AccountServiceImpl.java
│
└── BankingApplication.java   # Main Spring Boot Application
