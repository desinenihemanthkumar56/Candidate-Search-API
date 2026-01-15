# Candidate Search API (Spring Boot + MySQL + Hibernate + API Key Security)

A production-ready **Candidate Search REST API** built using **Java Spring Boot**, **Hibernate (JPA)**, **MySQL**, and **Spring Security** with **API Key authentication**.

This API allows recruiters to search for candidates using an **exact fullName match** and returns matching candidates with **fullName** and **email**.

---

## ✅ Requirements Completed

### ✅ API Requirements
- ✅ Single API endpoint using **GET**
- ✅ Accepts one query parameter: `fullName`
- ✅ Returns all candidates whose full name is an **exact match**
- ✅ Response is a **list of objects** containing:
  - `fullName`
  - `email`
- ✅ If no candidates found → returns **200 OK** with empty list `[]`

### ✅ Performance & Scalability
Designed to work efficiently even for a very large dataset (1B+ records):
- ✅ Uses database query (no in-memory searching)
- ✅ DTO Projection (returns only required fields)
- ✅ Supports indexing on `full_name` column for faster exact match

### ✅ Security
- ✅ Secured endpoint using **API Key authentication**
- ✅ Requests must include header:
  - `X-API-KEY`

### ✅ Clean Code & Structure
- ✅ Layered architecture:
  - Controller → Service → Repository
- ✅ Dependency Injection
- ✅ Clean and readable code

---

## 🛠 Tech Stack
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- Spring Security
- MySQL
- Lombok

---

## 📂 Project Structure

src/main/java/com/candidate_search_api
├── controller
├── dto
├── entity
├── repository
├── security
└── service

---


---

## ⚙️ Setup Instructions

### ✅ 1) Create Database (MySQL)
Run this in MySQL:

mysql
CREATE DATABASE candidate_db;

✅ 2) Configure application.properties

File path:
src/main/resources/application.properties

server.port=8080

# MySQL Config
spring.datasource.url=jdbc:mysql://localhost:3306/candidate_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

✅ 3) (Optional) Load Sample Data

If you don’t have data in MySQL, you can use the DataLoader file for the first run.

File path:
src/main/java/com/candidate_search_api/service/DataLoader.java

✅ Run once → then comment/remove the DataLoader to avoid duplicate inserts.

---

✅ 4)run the main class:

 CandidateSearchApiApplication.java

🔐 API Key Authentication

Every request must contain this header:

X-API-KEY: SUPER_SECRET_API_KEY_123


✅ If API key is missing/wrong → returns 401 Unauthorized

---

🚀 API Endpoint
✅ Search candidates by exact full name

GET /api/candidates?fullName=<name>

Example Request:

GET http://localhost:8080/api/candidates?fullName=hemanth kumar
Header-->
X-API-KEY: SUPER_SECRET_API_KEY_123


Example Response:


  {
    "fullName": "hemanth kumar",
    "email": "hemanth.2@example.com"
  },
  {
    "fullName": "hemanth kumar",
    "email": "hemanth.2@example.com"
  }



✅ If no candidates found:

[]

📝 Notes

Exact match is case-sensitive

hemanth ≠ Hemanth

Duplicate records can appear if duplicate entries exist in MySQL




