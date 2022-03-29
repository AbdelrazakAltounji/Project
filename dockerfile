FROM selenium/standalone-firefox:latest

WORKDIR /app

COPY . .

RUN java .\src\testing\test.java

