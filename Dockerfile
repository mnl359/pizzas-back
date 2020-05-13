FROM openjdk:11

MAINTAINER Manuela Carrasco

COPY ./target/pizzas-backend-0.0.1-SNAPSHOT.jar /usr/src/pizzas/pizzas-backend-0.0.1-SNAPSHOT.jar
CMD  ["java", "-jar", "/usr/src/pizzas/pizzas-backend-0.0.1-SNAPSHOT.jar"]