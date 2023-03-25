FROM adoptopenjdk/openjdk11
ENV PROFILE=test ARGS=null
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker.executable-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${PROFILE}","/docker.executable-0.0.1-SNAPSHOT.jar","${ARGS}"]