from eclipse-temurin:17
copy target/mydevapp.jar mydevapp.jar
cmd ["java","-jar","mydevapp.jar"]