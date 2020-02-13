#!/usr/bin/env bash

docker pull jboss/keycloak
docker run --name keycloak -p 8180:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin jboss/keycloak
curl localhost:8180

