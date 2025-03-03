# Java Docker Code Sandbox

## Overview

This project provides a sandbox environment for executing Java code within Docker containers. It isolates user code execution to ensure security and manage resources effectively. The project uses Spring Boot and Maven for building and managing dependencies.

## Features

- **Code Isolation**: User code is executed in isolated Docker containers.
- **Resource Management**: Limits on memory and CPU usage for each container.
- **Timeout Handling**: Ensures that code execution does not exceed a specified time limit.
- **Security Management**: Uses a custom security manager to restrict certain actions.

## Prerequisites

- Java 8 or higher
- Docker
- Maven

## Setup

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/java-docker-code-sandbox.git
    cd java-docker-code-sandbox
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

## Usage

### Running the Sandbox

The main class for running the sandbox is `JavaDockerCodeSandbox`. You can execute it directly from your IDE or using the command line.

### Example Code Execution

To execute Java code, create an instance of `ExecuteCodeRequest` and pass it to the `executeCode` method of `JavaDockerCodeSandbox`.

```java
JavaDockerCodeSandbox javaDockerCodeSandbox = new JavaDockerCodeSandbox();
ExecuteCodeRequest executeCodeRequest = new ExecuteCodeRequest();
executeCodeRequest.setInputList(Arrays.asList("1 2", "1 3"));
String code = "public class Main { public static void main(String[] args) { System.out.println(args[0] + args[1]); } }";
executeCodeRequest.setCode(code);
executeCodeRequest.setLanguage("java");
ExecuteCodeResponse executeCodeResponse = javaDockerCodeSandbox.executeCode(executeCodeRequest);
System.out.println(executeCodeResponse);
```

### Docker Configuration

The Docker configuration is managed within the `JavaDockerCodeSandbox` class. It pulls the required Docker image, creates containers, and manages their lifecycle.

## Project Structure

- `src/main/java/com/ben/codojcodesandbox`: Contains the main classes for the sandbox.
- `src/main/resources`: Contains resource files, including security policies.
- `pom.xml`: Maven configuration file.

## Dependencies

- **Spring Boot**: For building the application.
- **Docker Java**: For interacting with Docker.
- **Hutool**: For utility functions.

## Security

The project uses a custom security manager (`MySecurityManager`) to restrict certain actions during code execution. Note that the `Security Manager` is deprecated and will be removed in future Java releases. Consider alternative security measures.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## Contact

For any questions or issues, please open an issue on GitHub.