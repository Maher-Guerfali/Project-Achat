FROM openjdk:11
COPY /var/lib/jenkins/workspace/SpringIOC@2/target/tpAchatProject-1.0.jar tpAchatProject-1.0.jar
EXPOSE 8080
CMD ["java", "-jar", "/tpAchatProject-1.0.jar"]
