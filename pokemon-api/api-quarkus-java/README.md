# pokemon-api-java Project

This project uses Quarkus 2.13.0.Final with the following extensions:
- Resteasy Reactive
- PostgreSQL
- Hibernate ORM with Panache
- Flyway
- Junit 5

## Running the application

### Docker Compose

```shell
$ cd docker/
$ docker compose up 
```

### Dev mode

! Remeber that you need a PostgreSQL database running, 
change the values in application.properties 
and then run the following command

```shell
$ ./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.