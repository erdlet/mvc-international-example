# Example for Internationalization in MVC API with Eclipse Krazo
This example shows how a possible approach on internationalization may look like when
using the MVC API and Eclipse Krazo. 

## Build
mvn clean package && docker build -t de.erdlet.mvc/mvc-language-examples .

## RUN
docker rm -f mvc-language-examples || true && docker run -d -p 8080:8080 -p 4848:4848 --name mvc-language-examples de.erdlet.mvc/mvc-language-examples 