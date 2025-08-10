# Library Management System

A simple Java-based Library Management System demonstrating core Object-Oriented Programming (OOP) concepts.

## Description

This mini project implements a basic library management system with the following features:

- Add and manage books with unique IDs and availability status.
- Add and manage users who can issue and return books.
- Issue and return functionality with checks to prevent issuing already issued books and limiting the number of books a user can hold.
- Efficient lookups using Java Collections.
- Exception handling for invalid operations.

## Classes

- **Book**: Represents a book with id, title, author, and issue status.
- **User**: Represents a user with id, name, and a list of issued books.
- **Library**: Manages collections of books and users; handles issuing and returning of books.
- **Main**: Contains the main method to demonstrate usage.

## Requirements

- Java 11 or higher
- VS Code or any Java IDE
- Git (optional, for version control)

   ```bash
   javac *.java
