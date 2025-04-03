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
- ✅ **Soft Delete Support (Optional)**
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

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/your-username/employee-management-system.git
cd employee-management-system
2️⃣ Configure Database (H2 or MySQL)
By default, the project uses H2 Database (in-memory). To use MySQL, update src/main/resources/application.properties:

properties
Copy
Edit
# H2 Database (Default)
spring.datasource.url=jdbc:h2:mem:employeedb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
For MySQL, change it to:

properties
Copy
Edit
# MySQL Database
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
3️⃣ Build & Run the Application
Using Maven:

sh
Copy
Edit
mvn clean install
mvn spring-boot:run
Using IntelliJ IDEA / Eclipse:

Open the project in your IDE.

Run EmpManagementApplication.java (Spring Boot Main Class).

📡 API Endpoints
Method	Endpoint	Description
POST	/api/emp/add	Add a new employee
GET	/api/emp/{empId}	Get employee by ID
PUT	/api/emp/update/{empId}	Update an employee
DELETE	/api/emp/delete/{empId}	Delete an employee
GET	/api/emp/search/{name}	Search employees by name
📝 Example API Requests
1️⃣ Add a New Employee
http
Copy
Edit
POST http://localhost:8080/api/emp/add
Content-Type: application/json

{
  "ename": "John Doe",
  "sal": 50000
}
2️⃣ Get Employee by ID
http
Copy
Edit
GET http://localhost:8080/api/emp/1
3️⃣ Update Employee
http
Copy
Edit
PUT http://localhost:8080/api/emp/update/1
Content-Type: application/json

{
  "ename": "John Smith",
  "sal": 55000
}
4️⃣ Delete Employee
http
Copy
Edit
DELETE http://localhost:8080/api/emp/delete/1
5️⃣ Search Employees by Name
http
Copy
Edit
GET http://localhost:8080/api/emp/search/John
🛡️ Error Handling
HTTP Code	Error Message	Description
404	Employee Not Found	If employee does not exist
400	Employee Already Exists	If duplicate entry is found
🎯 Future Enhancements
🔹 JWT Authentication (Spring Security)

🔹 Soft Delete with active flag

🔹 Pagination & Sorting

🔹 Swagger API Documentation

📜 License
This project is open-source under the MIT License.

🤝 Contributing
Fork the repository.

Create a new branch (feature-branch).

Commit your changes (git commit -m "Added new feature").

Push to GitHub and create a Pull Request.

🌟 Support
If you like this project, give it a ⭐ on GitHub!

Feel free to submit issues or contribute.

🚀 Happy Coding! 🎯
