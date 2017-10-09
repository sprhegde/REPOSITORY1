FROM java:8-jre
MAINTAINER Shivaprasad Hegde <sprhegde@gmail.com>

ADD /home/travis/.m2/repository/com/dxc/test/app/SimpleRESTService/0.0.1-SNAPSHOT/SimpleRESTService-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/SimpleRESTService-0.0.1-SNAPSHOT.jar"]

