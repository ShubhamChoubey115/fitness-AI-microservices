# 🏋️ AI-Powered Fitness Application | Spring Boot Microservices + React

> A production-inspired Full Stack AI Fitness Platform built using Spring Boot Microservices architecture with secure authentication, asynchronous messaging, AI integration, and cloud-native components.

![Java](https://img.shields.io/badge/Java-21-red)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![React](https://img.shields.io/badge/React-Frontend-blue)
![Microservices](https://img.shields.io/badge/Architecture-Microservices-orange)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-EventDriven-yellow)
![Keycloak](https://img.shields.io/badge/Security-Keycloak-purple)

---

# 📌 Project Overview

This project is a **production-style AI-powered Fitness Management Platform** developed using **Spring Boot Microservices** and **React**.

The application demonstrates how modern enterprise systems are built using independently deployable services, centralized configuration, service discovery, API Gateway, secure authentication, asynchronous messaging, and AI-powered recommendations.

The goal of this project was to gain hands-on experience with real-world backend architecture rather than building a simple CRUD application.

---

# 🚀 Features

### 👤 User Management
- User Registration
- Login using Keycloak
- JWT Authentication
- Role Based Authorization

### 🏃 Activity Tracking
- Track daily workouts
- Store activity history
- Workout analytics

### 🤖 AI Integration
- Personalized fitness recommendations
- Google Gemini API integration
- AI-generated health insights

### ⚡ Event Driven Communication
- RabbitMQ messaging
- Asynchronous processing
- Loose coupling between services

### ☁ Cloud Native Architecture
- API Gateway
- Eureka Service Discovery
- Config Server
- Independent Microservices

---

# 🏗 System Architecture

```

Client (React)

|

API Gateway

|

|-------------------------------|

| | |

User Service Activity Service AI Service

| | |

MySQL MongoDB MongoDB

|

RabbitMQ

|

Google Gemini API

```

Supporting Components

- Eureka Server
- Config Server
- Keycloak Authentication

---

# 🛠 Tech Stack

## Backend

- Java
- Spring Boot
- Spring Security
- Spring Cloud Gateway
- Spring Cloud Config
- Spring Cloud Netflix Eureka
- Spring Data JPA
- Spring AMQP
- REST APIs
- Maven

## Frontend

- React
- Vite
- Axios

## Databases

- MySQL
- MongoDB

## Messaging

- RabbitMQ

## Authentication

- Keycloak
- JWT

## AI

- Google Gemini API

---

# 📂 Microservices

### User Service

Responsible for

- User Profile
- Authentication
- User Data
- MySQL Persistence

---

### Activity Service

Responsible for

- Workout History
- Daily Activities
- Fitness Records
- MongoDB Storage

---

### AI Service

Responsible for

- AI Recommendation Engine
- Gemini API Integration
- Smart Fitness Suggestions
- MongoDB Storage

---

# 🔒 Security

- OAuth2 Authentication
- JWT Token Validation
- Role Based Authorization
- API Gateway Security
- Keycloak Integration

---

# ⚡ Event Driven Flow

```

Activity Created

↓

RabbitMQ Queue

↓

AI Service Consumes Event

↓

Generate Fitness Recommendation

↓

Store AI Result

```

This architecture keeps services loosely coupled and improves scalability.

---

# 📁 Project Structure

```

fitness-platform

├── api-gateway

├── config-server

├── eureka-server

├── user-service

├── activity-service

├── ai-service

├── frontend-react

└── README.md

```

---

# 🎯 Learning Outcomes

This project helped me gain practical experience in

- Designing Microservices Architecture
- Secure Authentication using Keycloak
- API Gateway Routing
- Service Discovery
- Distributed Configuration
- Event Driven Architecture
- RabbitMQ Messaging
- AI Integration
- Spring Boot Best Practices
- React + Spring Boot Integration
- REST API Design
- Multi Database Architecture

---

# 📈 Future Improvements

- Docker & Docker Compose
- Kubernetes Deployment
- CI/CD using GitHub Actions
- Distributed Tracing
- Monitoring with Prometheus & Grafana
- Logging using ELK Stack
- Rate Limiting
- Circuit Breaker
- Caching with Redis

---

# 👨‍💻 About Me

I'm a Java Full Stack Developer passionate about building scalable enterprise applications using Java, Spring Boot, Microservices, React, and Cloud technologies.

I'm continuously improving my backend engineering skills by building real-world projects inspired by enterprise architectures.

If you found this project useful, feel free to ⭐ the repository.
