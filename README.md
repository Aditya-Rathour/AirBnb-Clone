🏠 Airbnb Booking System (Backend)

A backend system inspired by Airbnb that allows users to browse property listings, check availability, and book accommodations.
The application focuses on robust backend architecture, transactional booking logic, and data consistency to ensure reliable reservations.

🚀 Features
User Features

Browse available property listings

Check property availability for specific dates

Create and manage bookings

Host Features

Add and manage property listings

Update property details

System Features

RESTful API architecture

Transaction-safe booking system

Prevention of double booking

Structured service-layer architecture

API documentation using Swagger

🏗️ System Architecture

The project follows a layered architecture:

Client
  │
  ▼
Controller Layer
  │
  ▼
Service Layer (Business Logic)
  │
  ▼
Repository Layer (Spring Data JPA)
  │
  ▼
Database

Layers

Layer	Responsibility
Controller	Handles HTTP requests and responses
Service	Contains business logic
Repository	Handles database operations
Entity	Represents database tables
🛠️ Tech Stack
Backend

Java

Spring Boot

Spring Data JPA

Hibernate

Database

MySQL / PostgreSQL

Tools

Swagger (OpenAPI) – API documentation

Postman – API testing

Maven – Dependency management

📊 Database Design

<img width="658" height="659" alt="image" src="https://github.com/user-attachments/assets/50035cd9-fba7-4e27-8173-7e99579d588f" />


⚡ Preventing Double Booking

One of the main challenges in booking systems is preventing multiple users from booking the same property for overlapping dates.

This project handles it using:

Transactional database operations

Availability checks before booking creation

Concurrency-safe booking logic in the service layer

Example workflow:

User requests booking

System checks availability for requested dates

Database transaction locks the listing availability

Booking is created if dates are available

Transaction commits

📖 API Documentation

The APIs are documented using Swagger (OpenAPI).

After starting the application, access:

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/api/v1/swagger-ui/index.html#/)
Swagger Interface

<img width="1882" height="602" alt="image" src="https://github.com/user-attachments/assets/a7e81361-a5f5-47b6-98a0-88eae46dfc0b" />
<img width="935" height="622" alt="image" src="https://github.com/user-attachments/assets/1f4d8ace-259e-4eda-a91f-714eeaac67d5" />
<img width="935" height="700" alt="image" src="https://github.com/user-attachments/assets/bceac8f4-5a63-4316-95e9-858f0f2c2bf7" />
<img width="939" height="749" alt="image" src="https://github.com/user-attachments/assets/7f7ce91a-4b48-4571-935c-96ee9a85074c" />


📂 Project Structure

airbnb-booking-system

│

├── controller

│   └── BookingController

│

├── service

│   └── BookingService

│

├── repository

│   └── BookingRepository

│

├── entity

│   └── Booking

│

├── dto

│

├── config

│

└── application.properties

⚙️ Running the Project

1️⃣ Clone the repository
git clone https://github.com/yourusername/airbnb-booking-system.git

2️⃣ Navigate to project
cd airbnb-booking-system

3️⃣ Configure database

Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/airbnb

spring.datasource.username=root

spring.datasource.password=password

4️⃣ Run the application

mvn spring-boot:run
🧪 Sample API Endpoints
Create Booking
POST /api/bookings
Get Listing
GET /api/listings
Get Booking Details
GET /api/bookings/{id}
📈 Possible Future Improvements

Redis caching for listing search

Payment integration

Microservice architecture

Booking cancellation policies

Notification service

🎯 What This Project Demonstrates

REST API development using Spring Boot

Database schema design

Transaction handling

Concurrency management

Clean layered architecture

API documentation

👨‍💻 Author

Aditya Kumar

⭐ If you find this project useful, consider giving it a star!

