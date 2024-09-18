
# Finance Tracker Backend

This is the backend of the **Finance Tracker** application, which allows users to manage their financial data, track expenses, and generate reports. This backend is built using Spring Boot and provides APIs for the frontend to interact with.

## Features

- **User Authentication:** Secure login and registration functionality.
- **Expense Management:** Create, update, and delete expense records.
- **Income Management:** Manage income sources and records.
- **Expense Categorization:** Organize expenses by category (e.g., food, rent, transportation).
- **Reporting:** Generate detailed reports of expenses and income.
- **Data Storage:** Uses a MySQL/PostgreSQL database to store user and financial data.

## Technologies Used

- **Backend Framework:** Spring Boot
- **Database:** MySQL/PostgreSQL (configurable)
- **Security:** Spring Security with JWT Authentication
- **Build Tool:** Maven
- **Java Version:** 11 or later

## Prerequisites

Before running the project, ensure you have the following installed:

- Java 11 or later
- Maven
- MySQL/PostgreSQL
- Git

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/vanshika08j/Finance-tracker-backend.git
cd Finance-tracker-backend
```

### 2. Configure the Database

- Open the `application.properties` (or `application.yml`) file.
- Update the database settings:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/finance_tracker
spring.datasource.username=your-username
spring.datasource.password=your-password

spring.jpa.hibernate.ddl-auto=update
```

- Make sure you have a database created with the name `finance_tracker`:

```sql
CREATE DATABASE finance_tracker;
```

### 3. Install Dependencies

Install the required dependencies using Maven:

```bash
mvn clean install
```

### 4. Run the Application

To run the application locally:

```bash
mvn spring-boot:run
```

### 5. API Endpoints

Here are some of the available API endpoints:

- **User Registration:** `POST /api/auth/register`
- **User Login:** `POST /api/auth/login`
- **Create Expense:** `POST /api/expenses`
- **Get All Expenses:** `GET /api/expenses`
- **Create Income:** `POST /api/income`
- **Get All Income:** `GET /api/income`
- **Generate Report:** `GET /api/report`

### 6. Postman Collection

To test the API, import the provided Postman collection into your Postman tool. (Link to Postman collection can be added here if available.)

## Project Structure

```bash
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── finance
│   │   │           └── tracker
│   │   │               ├── controller  # API controllers
│   │   │               ├── model       # Data models
│   │   │               ├── repository  # Data access layer
│   │   │               ├── service     # Business logic layer
│   │   │               └── config      # Security and configuration
│   ├── resources
│   │   ├── application.properties      # Application configuration
└───pom.xml                              # Maven build file
```

## Contributions

Feel free to submit issues or pull requests. Contributions are welcome!
