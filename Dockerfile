FROM java
WORKDIR /opt
COPY target/spring-boot-web-0.1.jar /opt/
ENTRYPOINT ["java", "-jar", "/opt/spring-boot-web-0.1.jar"]
EXPOSE 8081