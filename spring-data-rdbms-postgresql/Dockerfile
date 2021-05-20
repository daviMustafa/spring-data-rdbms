FROM openjdk:16-alpine
LABEL maintainer="daviMustafa"

# image layer
WORKDIR /app
EXPOSE 8081
ADD ./target/spring-data-rdbms-postgresql-0.0.1-SNAPSHOT.jar /developments/
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/developments/spring-data-rdbms-postgresql-0.0.1-SNAPSHOT.jar"]