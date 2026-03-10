FROM eclipse-temurin:18-jdk

WORKDIR /app

COPY built/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]