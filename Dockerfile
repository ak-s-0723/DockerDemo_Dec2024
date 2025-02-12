FROM openjdk:17

COPY target/DockerDemo_Dec2024-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]