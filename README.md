# Academic Events Management System

A comprehensive event management system designed to create and organize complex academic events with flexible and scalable architecture. The system supports hierarchical event structuring with multiple organizational levels.

## Project Overview

This project was developed to facilitate the planning and execution of academic events, offering an intuitive interface and robust functionalities to manage all aspects involved in event organization. The system supports complex event structures including:

- **Sub-events**: Each event can contain sub-events, allowing better categorization and management of related activities
- **Sections**: Within each sub-event, specific sections can be defined to group activities or thematic tracks
- **Tracks**: Participation paths that can include various activities, helping participants choose their experiences according to their interests
- **Activities**: Each track or section can include diverse activities (Lectures, Round Tables, Workshops, etc.)
- **User Management**: Support for different user roles (Administrator, Speaker, Participant)
- **Registration System**: Complete participant registration and management system

## Technologies Used

- **Java 21**: Main programming language
- **JavaFX**: Desktop GUI framework
- **Maven**: Dependency management and build tool
- **JPA/Hibernate**: Object-relational mapping
- **JUnit 5**: Testing framework
- **Mockito**: Mocking framework for unit tests
- **JaCoCo**: Code coverage analysis

## Architecture

The project follows a layered architecture with clear separation of concerns:

### Core Components
- **Models**: Entity classes representing the domain objects
- **Controllers**: Business logic and data flow management
- **Repositories/DAO**: Data persistence layer
- **UI/FXML**: User interface components
- **Facades**: Simplified interfaces for complex subsystems

### Key Models
- `Evento` (Event): Main event entity
- `SubEvento` (Sub-event): Event subdivisions
- `Secao` (Section): Organizational sections within events
- `Trilha` (Track): Thematic participation paths
- `Atividade` (Activity): Individual activities within tracks
- `Usuario` (User): System users with different roles
- `Inscricao` (Registration): User registrations for events/activities

## Project Structure

```plaintext
academic-events-crud/
├── .github/
│   └── workflows/              # GitHub Actions CI/CD
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controllers/    # Business logic controllers
│   │   │   ├── models/         # Entity models
│   │   │   ├── repositories/   # Data access layer
│   │   │   ├── screenscontrollers/ # UI controllers
│   │   │   ├── facade/         # Facade pattern implementations
│   │   │   ├── interfaces/     # Interface definitions
│   │   │   ├── exception/      # Custom exception handling
│   │   │   ├── context/        # Application context
│   │   │   └── Main.java       # Application entry point
│   │   └── resources/
│   │       └── screens/        # FXML UI definitions
│   └── test/
│       └── java/
│           ├── controllers/    # Controller unit tests
│           ├── repositories/   # Repository tests
│           └── integration/    # Integration tests
├── pom.xml                     # Maven configuration
└── README.md                   # Project documentation
```

## Features

### Administrative Functions
- **Event Management**: Create, update, delete, and list events
- **Sub-event Management**: Organize events into logical sub-components
- **Section Management**: Define organizational sections within events
- **Track Management**: Create thematic participation paths
- **User Management**: Manage different user roles and permissions

### Speaker Functions
- **Activity Management**: Submit, update, and delete activities
- **Activity Listing**: View all submitted activities
- **Activity Status Tracking**: Monitor activity approval status

### Participant Functions
- **Event Registration**: Register for events and activities
- **Registration Management**: View and cancel registrations
- **Certificate Generation**: Generate participation certificates
- **Event Browsing**: Browse available events, sub-events, sections, and tracks

### System Features
- **User Authentication**: Secure login system with role-based access
- **Data Validation**: Comprehensive input validation and error handling
- **Responsive UI**: Intuitive JavaFX-based desktop interface
- **Data Persistence**: Reliable data storage and retrieval

## Installation and Setup

### Prerequisites
- **Java JDK 21** or higher
- **Maven 3.6+** for dependency management
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code recommended)

### Installation Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/username/academic-events-crud.git
   ```

2. Navigate to the project directory:
   ```bash
   cd academic-events-crud
   ```

3. Install dependencies and compile:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn javafx:run
   ```

   Or alternatively:
   ```bash
   java -cp target/classes Main
   ```

## Testing

The project includes comprehensive test coverage using JUnit 5 and Mockito:

### Run all tests:
```bash
mvn test
```

### Generate test coverage report:
```bash
mvn jacoco:report
```

### Test Structure
- **Unit Tests**: Individual component testing
- **Integration Tests**: Component interaction testing
- **Controller Tests**: Business logic validation
- **Repository Tests**: Data persistence validation

## Usage

### Getting Started
1. Launch the application
2. Create an administrator account or use existing credentials
3. Set up events and organizational structure
4. Configure user roles and permissions
5. Begin event management

### User Roles
- **Administrator**: Full system access, event management, user management
- **Speaker**: Activity submission and management
- **Participant**: Event registration and participation

## Technical Highlights

### Design Patterns
- **MVC Architecture**: Clear separation of concerns
- **DAO Pattern**: Data access abstraction
- **Facade Pattern**: Simplified interfaces for complex operations
- **Observer Pattern**: UI updates and event handling

### Data Persistence
- JPA/Hibernate for object-relational mapping
- Entity relationships with proper foreign key constraints
- Data validation at both application and database levels

### Error Handling
- Comprehensive exception handling
- User-friendly error messages
- Input validation and sanitization

## Development and Contributions

### Code Quality
- SonarQube integration for code quality analysis
- Comprehensive unit and integration testing
- Maven-based dependency management
- CI/CD pipeline with GitHub Actions

### Future Enhancements
- Web-based interface for broader accessibility
- Email notification system
- Advanced reporting and analytics
- Calendar integration
- Mobile application support

## Developer

**Bruno** - Software Developer  
Focused on enterprise application development and software architecture

---

*Project developed as part of academic coursework in software engineering and enterprise application development.*
