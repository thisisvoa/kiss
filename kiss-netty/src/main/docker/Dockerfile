FROM java:8
MAINTAINER zjtachao
VOLUME /tmp
ADD kiss-netty-1.0.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=Asia/Shanghai","-jar","/app.jar"]