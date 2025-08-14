FROM openjdk:21

ENV SERVER_PORT=8080

WORKDIR /stub-app

COPY target/stub-0.0.1-SNAPSHOT.jar stub-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/stub-app/stub-0.0.1-SNAPSHOT.jar", "--server.port=${SERVER_PORT}"]

LABEL authors="Vishal"