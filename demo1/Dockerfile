FROM hub.c.163.com/library/java:8-alpine
WORKDIR /demo
COPY target/demo1-0.0.1-SNAPSHOT.jar demo1.jar
#设置镜像的时区,避免出现8小时的误差
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
EXPOSE 8080
ENTRYPOINT ["java","-Xms256m","-Xmx512m","-jar","demo1.jar"]