FROM adoptopenjdk/openjdk11:jdk-11.0.9.1_1-alpine
EXPOSE 8080
ARG JAR_FILE=target/spring-boot-mongo-0.0.1-SNAPSHOT.jar
# Add the application's jar to the container
ADD ${JAR_FILE} spring-boot-mongo.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=local", "-jar", "spring-boot-mongo.jar"]