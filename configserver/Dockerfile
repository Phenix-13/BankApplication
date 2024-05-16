FROM openjdk:17-jdk-slim as build
MAINTAINER phenix13
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/configserver-0.0.1-SNAPSHOT.jar"]