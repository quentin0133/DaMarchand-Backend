FROM rsunix/yourkit-openjdk17

ADD target/damarchand_backend.jar damarchand_backend.jar
ENTRYPOINT ["java", "-jar", "damarchand_backend.jar"]
EXPOSE 8080