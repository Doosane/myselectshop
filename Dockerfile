FROM openjdk:17-jdk-slim
COPY build/libs/myselectshop-v2.3.0.jar /app/myselectshop.jar
WORKDIR /app
CMD ["java", "-jar", "myselectshop.jar"]