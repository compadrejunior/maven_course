# hello-world
This project includes many first steps configurations for a maven project.
## Introduction
This project aims to be a simple implementation of a maven project with the following characteristics:
- Run TestNG tests within the maven package lifecycle.
- Generate JaCoCo coverage reports
- Use the maven wrapper to distribute the project in a portable manner.
- Create both an executable jar with dependencies and another without them.

## Maven Wrapper
The project includes maven wrapper to make it portable. In other words, you should be able to clone, build, install 
and run the application with no need to install maven on your local machine. 
For Linux, use mvnw script to run the build. For windows use mvnw.cmd.

## TestNG an JaCoCo
The TestNG will execute within the maven surefire test goal as JaCoCo Coverage reports.

## Lifecycle 
This pom.xml aims to be use with the package and install lifecycles with some differences. To know about the complete 
lifecycle check the pom.xml file. 
### Package
```bash
./mvnw package 
```
- maven-clean-plugin:clean - cleans the target directory
- maven-surefire-plugin - compiles and executes TestNG tests
- jacoco-maven-plugin - generates the test coverage report
- maven-jar-plugin - creates the executable hello-world-{version}-SNAPSHOT.jar file without dependencies. To run 
  this file you shall have all the dependencies in you /target directory. 

- creates the executable hello-world-{version}-SNAPSHOT-jar-with-dependencies.jar file. This file includes all the 
  dependencies. 

### Install
```bash
./mvnw install 
```
- maven-dependency-plugin - copy all the dependencies to the target folder. This is required to run the jar file with 
  no dependencies included. 