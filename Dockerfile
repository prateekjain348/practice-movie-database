FROM openjdk:11-jre-slim

EXPOSE 8080
<<<<<<< HEAD
##ENV MYSQL_HOST='host.docker.internal'
#ENV MYSQL_HOST='jdbc:mysql://localhost:3306/movies?allowPublicKeyRetrieval=true&useSSL=false'
#ENV MYSQL_USER='root'
#ENV MYSQL_PASSWORD='root'
=======

ENV MYSQL_HOST='host.docker.internal'
ENV MYSQL_USER='root'
ENV MYSQL_PASSWORD='root'
>>>>>>> e4589d5e5f9d2036e710cfbe44129a60dc781280

ADD target/movie-management-0.1.jar movie-management-0.1.jar

ENTRYPOINT ["java","-jar","/movie-management-0.1.jar"]

#ADD NewRelic/newrelic.jar newrelic.jar
#ADD NewRelic/newrelic.yml newrelic.yml
#ENTRYPOINT ["java","-javaagent:newrelic.jar","-Dnewrelic.config.app_name=Movie Management","-jar","/movie-management-0.1.jar"]