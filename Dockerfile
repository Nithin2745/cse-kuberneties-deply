FROM eclipse-temurin:17-jdk-alpine

WORKDIR /APP

COPY target/*.jar cse-kuberneties-deply.jar

CMD ["java","-jar","cse-kuberneties-deply.jar" ]