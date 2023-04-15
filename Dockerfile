FROM openjdk:11-jre-slim

EXPOSE 8080

ENV MYSQL_HOST='host.docker.internal'

ADD target/movie-management-0.1.jar movie-management-0.1.jar

ENTRYPOINT ["java","-jar","/movie-management-0.1.jar"]

#ADD NewRelic/newrelic.jar newrelic.jar
#ADD NewRelic/newrelic.yml newrelic.yml
#ENTRYPOINT ["java","-javaagent:newrelic.jar","-Dnewrelic.config.app_name=Movie Management","-jar","/movie-management-0.1.jar"]