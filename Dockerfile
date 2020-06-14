FROM openjdk:alpine

WORKDIR /usr/app

COPY ./ ./

RUN javac Main.java

CMD ["java", "Main"]
