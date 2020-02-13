#!/usr/bin/env bash

docker pull prom/prometheus
docker run --name prometheus -d --network host prom/prometheus
docker exec -it prometheus vi /etc/prometheus/prometheus.yml
docker exec -it prometheus kill -HUP 1
curl http://localhost:9090/


# create image after edit prometheus file
# or I can edit the file and do COPY