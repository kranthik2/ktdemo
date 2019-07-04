[![Build Status](https://api.travis-ci.org/kranthik2/ktdemo.svg?branch=master)](https://travis-ci.org/kranthik2/ktdemo)
# ktdemo
Sample spring boot kotlin rest service

### how to run : 
This application uses gradle build tool, follow this document https://gradle.org/install/ to install gradle 
if you do not have it installed on your machine. 

The Spring Boot Gradle plugin includes a bootRun task that can be used to run your application in an exploded form

```
gradle bootRun
```

You need to have docker installed to run this application as docker container

Below command builds spring boot application as docker image and runs docker image as container.
Local port 8080 mapped to container port, where tomcat server exposed.

```
gradle build docker dockerRun
```

![](https://media.giphy.com/media/cM7dLTfY2Sa3GC5xFe/giphy.gif)


