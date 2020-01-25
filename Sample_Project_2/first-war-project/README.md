First create templates: mvn archetype:generate

Choose a number or apply filter (format: [groupID:}artifactId, case sensitive contains):choose the type of war, here we are choosing. maven-archetype-quickstart

Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): choose the archetype. org.apache.maven.archetypes:maven-archetype-quickstart version.

Choose org.apache.maven.archetypes:maven-archetype-quickstart version: choose the latest version, 8.

Define value for property 'groupId': give a unique group id, say, hulk.syed07

Define value for property 'artifactId': give first-war-project

Define value for property 'version' 1.0-SNAPSHOT: give 1.0-SNAPSHOT

Define value for property 'package' hulk.syed07: provide the suggested name i.e., hulk.syed07

Confirm by selection Y: Y


Create WAR File
We can create and use war file in a different way.

Using war type in the project package.

Using war:war goal.

Using war type in the project package.

1. First, we need to compile the project, type mvn compile.

Enter mvn clean package.

It will generate the war file in the target folder.

2. Using war:war goal to create war file.

Enter mvn compile war:war . It will compile and generate war file together.

It will create generate war in the target folder target/second-war-project.war




Create War file by passing all the dependencies value together.

Enter mvn archetype:generate -DgroupId=hulk.syed07 -DartifactId=First-WebApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false in terminal.

It will generate war file.

Verify the war file:

It should have pom.xml and src file.

src file should have main file with resources and webapp.

Create the war file:

Change directory with cd First-WebApp

Try using war:war goal method and package method.

