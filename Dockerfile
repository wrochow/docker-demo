# Use a base image
FROM openjdk:17-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/docker-demo-0.0.1.jar /app/docker-demo-0.0.1.jar

# Expose port 8080
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "docker-demo-0.0.1.jar"]