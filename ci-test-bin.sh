#!/bin/bash

docker run --rm -d -p 9080:9080 -v `pwd`/sample:/workdir -i sumeetchhetri/gatf-bin
echo "Waiting for gatf to listen on port 9080..."
COUNTER=0
while ! nc -z localhost 9080; do   
  sleep 1
  COUNTER=$((COUNTER+1))
  if [ "$COUNTER" = 60 ]
  then
  	echo "exiting...."
  	exit
  fi
done
echo "gatf listening on port 9080..."
