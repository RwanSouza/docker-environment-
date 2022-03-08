FROM maven:3.6.3 as Builder

COPY . /app

WORKDIR /app

RUN mvn package


FROM openjdk:11

# RUN mkdir -p /app/target/docker-0.0.1-SNAPSHOT.jar

COPY --from=Builder /app/target/docker-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "docker-0.0.1-SNAPSHOT.jar"]