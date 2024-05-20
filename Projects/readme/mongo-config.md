## Mongo config
mongo db https://cloud.mongodb.com/ Creds:
```
email: deyiy11921@fincainc.com
fname: deyiy
lname: deyiy
pass: 7@25ya$K6JkZr#/
```

Cluster creds:
```
url: mongodb+srv://deyiy11921:AQd3CGhJqyuxvR14@cluster0.naksbql.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0
```



## Maven commands:

1. `mvn clean`: Cleans the project by deleting the `target` directory, where Maven's output (like compiled classes and generated artifacts) resides.

2. `mvn compile`: Compiles the source code of the project.

3. `mvn test`: Runs the tests for the project. This will compile the test code (if not already compiled) and execute the tests.

4. `mvn package`: Packages the compiled code into a distributable format, such as a JAR, WAR, or EAR file.

5. `mvn install`: Installs the project's artifacts (JAR, WAR, etc.) into the local Maven repository. This makes them available to other projects locally.

6. `mvn deploy`: Deploys the project's artifacts to a remote repository. This is often used in a CI/CD pipeline to publish artifacts to a repository manager like Nexus or Artifactory.

7. `mvn dependency:resolve`: Resolves the project's dependencies from the repositories specified in the `pom.xml` file.

8. `mvn dependency:tree`: Displays the dependency tree for the project, showing all dependencies and their transitive dependencies.

9. `mvn clean install`: This is a common combination of commands that cleans the project, compiles the code, runs the tests, packages the code, and installs it into the local Maven repository.

10. `mvn clean package`: Similar to `mvn clean install`, but it skips installing the project into the local repository.

11. `mvn --help`