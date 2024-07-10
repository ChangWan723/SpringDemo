# SpringDemo

## Introduction

SpringDemo is a simple Spring Boot demo project designed to help beginners understand the basic structure and required files of a Spring Boot project. The project content is straightforward but complete in process. Currently, it includes the following features:

- Creating RESTful API controllers using annotations
- Connecting to a remote database
- Performing basic CRUD operations (JPA)
- Use CI to automatically build and release `jar` packages


## Notes

- The default `jar` will fail to start because the remote database is not available. Ensure you have configured the correct remote database information in `application.yml`, otherwise, it will fail to start.
- This project is mainly for learning and demonstration purposes and is not recommended for production use.
