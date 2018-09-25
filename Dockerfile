FROM openjdk:8-jre-alpine

ADD target/spring-admin-server-1.0-SNAPSHOT.jar /spring-admin-server.jar

CMD java ${JAVA_OPTS} -jar /spring-admin-server.jar

EXPOSE 9000
