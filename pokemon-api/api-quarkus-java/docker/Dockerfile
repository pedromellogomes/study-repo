FROM ghcr.io/graalvm/graalvm-ce:latest
WORKDIR /pokemon-api-java
COPY ../. .
CMD ["./mvnw", "quarkus:dev"]
EXPOSE 8080

#FROM quay.io/quarkus/quarkus-micro-image:2.0
#WORKDIR /pokemon-api-java/
#COPY ../ /pokemon-api-java/application
#RUN chmod 775 /pokemon-api-java
#EXPOSE 8080
#CMD ["./application", "-Dquarkus.http.host=0.0.0.0"]