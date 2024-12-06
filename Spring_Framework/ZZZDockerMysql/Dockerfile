FROM openjdk:24

COPY target/*.jar /opt/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]