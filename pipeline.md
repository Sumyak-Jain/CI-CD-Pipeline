# What we will do?

### We will develop a basic maven web application in Java using DevOps tools like Apache Maven as a build tool, GitHub for source code management, Selenium for testing, Jenkins for Continuous integration and Apache Tomcat for deployement and use jenkins plugin to monitor our pipeline.

### All things will be done under one Jenkins Pipeline!


![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(365).png?raw=true)

## For example we will develop a basic four function Calculator!

### STEP-1  : Write a sourcecode for a basic four function Calculator

[To see all the source code click!](/src/main)

### STEP-2  : Configure it using any maven present IDE 

I have used apache netbeans and i have got my  src and pom.xml with all the plugins for this maven web application

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(367).png?raw=true)
![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(369).png?raw=true)

you can also configure it using CMD [to see click](https://github.com/sumyak/Apache-Maven/tree/master/cmd)

### STEP-3  : Make a repo on github and push it using git

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(363).png?raw=true)
![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(371).png?raw=true)


### STEP-4  : Open Jenkins.war and login to your account

Write the following command on CMD to open jenkins.war file

```java
// Normal command
java -jar jenkins.war

// To change port no.
java -jar jenkins.war --httpPort=8383
```
![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(359).png?raw=true)

after then login to your account 

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(374).png?raw=true)
![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(375).png?raw=true)

### STEP-5  : Make a new jenkins pipeline

give the suitable tittle to it and select pipeline project and click ok

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(377).png?raw=true)


### STEP-6  : Give project url and write its script

give project description

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(360).png?raw=true)

