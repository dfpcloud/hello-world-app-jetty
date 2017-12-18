FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG VERSION=0.0.1-SNAPSHOT
ARG JAR_FILE=./target/hello-world-app-jetty${VERSION}.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]