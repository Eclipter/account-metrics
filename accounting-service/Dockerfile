FROM java:8-jre

ADD /build/libs/accounting-service-1.0-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/accounting-service-1.0-SNAPSHOT.jar"]

EXPOSE 9008
