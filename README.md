# To SetUp and Ran TestProjects

To SetUp you need:
1.	Windows machine
2.	Installed global JAVA (JAVA_HOME)
3.	Installed global Maven (MAVEN_HOME)
4.	Installed Google Chrome

* To Ran Project from console you need:
1.	In console: create path to your project

cd [path to TestProjects]

Example: C:\Software\TestProjects

2.	In same console ran goals:

mvn clean install -DfailIfNoTests=false -Dtest=PaymentsValidation_GKU_Moscow_AT

* To Ran Project from Jenkins CI you need:
1) Create new "Freestyle project"

2) Add in Build: "Invoke top-lelel Maven targets"

2.1) Add in goals:
clean install -DfailIfNoTests=false -Dtest=PaymentsValidation_GKU_Moscow_AT

2.2) Add in POM path to project pom.xml

Example: C:\Software\TestProjects\pom.xml
