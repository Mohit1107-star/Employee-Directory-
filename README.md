# 🏢 Employee Management System (Spring Boot CRUD API)

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.5-brightgreen)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.8.6-C71A36)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)

The **Employee Management System** is a **Spring Boot REST API** that allows users to perform **CRUD operations** (Create, Read, Update, Delete) on Employee records. It follows best practices with **Spring Data JPA**, **H2 Database**, and **Lombok** for cleaner code.

---

## 🚀 Features
- ✅ **Create, Read, Update, Delete (CRUD) Employees**
- ✅ **Search Employees by Name (Partial Match)**
- ✅ **Exception Handling with Custom Errors**
- ✅ **Spring Boot, Spring Data JPA, and H2 Database**

---

## ⚙️ Technologies Used

| Tech | Description |
|------|-------------|
| **Java 17** | Primary language |
| **Spring Boot** | Framework for building REST APIs |
| **Spring Data JPA** | ORM for database interaction |
| **H2 Database** | In-memory database (for development) |
| **Lombok** | Reduces boilerplate code |
| **Maven** | Dependency management |

---

## 🛠️ Setup Instructions
git clone https://github.com/your-username/employee-management-system.git
<br>
cd employee-management-system

## Configure Database (H2 or MySQL)
*To use MySQL, update src/main/resources/application.properties:*

spring.datasource.url=jdbc:mysql://localhost:3306/employeedb<br>
spring.datasource.username=root<br>
spring.datasource.password=yourpassword<br>
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect<br>
spring.jpa.hibernate.ddl-auto=update<br>

---------------
## Build & Run the Application

Using Maven:

mvn clean install<br>
mvn spring-boot:run<br>

--------------

## 📡 API Endpoints

Method	Endpoint	Description:

POST	/api/emp/add	Add a new employee<br>
GET	/api/emp/{empId}	Get employee by ID<br>
PUT	/api/emp/update/{empId}	Update an employee<br>
DELETE	/api/emp/delete/{empId}	Delete an employee<br>
GET	/api/emp/search/{name}	Search employees by name<br>


## 📝 Example API Requests

1️⃣ Add a New Employee ->
POST http://localhost:8080/api/emp/add
Content-Type: application/json
{
  "ename": "John Doe",
  "sal": 50000
}

2️⃣ Get Employee by ID ->
GET http://localhost:8080/api/emp/1

3️⃣ Update Employee ->
PUT http://localhost:8080/api/emp/update/1
Content-Type: application/json
{
  "ename": "John Smith",
  "sal": 55000
}

4️⃣ Delete Employee ->
DELETE http://localhost:8080/api/emp/delete/1

5️⃣ Search Employees by Name ->
GET http://localhost:8080/api/emp/search/John


## 📜 License
This project is open-source under the MIT License.

## 🤝 Contributing
Fork the repository.

Create a new branch (feature-branch).

Commit your changes (git commit -m "Added new feature").

Push to GitHub and create a Pull Request.

## 🌟 Support
If you like this project, give it a ⭐ on GitHub!

**Feel free to submit issues or contribute.**

🚀 Happy Coding! 🎯
