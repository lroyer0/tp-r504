docker run -d \
  -p 5000:5000 \
  --name image-tp4-2 \
  --network net-tp4 \
  -v $(pwd)/app_1.py:/srv/app_1.py \
  -v $(pwd)/index.html:/srv/templates/index.html \
  image-tp4-2
