# Week 1 Assignment – Java Shopping Cart (Console + CI/CD)

## Overview

This project is a **Java-based Shopping Cart application** implemented as a **console application**.

It demonstrates:

* Basic Java programming
* Object-oriented design
* Unit testing
* CI/CD pipeline integration using Jenkins
* Docker containerization

---

## Features

* Add items with price and quantity
* Calculate subtotal and total cost
* Console-based user interaction
* Unit tests for business logic
* Maven build system
* Jenkins pipeline integration
* Docker support

---

## Project Structure

```
Week1_Assignment
│── src
│   ├── main/java/org/example
│   │   ├── Main.java
│   │   ├── ShoppingCart.java
│   │   └── CartItem.java
│   └── test/java/org/example
│       └── ShoppingCartTest.java
│
│── pom.xml
│── Dockerfile
│── Jenkinsfile
│── Screenshot/
```

---

## How to Run

### Compile

```bash
mvn clean compile
```

### Run Application

```bash
mvn exec:java
```

---

## Running Tests

```bash
mvn test
```

---

## Docker

### Build Image

```bash
docker build -t week1-assignment .
```

### Run Container

```bash
docker run week1-assignment
```

---

## Jenkins Pipeline

The project includes a Jenkins pipeline that:

* Builds the project
* Runs tests
* Packages the application
* Builds Docker image

---


## Technologies Used

* Java 17
* Maven
* JUnit
* Docker
* Jenkins

---

## Notes

* This is a console-based application (no GUI)
* Designed to demonstrate CI/CD workflow and testing

---

## Author

Ahmad Sarfaraz
