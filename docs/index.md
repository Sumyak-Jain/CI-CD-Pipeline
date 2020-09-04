# What we will do?

### We will develop a basic maven web application in Java using DevOps tools like Apache Maven as a build tool, GitHub for source code management, Selenium for testing, Jenkins for Continuous integration and Apache Tomcat for deployement and use jenkins plugin to monitor our pipeline.

### All things will be done under one Jenkins Pipeline!


![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(365).png?raw=true)

## For example we will develop a basic four function Calculator!

### STEP-1  : Write the sourcecode for a basic four function Calculator

[To see all the source code click!](https://github.com/sumyak/CI-CD-Pipeline/tree/master/src/main)

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

and start writing your script [to get script click](https://github.com/sumyak/CI-CD-Pipeline/blob/master/script.groovy)

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(361).png?raw=true)

### STEP-6  : Click on Build now and start building your project

what it will do?
+ Fetch your sourcecode from github
+ Compile it
+ Make its build ( a .war file)
+ Test it using selenium (basic)
+ and then deploy it to a tomcat server

pipeline will do all its job stage by stage and you will get outputs like (for every successfull job!)

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(379).png?raw=true)


![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(350).png?raw=true)


![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(349).png?raw=true)


![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(348).png?raw=true)

### STEP-7  : Check your jenkins.war

it will record all your logs and when your pipeline will be build successfully it will show

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(352).png?raw=true)


### STEP-8  : Check your tomcat server 

open startup.bat of your tomcat and you will see that it will show deployment of a web application is finished! 

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(351).png?raw=true)


### STEP-9  : Start monitoring!

first install a delivery pipeline view plugin in your jenkins 
it will be showing two views
+ one for a dashboard
+ other a pipeline view

you can monitor all it changes, time, start time, end time ,logs etc

**Dashboard Stage View**

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(362).png?raw=true)

**Pipeline View**

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(353).png?raw=true)

### STEP-10  : Check your Web Application

open your tomcat url along with the context path provided

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(347).png?raw=true)

![alt txt](https://github.com/sumyak/CI-CD-Pipeline/blob/master/SS/Screenshot%20(381).png?raw=true)



##      THANK YOU   





