FROM openjdk:11
ADD /var/lib/jenkins/workspace/SpringIOC/target/tpAchatProject-1.0.jar tpAchatProject-1.0.jar
EXPOSE 8080
CMD ["java", "-jar", "/tpAchatProject-1.0.jar"]
