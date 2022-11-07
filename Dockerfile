FROM openjdk:11
COPY /var/lib/jenkins/workspace/SpringIOC/target/tpAchatProject-2.0.0.jar tpAchatProject-2.0.0.jar
EXPOSE 8080
CMD ["java", "-jar", "/tpAchatProject-2.0.0.jar"]
