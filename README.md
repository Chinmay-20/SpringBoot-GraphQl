# Inventory Service with Spring Boot and GraphQL

This project is an Inventory Service application developed using Spring Boot and GraphQL. It provides a REST API and a GraphQL API to manage inventory items.

## Table of Contents

- [Overview](#overview)
- [Files and Structure](#files-and-structure)
- [Setup](#setup)
- [Usage](#usage)
- [GraphQL Schema](#graphql-schema)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Inventory Service application allows you to manage inventory items such as products, categories, and stock levels. It uses Spring Boot for the backend and integrates GraphQL to provide flexible and efficient data querying capabilities.

## Files and Structure

- **InventoryServiceApplication.java**: Main class to bootstrap the Spring Boot application.
- **Product.java**: Entity class representing the product in the inventory.
- **ProductRepository.java**: Repository interface for product data operations.
- **ProductService.java**: Service class containing business logic for managing products.
- **ProductController.java**: REST controller class to handle HTTP requests for products.
- **schema.graphqls**: GraphQL schema file defining the GraphQL types and queries.
- **SpringBoot + GraphQL.pdf**: Documentation explaining the integration of Spring Boot with GraphQL.

## Setup

### Prerequisites

- Java 21.0.3 or higher
- Maven 3.6.0 or higher
- MySQL Server

### Steps

1. **Clone the repository**

   ```bash
   git clone https://github.com/your-username/inventory-service.git
   cd inventory-service
2. **Set up the MySQL database
CREATE DATABASE springboot;
spring.datasource.url=jdbc:mysql://localhost:3306/springboot
spring.datasource.username=root
spring.datasource.password=your_password
3. **Build the project
mvn clean install
4. **Run the application
mvn spring-boot:run


### Usage

REST API
The application provides REST endpoints to manage products. You can access the API documentation (e.g., Swagger) if configured.

GraphQL API
To use the GraphQL API, navigate to http://localhost:9191/graphiql (or the configured port) in your browser. You can execute GraphQL queries to fetch specific fields of data.

Example GraphQL Query
{
  getProducts {
    id
    name
    category
    price
    stock
  }
}

### GraphQL Scehma
The GraphQL schema is defined in the schema.graphqls file. It contains type definitions and queries for the inventory data.


