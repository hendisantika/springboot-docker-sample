FROM openjdk:latest
LABEL maintainer="hendisantika@yahoo.co.id"
COPY ./target/springboot-docker-sample-1.0.0-SNAPSHOT.jar /usr/src/springboot-docker-sample/
WORKDIR /usr/src/springboot-docker-sample
EXPOSE 8080
CMD ["java", "-jar", "springboot-docker-sample-1.0.0-SNAPSHOT.jar"]