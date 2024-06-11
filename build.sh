#!/bin/bash

docker build -t microservice:v1.0.0 .
docker run --rm -p 8080:8080 microservice:v1.0.0


