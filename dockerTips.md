docker exec -it <db_container_name> psql -U todo_user tododb
\dt

docker-compose up --build

docker-compose down zatrzymanie bez kasowania
docker-compose down -v z kasowaniem bazki