FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=build
RUN echo ${DEPENDENCY}
COPY ${DEPENDENCY}/libs/ktdemo-0.0.1-SNAPSHOT.jar /app/lib/ktdemo.jar
ENTRYPOINT ["java","-jar","/app/lib/ktdemo.jar"]