FROM openjdk:16-alpine
LABEL maintainer="daviMustafa"

# image layer
VOLUME /developments
WORKDIR /developments

EXPOSE 8081

ADD ./target/spring-data-rdbms-postgresql*jar /developments/spring-data-rdbms-postgresql.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "/developments/spring-data-rdbms-postgresql.jar"]