FROM openjdk:8
EXPOSE 8090
ADD target/test-client-oAuth2-docker.jar test-client-oAuth2-docker.jar
ENTRYPOINT ["java","-jar","/test-client-oAuth2-docker.jar"]