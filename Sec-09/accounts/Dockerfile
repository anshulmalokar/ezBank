FROM openjdk:17-jdk-slim

MAINTAINER anshulmalokar@gmail.com

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

RUN apt-get update && apt-get install -y curl

ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]