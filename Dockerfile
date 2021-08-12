FROM openjdk:12-alpine
COPY target/demo-0.0.1-SNAPSHOT.war /docker.war
CMD ["java", "-jar", "/docker.war"]
