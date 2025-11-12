for i in {1..500}; do
  curl -s http://localhost:83
done | grep -o "Hello [12]" | sort | uniq -c
