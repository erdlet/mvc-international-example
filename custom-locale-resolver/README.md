# MVC custom LocaleResolver
This example shows how to implement a custom `LocaleResolver` to read the `Locale` from a query param.

## Build
mvn clean package && docker build -t de.erdlet.mvc/custom-locale-resolver .

## RUN
docker rm -f custom-locale-resolver || true && docker run -d -p 8080:8080 -p 4848:4848 --name custom-locale-resolver de.erdlet.mvc/custom-locale-resolver 
