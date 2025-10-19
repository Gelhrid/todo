package pl.kodz.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kodz.todo.modeldata.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {}