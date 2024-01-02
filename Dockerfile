From openjdk:17
copy ./target/spring-data-rest-0.0.1-SNAPSHOT.jar spring-data-rest.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-data-rest.jar"]

