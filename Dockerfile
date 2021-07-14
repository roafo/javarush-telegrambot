FROM adoptopenjdk/openjdk8:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test.javarush.community.bot
ENV BOT_TOKEN=1801192041:AAF4SdBtJJeetF-tS6BEJxv0suK1OrLXF00
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}","-jar","/app.jar"]