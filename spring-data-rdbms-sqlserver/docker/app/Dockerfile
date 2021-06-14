FROM openjdk:16-alpine
LABEL maintainer="daviMustafa"

# image layer
WORKDIR /app
EXPOSE 8081
ADD ./target/spring-data-rdbms-sqlserver*jar /developments/spring-data-rdbms-sqlserver.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/developments/spring-data-rdbms-sqlserver.jar"]