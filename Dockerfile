FROM 127.0.0.1:5000/jre:8
COPY *.jar /opt/run.jar

CMD ["java","-jar","/opt/run.jar"]