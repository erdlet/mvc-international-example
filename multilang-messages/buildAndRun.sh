#!/bin/sh
mvn clean package && docker build -t de.erdlet.mvc/mvc-language-examples .
docker rm -f mvc-language-examples || true && docker run -d -p 8080:8080 -p 4848:4848 --name mvc-language-examples de.erdlet.mvc/mvc-language-examples 
