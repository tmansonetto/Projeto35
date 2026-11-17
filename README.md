# Projeto35 – JPA / Hibernate with PostgreSQL

A minimal Java project introducing **JPA** with Hibernate and PostgreSQL, without Spring: an `EntityManager` is used to persist and query a `Pessoa` (person) entity.

## Tech stack
- Java 25, Maven
- Hibernate 5.6 (`hibernate-entitymanager`, `javax.persistence` API)
- PostgreSQL driver 42.7

## Structure
```
src/main/java
├── dominio/Pessoa.java        JPA entity (id, name, email)
└── aplicacao/Programa.java    Creates the EntityManager, persists and finds records
src/main/resources/META-INF/persistence.xml   persistence unit "exemplo-jpa"
```

## Setup
1. Create a PostgreSQL database and schema (the sample uses database `coursejdbc`, schema `coursejdbc`).
2. Set the `DB_PASSWORD` environment variable with your database password. It is injected at runtime by `Programa`, so no password is stored in `persistence.xml`. Adjust the URL and user in `persistence.xml` if yours differ.
3. Run `aplicacao.Programa` from your IDE, or build with `mvn compile`.

`hibernate.hbm2ddl.auto=update` creates/updates the table automatically.

## What it demonstrates
- Configuring a persistence unit by hand
- `EntityManagerFactory` / `EntityManager` lifecycle
- `persist` inside a transaction and `find` by primary key

> Tip: keep every Hibernate artifact on the same major version (5.6 uses `javax.persistence`; Hibernate 6+/Spring Boot 3+ use `jakarta.persistence`).
