# spring-boot-ssl-https
Spring Boot Configuration with Https

## To generate self signed certificate using keytool 

*keytool -genkey -alias ssl-https -storetype JKS -keyalg RSA -keysize 2048 -keystore ssl-https-demo.jks*

## Properties added in application.properties file.
```
server.port=8443
server.ssl.key-alias=ssl-https
server.ssl.key-store-type=JKS
server.ssl.key-password=changeit
server.ssl.key-store=classpath:ssl-https-demo.jks
```

## Execute the REST API with https endpoint.
 
*https://localhost:8443/hello*


