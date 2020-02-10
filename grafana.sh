#!/usr/bin/env bash

docker pull grafana/grafana
docker run --name grafana -d --network host grafana/grafana
curl localhost:3000
