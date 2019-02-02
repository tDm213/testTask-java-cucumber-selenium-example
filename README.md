# To Setup and Run TestProjects

To Setup you need:
1.	A Windows machine
2.	Global JAVA (JAVA_HOME)
3.	Global Maven (MAVEN_HOME)
4.	Google Chrome

* To run the Project from the CMD console you need:
1.	In console: create a path to your project

cd [path to TestProjects]

Example: C:\Software\TestProjects

2.	On the same console run Goals:

mvn clean install -DfailIfNoTests=false -Dtest=PaymentsValidation_GKU_Moscow_AT

* To run the Project from Jenkins CI you need:
1) Create a new "Freestyle Project"

2) Add in Build: "Invoke top-lelel Maven targets"

2.1) Add in Goals:
clean install -DfailIfNoTests=false -Dtest=PaymentsValidation_GKU_Moscow_AT

2.2) Add in POM path to project pom.xml

Example: C:\Software\TestProjects\pom.xml
