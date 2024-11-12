markdown
# Customer Management API

This project is a RESTful API for managing customer information. It allows creating, reading, updating, and deleting customer details.

## How to Build and Run the Application

### Prerequisites

- Java 11 or higher
- Maven 3.6.3 or higher

### Steps

1. **Clone the repository:**
   ```shell
   git clone https://github.com/yourusername/customer-management-api.git
   cd customer-management-api
   ```
2. **Build the project:**
    ```shell
    mvn clean install
   ```
3. **Run the application:**
    ```shell
    mvn spring-boot:run
    ```
- The application will start and be accessible at http://localhost:8080.

## Sample Requests to Test Each Endpoint
### Create a New Customer
####  Endpoint: ```POST /customers```

Sample Request:

    
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "annualSpend": 1000,
  "lastPurchaseDate": "2024-11-12T22:50:00"
}
```

### Get Customer Details ###
#### Endpoint: ```GET /customers/detail/{id}``` ####

Sample Request:

```shell
curl -X GET http://localhost:8080/customers/detail/<id>
```

### Get Customer Details by name or email ###
#### Endpoint: ```GET /customers/search``` ####

Sample Request:

```shell
curl -X GET http://localhost:8080/customers/search?name=<name>&email=<email>
```

### Get Customer Details with tier ###
#### Endpoint: ```GET /customers/{id}/tier``` ####

Sample Request:

```shell
curl -X GET http://localhost:8080/<id>/tier
```

### Update Customer Details ###
#### Endpoint: ```PUT /customers/{id}``` ####

Sample Request:

```json
{
    "name": "Jane Doe",
    "email": "jane.doe@example.com",
    "annualSpend": 2000,
    "lastPurchaseDate": "2024-11-12T22:50:00"
}
```

### Delete a Customer ###
#### Endpoint: ```DELETE /customers/{id}``` ####

Sample Request:

```shell
curl -X DELETE http://localhost:8080/customers/{id}
```
## Accessing the H2 Database Console ##
- The H2 database console can be accessed at http://localhost:8080/h2-console.

- Steps to Access:
        
  - URL: jdbc:h2:mem:testdb

  - Username: sa

  - Password: (leave blank)

Make sure the application is running before trying to access the H2 console.

## Assumptions Made in Implementation ##

- Unique Email Addresses: Each customer has a unique email address.

- Date Format: The lastPurchaseDate is expected to be in ISO 8601 format (YYYY-MM-DDTHH:MM:SS).

- Validation: Basic validation is assumed for customer details (e.g., non-empty names, valid email formats).

- In-Memory Database: For simplicity, an in-memory H2 database is used. This can be changed to a persistent database in production.

