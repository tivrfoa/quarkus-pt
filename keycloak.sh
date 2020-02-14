#!/usr/bin/env bash

docker pull jboss/keycloak
docker run --name keycloak -p 8180:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin jboss/keycloak
curl localhost:8180

# After adding quarkus-realm.json, it is necessary to change
# "Valid Redirect URIs" and "Web Origns" in "backend-service" settings.