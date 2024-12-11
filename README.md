# Bank-Admin-Operations-Project

This project implements various admin-level banking operations using the **Strategy Pattern**. 
The application ensures modularity, scalability, and efficient file handling through the use of **Java NIO** for data storage and manipulation.

## Project Objectives

The primary objective of this project is to provide a flexible and dynamic way to handle banking operations such as:

- Adding and deleting customers.
- Blocking customer cards.
- Creating new cards for customers.
- Viewing customers and their associated cards.
- Monitoring money transfer operations.

## Features

1. **AddDeleteCustomersStrategy**:  
   Provides functionality to add new customers or delete existing ones. Each action is logged for traceability.

2. **CardBlockStrategy**:  
   Enables admins to block a customer's card to ensure security in case of suspicious activities or upon request.

3. **CreateCardStrategy**:  
   Allows admins to create new cards for customers, with unique card details stored securely.

4. **ShowCustomersAndCardsStrategy**:  
   Displays all customers along with their associated cards for a comprehensive overview.

5. **ShowMoneyTransferStrategy**:  
   Tracks and displays details of money transfer operations conducted by customers.

6. **FileNIO Integration**:  
   All operations are backed by **Java NIO**, ensuring efficient reading, writing, and updating of data files.

## Technologies Used

- **Java 17**: Programming language for building the application.
- **FileNIO**: Used for handling file-based data storage.
- **Strategy Pattern**: Provides a modular and dynamic approach to implementing different operations.

## Project Structure

The project follows the **Strategy Pattern** for separating different operations into reusable components:

