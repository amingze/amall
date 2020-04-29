FROM 127.0.0.1:5000/jre:8
COPY target/amall-0.0.1-SNAPSHOT.jar.jar /opt/
EXPOSE 8080
CMD ["java","-jar","/opt/amall-0.0.1-SNAPSHOT.jar","&"]
