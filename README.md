<center>
  <p align="center">
    <img src="https://icon-library.com/images/java-icon-png/java-icon-png-15.jpg"  width="150" />
  </p>  
  <h1 align="center">🚀 Microservice: Video Catalog Admin</h1>
  <p align="center">
    Microservice referring to the Video Catalog Administration backend<br />
    Using Clean Architecture, DDD, TDD and the best practices
  </p>
</center>

## Ferramentas necessárias

- JDK 17
- Docker

## How to run?

1. Clone the repository:
```sh
git clone https://github.com/codeedu/micro-admin-videos-java.git
```

2. Up MySQL Database with Docker:
```shell
docker-compose up -d
```

3. Run MySQL Migrations with Flyway:
```shell
./gradlew flywayMigrate
```

4. Run the application as SpringBoot app:
```shell
./gradlew bootRun
``` 

<br/>

## Database

O banco de dados principal é um MySQL e para subir localmente vamos utilizar o
Docker. Execute o comando a seguir para subir o MySQL:

The main database is a MySQL and to up it locally we will use the
Docker. Run the following command to up MySQL:

```shell
docker-compose up -d
```

<br/>

### Database migrations with Flyway

#### Run the migrations

If this is the first time you are up the database, it is necessary
to perform SQL migrations with the `flyway` tool.
Run the following command to run the migrations:

```shell
./gradlew flywayMigrate
```
<br/>

#### Clean up database migrations

It's possible to clean (delete all tables) your database, just
run the following command:

```shell
./gradlew flywayClean
```

<br/>

#### Repairing database migrations

There are two ways to generate an inconsistency in Flyway by leaving it in the repair state:
1. Some error migration SQL file;
2. Some migration file already applied has been changed (by modifying the `checksum`).

When this happens the flyway will be in a repair state.
with a record in the `flyway_schema_history` table with error (`success = 0`).

To run the repair, fix the files and run:
```shell
./gradlew flywayRepair
```

With the above command Flyway will clear the records with error from the `flyway_schema_history` table,
then run the FlywayMigrate command to try to migrate them again.

<br/>

#### Other useful Flyway commands

In addition to the commands already shown, we have some very useful ones like info and validate:

```shell
./gradlew flywayInfo
./gradlew flywayValidate
```

To know all available commands: [Flyway Gradle Plugin](https://flywaydb.org/documentation/usage/gradle/info)

<br/>

#### To run commands in another environment

In `build.gradle`, Flyway is configured to first read the variables from
`FLYWAY_DB`, `FLYWAY_USER` and `FLYWAY_PASS` environment and then use a default value
if you can't find them. With that, to point to another environment just overwrite
these variables when executing the commands, for example:

```shell
FLYWAY_DB=jdbc:mysql://prod:3306/adm_videos FLYWAY_USER=root FLYWAY_PASS=123h1hu ./gradlew flywayValidate
```