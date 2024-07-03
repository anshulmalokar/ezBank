FROM openjdk:17-jdk-slim

MAINTAINER anshulmalokar@gmail.com

COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

RUN apt-get update && apt-get install -y curl

ENTRYPOINT [ "java","-jar","configserver-0.0.1-SNAPSHOT.jar" ]