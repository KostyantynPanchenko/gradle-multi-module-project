# About
This example demonstrates how to build a multi module Java project with Gradle

### Project Structure

The project consists of three modules:
* app - exposes REST API for getting the schedules
* service - provide some hardcoded business logic
* model - data model module


### How To Run

* `git clone`
* Modify `settings.gradle` to point to your installation of Java 17+
* `./gradlew bootRun`
* `curl -v localhost:8080`
