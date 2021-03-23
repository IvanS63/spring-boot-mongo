# Spring Boot + Mongo DB + Docker
Simple example that represents Spring Boot backend application which interacts with Mongo DB via Docker containers.

## Technologies
- Maven
- Java 11
- Spring Boot 
- Mongo DB
- Docker

Workflow
========
## Run project
1. Run: **mvn clean install** command from  project root directory to build jar file.
2. Run: **docker-compose up --build** command from  project root directory to build and run docker containers.
3. Stop: **docker-compose down --remove-orphans** command from  project root directory.