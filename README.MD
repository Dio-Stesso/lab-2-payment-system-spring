# Payment System

## Description

This system is designed for managing payments. A client can have one or more credit cards, each associated with an account in the payment system. The client can use the account to make payments, block the account, and replenish the account. An administrator can unblock the account.

## Architecture

The project is implemented using the following technologies:

- **Backend**:
    - Java
    - Spring Boot
    - Spring Data JPA
    - Spring Security
    - Hibernate
    - Liquibase
    - Keycloak for authentication and authorization
    - PostgreSQL
    - Maven
    - Lombok
    - MapStruct
### Backend

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/paymentsystem.git
    cd paymentsystem
    ```

2. **Set up PostgreSQL:**

    ```sql
    CREATE DATABASE paymentsystem;
    CREATE USER paymentuser WITH ENCRYPTED PASSWORD 'password';
    GRANT ALL PRIVILEGES ON DATABASE paymentsystem TO paymentuser;
    ```

3. **Configure `application.yml`:**

    ```yaml
    spring:
      datasource:
        url: jdbc:postgresql://localhost:5432/paymentsystem
        username: paymentuser
        password: password
        driver-class-name: org.postgresql.Driver
      jpa:
        hibernate:
          ddl-auto: none
        show-sql: true
      liquibase:
        change-log: classpath:db/changelog/db.changelog-master.xml

    keycloak:
      realm: PaymentSystem
      auth-server-url: http://localhost:8080/auth
      resource: paymentsystem-client
      credentials:
        secret: your-client-secret
      bearer-only: true
      realm-key: "your-realm-key"

    spring.security.oauth2.resourceserver.jwt.jwk-set-uri: http://localhost:8080/auth/realms/PaymentSystem/protocol/openid-connect/certs
    ```

4. **Build the project:**

    ```bash
    mvn clean install
    ```

5. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

## Usage

### Client Operations

- **Create a client**
- **View client details**
- **Update client information**
- **Delete a client**

### Credit Card Operations

- **Create a credit card**
- **View credit card details**
- **Update credit card information**
- **Delete a credit card**

### Account Operations

- **Create an account**
- **View account details**
- **Block/unblock an account**
- **Replenish an account**

### Payment Operations

- **Create a payment**
- **View payment details**
- **Update payment information**
- **Delete a payment**

### Admin Operations

- **Unblock accounts**

## Security

- **Keycloak** is used for authentication and authorization.
- **Role-based access control**: Different functionalities are accessible based on the user's role (user/admin).

## Logging

- **Log4j** is used for logging various events within the system.

## Contributing

1. Fork the repository.
2. Create your feature branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature-name`
5. Open a pull request.