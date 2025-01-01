Here are the instructions for compiling, testing, and running your Spring Boot project:

### 1. Compile the Project

To compile the project, open a terminal and navigate to the root directory of your project. Then run the following command:

```sh
mvn clean compile
```

This command will clean any previous build artifacts and compile the source code.

### 2. Run Tests

To run the tests, use the following command:

```sh
mvn test
```

This command will execute the tests defined in your project and provide a report of the test results.

### 3. Package the Project

To package the project into a JAR file, use the following command:

```sh
mvn package
```

This command will compile the project, run the tests, and package the application into a JAR file located in the 

target

 directory.

### 4. Run the Application

You can run the application in two ways:

#### a. Using Maven

To run the application directly using Maven, use the following command:

```sh
mvn spring-boot:run
```

#### b. Using the JAR File

Alternatively, you can run the packaged JAR file using the `java -jar` command. First, ensure that the JAR file is generated in the 

target

 directory. Then, use the following command:

```sh
java -jar target/TestCopilot-1.0-SNAPSHOT.jar
```

### 5. Access the Application

Once the application is running, you can access the endpoints using your web browser:

- **Root Endpoint**: [http://localhost:8080/](http://localhost:8080/)
- **Square Endpoint**: [http://localhost:8080/square/4](http://localhost:8080/square/4) (replace `4` with any number to get its square)

These instructions should help you compile, test, and run your Spring Boot project.