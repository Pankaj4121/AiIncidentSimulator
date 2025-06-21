# AI Incident Management System

A Spring Boot application that automatically categorizes and assigns severity levels to incidents using AI-powered analysis.

## 🚀 Features

- **AI-Powered Incident Analysis**: Automatically determines severity and category based on incident descriptions
- **RESTful API**: Complete CRUD operations for incident management
- **Database Integration**: JPA/Hibernate with automatic table generation
- **Smart Categorization**: Classifies incidents into categories (Database, Network, Infrastructure, Application, General)
- **Intelligent Severity Assessment**: Assigns severity levels (Critical, High, Medium, Low) based on keywords

## 🛠️ Technology Stack

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (for development)
- **Maven**

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

## 🚀 Quick Start

### 1. Clone the Repository
```bash
git clone <repository-url>
cd AiIncident
```

### 2. Build the Project
```bash
mvn clean install
```

### 3. Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📚 API Documentation

### Base URL
```
http://localhost:8080/api/incidents
```

### Endpoints

#### 1. Create Incident
**POST** `/api/incidents`

Creates a new incident with AI-powered analysis.

**Request Body:**
```json
{
  "title": "Database Connection Failed",
  "description": "Database server is down and unreachable",
  "affectedService": "UserService"
}
```

**Response:**
```json
{
  "id": 1,
  "title": "Database Connection Failed",
  "description": "Database server is down and unreachable",
  "affectedService": "UserService",
  "aiSeverity": "CRITICAL",
  "aiCategory": "DATABASE"
}
```

**Status Codes:**
- `201 CREATED` - Incident created successfully
- `400 BAD_REQUEST` - Invalid request data

#### 2. Get Incident by ID
**GET** `/api/incidents/{id}`

Retrieves an incident by its ID.

**Response:**
```json
{
  "id": 1,
  "title": "Database Connection Failed",
  "description": "Database server is down and unreachable",
  "affectedService": "UserService",
  "aiSeverity": "CRITICAL",
  "aiCategory": "DATABASE"
}
```

**Status Codes:**
- `200 OK` - Incident found
- `404 NOT_FOUND` - Incident not found

## 🤖 AI Analysis Logic

### Severity Classification
The system analyzes incident descriptions to assign severity levels:

- **CRITICAL**: Contains keywords like "critical", "down", "outage"
- **HIGH**: Contains keywords like "error", "failed", "broken"
- **MEDIUM**: Contains keywords like "slow", "degraded", "issue"
- **LOW**: Default for other cases

### Category Classification
Incidents are categorized based on description keywords:

- **DATABASE**: "database", "db"
- **NETWORK**: "network", "connection"
- **INFRASTRUCTURE**: "server", "host"
- **APPLICATION**: "api", "service"
- **GENERAL**: Default category

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── aiIncident/
│   │           └── AiIncident/
│   │               ├── AiIncidentApplication.java
│   │               ├── controller/
│   │               │   └── IncidentController.java
│   │               ├── service/
│   │               │   └── IncidentService.java
│   │               ├── repository/
│   │               │   └── IncidentRepository.java
│   │               ├── model/
│   │               │   └── Incident.java
│   │               └── ai/
│   │                   └── AiLogicSimulator.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/
            └── aiIncident/
                └── AiIncident/
                    └── AiIncidentApplicationTests.java
```

## 🔧 Configuration

### Database Configuration
The application uses H2 in-memory database by default. Configuration can be found in `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

### H2 Console
Access the H2 database console at: `http://localhost:8080/h2-console`

## 🧪 Testing

### Run Tests
```bash
mvn test
```

### Manual Testing with cURL

#### Create an Incident
```bash
curl -X POST http://localhost:8080/api/incidents \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Network Timeout",
    "description": "API calls are timing out due to network connectivity issues",
    "affectedService": "PaymentService"
  }'
```

#### Get Incident by ID
```bash
curl -X GET http://localhost:8080/api/incidents/1
```

## 🚀 Deployment

### Build JAR
```bash
mvn clean package
```

### Run JAR
```bash
java -jar target/AiIncident-0.0.1-SNAPSHOT.jar
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🆘 Support

For support and questions, please open an issue in the repository or contact the development team.

---

**Note**: This is a demonstration project showcasing AI-powered incident management. The AI analysis logic is simplified and can be enhanced with more sophisticated machine learning models for production use.
