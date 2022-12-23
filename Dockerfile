FROM openjdk:11

WORKDIR /app

COPY ./target/*.jar /app

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "githubcicd-0.0.1-SNAPSHOT.jar"]