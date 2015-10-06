# Spring Boot Fundamentals

## Acknowledgements

This is a [LEAN**STACKS**](http://www.leanstacks.com) solution.

For more detailed information and instruction about constructing Spring Boot RESTful web services, see the book [Lean Application Engineering Featuring Backbone.Marionette and the Spring Framework](https://leanpub.com/leanstacks-marionette-spring).

LEAN**STACKS** offers several technology instruction video series, publications, and starter projects.  For more information go to [LeanStacks.com](http://www.leanstacks.com/).

## Repository

This repository is a companion for the LEAN**STACKS** YouTube channel playlist entitled [Spring Boot Fundamentals](https://www.youtube.com/playlist?list=PLGDwUiT1wr6-Fn3N2oqJpTdhGjFHnIIKY).

### Repository Organization

Each episode of the Spring Boot Fundamentals video series has a corresponding branch in this repository.  For example, all of the source code illustrated in the episode entitled [Bootstrapping a Spring Boot Application Project](https://youtu.be/XbknBOmMuPQ?list=PLGDwUiT1wr6-Fn3N2oqJpTdhGjFHnIIKY) may be found on the repository branch named [bootstrap](https://github.com/mwarman/spring-boot-fundamentals/tree/bootstrap).

### Branches

#### Episode: Bootstrapping a Spring Boot Application Project

The branch named `bootstrap` contains the source code illustrated in this episode.

#### Episode: Creating RESTful Web Services with Spring Boot - Part One

The branch named `restws-1` contains the source code illustrated in this episode.

#### Episode: Creating RESTful Web Services with Spring Boot - Part Two

The branch named `restws-2` contains the source code illustrated in this episode.

#### Episode: Creating Service Components with Spring Boot

The branch named `service` contains the source code illustrated in this episode.

#### Episode: Using Spring Data Repositories with Spring Boot

The branch named `repository` contains the source code illustrated in this episode.


## Languages

This project is authored in Java.

## Installation

### Fork the Repository

Fork the [Spring Boot Fundamentals](https://github.com/mwarman/spring-boot-fundamentals) repository on GitHub.  Clone the project to your host machine.

### Dependencies

The project requires the following dependencies be installed on the host machine:

* Java Development Kit 8 or later
* Apache Maven 3 or later

## Running

The project uses [Maven](http://maven.apache.org/) for build, package, and test workflow automation.  The following Maven goals are the most commonly used.

### spring-boot:run

The `spring-boot:run` Maven goal performs the following workflow steps:

* compiles Java classes to the /target directory
* copies all resources to the /target directory
* starts an embedded Apache Tomcat server

To execute the `spring-boot:run` Maven goal, type the following command at a terminal prompt in the project base directory.

```
mvn spring-boot:run
```

Type `ctrl-C` to halt the web server.

This goal is used for local machine development and functional testing.  Use the `package` goal for server deployment.

### test

The `test` Maven goal performs the following workflow steps:

* compiles Java classes to the /target directory
* copies all resources to the /target directory
* executes the unit test suites
* produces unit test reports

The `test` Maven goal is designed to allow engineers the means to run the unit test suites against the main source code.  This goal may also be used on continuous integration servers such as Jenkins, etc.

To execute the `test` Maven goal, type the following command at a terminal prompt in the project base directory.

```
mvn clean test
```

### package

The `package` Maven goal performs the following workflow steps:

* compiles Java classes to the /target directory
* copies all resources to the /target directory
* executes the unit test suites
* produces unit test reports
* prepares an executable JAR file in the /target directory

The `package` Maven goal is designed to prepare the application for distribution to server environments.  The application and all dependencies are packaged into a single, executable JAR file.

To execute the `package` goal, type the following command at a terminal prompt in the project base directory.

```
mvn clean package
```

The application distribution artifact is placed in the /target directory and is named using the `artifactId` and `version` from the pom.xml file.  To run the JAR file use the following command:

```
java -jar example-1.0.0.jar
```

By default, the batch and hsqldb profiles are active.  To run the application with a specific set of active profiles, supply the `--spring.profiles.active` command line argument.  For example, to start the project using MySQL instad of HSQLDB and enable the batch process:

```
java -jar example-1.0.0.jar --spring.profiles.active=mysql,batch
```
