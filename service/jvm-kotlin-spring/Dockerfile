FROM eclipse-temurin:21-jdk-jammy

WORKDIR /workdir
COPY . .
RUN ./gradlew bootjar --no-daemon --info

FROM eclipse-temurin:21-jre-jammy

WORKDIR /workdir
COPY --from=0 /workdir/build/libs/kotlin-spring-jpa-0.0.1-SNAPSHOT.jar /workdir/app.jar
CMD ["java", "-jar", "/workdir/app.jar"]
