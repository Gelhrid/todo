Application for exercise.
Main purpose classic ToDo list.


run from IDE -> run application
run from docker
first mvn clean package
docker build -t todo-app .
docker run -p 9090:9090 todo-app