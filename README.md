# ktdemo
Sample spring boot rest service using kotlin

### how to run : 
This application uses gradle build tool, follow this document https://gradle.org/install/ to install gradle 
if you dont have it installed on your machine. 

Below command builds spring boot application as docker image and runs docker image as container.
Local port 8080 mapped to container port, where tomcat server exposed.

```
gradle build docker dockerRun
```

![](https://media.giphy.com/media/cM7dLTfY2Sa3GC5xFe/giphy.gif)


