# Payroll Microservices Project

## Project Overview

This is a Microservice-Based Payroll Management System developed using Spring Boot and REST APIs.

The application consists of three independent microservices:

- Employee Service
- Attendance Service
- Payslip Service

The Payslip Service acts as the orchestration service and communicates with other services using RestTemplate.

---

# Technologies Used

- Java
- Spring Boot
- REST APIs
- Thymeleaf
- Maven
- JUnit
- GitHub

---

# Microservices Architecture

Frontend → Payslip Service  
Payslip Service → Employee Service  
Payslip Service → Attendance Service  

---

# Services and Ports

| Service | Port |
|----------|------|
| Employee Service | 8081 |
| Attendance Service | 8082 |
| Payslip Service | 8083 |

---

# Features

- Employee Details API
- Attendance Management API
- Salary Calculation
- REST API Communication
- Frontend UI using Thymeleaf
- Dynamic Payslip Generation
- Unit Testing using JUnit

---

# Salary Calculation Formula

Final Salary = (Basic Salary / 30) × Present Days

---


# How to Run the Project

## Step 1
Run Employee Service

## Step 2
Run Attendance Service

## Step 3
Run Payslip Service

## Step 4
Open Browser

http://localhost:8083

---

# API Endpoints

## Employee Service

http://localhost:8081/employee/1

## Attendance Service

http://localhost:8082/attendance/1

## Payslip Service

http://localhost:8083/payslip/1

---

# Unit Testing

JUnit test cases are implemented for salary calculation validation.

---

# Author

Maitreyee Dahane
