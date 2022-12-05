FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} libraryapp.jar

ENTRYPOINT ["java","-jar","/libraryapp.jar"]

EXPOSE 8181