# 🛒 Product Management App

A full-stack **Product Management Web Application** that allows users to add, view, update, and remove products. This project is built using **HTML, CSS, Java, Spring Boot, and JPA**, focusing on clean architecture and core CRUD operations.

---

## 📌 Features

* ➕ Add new products
* 📋 View all products
* ✏️ Update existing products
* ❌ Delete products
* 🔐 Backend validation
* 💾 Persistent storage using JPA

---

## 🧰 Tech Stack

### Frontend

* HTML
* CSS

### Backend

* Java
* Spring Boot
* Spring Data JPA
* RESTful APIs

### Database

* H2 / MySQL (configurable)

---

## 🏗️ Project Architecture

```
Frontend (HTML/CSS)
        ↓
Spring Boot Controllers
        ↓
Service Layer
        ↓
JPA Repository
        ↓
Database
```

---

## ⚙️ Setup & Installation

### Prerequisites

* Java 17+
* Maven
* IDE (IntelliJ / Eclipse / VS Code)

### Steps

1. Clone the repository

   ```bash
   git clone https://github.com/your-username/product-management-app.git
   ```

2. Navigate to the project directory

   ```bash
   cd product-management-app
   ```

3. Configure database in `application.properties`

4. Run the application

   ```bash
   mvn spring-boot:run
   ```

5. Open the app in browser

   ```
   http://localhost:8080
   ```

---

## 📂 Project Structure

```
├── controller
├── service
├── repository
├── entity
├── resources
│   ├── static
│   └── templates
└── ProductManagementApplication.java
```

---

## 🧪 API Endpoints (Sample)

| Method | Endpoint       | Description      |
| ------ | -------------- | ---------------- |
| GET    | /products      | Get all products |
| POST   | /products      | Add new product  |
| PUT    | /products/{id} | Update product   |
| DELETE | /products/{id} | Delete product   |

---

## 🎯 Learning Outcomes

* Spring Boot fundamentals
* REST API development
* JPA & Hibernate
* MVC architecture
* Full-stack integration

---



If you like this project, don’t forget to
