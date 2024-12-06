FROM openjdk:24-jdk

WORKDIR /opt

EXPOSE 8080

COPY target/*.jar /opt/app.jar

ENTRYPOINT ["java","-jar","app.jar"]
