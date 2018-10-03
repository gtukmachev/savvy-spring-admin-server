FROM openjdk:8-jre-alpine

#Version must be passed as a build arg, e.g. docker build --build-arg IMAGE_VERSION=<VERSION> .
ARG IMAGE_VERSION

ENV IMAGE_VERSION=${IMAGE_VERSION}

ADD target/spring-admin-server-1.0-SNAPSHOT.jar /spring-admin-server.jar

CMD java ${JAVA_OPTS} -jar /spring-admin-server.jar

EXPOSE 9000
