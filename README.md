# dummy-web-app

This project was used for demonstration of features/libraries like auto wiring, spring boot,  spring data rest and spring data jpa to interns.

Builds on gradle
./gradlew build -x test

Setup
1. edit application.properties to provide MySQL database 
2. execute DDL from resources

Supports CRUD operation
GET METHOD URIs( other http method for CRUD are also supported) -
http://localhost:7766/training/persons
http://localhost:7766/training/api/students
http://localhost:7766/training/api/employees
