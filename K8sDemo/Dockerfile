# Use an official OpenJDK image as base
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built JAR file
COPY target/k8s-demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
