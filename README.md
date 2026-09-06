# Spring Boot + Next.js CRUD Application

A full-stack CRUD application built with **Spring Boot** as the backend and **Next.js + TypeScript** as the frontend.

This project is built to practice developing and connecting a modern frontend with a Spring Boot REST API.

## 🚀 Tech Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* REST API
* Maven

### Frontend

* Next.js
* TypeScript
* React
* Tailwind CSS
* shadcn/ui

## ✨ Features

* Create records
* View records
* Update records
* Delete records
* REST API integration
* Responsive frontend UI
* Frontend and backend separated into their own applications

## 📁 Project Structure

```text
springboot-nextjs-crud/
│
├── curd/                  # Spring Boot backend
│   ├── src/
│   ├── pom.xml
│   └── ...
│
├── frontend/              # Next.js frontend
│   ├── src/
│   ├── package.json
│   └── ...
│
└── README.md
```

## ⚙️ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/iRfAn-AnSaRi0/springboot-nextjs-crud.git
cd springboot-nextjs-crud
```

## 🖥️ Run the Backend

Go to the Spring Boot project:

```bash
cd curd
```

Run the application using Maven:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The backend will start on the configured Spring Boot port.

## 🌐 Run the Frontend

Open another terminal and go to the frontend:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
npm run dev
```

Open:

```text
http://localhost:3000
```

## 🔗 Architecture

The application follows a simple full-stack architecture:

```text
┌─────────────────────┐
│      Next.js        │
│   TypeScript + UI   │
└──────────┬──────────┘
           │
           │ REST API
           ▼
┌─────────────────────┐
│     Spring Boot     │
│      Backend        │
└──────────┬──────────┘
           │
           │ JPA
           ▼
┌─────────────────────┐
│      Database       │
└─────────────────────┘
```

The Next.js frontend communicates with the Spring Boot backend through REST APIs.

## 🎯 Purpose

This project is part of my learning journey toward becoming a full-stack software developer.

The main goal is to gain practical experience with:

* Spring Boot REST APIs
* CRUD operations
* Spring Data JPA
* Next.js
* TypeScript
* API integration
* Full-stack application structure
* Git and GitHub

## 🔮 Future Improvements

Planned improvements include:

* Authentication and authorization
* JWT-based security
* Form validation
* Better error handling
* Pagination and searching
* Unit and integration testing
* Deployment
* CI/CD

## 👨‍💻 Author

**Irfan Ansari**

GitHub: [iRfAn-AnSaRi0](https://github.com/iRfAn-AnSaRi0)

---

⭐ If you find this project useful, feel free to explore the repository.
