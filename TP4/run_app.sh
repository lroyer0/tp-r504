#!/bin/bash
docker run -d \
  -p 5000:5000 \
  --name image-tp4 \
  --network net-tp4 \
  im-tp4
