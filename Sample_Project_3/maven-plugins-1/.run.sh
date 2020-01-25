mvn clean compile
mvn exec:java -Dexec.args=20 | tee .output.txt  