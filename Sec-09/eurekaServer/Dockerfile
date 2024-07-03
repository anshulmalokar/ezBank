FROM openjdk:17-jdk-slim

MAINTAINER anshulmalokar@gmail.com

COPY target/eurekaServer-0.0.1-SNAPSHOT.jar eurekaServer-0.0.1-SNAPSHOT.jar

RUN apt-get update && apt-get install -y curl

ENTRYPOINT [ "java","-jar","eurekaServer-0.0.1-SNAPSHOT.jar" ]