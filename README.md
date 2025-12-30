# LogaRithm
A RESTful service for logistics management.

# Tech Stack
1. Java 23
2. Gradle
3. JUnit5
4. Spring Boot
5. MySQL/PostgreSQL

# Use case
Here is the description of system roles and planned functionality:
1. Client
    - Register
    - View items in stock
    - Create a new order
    - Track his orders
    - Cancel and change his orders
2. Courier
    - Get assigned with an order
    - Receive an optimal route suggestion
    - Load the goods to deliver
    - Update his position and status
3. Manager
    - Add new warehouses
    - Update the stock of warehouses
    - Update the map
    - Add new couriers
    - Add new items

# Entities
1. User
    - Role (Client, Courier, Manager)
    - Address
2. Order
    - Client
    - Courier
    - Contents (Items with quantity)
3. OrderStatus
   - Name (Created, In Delivery, Delivered, Canceled)
   - Status description
4. Item (SKU)
    - Name
5. Warehouse
    - Address
6. Stock
    - Items with quantity in a warehouse
7. Location
   - Name
8. Road
    - Source
    - Target
    - Distance

# ER diagram
The Entity-Relationship Diagram of the database
![ER](docs/LogaRithm_ER.drawio.svg)

# Implementation tasks

| Task Name              | Description                                          | Estimation (Hrs) | Start Date | End Date | Time logged | Status  |
|------------------------|------------------------------------------------------|------------------|------------|----------|-------------|---------|
| Database Setup         | Set up a database and add tables                     | 2                |            |          |             | Backlog |
| Domain Classes         | Create domain classes                                | 3                |            |          |             | Backlog |
| CRUD                   | Add main controllers                                 | 10               |            |          |             | Backlog |
| Security               | Add authentication and authorization                 | 3                |            |          |             | Backlog |
| Path-finding algorithm | Implement algorithm that will find the optimal route | 12               |            |          |             | Backlog |
| Tests                  | Write integration and unit tests                     | 6                |            |          |             | Backlog |
| Documenation           | Create an OpenAPI documentation                      | 3                |            |          |             | Backlog |

# Feature ideas
Ideas that can be implemented in the future
- Add simulation capabilities: multiple couriers and clients will create and deliver orders at the same time
- Add history of changes for some entities (OrderStatus, Stock)
- Add Map entity, so Locations and Roads would belong to a certain map, which can be loaded on system's initialization
- Split User into client, courier and manager entities with unique attributes
- Add online/offline flag to the couriers, so only online couriers would receive orders
- Add return functionality to the client. Courier would need to pick up an item and bring it back to the designated warehouse
- Add delivery date selection and planned delivery date (and time)
- Make orders separably deliverable: order can be delivered in parts on different days
- Add max capacity of a warehouse
- Add different types of couriers: drivers, cyclists, drone etc. They will have different delivery capacity and different delivery speed
- Add different delivery options: regular, fast, express, etc.
- Split monolith into microservices
- Use external map API to make the system real
