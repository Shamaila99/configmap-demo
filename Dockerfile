FROM openjdk:11-jdk-slim
VOLUME /tmp
MAINTAINER mila
ARG JAR_FILE
COPY target/*.jar /usr/local/share/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urando","-jar","/usr/local/share/app.jar"]
EXPOSE 9000