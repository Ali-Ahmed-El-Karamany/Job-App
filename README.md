# Job Application Management System

A Spring Boot web application for managing and browsing job postings. The project was built to practice **Spring Boot, Spring MVC, layered architecture, dependency injection, and server-side web application development** using Java.

## Overview

The Job Application Management System provides a simple platform for creating and viewing job postings.

The application follows a layered architecture that separates HTTP request handling, business logic, data access, and domain models. This structure makes the application easier to understand, maintain, and extend.

## Features

- View available job postings
- Add new job postings
- Submit job posting details through web forms
- Server-side request handling with Spring MVC
- Layered application architecture
- Dependency injection using Spring
- In-memory data storage for development and learning purposes

## Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Primary programming language |
| Spring Boot 4 | Application framework |
| Spring MVC | Web layer and HTTP request handling |
| Maven | Dependency management and build automation |
| Lombok | Reducing boilerplate code |
| JSP / HTML | Server-side presentation |
| Git & GitHub | Version control |


## Project Structure

```text
src/
├── main/
│   ├── java/
│   │   └── com/app/JobApp/
│   │       ├── model/
│   │       │   └── JobPost.java
│   │       ├── repo/
│   │       │   └── JobRepo.java
│   │       ├── service/
│   │       │   └── JobService.java
│   │       ├── JobController.java
│   │       └── JobAppApplication.java
│   │
│   ├── resources/
│   │   └── ...
│   │
│   └── webapp/
│       └── ...
│
└── test/
    └── java/
        └── com/app/JobApp/
```

## Main Endpoints

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/` | Display the home page |
| `GET` | `/addJob` | Display the job creation form |
| `POST` | `/handleForm` | Submit a new job posting |
| `GET` | `/viewAllJobs` | Display all available job postings |

## Getting Started

### Prerequisites

Make sure you have the following installed:

- Java 21 or later
- Maven 3.9+
- Git

### Clone the Repository

```bash
git clone https://github.com/Ali-Ahmed-El-Karamany/Job-App.git
cd Job-App
```

### Build the Project

```bash
mvn clean package
```

### Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

After starting the application, open:

```text
http://localhost:8084
```

