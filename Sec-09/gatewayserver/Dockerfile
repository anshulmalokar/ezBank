FROM openjdk:17-jdk-slim

MAINTAINER anshulmalokar@gmail.com

COPY target/gatewayserver-0.0.1-SNAPSHOT.jar gatewayserver-0.0.1-SNAPSHOT.jar

RUN apt-get update && apt-get install -y curl

ENTRYPOINT ["java", "-jar","gatewayserver-0.0.1-SNAPSHOT.jar"]