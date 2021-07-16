FROM adoptopenjdk/openjdk8:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test.javarush.community.bot
ENV BOT_TOKEN=1801192041:AAF4SdBtJJeetF-tS6BEJxv0suK1OrLXF00
ENV BOT_DB_USERNAME=postgres
ENV BOT_DB_PASSWORD=postgres
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dbot.token=${BOT_TOKEN}","-Dbot.username=${BOT_NAME}","-Dspring.datasource.password=${BOT_DB_PASSWORD}","-Dspring.datasource.username=${BOT_DB_USERNAME}","-jar","/app.jar"]