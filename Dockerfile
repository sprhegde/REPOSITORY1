FROM java:8-jre
MAINTAINER Shivaprasad Hegde <sprhegde@gmail.com>

ADD https://github.com/sprhegde/REPOSITORY1/releases/download/v37.0/SimpleRESTService-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/SimpleRESTService-0.0.1-SNAPSHOT.jar"]

