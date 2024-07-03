FROM openjdk:17-jdk-slim

MAINTAINER anshulmalokar@gmail.com

COPY target/loan-0.0.1-SNAPSHOT.jar loan-0.0.1-SNAPSHOT.jar

RUN apt-get update && apt-get install -y curl

ENTRYPOINT ["java", "-jar","loan-0.0.1-SNAPSHOT.jar"]