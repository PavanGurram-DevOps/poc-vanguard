**Useful Commands**

1. To clean install: mvn clean install -DskipTests
2. To create package/jar: mvn clean package -DskipTests
3. To run the test: mvn test
4. Execute the tests on local using jar:   
   java -cp org.sapient.selenium.docker.demo-tests.jar:libs/* -Dcucumber.options="classpath:features" org.testng.TestNG ../testng.xml
5. Execute the tests on Grid using jar:   
   java -cp org.sapient.selenium.docker.demo-tests.jar:libs/* -Dcucumber.options="classpath:features" -DHUB_HOST=localhost -DBROWSER=CHROME -DENVIRONMENT=grid org.testng.TestNG ../testng.xml
6. Build Image: docker build -t=pavangurram/docker-integration .
7. Run container and jump onto it: docker run -it --entrypoint=/bin/sh pavangurram/docker-integration
8. Map volume and execute tests to see cucumber report: docker run -it -v /Users/pavgurra/Desktop/SeleniumDockerAWS/Directory:/usr/sapient/demo/test-output pavangurram/docker-integration
9. Docker Compose commands:
    docker-compose up
    docker-compose down
    docker-compose ps
    docker-compose up -d
    docker-compose up -d --scale chrome=4 --scale firefox=4
    docker-compose up | grep -e 'testng-module'
10. Pull Jenkins docker image --> docker pull jenkins/jenkins:lts
11. To give full permission to specific folder on mac: 
	sudo chmod 777 /Users/pavgurra/Desktop/SeleniumDockerAWS/Jenkins-Directory
12. Go to above path where you created folder Jenkins-Directory and run this command. Run Jenkins Container --> 
    docker run -p 8050:8080 -p 50000:50000 -v "$PWD/Jenkins-Master:/var/jenkins_home" jenkins/jenkins:lts

    
    