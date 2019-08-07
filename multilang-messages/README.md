# Example for messages in multiple languages
This example shows how to use multi-language translations in an MVC application using
the default `LocaleResolver` implementation.

## Build
mvn clean package && docker build -t de.erdlet.mvc/multilang-messages .

## RUN
docker rm -f multilang-messages || true && docker run -d -p 8080:8080 -p 4848:4848 --name multilang-messages de.erdlet.mvc/multilang-messages
