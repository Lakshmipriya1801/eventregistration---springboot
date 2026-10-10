🎟️ Event Registration System

📌 About the Project :

The Event Registration System is a backend application developed using Java Spring Boot and MySQL. It allows users to create events, view event details, register for events, and cancel registrations.

✨ Features :

- Create new users
- Create and view events
- View event details by ID
- Register users for events
- View registrations by user ID
- Cancel event registrations
- Store data in a MySQL database

🛠️ Technologies Used :

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

📂 Project Structure :

```text
eventregistration/
├── src/main/java/com/example/eventregistration/
│   ├── controller/
│   │   ├── EventController.java
│   │   ├── RegistrationController.java
│   │   └── UserController.java
│   ├── dao/
│   │   ├── EventRepo.java
│   │   ├── RegistrationRepo.java
│   │   └── UserRepo.java
│   ├── entity/
│   │   ├── Event.java
│   │   ├── Registration.java
│   │   └── User.java
│   ├── service/
│   │   ├── EventService.java
│   │   └── RegistrationService.java
│   └── EventRegistrationApplication.java
├── src/main/resources/
│   └── application.properties
├── pom.xml
└── README.md
```

 🚀 How to Run :

1. Clone the repository:
   ```bash
   git clone YOUR_GITHUB_REPOSITORY_URL
   ```
2. Create a MySQL database:
   ```sql
   CREATE DATABASE eventregistration_db;
   ```
3. Configure the database username and password in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/eventregistration_db
   spring.datasource.username=root
   spring.datasource.password=YOUR_MYSQL_PASSWORD
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Open the project in Eclipse.
5. Run `EventRegistrationApplication.java`.
6. Test the APIs using Postman.

🔗 API Endpoints :

**Base URL:** `http://localhost:8080`

 1. POST – Create Data

- **Purpose:** Create a new user, event, or registration.
- **Endpoints:** `/users`, `/events`, `/registrations`

Example: `POST /users`

Request Body:

```json
{
  "name": "Priya",
  "email": "priya@example.com"
}
```

Example: `POST /events`

Request Body:

```json
{
  "name": "Java Workshop",
  "description": "Workshop on Java programming",
  "date": "2026-11-15",
  "location": "Chennai"
}
```

Example: `POST /registrations`

Request Body:

```json
{
  "userId": 1,
  "eventId": 1
}
```

 2. GET – Retrieve All Data

- **Purpose:** Retrieve all available events.
- **Endpoint:** `/events`
- **Example:** `GET /events`

3. GET – Retrieve Data by ID

- **Purpose:** Retrieve an event using its ID.
- **Endpoint:** `/events/{id}`
- **Example:** `GET /events/1`

 4. GET – Retrieve User Registrations

- **Purpose:** Retrieve all registrations for a particular user.
- **Endpoint:** `/registrations/user/{userId}`
- **Example:** `GET /registrations/user/1`

 5. DELETE – Cancel Registration

- **Purpose:** Cancel a registration using its ID.
- **Endpoint:** `/registrations/{id}`
- **Example:** `DELETE /registrations/1`

 🧪 Testing with Postman :

1. Start the Spring Boot application.
2. Select the required HTTP method in Postman.
3. Enter the base URL and endpoint.
4. For POST requests, select **Body → raw → JSON** and enter the request data.
5. Click **Send** to view the response.

Use actual user, event, and registration IDs from your database.

 📚 What I Learned :

- Building REST APIs using Spring Boot
- Connecting Spring Boot with MySQL
- Using Spring Data JPA repositories
- Understanding controller, service, DAO, and entity layers
- Performing create, read, and delete operations
- Testing APIs using Postman

 🔮 Future Enhancements :

- Add validation for user and event details
- Check event availability before registration
- Add update functionality for events
- Implement user authentication and authorization
  

 👩‍💻 Author

**Lakshmi Priya S**
