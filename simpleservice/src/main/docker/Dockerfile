FROM openjdk:11.0.2-jre-slim
RUN  apt-get update && apt-get upgrade && apt-get install netcat-openbsd
RUN mkdir -p /usr/local/simple-service
ADD simpleservice-0.0.1-SNAPSHOT.jar /usr/local/simple-service/simple-service.jar
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
