FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/simple-service
ADD @project.build.finalName@.jar /usr/local/simple-service/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
