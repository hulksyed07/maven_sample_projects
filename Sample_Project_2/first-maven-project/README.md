maven archetype:generate

Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 962: hit enter.

Choose org.apache.maven.archetypes:maven-archetype-quickstart version: ** choose the version to include. Default is the latest version of Maven.

Define value for property 'groupId': give a unique group id, say, hulk.syed07

Define value for property 'artifactId': give first-maven-project.

Define value for property 'version' 1.0-SNAPSHOT: give 1.0-SNAPSHOT Snapshot indicates that the project is in development.

Define value for property 'package' hulk.syed07: provide the suggested name i.e., hulk.syed07

mvn compile

mvn clean

mvn package

java -cp /target/first-maven-project-1.0-SNAPSHOT com.fresco.play.App

mvn test
