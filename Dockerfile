FROM amazoncorretto:17-alpine-jdk

MAINTAINER melinda

COPY target/portfolio.Web-0.0.1-SNAPSHOT.jar portfolio.Web-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/portfolio.Web-0.0.1-SNAPSHOT.jar"]
