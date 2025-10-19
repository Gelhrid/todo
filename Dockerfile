# Wybieramy lekką JDK 21
FROM eclipse-temurin:21-jdk-alpine

LABEL authors="micha"
WORKDIR /app
COPY target/todo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]