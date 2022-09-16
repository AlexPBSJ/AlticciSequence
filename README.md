# AlticciSequence
Alticci Sequence implemented with Quarkus and REST documentation with Swagger

# Instructions
- To run the program navigate to the directory and execute the command: ./mvnw quarkus:dev
- Once the application is running access: localhost/8080/alticci/{n} (without the brackets and 'n' being the number you want the value to). You can access through a browser or through Postman.
- To access Swagger documentation: localhost/8080/q/swagger-ui
- There are also Unit Tests made and tested in IntelliJ Idea under src/test directory
- If the number specified is lower than 0, an Exception will be thrown and you'll get a message and a 400 Bad Request.
