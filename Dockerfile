FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/finalProject-0.0.1-SNAPSHOT-jar-with-dependencies.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
